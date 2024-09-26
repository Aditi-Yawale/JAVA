//ADD MENU DRIVEN PROGRAM ON UR OWN AT LAST - CHANGE INPUT NAMES - TAKE INPUT FROM USER FOR OTHER QUERIES
//CUSTOMIZED DBMS
import java.util.*;

class program662
{
    public static void main(String Arg[]) 
    {
        System.out.println("---------Marvellous Database Management System---------");
    
        MarvellousDBMS mobj = new MarvellousDBMS();

        mobj.InsertIntoTable("Sagar Kulkarni", "Karve Road Pune 4", 11000);
        mobj.InsertIntoTable("Gaurav Sharma", "SB Road Nasik", 21000);
        mobj.InsertIntoTable("Chinmayee Patil", "LB Road Mumbai", 20000);
        mobj.InsertIntoTable("Akash Sudame", "FC Road Satara", 25000);
        mobj.InsertIntoTable("Mansi Joshi", "Panchavati Nasik", 12000);

        mobj.SelectStar();

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter EID To Display Info : ");
        int iValue = sobj.nextInt();

        mobj.SelectSpecific(iValue);

        mobj.SelectSpecific("Mansi Joshi");

        mobj.DeleteFrom(4);
        System.out.println();
        mobj.SelectStar();

        mobj.DeleteFrom(7);
        mobj.DeleteFrom("Gaurav Sharma");
        System.out.println();
        mobj.SelectStar();

        mobj.AggregateSum();

    }

}

class Employee
{
    public int EID;
    public String EName;
    public String EAddress;
    public int ESalary;

    private static int Counter;

    static
    {
        Counter = 0;    //Auto Generator
    }

    public Employee(String B, String C, int D)
    {
        this.EID = ++Counter;
        this.EName = B;
        this.EAddress = C;
        this.ESalary = D;
    }

    void DisplayInfo()
    {
        System.out.println(+EID+"\t"+EName+"\t"+EAddress+"\t"+ESalary);
    }
}

class MarvellousDBMS    //Will Handle All Functionalities
{
    public LinkedList <Employee> lobj;  //Object of LinkedList

    public MarvellousDBMS()
    {
        System.out.println("Marvellous DBMS Started Successfuly...");
        lobj = new LinkedList<Employee>();
    }

    //Insert into Employee values(1, "Sagar", "Pune", 11000);
    public void InsertIntoTable(String Name, String Address, int Salary)
    {
        Employee eobj = new Employee(Name, Address, Salary);
        lobj.add(eobj);
    }

    //Select * from Employee;
    public void SelectStar()
    {
        System.out.println("Data from the Employee Database : ");
        System.out.println("------------------------------------------------------------");

        System.out.println("EID\tEName\t\tEAddress\t\tESalary");
        System.out.println("------------------------------------------------------------");

        for(Employee eref : lobj)
        {
            eref.DisplayInfo();
        }
        System.out.println("------------------------------------------------------------");

    }

    //Select * from Employee where EID = 3;
    public void SelectSpecific(int ID)
    {
        System.out.println("Information of Employee whose EID is : "+ID);

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                eref.DisplayInfo();
                break;
            }
        }
    }

    //Select * from Employee where EName = Sagar;
    public void SelectSpecific(String Name)
    {
        System.out.println("Information of Employee whose Name is : "+Name);

        for(Employee eref : lobj)
        {
            if(Name.equals(eref.EName))
            {
                eref.DisplayInfo();
            }
        }
    }

    //delete from Employee where EID = 3;
    public void DeleteFrom(int ID)
    {
        int index = 0;
        boolean bflag = false;

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                bflag = true;
                break;
            }   
            index++;
        }

        if(bflag == false)
        {
            System.out.println("Unable to prevent from database as given id is not present");
        }
        else
        {
            lobj.remove(index);
        }
    }

    //delete from Employee where Ename = "Sagar";
    public void DeleteFrom(String Name)
    {
        int index = 0;
        boolean bflag = false;

        for(Employee eref : lobj)
        {
            if(Name.equals(eref.EName))
            {
                bflag = true;
                break;
            }   
            index++;
        }

        if(bflag == false)
        {
            System.out.println("Unable to prevent from database as given id is not present");
        }
        else
        {
            lobj.remove(index);
        }
    }

    //Select Sum(ESalary) from Employee;
    public void AggregateSum()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }
        System.out.println("Summation of salary : "+iSum);
    }

    //Select Max(ESalary) from Employee;
    public void AggregateMax()
    {
        int iMax = 0;

        for(Employee eref : lobj)
        {
            if(eref.ESalary > iMax)
            {
                iMax = eref.ESalary;
            }
        }
        System.out.println("Maximum salary is: "+iMax);
    }

    //Select Min(ESalary) from Employee;
    public void AggregateMax()
    {
        int iMin = 0;

        for(Employee eref : lobj)
        {
            if(eref.ESalary < iMin)
            {
                iMin = eref.ESalary;
            }
        }
        System.out.println("Minimum salary is: "+iMin);
    }

    public void AggregateAvg()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }
        System.out.println("Average salary is: "+(iSum / lobj.size()));
    }
    
}