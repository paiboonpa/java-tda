package day2;

public class Programmer extends Employee {   
    public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
        super(firstnameInput, lastnameInput, salaryInput);
    }
    public void fixPC(String serialNumber) {
        System.out.println("I'm trying to fix PC serialNumber:" + serialNumber);
    }
    // สร้าง Method createWebsite()
    // สร้าง Method installWindows()
}
   
   