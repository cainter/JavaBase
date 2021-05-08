public class Cacl {
    public static void main(String[] args) {
        /* 四则运算 */
        // 整型运算, 结果总是精确的
        int result_x = 1234 / 67;   // 184
        int result_y = 12345 % 67;  // 17

        // 溢出, 不报错, 但结果是个奇怪的数字
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println("sum = " + sum);  // -2147483641

        // 调用方法
        System.out.println("GaoS(2) = " + GaoS(2));
        ;

        // 浮点数运算
        double d_x = 1.0 / 10;
        double d_y = 1 - 9.0 / 10;
        System.out.println("d_x = " + d_x);   // 0.1
        System.out.println("d_y = " + d_y);   // 0.09999999999999998
        System.out.println(d_x == d_y);     // false
        /* 不能用浮点运算来确定是否相等
         * 由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果。
         * 正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数：
         * */
        if (Math.abs(d_x - d_y) < 0.00001) {
            // 相等
            System.out.println("相等");
        } else {
            // 不相等
            System.out.println("不相等");
        }

        // 调用求解公式
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        double[] result = DoResult(a, b, c);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int GaoS(int n) {
        int result = (1 + n) * n / 2;
        return result;
    }

    // 求解公式
    // x^2 + 3*x - 4 = 0
    public static double[] DoResult(double a, double b, double c) {

        double result_x = (-1 * b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        double result_y = (-1 * b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        return new double[]{result_x, result_y};
    }
}
