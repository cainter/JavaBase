package Models;

public class Author extends Person {

    public Author(String name){
        super(name);
    }

    private double salary;

    @Override
    public void Run(){
        super.Run();
        System.out.println("作者在跑步！");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Author{" +
                "salary=" + salary +
                '}';
    }
}
