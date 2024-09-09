public class dvd extends product { 
    int length;
    String rating;
    String studio;



    public dvd() {
        super();
        length = 0;
        rating = "";
        studio = "";
    }

    public dvd(int number, String name, int quantity, double price, int length, String rating, String studio) {
        super(number, name, quantity, price);
        this.length = length;
        this.rating = rating;   
        this.studio = studio;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating; 
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    

}
