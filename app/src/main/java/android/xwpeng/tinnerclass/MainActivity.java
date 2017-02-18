package android.xwpeng.tinnerclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
      /*  OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerClass1 innerClass1 = outerClass1.new InnerClass1();
        innerClass1.innerPrint();*/
/*        OuterClass2 class2 = new OuterClass2();
        class2.printInit("main run").print();
        class2.restoreOuterStr("main");*/
//        OuterClass3.InnerClass3.a4();
//       new  OuterClass4().a1();
        new Son().printlnSelf();
    }

}
