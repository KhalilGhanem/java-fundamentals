package inheritance;

import java.util.*;
import java.util.List;

public class Theater {
    private String name;
    private List<Review> reviews=new ArrayList<Review>();
    private List<String> movies=new ArrayList<String>();
//    private HashMap<String, List<Review>> movies = new HashMap<String, List<Review>>();

    private int reviewscount=0;
    private double reviewStars;
    public Theater(String name){
        this.name=name;
    }

    public void addMovie(String movie){
        movies.add(movie);
    }
    public void removeMovie(String movie){
        movies.remove(movie);
    }

    public Review addReview(Review newReview){

//        if (movies.containsKey(newReview.getMovie())){
//            System.out.println("found");
//            movies.get(newReview.getMovie()).add(newReview);
//        }
        if (reviewscount==0){
            System.out.println(newReview+" first");
            reviewscount=1;
            this.reviews.add(newReview);
            this.reviewStars=(this.reviewStars+newReview.getStars())/reviewscount;
            return newReview;
        }else {
            System.out.println(newReview+ "second");
            reviewscount += 1;
            System.out.println(reviewscount);
            this.reviews.add(newReview);
            System.out.println(newReview.getStars());

            this.reviewStars = (this.reviewStars + newReview.getStars()) / reviewscount;
            System.out.println(reviewStars);
            return newReview;
        }

    }

//    public HashMap<String, List<Review>> getMovies() {
//        return movies;
//    }
//
//    public void setMovies(HashMap<String, List<Review>> movies) {
//        this.movies = movies;
//    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", reviews=" + reviews +
                ", TheaterRate=" + reviewStars +
                '}';
    }
}
