import java.util.Scanner;
class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int o=n,s=0,c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        n=o;
        while(n!=0){
            int d=n%10;
            s+=Math.pow(d,c);
            n/=10;
        }
        if(s==o)
            System.out.println(o+" is armstrong");
        else
            System.out.println(o+" is not armstrong");
    }
}
