import java.util.Scanner;
class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int l=(a*b);
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                l=(a*b)/i;
            }
        }
        System.out.println("LCM: "+l);
    }
}
