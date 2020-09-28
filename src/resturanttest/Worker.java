
package resturanttest;
public class Worker {
    String firstName;
    String lastName;
    Date DateOfBirth;
    Date HireDate;
    String Gender;

    public Worker() {
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate(Date HireDate) {
        this.HireDate = HireDate;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    
    public Worker(String firstName, String lastName, String Gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        return "first Name: " + firstName + ", last Name: " + lastName + ", Gender: " + Gender;
    }
    
    
    
}
