import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Main{

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

	int catCount = 2;
	System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

	int turtleCount = 0;
	System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
	
	flipNHeads(3);
	clock();
    }
    public static String pluralize(String s,int n) {
        if(n==1){
            return s;
        }else {
            return s+"s";
        }
    }

	
      public static void flipNHeads(int n){
        int flips=0;
        int count=0;
        while(n >count) {
            flips++;
            double rand = Math.random();
            if (rand < 0.5) {
                System.out.println("tails");
		count=0;    
            } else {
                System.out.println("heads");
                ++count;
                if (n==count){
                    System.out.println("It took "+flips+" flips to flip "+ count+" head in a row.");
                }
            }
        }
    }


	  public static void clock(){
        while(true) {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



}
