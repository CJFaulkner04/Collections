import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(100);
        num.add(200);
        num.add(300);
        num.add(400);
        num.add(200);

        Set<Integer> uniqueNum = new HashSet<>(num);

        int sum = 0;
        try{

            for (int n : uniqueNum) {
                sum += n;
            }
        } catch(Exception e){
            System.out.println("Couldn't calculate sum");
        }

        double average = 0;
        try{
            average = (double) sum / num.size();
        } catch (Exception e){
            System.out.println("Couldn't calculate average");
        }


        System.out.println("List of integers: " + num);
        System.out.println("List without duplicates: " + uniqueNum);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }

}