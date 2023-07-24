package com.tms.hw41_springbootactuator.service;

import com.tms.hw41_springbootactuator.model.Player;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PlayerCRUD {
    private Connection connection;

    // Конструктор, инициализирующий подключение к базе данных
    public PlayerCRUD(Connection connection) {
        this.connection = connection;
    }

    // Метод для создания нового игрока
    public void createPlayer(Player player) {
        try {
            String query = "INSERT INTO players (player_name, player_age, position, player_number, status, statistics) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, player.getName());
            statement.setInt(2, player.getAge());
            statement.setString(3, player.getPosition());
            statement.setInt(4, player.getJerseyNumber());
            statement.setString(5, player.getStatus());
            statement.setString(6, player.getStatistics());
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int generatedId = generatedKeys.getInt(1);
                player.setPlayerId(generatedId);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Метод для получения информации об игроке по его идентификатору
    public Player getPlayerById(int playerId) {
        Player player = null;
        try {
            String query = "SELECT * FROM players WHERE player_id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, playerId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                player = new Player();
                player.setPlayerId(resultSet.getInt("player_id"));
                player.setName(resultSet.getString("player_name"));
                player.setAge(resultSet.getInt("player_age"));
                player.setPosition(resultSet.getString("position"));
                player.setJerseyNumber(resultSet.getInt("player_number"));
                player.setStatus(resultSet.getString("status"));
                player.setStatistics(resultSet.getString("statistics"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return player;
    }

    // Метод для обновления информации об игроке
    public void updatePlayer(Player player) {
        try {
            String query = "UPDATE players SET player_name = ?, player_age = ?, position = ?, player_number = ?, status = ?, statistics = ? WHERE player_id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, player.getName());
            statement.setInt(2, player.getAge());
            statement.setString(3, player.getPosition());
            statement.setInt(4, player.getJerseyNumber());
            statement.setString(5, player.getStatus());
            statement.setString(6, player.getStatistics());
            statement.setInt(7, player.getPlayerId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Метод для удаления игрока по его идентификатору
    public void deletePlayer(int playerId) {
        try {
            String query = "DELETE FROM players WHERE player_id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, playerId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Метод для получения всех игроков
    public List<Player> getAllPlayers() {
        List<Player> players = new ArrayList<>();
        try {
            String query = "SELECT * FROM players";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Player player = new Player();
                player.setPlayerId(resultSet.getInt("player_id"));
                player.setName(resultSet.getString("player_name"));
                player.setAge(resultSet.getInt("player_age"));
                player.setPosition(resultSet.getString("position"));
                player.setJerseyNumber(resultSet.getInt("player_number"));
                player.setStatus(resultSet.getString("status"));
                player.setStatistics(resultSet.getString("statistics"));
                players.add(player);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return players;
    }
}
