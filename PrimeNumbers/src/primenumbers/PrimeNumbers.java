package primenumbers;

/**
 *
 * @author Daniel Gurbiel
 */

public class PrimeNumbers {
    private int range;
    private int start;
    private final int STANDARD_RANGE = 100;
    
    public PrimeNumbers(){
        start = 1;
        range = STANDARD_RANGE;
    }
    
    public PrimeNumbers(int range){
        start = 1;
        this.range = range;
    }
    
    public PrimeNumbers(int start, int range){
        this.start = start;
        this.range = range;
    }
 
    public void generatePrimeNumbers(){
        boolean check;
        for(int i = start ; i <= range ; i++){
            check = true;
            
            for(int j = 2 ; j < i ; j++){
                if(i%j == 0) check = false;
            }
            
            if(check) System.out.println(i);
        }
    } 
}
