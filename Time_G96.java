
/**
 * Write a description of class Time_G96 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Time_G96
{  double time;
    public  Time_G96(int x0,int x1,float f,int s0){
         double c0=Math.ceil((Math.abs(x0-x1))/2.0f/f);//螺旋线次数
       //System.out.println("c0= "+c0);
       double ds=0; //计算切削的总长度
       for(c0--;c0>=0;c0--){
           ds=(x1+c0*f/2.0f)*6.28+ds;
        }
      double time=ds/1000/s0;//总共花费的时间，单位分
      //System.out.println("加工所用的时间是: "+(time*60)+"秒");
      //return time;
      this.time=time;
    }
        
  /* public static void main(String arge[]){
       int x0=100;
       int x1=50;
       float f=0.25f;
       float vs=150;//端面加工线速度,单位m/min
       double c0=Math.ceil((x0-x1)/2.0f/f);//螺旋线次数
       System.out.println("c0= "+c0);
       double s0=0;
       for(c0--;c0>=0;c0--){
           s0=(x1+c0*f/2.0f)*6.28+s0;
        }
      double time=s0/1000/vs;//总共花费的时间，单位分
      System.out.println("加工所用的时间是: "+(time*60)+"秒");
      double k0=Time_G96(100,50,0.25f,150);
      System.out.println("k0.time= "+k0*60+"秒");
      
}*/
}