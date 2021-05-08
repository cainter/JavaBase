import java.util.Scanner;

public class Variable {
    /* 变量 */
    public static void main(String[] args) {
        // byte     1子节     -128 ~ 127
        // short    2子节     -32768 ~ 32767
        // int      4子节     -2147483648 ~ 2147483647
        // long     8子节     -9223372036854775808 ~ 9223372036854775807
        // float    4子节
        // double   8子节
        // char     2子节

        /* 基础类型 */
        // 整型子节
        int n = 2147483647;
        int n1 = -2147483648;
        int n2 = 2_000_000_000; // 加下划线
        int n4 = 0xff0000;  // 十六进制 16711680
        int n5 = 0b100000000;   // 二进制表示的512
        long l = 9000000000000000000L;  // long类型结尾需要加L
        /*注意:同一个数的不同进制表示是完全相同的*/
        System.out.println("n = " + n4);

        // 浮点型
        float f1 = 3.14f;
        float f2 = 3.14e38f;    // 科学计数法表示3.14 * 10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324;

        // 布尔类型
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3;
        int age = 12;
        boolean isAdult = age >= 18;

        // 字符类型
        char a = 'A';
        char zh = '中';

        /* 引用类型 */
        // 字符串
        String s = "hello";
        // 一维数组
        int[] score = {80, 81, 98};
        // 字符串数组
        String[] stringList = new String[5];
        String[] books = new String[]{"book1", "book2", "book3"};
        // 二维数组
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 7, 9}};
        // 对象
        Scanner sc = new Scanner(System.in);

        // 常量
        final double PI = 3.14;
        double r = 5.0;
        double area = PI * r * r;
        /*  常量的作用是用有意义的变量名来避免魔术数字（Magic number），例如，不要在代码中到处写3.14，而是定义一个常量。
            如果将来需要提高计算精度，我们只需要在常量的定义处修改，例如，改成3.1416，而不必在所有地方替换3.14。
        */

        // var 关键字
        var sb = new StringBuffer();    // 实际为 StringBuffer sb = new StringBuffer();


    }
}
