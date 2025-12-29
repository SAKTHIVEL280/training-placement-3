import java.util.Scanner;
class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int x=sc.nextInt();
        if(x<0){
            System.out.println("Not palindrome");
            return;
        }
        int o=x,r=0;
        while(x!=0){
            int d=x%10;
            r=r*10+d;
            x/=10;
        }
        if(o==r)
            System.out.println(o+" is palindrome");
        else
            System.out.println(o+" is not palindrome");
    }
}
