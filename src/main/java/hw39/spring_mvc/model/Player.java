package hw39.spring_mvc.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class Player {
    private int playerId;
    @Max(10)
    @Min(7)
    private String name;
    @Max(120)
    private int age;
    private String position;
    @Max(99)
    private int jerseyNumber;
    private String status;
    private String statistics;

    // Конструкторы, геттеры и сеттеры для полей

    // Пример конструктора
    public Player() {
    }

    // Геттеры и сеттеры для всех полей
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }
}