package android.xwpeng.tinnerclass;

/**
 * Created by xwpeng on 17-2-16.
 */

public class OuterClass3 {
    private String str1 = "str1";
    private static String str2 = "str2";

    private void a1() {
        System.out.println("a1()");
    }
    private static void a2() {
        System.out.println("a2()");
    }

    public static class InnerClass3{
        private String str3 = "str3";
        private static String str4 = "str4";
        public void a3() {
            System.out.println("a3()");
        }
        public static void a4() {
            System.out.println("a4()");
            a2();
            System.out.println(str2);
        }
    }
}
