package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private int price;
    double stars;
    private List<Review> reviews=new ArrayList<Review>();
    String allreviews="";
    int reviewscount=1;

    public Restaurant(String name){
        this.name=name;
    }

    public Review addReview(Review newReview){
        reviewscount+=1;
        this.reviews.add(newReview);
        this.stars=(this.stars+newReview.getStars())/reviewscount;
        return newReview;
    }

    public void setReviews(List<Review> reviews) {
        reviewscount+=1;
        for (Review review : reviews) {
            allreviews+=review+"\n";
        }
        this.reviews = reviews;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        if (stars>=0 && stars<=5){
            this.stars = stars;
        }else {
            throw new IllegalArgumentException("The number should be inside a range of (0-5)");
        }

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String pricesigns="";
        for(int i=0;i<price;i++){
            pricesigns+="$";
        }
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + pricesigns +
                ", reviews=" + reviews +
                '}';
    }
}
