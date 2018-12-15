#include <stdio.h>
#include "SimpleClass.h"
JNIEXPORT void JNICALL Java_SimpleClass_changecountvalue(JNIEnv *env, jobject ob, jobject obj)
{
  printf("This is C program :)\n");
  jclass cl=(*env)->GetObjectClass(env,ob);
  jmethodID id=(*env)->GetMethodID(env,cl,"Increment","()V");
  (*env)->CallVoidMethod(env,ob,id);
  jclass cl1=(*env)->GetObjectClass(env,obj);
  jmethodID id1=(*env)->GetMethodID(env,cl,"Increment","()V");
  (*env)->CallVoidMethod(env,obj,id);
}
