public class Medicine {
    private String name;
    private double price;
    private String expirationdate;

    public Medicine() {
        this.name = "";
        this.price = 0;
        this.expirationdate = "";
    }

    public Medicine(String name, double price, String expirationdate) {
        this.name = name;
        this.price = price;
        this.expirationdate = expirationdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(String expirationdate) {
        this.expirationdate = expirationdate;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expirationdate='" + expirationdate + '\'' +
                '}';
    }
}
