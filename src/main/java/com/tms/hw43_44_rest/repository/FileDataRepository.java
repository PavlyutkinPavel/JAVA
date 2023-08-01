package com.tms.hw43_44_rest.repository;

import com.tms.hw43_44_rest.domain.FileData;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class FileDataRepository {

    private Connection connection;

    public FileDataRepository(Connection connection) {
        this.connection = connection;
    }

    public void save(FileData fileData) throws SQLException {

        String insertQuery = "INSERT INTO files (file_name, file_data) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, fileData.getFileName());
            preparedStatement.setBytes(2, fileData.getFileData());
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}