package inheritance;

public class Review {
    private String body,author;
    private double stars;

    public Review (String author){
        this.author=author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}
