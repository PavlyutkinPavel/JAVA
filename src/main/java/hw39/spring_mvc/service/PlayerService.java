package hw39.spring_mvc.service;

import hw39.spring_mvc.model.Player;
import hw39.spring_mvc.model.PlayerCRUD;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
