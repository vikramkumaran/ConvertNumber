import java.util.Scanner;
import java.io.File;

/**
 * Created by vikramkumaran on 10/31/16.
 * Test class
 */
public class ConvertNumberTest {

        public static void main(String[] args){
            try{

                ConvertNumber cn = new ConvertNumber();
                if(args.length > 0){
                    Scanner fin = new Scanner(new File(args[0]));
                    while(fin.hasNext()){
                        String[] vals = fin.nextLine().split("\\|");
                        if(!vals[1].trim().equals(cn.convert(Integer.parseInt(vals[0].trim())).trim())){
                            System.out.println (vals [0] + "\t" + vals[1] + " : FAIL (" +
                                    cn.convert(Integer.parseInt(vals[0].trim())).trim() + ")");
                        }
                    }

                }else
                    throw new RuntimeException("Bad usage");

            }catch(Exception ex){
                System.out.println("usage: java -jar ConvertNumberTest <file_name>");
                System.out.println("\tInput file_name: text file with numbers separated from their string representation by | " +
                        "(e.g 3456 | three thousand four hundred fifty six" );
                System.out.println("\tOutput: success or failure for each line of input tested" );
            }

        }

}
