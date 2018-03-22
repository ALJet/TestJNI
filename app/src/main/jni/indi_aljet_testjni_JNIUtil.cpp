
 #include "indi_aljet_testjni_JNIUtil.h"

JNIEXPORT jstring JNICALL Java_indi_aljet_testjni_JNIUtil_getWorld
  (JNIEnv * env, jobject obj){
    return env->NewStringUTF("Hello World !, I'm  JNI Test !!!!");
  };

