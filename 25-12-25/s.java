import java.util.Scanner;
class s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        System.out.println("Sum of digits: "+s);
    }
}
