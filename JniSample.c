#include <stdio.h>
#include "JniSample.h"
int check()
{
return 5;
}
JNIEXPORT jint JNICALL Java_JniSample_sayHello(JNIEnv *env,jobject obj)
{
  printf("Hello World :%d)\n",check());
  //check();
  return 0;
}
