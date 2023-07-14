package com.jdbc;

import java.lang.reflect.Type;
import java.sql.*;

public class JdbcCallableStatement {
    public static void main(String[] args) {
        //1. регистрация драйвера
        try {
            Class.forName("org.postgresql.Driver");

            //2. создание соединения
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group_65_db", "postgres", "4864"); //URL(host,port,database_name), login, password

            CallableStatement statement = connection.prepareCall("{call find_max_salary_by_age(?)}");
            //регистрация возвращаемого значения функции
            statement.registerOutParameter(1, Types.INTEGER);
            statement.setInt(1, 18);
            statement.execute();
            //результат в statement а не в resultset

            int result = statement.getInt(1);
            System.out.println(result);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
