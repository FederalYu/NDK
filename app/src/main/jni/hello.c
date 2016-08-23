//
// Created by 于军 on 2016/8/23.
//
#include <jni.h>

JNIEXPORT jstring JNICALL Java_com_yujun_ndk_MainActivity_getStringFromJni
  (JNIEnv* env, jclass obj){ //记得添加参数
    //C语言中的字符串
    char *str = "Hello, NDK";
    //把C语言的字符串转化成Java的字符串
    jstring jstr = (*env)->NewStringUTF(env, str);
    //返回字符串
    return jstr;
  }