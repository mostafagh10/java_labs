package PackageMain; 
import Package1.Part2Func;

class Part2Main{
public static void main(String[] args){

Part2Func q = new Part2Func(50,50,50);

float arr[] = q.get();
System.out.println(arr[0]);
System.out.println(arr[1]);

}
}
