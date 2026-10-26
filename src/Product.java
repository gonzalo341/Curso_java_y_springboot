public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double applyDiscount(double percentage){
        System.out.println("Se aplico un descuento del " + percentage + "%");

        double montoDescontado = price * (percentage/100.0);
        return price -= montoDescontado;
    }
}
