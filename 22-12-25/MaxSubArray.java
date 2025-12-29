import java.util.Scanner;
class max_subarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ms=arr[0],cs=arr[0];
        for(int i=1;i<n;i++){
            cs=Math.max(arr[i],cs+arr[i]);
            ms=Math.max(ms,cs);
        }
        System.out.println("Max subarray sum: "+ms);
    }
}
