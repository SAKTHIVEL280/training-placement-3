import java.util.Scanner;
class r {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1=sc.nextLine();
        System.out.print("Enter string 2: ");
        String s2=sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("Not anagram");
            return;
        }
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();
        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(a2);
        if(java.util.Arrays.equals(a1,a2))
            System.out.println("Anagram");
        else
            System.out.println("Not anagram");
    }
}
