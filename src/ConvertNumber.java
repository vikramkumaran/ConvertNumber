import java.util.HashMap;

/**
 * Created by vikramkumaran on 10/31/16.
 *
 * A utility class that converts integers between -999999 and 999999 to its
 * string representation
 *
 */
public class ConvertNumber {


    public static void main(String[] args){

        try{
            System.out.println(args[0] + " --> " + (new ConvertNumber()).convert(Integer.parseInt(args[0])));
        }catch(Exception ex){

           System.out.println(ex.getMessage() + "\n");
           System.out.println("usage: java -jar ConvertNumber <number>");
           System.out.println("\tInput <number>: Integer values from -999, 999 to 999, 999" );
            System.out.println("\tOutput: String representation of the value" );
        }

    }


    private final HashMap<Integer,String> numsMap;
    private final String ZERO = "zero";

    public ConvertNumber(){
        numsMap = new HashMap<>();
        numsMap.put(0,ZERO);
        numsMap.put(1,"one");
        numsMap.put(2,"two");
        numsMap.put(3,"three");
        numsMap.put(4,"four");
        numsMap.put(5,"five");
        numsMap.put(6,"six");
        numsMap.put(7,"seven");
        numsMap.put(8,"eight");
        numsMap.put(9,"nine");
        numsMap.put(10,"ten");
        numsMap.put(11,"eleven");
        numsMap.put(12,"twelve");
        numsMap.put(13,"thirteen");
        numsMap.put(14,"fourteen");
        numsMap.put(15,"fifteen");
        numsMap.put(16,"sixteen");
        numsMap.put(17,"seventeen");
        numsMap.put(18,"eighteen");
        numsMap.put(19,"nineteen");
        numsMap.put(20,"twenty");
        numsMap.put(30,"thirty");
        numsMap.put(40,"forty");
        numsMap.put(50,"fifty");
        numsMap.put(60,"sixty");
        numsMap.put(70,"seventy");
        numsMap.put(80,"eighty");
        numsMap.put(90,"ninety");
    }

    /**
     * Converts numbers into string representation
     * @param i an integere between  -999, 999 and 999, 999
     * @return String represententation
     */
    public String convert(int i){

        if(i == 0) return ZERO;
        String sign = i<0?"minus ":"";
        i = Math.abs(i);
        if(i > 999999) throw new RuntimeException("Input out of range");

        String top = triples(i/1000);
        String bottom = triples(i%1000);
        return sign + (ZERO.equals(top)?"":(top + " thousand "))
                + (ZERO.equals(bottom)?"":bottom);

    }

    /**
     * Utility method that handles numbers between 0 to 1000
     * @param i number between 0 to 1000 (e.g 856)
     * @return String represententation (e.g "eight hundred fifty six")
     */
    private String triples(int i){

        if(i == 0) return ZERO;

        // Figure out numbers between 0-100
        String tens = numsMap.get(i%100);
        // Figure out numbers between 20-100 that are not divisible by 10
        tens = ZERO.equals(tens)?"":tens;
        if(tens == null){
            tens = (numsMap.get((i%100)-(i%10))) + " " + (numsMap.get(i%10));
        }


        // Figure out how many hundreds
        String hundreds = numsMap.get(i/100);
        hundreds = ZERO.equals(hundreds)?"":(hundreds+ " hundred ");



        return hundreds + tens;

    }

}
