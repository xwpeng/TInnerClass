package android.xwpeng.tinnerclass;

/**
 * Created by xwpeng on 17-2-16.
 */

public class OuterClass4 {
    private String str1 = "str1";
    private static String str2 = "str2";

    public void a1() {
        System.out.println("a1()");
        new CallBack() {
            private String str3;

            @Override
            public void OnXxx() {
                str1 = "onXxx update " + str1;
                System.out.println(str1 + str2);
            }
        }.OnXxx();
    }

    interface CallBack {
        void OnXxx();
    }
}
