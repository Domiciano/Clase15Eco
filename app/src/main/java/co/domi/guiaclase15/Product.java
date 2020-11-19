package co.domi.guiaclase15;

public class Product {

    private String id;
    private double price;
    private String name;
    private boolean liked;

    public Product() {
    }

    public Product(String id, double price, String name, boolean liked) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.liked = liked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
