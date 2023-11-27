package Classes;

public class Factorial {
    
    public int fatorial(int number){
        int result = 1;
        for(int i=number; i>0; i--)
        {
            result *= i;
        }
        return result;
    }

    public int repetition(int number, int[] repetitions)
    {
        int numerator = fatorial(number);
        int denominator = 1;

        for(int i=0; i<repetitions.length; i++)
        {
            denominator *= fatorial(repetitions[i]);
        }

        return numerator/denominator;
    }

    public int circlar(int number)
    {
        number--;
        return fatorial(number);
    }
}
