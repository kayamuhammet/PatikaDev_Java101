public class main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT",0.20);
        Course fizik = new Course("Fizik", "FZK101", "FZK",0.30);
        Course kimya = new Course("Kimya", "KMY101", "KMY",0.40);

        Teacher t1 = new Teacher("Alim","MAT", "90550000001");
        Teacher t2 = new Teacher("Mehmet","FZK","90550000000");
        Teacher t3 = new Teacher("Ali","KMY","90550000002");

        mat.addTeacher(t1);
        mat.printTeacher();
        fizik.addTeacher(t2);
        fizik.printTeacher();
        kimya.addTeacher(t3);
        kimya.printTeacher();

        Student s1 = new Student("Muhammet",11,"12345",mat,fizik,kimya);
        s1.addExamNote(70,50,80);
        s1.addQuizNote(30,40,50);
        s1.isPass();

        Student s2 = new Student("Talha",11,"12346",mat,fizik,kimya);
        s2.addExamNote(50,100,50);
        s2.addQuizNote(100,20,70);
        s2.isPass();

        Student s3 = new Student("Diyar",11,"12347",mat,fizik,kimya);
        s3.addExamNote(50,20,40);
        s3.addQuizNote(20,60,90);
        s3.isPass();
    }
}
