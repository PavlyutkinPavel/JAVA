package com.tms.hw41_springbootactuator.controller;


import jakarta.validation.Valid;
import com.tms.hw41_springbootactuator.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import com.tms.hw41_springbootactuator.service.PlayerCRUD;
import com.tms.hw41_springbootactuator.service.PlayerService;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {
    private PlayerCRUD playerCRUD;

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public String getAllPlayers(Model model) throws SQLException {
        List<Player> players = playerService.getAllPlayers();
        model.addAttribute("playerList", players);
        return "players-page";
    }

    @GetMapping("/{playerId}")
    public String getPlayerById(@PathVariable int playerId, Model model, @Valid @ModelAttribute("player") Player player, BindingResult bindingResult) {
        Player existingPlayer = playerService.getPlayerById(playerId);
        if (existingPlayer == null) {
            return "error-page";
        } else {
            model.addAttribute("playerList", Collections.singletonList(existingPlayer));

            if (bindingResult.hasErrors()) {
                for (ObjectError error : bindingResult.getAllErrors()) {
                    System.out.println(error);
                }
                return "error-page";
            }

            return "players-page";
        }
    }

    @GetMapping("/add")
    public String showAddPlayerForm(Model model) {
        model.addAttribute("player", new Player());
        return "add-player";
    }

    @PostMapping("/add")
    public String addPlayer(@ModelAttribute("player") Player player) {
        playerService.addPlayer(player);
        return "redirect:/players";
    }

    @GetMapping("/{playerId}/edit")
    public String showEditPlayerForm(@PathVariable int playerId, Model model) {
        Player player = playerService.getPlayerById(playerId);
        model.addAttribute("player", player);
        return "edit-player";
    }

    @PostMapping("/{playerId}/edit")
    public String updatePlayer(@PathVariable int playerId, @ModelAttribute("player") Player player) {
        player.setPlayerId(playerId);
        playerService.updatePlayer(player);
        return "redirect:/players";
    }

    @GetMapping("/{playerId}/delete")
    public String deletePlayer(@PathVariable int playerId) {
        playerService.deletePlayer(playerId);
        return "redirect:/players";
    }
}
