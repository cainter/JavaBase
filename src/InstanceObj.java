import Models.*;

public class InstanceObj {
    public static void main(String[] args) {
        Book dragon = new Book("龙族");
        Book shangHaiBaoLei = new Book("上海堡垒");
        Book ciJianDeShaoNian = new Book("此间的少年");
        Author JiangNan = new Author("江南");
        JiangNan.setAge(30);
        JiangNan.setId(1);
        JiangNan.setGender(Gender.男);
        dragon.setAuthor(JiangNan);
        dragon.setPrice(27.00);
        shangHaiBaoLei.setAuthor(JiangNan);
        ciJianDeShaoNian.setAuthor(JiangNan);
        System.out.println(dragon);

        System.out.println(JiangNan);

        Person cainter = JiangNan;
        System.out.println(cainter);
        cainter.Run();

        cainter = (Author)cainter;
        System.out.println(cainter);
        cainter.Run();

        Person p = new Person("认类");
        p.Run();
        Student monster = new Student("Monster");
        monster.Run();

        Person master = new Person("Master");
        master.Run();
        Person JiangLi = new Author("江蓠");
        System.out.println(JiangLi);
        JiangLi.Run();
        Person JinNian = new Student("瑾年");
        JinNian.Run();
    }
}
