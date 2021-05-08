package Models;

public class Student extends Person {
    public Student(String name){
        super(name);
    }

    private double score;

    @Override
    public void Run(){
        System.out.println("学生在跑步！");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
