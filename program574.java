//Sum of each row of a matrix
import java.util.*;

class program574
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int No1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int No2 = sobj.nextInt();

        Matrix mobj = new Matrix(No1,No2);

        mobj.Accept();
        mobj.Dissplay();
        mobj = null;

        mobj.RowSum();

    }
}

class Matrix
{
    public int iRow, iCol;
    public int Arr[][];
    
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

        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Dissplay()
    {
        int i = 0, j = 0;

        System.out.println("Elements from the matrix : ");
        
        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public int Summation()
    {
        int iSum = 0;
        int i = 0, j = 0;

        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;

    }      
    
    public int Maximum()
    {
        int iMax = 0, i = 0, j = 0;

        iMax = Arr[0][0]; //IMP
        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] > iMax) 
                {
                    iMax = Arr[i][j];
                } 
            }   
        }
        return iMax;
    }

    int Minimum()
    {
        int iMin = 0, i = 0, j = 0;

        iMin = Arr[0][0]; //IMP
        for(i= 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] < iMin) 
                {
                    iMin = Arr[i][j];
                } 
            }   
        }
        return iMin;
    }

    public void RowSum()
    {
        int i = 0, j = 0, iSum = 0;

        iSum = Arr[0][0];
        for(i= 0; i < iRow; i++)
        {
            for(j = 0, iSum = 0; j < iCol; j++)
            {

                iSum = iSum + Arr[i][j];
                
            }  
            System.out.println("Summation of all elements of row no : "+i+1+"is "+iSum);
        
        }
    }

    
}

