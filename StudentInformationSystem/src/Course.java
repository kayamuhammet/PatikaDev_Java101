public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int quizNote;
    double effectOfQuiz;
    double effectOfExam;

    public Course(String name, String code, String prefix, double effectOfQuiz){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.quizNote = 0;
        this.effectOfQuiz = effectOfQuiz;
        noteEffect();
    }

    public void noteEffect(){
        effectOfExam = (1.0-effectOfQuiz);
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Process successful.");
        } else{
            System.out.println(t.name + " Academician cannot teach this course");
        }
    }

    public void printTeacher(){
        if(this.courseTeacher != null){
            System.out.println(courseTeacher.name + " is the academician of the "+ this.name + " course.");
        }else{
            System.out.println("No academician has been assigned to the " + this.name + " course.");
        }
    }
}
