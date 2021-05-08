public class BooleanCacl {
    public static void main(String[] args) {
        /*布尔运算*/
        // 短路运算
        boolean result = (5 == 3) && (5/0==100);
        System.out.println(result);
        // 三元运算符
        int n = 100;
        String result_n = n>100?"Yes":"No";
        System.out.println(result_n);
    }
}
