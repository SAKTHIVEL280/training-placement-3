import java.util.Scanner;
class e {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array 1: ");
        int m=sc.nextInt();
        int[] a1=new int[m];
        for(int i=0;i<m;i++){
            a1[i]=sc.nextInt();
        }
        System.out.print("Enter size of array 2: ");
        int n=sc.nextInt();
        int[] a2=new int[n];
        for(int i=0;i<n;i++){
            a2[i]=sc.nextInt();
        }
        int[] r=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(a1[i]<a2[j])
                r[k++]=a1[i++];
            else
                r[k++]=a2[j++];
        }
        while(i<m) r[k++]=a1[i++];
        while(j<n) r[k++]=a2[j++];
        System.out.print("Merged: ");
        for(int x:r) System.out.print(x+" ");
    }
}
