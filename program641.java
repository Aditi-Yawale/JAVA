class program641
{
    public static void main(String Arg[]) 
    {
        System.out.println("---------Marvellous Database Management System---------");
    
        Employee eobj1 = new Employee(1, "Amit", "Pune", 11000);
        Employee eobj2 = new Employee(2, "Sagar", "Mumbai", 21000);
        Employee eobj3 = new Employee(3, "Pooja", "Satara", 51000);

        eobj1.DisplayInfo();
        eobj2.DisplayInfo();
        eobj3.DisplayInfo();
    }

}

class Employee
{
    public int EID;
    public String EName;
    public Sring EAddress;
    public int ESalary;

    private static int Counter;

    static
    {
        Counter = 0;
    }

    public Employee(int A, String B, String C, int D)
    {
        this.EID = A;
        this.Ename = B;
        this.EAddress = C;
        this.ESalary = D;
    }

    void DisplayInfo()
    {
        System.out.println("EID : "+EID+" Name : "+EName+" Address : "+EAddress+" Salary : "+ESalary);
    }
}