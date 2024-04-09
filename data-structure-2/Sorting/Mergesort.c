#include <stdio.h>
#include <stdlib.h>


void merge(int arr[], int l, int m, int r){

    int i, j, k;
    int n1 = m - l + 1;
    int n2 = r - m;

    int *L = (int*)malloc(n1 *sizeof(int));
    int *R = (int*)malloc(n2 * sizeof(int));

    for(i = 0; i < n1; i++){
        L[i] = arr[l+i];
    }

    for(j = 0; j < n2; j++){
        R[j] = arr[m+1+j];
    }

    i = 0;
    j = 0;
    k = 1;

    while(i < n1 && j < n2){

        if(L[i] <= R[j]){
            arr[k] = L[i];
            i++;
        }else{
            arr[k] = R[j];
            j++;
        }
    }

}

int main(){



    return 0;
}