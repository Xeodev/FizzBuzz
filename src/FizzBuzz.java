public class FizzBuzz {


    public static void main (String[] args){

        final String emptyString = "";

        for (int i= 1; i <=100; i++){

            String value = emptyString;

            if (i % 3 ==0) value += "Fizz";

            if (i % 5 == 0) value += "Buzz";

            if (value == emptyString) value += i;
            System.out.println();
            System.out.print(value );
        }
    }
}

