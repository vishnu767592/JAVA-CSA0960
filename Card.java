package jfo7practice;
public class Card {
    private int cardNumber;
    private int credits;
    private int tickets;

    // Constructor
    public Card(int cardNumber) {
        this.cardNumber = cardNumber;
        this.credits = 0;
        this.tickets = 0;
    }

    // Getters
    public int getCardNumber() {
        return cardNumber;
    }

    public int getCredits() {
        return credits;
    }

    public int getTickets() {
        return tickets;
    }

    // Setters
    public void addCredits(int credits) {
        this.credits += credits;
    }

    public void subtractCredits(int credits) {
        if (this.credits >= credits) {
            this.credits -= credits;
        } else {
            System.out.println("Insufficient credits.");
        }
    }

    public void addTickets(int tickets) {
        this.tickets += tickets;
    }

    public void subtractTickets(int tickets) {
        if (this.tickets >= tickets) {
            this.tickets -= tickets;
        } else {
            System.out.println("Insufficient tickets.");
        }
    }
}
