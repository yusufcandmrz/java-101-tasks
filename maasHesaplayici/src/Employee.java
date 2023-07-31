public class Employee {

    public String name;
    public double salary;
    public int workHours;
    public int hireYear;
    public double extraSalary = 0;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){

        double texAmount = 0;

        if(salary >= 1000){
            texAmount = salary * 0.03;
        }

        System.out.println("Vergi Miktarı: " + texAmount);
        extraSalary -= texAmount;
    }

    public void bonus(){

        double extraWorkHours = 0;

        if(workHours > 40){
            extraWorkHours = workHours - 40;
        }

        System.out.println("Bonus Miktarı: " + extraWorkHours*30);
        extraSalary += extraWorkHours * 30;
    }

    public void raiseSalary(){
        int currentYear = 2021;
        int timeRange = currentYear - hireYear;
        double raiseAmount = 0;

        if(timeRange < 10){
            raiseAmount = salary * 0.05;
        }
        else if(timeRange < 20){
            raiseAmount = salary * 0.10;
        }
        else{
            raiseAmount = salary * 0.15;
        }

        System.out.println("Maaş Yükseltme Miktarı: " + raiseAmount);
        extraSalary += raiseAmount;
    }

    public void updateSalary(){
        salary += extraSalary;
    }

    @Override
    public String toString() {
        return "Çalışan Adı: " + name + "\nÇalışan Maaşı: " + salary + "\nÇalışan Çalışma Saati: " + workHours + "\nÇalışan İşe Başlangıç Yılı: " + hireYear;
    }
}
