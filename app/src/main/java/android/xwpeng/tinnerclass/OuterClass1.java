package android.xwpeng.tinnerclass;

/**
 * 成员内部类
 * Created by xwpeng on 17-2-9.
 */

public class OuterClass1 {
    private String str;

    private void outerPrint() {
        str = "outterclass1.outerPrint()";
        System.out.println(str);

//        new InnerClass1().innerPrint();//外部类访问内部类对象与方法需要内部类对象来访问
    }


    public class InnerClass1 {
        private String str;
        public String str2;
        public void innerPrint() {
            outerPrint();
            str = "innerclass1.innerinnerPrint()";
            OuterClass1.this.str = "innerclass1.update outer str";
            System.out.println(str);
            System.out.println( OuterClass1.this.str);
        }
    }
    /*推荐使用getxxx()来获取成员内部类，尤其是该内部类的构造函数无参数时 */
    public InnerClass1 getInnerClass(){
        return new InnerClass1();
    }

}
