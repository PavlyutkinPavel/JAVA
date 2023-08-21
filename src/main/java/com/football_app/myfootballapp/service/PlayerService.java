package com.football_app.myfootballapp.service;

import com.football_app.myfootballapp.domain.Player;
import com.football_app.myfootballapp.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayer(Long id) {
        return playerRepository.findById(id);
    }

    public Player createPlayer(Player player) {
        playerRepository.save(player);
        return player;
    }

    public void updatePlayer(Player player) {
        playerRepository.update(player);
    }

    public void deletePlayerById(Long id){
        playerRepository.delete(id);
    }
}
