public class Department {

    private String departmentName;
    private int employeeCount;

    public Department(String departmentName, int employeeCount) {
        this.departmentName = departmentName;
        this.employeeCount = employeeCount;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + departmentName);
        System.out.println("Employees: " + employeeCount);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }
}
