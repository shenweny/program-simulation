
/**
 * 本例程用于产生一个新的加工程序，对象为毛坯轮廓和精车轮廓，以及刀具，加工余量，切削参数
 * 
 */
public class Program_new
{// instance variables - replace the example below with your own
    Primitive lunkuo_1[]=new Primitive[100];//毛坯轮廓
    Primitive lunkuo_2[]=new Primitive[100];//精车轮廓
    public int lunkuo_check(Primitive [] luokuo_all){ //输入轮廓检测方法
        return 0;
    }
    public int lunkuo_include(Primitive [] luokuo_f,Primitive [] lunkuo_e){
        return 1;  //轮廓检查程序，检查是否包含关系，
    }
    
    public Program_new(){
        lunkuo_1[0]=new Primitive(15,15,0,0,3);//实例化轮廓示例
    }
    public static void main(String arge[]){
        float j=2.5f;//粗加工背吃刀量
        float k=2;//精加工外圆余量
        float f=0.3f;//粗加工进给参数
        float h=0.25f;//精加工进给参数
        float d=0.2f;//端面余量参数
        
        Primitive lunkuo_first[]=new Primitive[100];
        Primitive lunkuo_end[]=new Primitive[100];
        Program_new O380=new Program_new();
        O380.lunkuo_1=lunkuo_first;
        O380.lunkuo_2=lunkuo_end;
        lunkuo