package android.xwpeng.tinnerclass;

/**
 * Created by xwpeng on 17-2-16.
 */

public class Son {

    public void printlnSelf() {
        System.out.println("strong: " + new _Father().Strong);
        System.out.println("love: " + new _Mother().love);
    }
    private class _Father extends Father{
        _Father(){
            Strong = Strong -1;
        }

    }
    private class _Mother extends Mother{
        _Mother() {
            love = love - 1;
        }

    }
}
