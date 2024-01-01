import java.util.Random;

class Question1{
public static void main(String[] args){

int arr[];
Random random = new Random();
arr = new int[1000];
int min = arr[0];
int max = arr[0];
long start = System.nanoTime ();
for(int i=0 ; i<1000 ; i++){
arr[i] = random.nextInt();
if(max <= arr[i]){
max = arr[i];
}

if(min >= arr[i]){
min = arr[i];
}
}

System.out.println("the min = "+min+" and max = "+max);
long end = System.nanoTime () - start;
System.out.println("the time after the searching = "+ end );


}
}
