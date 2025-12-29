import java.util.Scanner;
class i {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int es=n*(n+1)/2;
        int as=0;
        for(int x:arr){
            as+=x;
        }
        System.out.println("Missing number: "+(es-as));
    }
}
