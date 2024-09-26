import java.util.*;

class program647
{
    public static void main(String Arg[]) 
    {
        System.out.println("---------Marvellous Database Management System---------");
    
        MarvellousDBMS mobj = new MarvellousDBMS();

        LinkedList <Employee>lobj = new LinkedList<Employee>();

        Employee eobj1 = new Employee("Sagar", "Pune", 21000);
        Employee eobj2 = new Employee("Pooja", "Satara", 11000);

        lobj.add(eobj1);
        lobj.add(eobj2);


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
    public MarvellousDBMS()
    {
        System.out.println("Marvellous DBMS Started Successfuly...");
    }
}