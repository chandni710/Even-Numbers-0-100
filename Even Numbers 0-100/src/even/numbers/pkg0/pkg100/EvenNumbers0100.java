package even.numbers.pkg0.pkg100;

public class EvenNumbers0100 {
    public static void main(String[] args) {
       for (int i = 0; i <= 100; i++) {
           if (i % 2 == 0) { //numbers %2 == 0 means it yields no remainder so it is even number//
               System.out.println(i);
           }
       }
    }  
}
