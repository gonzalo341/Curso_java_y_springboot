public class Product {
    String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        this.price = 0.0;
    }

    public double applyDiscount(double percentage){
        System.out.println("Se aplico un descuento del " + percentage + "%");

        double montoDescontado = price * (percentage/100.0);
        return price -= montoDescontado;
    }
}
