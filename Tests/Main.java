import Classes.Factorial;
public class Main {

    public static void main(String[] args) {
        Factorial test = new Factorial();

        int result;
        int[] array = {3, 2, 2};

        result = test.fatorial(5);

        System.out.println(result);
        
        result = test.circlar(5);

        System.out.println(result);

        result = test.repetition(7, array);

        System.out.println(result);

    }    
}
