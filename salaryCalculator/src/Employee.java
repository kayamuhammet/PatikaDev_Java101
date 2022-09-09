public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int emp_id;
    int dept_id;
    String job_name;


    public Employee(String name, double salary, int workHours, int hireYear,int emp_id, int dept_id,String job_name){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.emp_id = emp_id;
        this.dept_id = dept_id;
        this.job_name = job_name;
    }
    public double tax(){
        if(this.salary >= 1000){
            return salary*3/100;
        }else{
            return 0;
        }
    }

    public double bonus(){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary(){
        if (2021-hireYear<10){
            return salary * 5 / 100;
        }
        if (2021-hireYear<20 && 2021-hireYear>9){
            return salary * 10 / 100;
        }
        if (2021-hireYear>19){
            return salary * 15 / 100;
        }
        return 0;
    }

    public double takeHome(){
        return this.salary + bonus() - tax();
    }

    public double totalSalary(){
        return this.salary + bonus() + raiseSalary() - tax();
    }


    public String toString(){
        System.out.println("Name : " + name);
        System.out.println("Employee ID : " + emp_id);
        System.out.println("Department ID : " + dept_id);
        System.out.println("Job Name : " + job_name);
        System.out.println("Salary : " + salary);
        System.out.println("WorkHours : " + workHours);
        System.out.println("hireYear : " + hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("RaiseSalary : " + raiseSalary());
        System.out.println("Take-Home : " + takeHome());
        System.out.println("Total Salary : " + totalSalary());
        System.out.println("----------------");
        return null;
    }

}
