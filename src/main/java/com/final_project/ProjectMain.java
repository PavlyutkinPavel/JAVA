package com.final_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProjectMain {
    public static void main(String[] args){
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/football_app", "postgres", "4864"); //URL(host,port,database_name), login, password
            PlayerCRUD player = new PlayerCRUD(connection);

            //create
//            Player newPlayer = new Player();
//            newPlayer.setName("CR7");
//            newPlayer.setAge(38);
//            newPlayer.setPosition("ST");
//            player.createPlayer(newPlayer);

            //read
            Player playerR = player.getPlayerById(1);
            System.out.println(playerR.getName());
            System.out.println(playerR.getPosition());

            //update
            Player playerU = player.getPlayerById(1);
            playerU.setName("Neymar JR");
            playerU.setPosition("CAM");
            player.updatePlayer(playerU);

            //delete
            player.deletePlayer(5);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
