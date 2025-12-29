import java.util.Scanner;
class move_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int p=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[p++]=arr[i];
            }
        }
        while(p<n){
            arr[p++]=0;
        }
        System.out.print("After moving zeroes: ");
        for(int x:arr) System.out.print(x+" ");
    }
}
