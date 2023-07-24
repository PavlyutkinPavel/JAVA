package com.tms.hw41_springbootactuator.service;


import com.tms.hw41_springbootactuator.model.Player;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayerService {
    private PlayerCRUD playerCRUD;

    public PlayerService(PlayerCRUD playerCRUD){
        this.playerCRUD = playerCRUD;
    }

    public List<Player> getAllPlayers() {
        List<Player> players = playerCRUD.getAllPlayers();
        return players;
    }
    public Player getPlayerById(int playerId) {
        Player player = playerCRUD.getPlayerById(playerId);
        return player;
    }

    public void addPlayer(Player player) {
        playerCRUD.createPlayer(player);
    }

    public void updatePlayer(Player player) {
        playerCRUD.updatePlayer(player);
    }

    public void deletePlayer(int playerId) {
        playerCRUD.deletePlayer(playerId);
    }
}
