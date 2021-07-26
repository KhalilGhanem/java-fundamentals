/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Random;

public class Library {

    public boolean someLibraryMethod() {
        return true;
    }

    public static int [] roll(int n){
        if(n<0){
            n=0;
        }
        int [] Dice=new int[n];
        Random rn = new Random();

        for (int i=0;i<Dice.length;i++){
            int rand=rn.nextInt(6 - 1 + 1) + 1;
            Dice[i]=rand;
        }
        return Dice;
    }

    public static boolean containsDuplicates(int[]test){
        boolean result=false;
        for (int i = 0; i < test.length; i++) {
            int count=0;
            for (int x = 0; x < test.length; x++) {
                if (test[i]==test[x]){
                    ++count;
//                   System.out.println(count);
                    if (count==2){
                        result=true;
                        return result;
                    }
                }else {
//                   System.out.println("hi");
                    result=false;
                }
            }
        }


        return result;
    }

    public static double calculatingAverages (int[]test){
        double avg=0;
        for (int i : test) {
            avg+=i;
        }
        return avg/test.length;
    }

    public static int[] arrayAvg(int[][]test){
        double low=calculatingAverages(test[0]);
        int idx=0;
        for (int i = 0; i < test.length; i++) {
            if(low>calculatingAverages(test[i])){
                low=calculatingAverages(test[i]);
                idx=i;
            }
        }
        return test[idx];
    }

}
