#include <stdio.h>


int CalcProdSumSub(int numa, int numb){

    if(numb == 0){

        return 0;

    }else if(numb > 0){

        return numa + CalcProdSumSub(numa, numb - 1);

    }else{

        return -CalcProdSumSub(numa, -numb);
    }
}

int main(){


    int numa;
    int numb;
    int result = 0;

    scanf("%d",&numa);
    scanf("%d",&numb);


    result = CalcProdSumSub(numa, numb);

    printf("The result is %d", result);
    


    

    return 0;
}

