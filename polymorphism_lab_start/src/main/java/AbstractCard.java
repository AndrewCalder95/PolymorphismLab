public abstract class AbstractCard implements IScan {
    private String cardNumber;
    private String expiryDate;
    private int securityNumber;

    public AbstractCard(String cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public String scan() {
        return "Payment Successful";
    }

    public String addItem(String data) {
        return "Credit Card " + data + " added";
    }
}
