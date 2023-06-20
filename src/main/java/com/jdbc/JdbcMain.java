package com.jdbc;

import java.sql.*;

public class JdbcMain {
    public static void main(String[] args) {
        //1. регистрация драйвера
        try {
            Class.forName("org.postgresql.Driver");
//            Driver driver = new org.postgresql.Driver();
//            DriverManager.registerDriver(driver);

            //2. создание соединения
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_65_db", "postgres", "4864"); //URL(host,port,database_name), login, password

            //3. создание PrepareStatement
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id=?");
            statement.setLong(1,2);

            //4. Отправка запроса
            //boolean result = statement.execute(); - выполняет, но результат не дает(только true/false)
            //int result = statement.executeUpdate(); - выполняет, возвращает сколько строк изменил.
            //ResultSet resultSet = statement.executeQuery(); //- выполняет и отдает результат(ResultSet)

            System.out.println(statement.execute());
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
