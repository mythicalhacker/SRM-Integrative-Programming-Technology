#include <stdio.h>
#include "Exception_Difftypes.h"
JNIEXPORT jint JNICALL Java_Exception_1Difftypes_intMethod(JNIEnv *env, jobject obj, jint x, jint y)
{
  return x*y;
}
JNIEXPORT jboolean JNICALL Java_Exception_1Difftypes_booleanMethod(JNIEnv *env, jobject obj, jboolean b)
{
  jboolean x=!b;
  return x;
}

JNIEXPORT jstring JNICALL Java_Exception_1Difftypes_stringMethod(JNIEnv *env, jobject obj, jstring s)
{
  const char *org;
  char *upper;
  org = (*env)->GetStringUTFChars(env,s,NULL);
  int i;
  int size = (*env)->GetStringUTFLength(env,s);
  for(i=0;i<size;i++)
  {
    if((int)org[i] >= 97)
    {
      int x;
      x = (int)org[i];
      x = x - 38;
      upper[i]=putchar(x-38);
    }
    else
    {
      upper[i]=org[i];
    }
  }
  upper[size]='\0';
  return (*env)->NewStringUTF(env,upper);
}
JNIEXPORT void JNICALL Java_Exception_1Difftypes_doit(JNIEnv *env, jobject obj)
{
  printf("Working\n");
}
