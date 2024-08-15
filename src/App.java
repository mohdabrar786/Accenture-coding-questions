import java.util.*;
class Program1{
    public static void main(String[] args){
        int ar[]=new int[]{1,2,3,4,5};
        int n=ar.length;
        zeroShift(ar,n);
        System.out.println(Arrays.toString(ar));
    }
    public static void zeroShift(int ar[],int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(ar[i]!=0){
                ar[j]=ar[i];
                j++;}}
                while(j<n){
                    ar[j]=0;
                    j++;
                }
        }
    }
