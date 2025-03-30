public class Wk10Ex3
{
    public static void main(String[] args)
    {
        //Declare and initialize a 2x3 multi-dimensional array.
        int[][] mdArray = {{1,2,3},{4,5,6}};
        //Section Title.
        //Styling
        System.out.println("==================================");
        System.out.println("Array Elements in Tabular Format.");
        //Styling
        System.out.println("==================================");
        //Loop through each rwo of the matrix.
        for (int i = 0; i < mdArray.length; i++)
        {
            //Loop through each column in current row.
            for (int j = 0; j < mdArray[i].length; j++)
            {
                //Print the current element.
                System.out.print(mdArray[i][j] + " ");
            }
            //Prints a new line after each row.
            System.out.println();
        }
        //Section Title.
        //Styling
        System.out.println("==================================");
        System.out.println("Sum of All Array Elements.");
        //Styling
        System.out.println("==================================");
        //Variable to store the total sum of all elements.
        int arraySum = 0;
        //Loop through each row of the matrix.
        for (int i = 0; i < mdArray.length; i++)
        {
            //Loop through each column in current row.
            for (int j = 0; j < mdArray[i].length; j++)
            {
                //Add elements to the sum.
                arraySum = arraySum + mdArray[i][j];
            }
        }
        //Prints the final sum of the elements.
        System.out.println(arraySum);
        //Section Title.
        //Styling
        System.out.println("==================================");
        System.out.println("Transpose the Matrix.");
        //Styling
        System.out.println("==================================");
        //New Reversed Marix 2X3
        int[][] transposedMatrix = new int[3][2];
        //Loop through each row of the matrix.
        for (int i = 0; i < mdArray.length; i++)
        {
            //Loop through each row of the matrix.
            for (int j = 0; j < mdArray[i].length; j++)
            {
                //Assign value switching row and column positions
                transposedMatrix[j][i] = mdArray[i][j];
            }
        }
        //Loop for printing the transposed matrix.
        for (int i = 0; i < transposedMatrix.length; i++)
        {
            //Loops through each column in new matrix
            for (int j = 0; j < transposedMatrix[i].length; j++)
            {
                //Print transposed elements
                System.out.print(transposedMatrix[i][j] + " ");
            }
            //Line after each row is printed.
            System.out.println();
        }
        //End of the Program.
        System.out.println("\nEnd of The Program...\n");
        
        //Pushed to GitHub Wk10Ex3 Repo.
    }
}
