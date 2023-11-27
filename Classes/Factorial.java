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
}
