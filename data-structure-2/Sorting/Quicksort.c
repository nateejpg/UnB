#include <stdio.h>

void swap(int *a, int *b){

    int temp = *a;
     *a = *b;
     *b = temp; 
}

int particiona(int arr[], int e, int d){

    int pivo = arr[d];
    int i = (e - 1);
    
    for(int j = e; j <= d - 1; j++){

        if(arr[j] < pivo){
            i++;
            swap(&arr[i], &arr[j]);
        }

    }

        swap(&arr[i + 1], &arr[d]);

        return (i + 1);

}


void quicksort(int arr[], int e, int d){

    if(e < d){

        int pi = particiona(arr, e, d);

        quicksort(arr, e, pi - 1);
        quicksort(arr, pi + 1, d);

    }

}


int main(){

    int arr[] = {6, 4, 2, 8, 1, 19, 3};
    int n = sizeof(arr) / sizeof(arr[0]);

    quicksort(arr, 0, n - 1);

    for(int i = 0; i < n; i++){

        printf("%d", arr[i]);
    }

    return 0;
}