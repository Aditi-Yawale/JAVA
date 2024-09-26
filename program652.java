//ADD MENU DRIVEN PROGRAM ON UR OWN AT LAST - CHANGE INPUTS

import java.util.*;

class program652
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
        System.out.println("EID : "+EID+" Name : "+EName+" Address : "+EAddress+" Salary : "+ESalary);
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
        for(Employee eref : lobj)
        {
            eref.DisplayInfo();
        }
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
    
}