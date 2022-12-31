import java.lang.*;

public class Main2 {
    static void reverse(int array1[],int size
    )
    {
        int[] array2=new int[size];
        int j=size;
        for (int i=0;i<size;i++)
        {
            array2[j-1]=array1[i];
            j=j-1;
        }
        System.out.println("\nReversed array is: ");
        for (int k=0;k<size;k++)
        {
            System.out.println(""+array2[k]);

        }
    }
    public static void main(String[]args)
    {
        int i,j,c=0;
        int[] A={10,20,30,40,50,60,71,80,90,91};
        int[] B={11,22,31,40,51,6,712,81,921};
        int[] C=new int [A.length+ B.length];

        for(i=0;i<A.length;i++)
        {
            C[i]=A[i];
            c++;
        }
        for(j=0;j< B.length;j++)
        {
            C[c++]=B[j];
        }
        System.out.println("New merrged array: ");
        for (i=0;i<C.length;i++)
        {
            System.out.println(""+C[i]);
        }
        reverse(C,C.length);
    }
}
