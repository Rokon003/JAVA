import java.lang.*;

public class Main {
    public static void main(String[]args){
        int i,j,size=0;
        int[] A={10,20,30,40,50,60,71,80,90,91};
        int[] B={11,20,30,40,50,60,71,80,90,91};
        int[] C=new int[A.length];
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<B.length;j++)
            {
                if (A[i]==B[j])
                {
                    C[i]=A[i];
                    size++;
                }
            }
        }
        for (i=0;i<C.length;i++)
        {
            if(C[i]!=0)
                System.out.println("Common element: "+C[i]);
        }
        if(size==0)
            System.out.println("No common elements");
    }
}
