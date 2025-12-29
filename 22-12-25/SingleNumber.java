import java.util.Scanner;
class j {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=0;
        for(int x:arr){
            r^=x;
        }
        System.out.println("Single number: "+r);
    }
}
