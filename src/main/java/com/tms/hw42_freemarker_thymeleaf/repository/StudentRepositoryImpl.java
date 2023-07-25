package com.tms.hw42_freemarker_thymeleaf.repository;

import com.tms.hw42_freemarker_thymeleaf.domain.Student;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

    private Connection connection;

    public StudentRepositoryImpl(Connection connection) {
        this.connection = connection;
    }
    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try {
            String query = "SELECT * FROM students";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getLong("id"));
                student.setFirstName(resultSet.getString("firstname"));
                student.setLastName(resultSet.getString("lastname"));
                student.setGroup(resultSet.getString("group"));
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public Student findById(Long id) {
        Student student = null;
        try {
            String query = "SELECT * FROM students WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                student = new Student();
                student.setId(resultSet.getLong("id"));
                student.setFirstName(resultSet.getString("firstname"));
                student.setLastName(resultSet.getString("lastname"));
                student.setGroup(resultSet.getString("group"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public void save(Student student) {
        try {
            String query = "INSERT INTO students (firstname, lastname, \"group\") VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());
            statement.setString(3, student.getGroup());
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                Long generatedId = generatedKeys.getLong(1);
                student.setId(generatedId);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            String query = "DELETE FROM students WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
