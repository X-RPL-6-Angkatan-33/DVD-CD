package Bert;

public class DVD extends Product {
    private String length;
    private int rating;
    private String studio;

    public DVD() {
        super();
        this.length = "";
        this.rating = 0;
        this.studio = "";
    }

    public DVD(int number, String name, int quantity, double price, String length, int rating, String studio) {
        super(number, name, quantity, price);
        this.length = length;
        this.rating = rating;
        this.studio = studio;
    }

    // Getters and Setters
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("Lenght :" + length);
        System.out.println("Rating :" + rating);
        System.out.println("Studio :" + studio);
    }
}
