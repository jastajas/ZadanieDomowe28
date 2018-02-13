import java.util.*;

public class ArrayNumTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> positiveNumbers = new ArrayList<>();

        int tempNumber = 0;

        try {
            do{
            System.out.println("Wprowadź liczbę całkowitą: ");
                tempNumber = sc.nextInt();
                if (tempNumber > 0) {
                    positiveNumbers.add(tempNumber);
                }
            } while(tempNumber >= 0);
        } catch (InputMismatchException e){
            System.out.println("Niewłasciwy typ danych.");
        }

        System.out.println(positiveNumbers.toString());

        for (int i = positiveNumbers.size() - 1 ; i >= 0 ; i--) {
            System.out.println(positiveNumbers.get(i));
        }

        int sum = 0;

        for (int i = 0; i < positiveNumbers.size(); i++) {
            System.out.print(positiveNumbers.get(i));
            sum += positiveNumbers.get(i);
            if(i < positiveNumbers.size()-1){
                System.out.print("+");
            } else {
                System.out.print("=");
                System.out.print(sum);
            }
        }
        System.out.println();

        System.out.println("Max value: " + Collections.max(positiveNumbers));

        int maxVal = positiveNumbers.get(0);
        for (int i = 0; i < positiveNumbers.size(); i++) {
            if(maxVal < positiveNumbers.get(i)){
                maxVal = positiveNumbers.get(i);
            }
        }

        System.out.println("Maksymalna wartość to: " + maxVal);

        System.out.println("Min value: " + Collections.min(positiveNumbers));

        int minVal = positiveNumbers.get(0);
        for (int i = 0; i < positiveNumbers.size(); i++) {
            if(minVal > positiveNumbers.get(i)){
                minVal = positiveNumbers.get(i);
            }
        }

        System.out.println("Minimalna wartość to: " + minVal);


    }
}
