import java.util.Scanner;
class problem1
{
    public static void main(String[] args)
    {
        int m, n, c, d;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        m = scanner.nextInt();
        n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter elements of the matrix");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                matrix[c][d] = scanner.nextInt();

        int[][] transpose = new int[n][m];

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                transpose[d][c] = matrix[c][d];

        System.out.println("Transpose of the matrix:");

        for (c = 0; c < n; c++)
        {
            for (d = 0; d < m; d++)
                System.out.print(transpose[c][d]+"\t");

            System.out.print("\n");
        }
    }
}