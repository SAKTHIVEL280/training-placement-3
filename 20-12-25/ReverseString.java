import java.util.Scanner;
class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();
        char[] s=str.toCharArray();
        int l=0,r=s.length-1;
        while(l<r){
            char t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;
            r--;
        }
        System.out.println("Reversed: "+String.valueOf(s));
    }
}
