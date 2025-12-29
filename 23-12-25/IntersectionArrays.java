import java.util.*;
class m {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array 1: ");
        int n1=sc.nextInt();
        int[] a1=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }
        System.out.print("Enter size of array 2: ");
        int n2=sc.nextInt();
        int[] a2=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> rs=new HashSet<>();
        for(int x:a1) s1.add(x);
        for(int x:a2){
            if(s1.contains(x)) rs.add(x);
        }
        System.out.print("Intersection: ");
        for(int x:rs) System.out.print(x+" ");
    }
}
