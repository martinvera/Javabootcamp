package tcs_bootcamp.model;

import java.io.Serializable;
import java.util.Objects;

public class Card implements Serializable {
    private static int contadorCard=0;
    private int cardId;
    private String cardNumber;      // Número de tarjeta (16 dígitos)
    private String cardHolderName;  // Nombre completo del titular de la tarjeta
    private double balance;         // Saldo disponible en soles
    private double exchangeRate;   // Tipo de cambio (por ejemplo, 4 soles por dólar)
    private Card(){
        this.cardId= ++Card.contadorCard;

    }
    public Card( String CardNumber, String carderHolderName,double balance,
                double exchangeRate){
        this();
        this.cardNumber=cardNumber;
        this.cardHolderName=carderHolderName;
        this.balance=balance;
        this.exchangeRate=exchangeRate;
    }

    public static int getContadorCard() {
        return contadorCard;
    }

    public static void setContadorCard(int contadorCard) {
        Card.contadorCard = contadorCard;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", balance=" + balance +
                ", exchangeRate=" + exchangeRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardId == card.cardId && Double.compare(card.balance, balance) == 0 && Double.compare(card.exchangeRate, exchangeRate) == 0 && Objects.equals(cardNumber, card.cardNumber) && Objects.equals(cardHolderName, card.cardHolderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, cardNumber, cardHolderName, balance, exchangeRate);
    }
}

