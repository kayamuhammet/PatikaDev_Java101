public class Student {
    String name, stuNo;
    int classes;
    Course math;
    Course phy;
    Course chem;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math, Course phy, Course chem){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.phy = phy;
        this.chem = chem;
        this.isPass = false;
    }

    public void addExamNote(int math, int phy, int chem){
        if(math >= 0 && math <= 100){
            this.math.examNote = math;
        }
        if(phy >= 0 && phy <= 100){
            this.phy.examNote = phy;
        }
        if(chem >= 0 && chem <= 100){
            this.chem.examNote = chem;
        }
    }

    public void addQuizNote(int math, int phy, int chem){
        if(math >= 0 && math <= 100){
            this.math.quizNote = math;
        }
        if(phy >= 0 && phy <= 100){
            this.phy.quizNote = phy;
        }
        if(chem >= 0 && chem <= 100){
            this.chem.quizNote = chem;
        }
    }

    public void calcAvarage(){
        double mathNote = (this.math.examNote * this.math.effectOfExam) + (this.math.quizNote * this.math.effectOfQuiz);
        double phyNote = (this.phy.examNote * this.phy.effectOfExam) + (this.phy.quizNote * this.phy.effectOfQuiz);
        double chemNote = (this.chem.examNote * this.chem.effectOfExam) + (this.chem.quizNote * this.chem.effectOfQuiz);

        this.average = (mathNote + phyNote + chemNote) / 3;
    }

    public boolean isCheckPass(){
        calcAvarage();
        return this.average > 55;
    }


    public void isPass(){
        if(this.math.examNote == 0 ||this.phy.examNote == 0 || this.chem.examNote == 0 ||
                this.math.quizNote == 0|| this.phy.quizNote == 0|| this.chem.quizNote == 0){
            System.out.println("Notes are not fully entered.");
        }
        else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Avarage : "+ this.average);
            if(this.isPass){
                System.out.println("Passed the class.");
            }
            else {
                System.out.println("Failed the class.");
            }
        }
    }

    public void printNote(){
        System.out.println("=================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note : " + this.math.examNote);
        System.out.println("Math Quiz Note : " + this.math.quizNote);
        System.out.println("Physics Note : " + this.phy.examNote);
        System.out.println("Physics Quiz Note : " + this.phy.quizNote);
        System.out.println("Chemistry Note : " + this.chem.examNote);
        System.out.println("Chemistry Quiz Note : " + this.chem.quizNote);
    }

}
