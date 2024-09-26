//NOTE IN JAVA - INSTEAD OF PASSING FROM MAIN TO FUNCTION, DESIGN A CLASS FOR THE DATA STRCUTURES = AS THERE IS NO CALL BY ADDRESS FACILITY
import java.util.*;

class program569
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int No1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int No2 = sobj.nextInt();

        Matrix mobj = new Matrix(No1, No2);

        mobj.Accept();
        mobj.Display();
    }
}

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];


    // public Matrix()
    // {
    //     Scanner sobj = new Scanner(System.in);

    //     System.out.println("Enter the number of rows : ");
    //     iRow = sobj.nextInt();

    //     System.out.println("Enter the number of columns : ");
    //     iCol = sobj.nextInt();

    //     Arr[][] = new int[iRow][iCol];
    // }

    public Matrix(int A, int B)
    {
        this.iRow = A;
        this.iCol = B;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the data : ");

        int i = 0, j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    void Display()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Elements from the matrix : ");

        int i = 0, j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }



}