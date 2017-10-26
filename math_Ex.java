
/**
 * Write a description of class math_Ex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class math_Ex
{
   
   public static void main(String arge[]){
       float f=0.3f;
       float c0=(100-50)/2.0f/f;
       double d0;
      // d0=int(c0);
         d0=Math.ceil(c0);
       System.out.println("c0= "+c0);
       System.out.println("d0= "+d0);
    }
}
