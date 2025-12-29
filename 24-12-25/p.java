import java.util.Scanner;
class prime_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        boolean f=true;
        if(n<=1) f=false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                f=false;
                break;
            }
        }
        if(f)
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is not prime");
    }
}
