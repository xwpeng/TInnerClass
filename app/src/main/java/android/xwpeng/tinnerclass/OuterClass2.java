package android.xwpeng.tinnerclass;

/**
 * 局部内部类
 * Created by xwpeng on 17-2-16.
 */

public class OuterClass2 {
    private String str1 = "outer";
    interface ILog {
        void print();
    }

    public ILog printInit(final String content) {
         class Log implements ILog {
             String str2;

            @Override
            public void print() {
                str1 = str1 + content;
                str2 = str1 +  " Log content: ";
                System.out.println(str2);
            }

             private void aa () {

             }
        }
        return new Log();
    }

    public void restoreOuterStr(final String s) {
        if (!"outer".equals(str1)) {
             class RestoreLog implements ILog{

                @Override
                public void print() {
                    str1 = "outer";
                    System.out.println(s + " restore " + str1 );
                }
            }
            new RestoreLog().print();
        }
    }
}
