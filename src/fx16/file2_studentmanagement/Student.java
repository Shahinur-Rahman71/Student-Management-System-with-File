
package fx16.file2_studentmanagement;


public class Student {
    
    String name;
    String email;
    String department;
    String address;

    public Student(String name, String email, String department, String address) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.address = address;
    }

//    public Student() {
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
