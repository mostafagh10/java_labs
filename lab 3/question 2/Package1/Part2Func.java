package Package1;
import java.util.function.Supplier;

public class Part2Func implements Supplier<float[]>{
public float a;
public float b;
public float c;
 public Part2Func(float a,float b,float c){
 this.a=a;
 this.b=b;
 this.c=c;
 }
 
 
    @Override
    public float[] get(){
       float formula1 = (b*b)-(4*a*c);
       if(formula1 > 0){
	       float s1 = ((-1*b)+formula1) / (2*a);
	       float s2 = ((-1*b)-formula1) / (2*a);
	       float arr[] = {s1,s2};
	       return arr;
       }else{
       throw new IllegalArgumentException("custom exception occured");
       }
    }



}
