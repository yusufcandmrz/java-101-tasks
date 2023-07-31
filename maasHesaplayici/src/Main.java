public class Main {

    public static void main(String[] args) {

        String employeeName = "Yusuf";
        double employeeSalary = 2000;
        int employeeWorkHouse = 45;
        int employeeHireYear = 1985;

        Employee employee = new Employee(employeeName, employeeSalary, employeeWorkHouse, employeeHireYear);
        System.out.println(employee);

        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        employee.updateSalary();

        System.out.println("Çalışan Güncel Maaşı: " + employee.salary);
    }
}