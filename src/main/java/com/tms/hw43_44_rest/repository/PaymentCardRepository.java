package com.tms.hw43_44_rest.repository;

import com.tms.hw43_44_rest.domain.Client;
import com.tms.hw43_44_rest.domain.PaymentCard;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PaymentCardRepository {
    private Connection connection;

    public PaymentCardRepository(Connection connection) {
        this.connection = connection;
    }
    public List<PaymentCard> findAll() {
        List<PaymentCard> paymentCards = new ArrayList<>();
        try {
            String query = "SELECT * FROM payment_cards";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                PaymentCard paymentCard = new PaymentCard();
                paymentCard.setId(resultSet.getLong("id"));
                paymentCard.setCardHolderName(resultSet.getString("card_holder_name"));
                paymentCard.setCardNumber(resultSet.getString("card_number"));
                paymentCard.setAmount(resultSet.getDouble("amount"));
                paymentCards.add(paymentCard);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return paymentCards;
    }

    public PaymentCard findById(Long id) {
        PaymentCard paymentCard = null;
        try {
            String query = "SELECT * FROM payment_cards WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                paymentCard = new PaymentCard();
                paymentCard.setId(resultSet.getLong("id"));
                paymentCard.setCardHolderName(resultSet.getString("card_holder_name"));
                paymentCard.setCardNumber(resultSet.getString("card_number"));
                paymentCard.setAmount(resultSet.getDouble("amount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return paymentCard;
    }

    public void save(PaymentCard paymentCard) {
        try {
            String query = "UPDATE payment_cards SET card_holder_name = ?, card_number = ?, amount = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, paymentCard.getCardHolderName());
            statement.setString(2, paymentCard.getCardNumber());
            statement.setDouble(3, paymentCard.getAmount());
            statement.setLong(4, paymentCard.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
