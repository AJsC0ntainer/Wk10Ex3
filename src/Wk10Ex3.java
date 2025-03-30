public class Wk10Ex3
{
    public static void main(String[] args)
    {
        int[][] mdArray = {{1,2,3},{4,5,6}};

        System.out.println("==================================");
        System.out.println("Array Elements in Tabular Format.");
        System.out.println("==================================");

        for (int i = 0; i < mdArray.length; i++)
        {
            for (int j = 0; j < mdArray[i].length; j++)
            {
                System.out.print(mdArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("Sum of All Array Elements.");
        System.out.println("==================================");

        int arraySum = 0;

        for (int i = 0; i < mdArray.length; i++)
        {
            for (int j = 0; j < mdArray[i].length; j++)
            {
                arraySum = arraySum + mdArray[i][j];
            }
        }
        System.out.println(arraySum);

        System.out.println("==================================");
        System.out.println("Transpose the Matrix.");
        System.out.println("==================================");

        int[][] transposedMatrix = new int[3][2];
        
        for (int i = 0; i < mdArray.length; i++)
        {
            for (int j = 0; j < mdArray[i].length; j++)
            {
                transposedMatrix[j][i] = mdArray[i][j];
            }
        }
        for (int i = 0; i < transposedMatrix.length; i++)
        {
            for (int j = 0; j < transposedMatrix[i].length; j++)
            {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nEnd of The Program...\n");


        


        
        
    }
}
