package com.tms.hw43_44_rest.repository;

import com.tms.hw43_44_rest.domain.Client;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository {
    private Connection connection;

    public ClientRepository(Connection connection) {
        this.connection = connection;
    }
    public List<Client> findAll() {
        List<Client> clients = new ArrayList<>();
        try {
            String query = "SELECT * FROM clients";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Client client = new Client();
                client.setId(resultSet.getLong("id"));
                client.setFirstName(resultSet.getString("firstName"));
                client.setLastName(resultSet.getString("lastName"));
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public Client findById(Long id) {
        Client client = null;
        try {
            String query = "SELECT * FROM clients WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                client = new Client();
                client.setId(resultSet.getLong("id"));
                client.setFirstName(resultSet.getString("firstName"));
                client.setLastName(resultSet.getString("lastName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

}
