#include "Sorting_array.h"
#include "jni.h"
#include <stdio.h>

/*
 * Class:     SortArray
 * Method:    sort
 * Signature: ([I)[I
 */
 JNIEXPORT jintArray JNICALL Java_Sorting_1array_ArraySorting
   (JNIEnv *env, jclass Sorting_array, jintArray arr){

    jsize arrLength = (*env)->GetArrayLength(env,arr);
    jintArray arrSorted =(*env)->NewIntArray(env,arrLength);

    jint *arrOut = NULL;
    arrOut =(*env)->GetIntArrayElements(env,arr, 0);

    for(jsize x = 0; x < arrLength; x++){
        for(jsize y = 0; y < arrLength - 1; y++){
                        if(arrOut[y] > arrOut[y+1]){
				jsize temp = arrOut[y+1];
				arrOut[y+1] = arrOut[y];
				arrOut[y] = temp;
			}
		}
	}

    (*env)->SetIntArrayRegion(env,arrSorted, 0, arrLength, arrOut);
    (*env)->ReleaseIntArrayElements(env,arr, arrOut, 0);

    return arrSorted;
}
