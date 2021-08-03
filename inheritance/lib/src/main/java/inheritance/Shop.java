package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name,description;
    private int dSigns;
    private String singsNum;
    private List<Review> reviews=new ArrayList<Review>();
    private int reviewscount=0;
    private double reviewStars;



    public Shop(String name,String description,int dSigns){
        this.name=name;
        this.description=description;
        this.dSigns=dSigns;
    }
    public Review addReview(Review newReview){
        if (reviewscount==0){
            reviewscount=1;
            this.reviews.add(newReview);
            this.reviewStars=(this.reviewStars+newReview.getStars())/reviewscount;
            return newReview;
        }else {
            reviewscount += 1;
            this.reviews.add(newReview);
            this.reviewStars = (this.reviewStars + newReview.getStars()) / reviewscount;
            return newReview;
        }
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getdSigns() {
        return dSigns;
    }

    public void setdSigns(int dSigns) {
        this.dSigns = dSigns;
    }

    @Override
    public String toString() {
        if (dSigns<=10){
            singsNum="$";
        }else if (dSigns>10 && dSigns<=50){
            singsNum="$$";
        }else if (dSigns>50 && dSigns<=200){
            singsNum="$$$";
        }else if(dSigns>200 && dSigns<=500){
            singsNum="$$$$";
        }else if (dSigns>500){
            singsNum="$$$$$";
        }
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", singsNumber='" + singsNum + '\'' +
                ", reviewAverage='" + reviewStars + '\'' +
                ", reviews=" + reviews +
                '}';
    }

}
