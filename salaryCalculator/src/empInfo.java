public class empInfo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ahmet",5500,45,2010,58932,1001,"Lifeguard");
        Employee emp2 = new Employee("Mehmet",7500,50,2008,68342,1001,"Teacher");
        Employee emp3 = new Employee("Ali",9500,55,2006,62932,2001,"Front-End Developer");
        Employee emp4 = new Employee("Aylin",10500,60,2000,78932,2001,"Back-End Developer");
        System.out.println("====EMPLOYEES====");
        emp1.toString();
        emp2.toString();
        emp3.toString();
        emp4.toString();

    }
}
