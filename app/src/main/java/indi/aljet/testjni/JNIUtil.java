package indi.aljet.testjni;

/**
 * Created by PC-LJL on 2018/3/22.
 */

public class JNIUtil {

    static {
        System.loadLibrary("JNISample");
    }

    public native String getWorld();

}
