class Currency {
    private String name;
    private double exchangeRate;

    public Currency(String name, double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
