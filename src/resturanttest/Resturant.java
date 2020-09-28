package resturanttest;
public class Resturant {
    private int restID;
    private String restAddess;
    private String PostalBox;
    private String restName;
    private String restOwner;
    private int NbEmployee;
    private Worker[] EmployeeNames;
    
    public Resturant(int restID, String restName, int NbEmployee){
        this.restID= restID;
        this.restAddess = restName;
        setNbEmployee(NbEmployee);
        EmployeeNames = new Worker[this.NbEmployee];
    }
    public Resturant(int restID, String restAddess,
            String restName, String restOwner, int NBEmployee) {
        this.restID = restID;
        this.restAddess = restAddess;
        this.restName = restName;
        this.restOwner = restOwner;
        setNbEmployee(NBEmployee);
        EmployeeNames = new Worker[this.NbEmployee];
    }
    public void setRestID(int restID){
        this.restID = restID;
    }
    public int getRestID(){
        return this.restID;
    }

    public String getRestAddess() {
        return restAddess;
    }
    public void setRestAddess(String restAddess) {
        this.restAddess = restAddess;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestOwner() {
        return restOwner;
    }

    public void setRestOwner(String restOwner) {
        this.restOwner = restOwner;
    }

    public Worker[] getEmployeeNames() {
        return EmployeeNames;
    }

    public void setEmployeeNames(Worker[] EmployeeNames) {
        this.EmployeeNames = EmployeeNames;
    }

    public int getNbEmployee() {
        return NbEmployee;
    }

    public void setNbEmployee(int NbEmployee) {
        if(NbEmployee>0)
            this.NbEmployee = NbEmployee;
        else this.NbEmployee =0;
    }
    
    public void checkRestaurant(){
        if(NbEmployee>=0 && NbEmployee<=5)
            System.out.println("FastFood");
        else if(NbEmployee>=6 && NbEmployee<=15)
            System.out.println("Small Resturant");
        else if(NbEmployee>15)
            System.out.println("this resturant employs "+ NbEmployee + " people");
    }
    public void tostring(){
        System.out.printf("Resturant ID: %d\nResturant Name: %s\nResturant Owner: %s\n"
                + "Resturant Address: %s\nResturant PostalBox: %s\n Number of Employees: %d\n",
                this.restID, this.restName, this.restOwner, this.restAddess, this.PostalBox, this.NbEmployee);
        System.out.println("Employee Details: ");
        
        for(Worker x: this.EmployeeNames)
            System.out.println(x.toString());
    }
}
