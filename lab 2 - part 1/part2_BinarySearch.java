import java.util.Random;
import java.util.Arrays;
class Question2{

public void binarySearch(int arr[],int L,int H,int key){
    if (L<=H){
        int mid = L+(H-L);
        if(key == arr[mid]){
            System.out.println("key is found in the array");
            return;
        }
        if(key > arr[mid]){
            binarySearch(arr,mid+1,H,key);
        }
        else{
            binarySearch(arr,L,mid-1,key);
        }
    }
    else{
        System.out.println("the key is not found in the array");
    }
}


public static void main(String[] args){

int arr[];
Random random = new Random();
arr = new int[1000];
for(int i=0 ; i<1000 ; i++){
arr[i] = random.nextInt();
}
Arrays.sort(arr);
long start = System.nanoTime ();
int min = arr[0];
int max = arr[999];
Question2 obj = new Question2();
obj.binarySearch(arr,0,999,min);
obj.binarySearch(arr,0,999,max);
long end = System.nanoTime () - start;
System.out.println("the min = "+min+" and max = "+max);
System.out.println("the time after the searching = "+ end );


}
}
