import java.util.Scanner;
class k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of days: ");
        int n=sc.nextInt();
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        int mp=p[0],mx=0;
        for(int i=1;i<n;i++){
            if(p[i]<mp){
                mp=p[i];
            }else{
                mx=Math.max(mx,p[i]-mp);
            }
        }
        System.out.println("Max profit: "+mx);
    }
}
