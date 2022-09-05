#include <stdio.h>
#include <stdlib.h>

int main()
{
    //ponteiros e vetores

     int vetor[3] = {7, 1, 1990};
     int *ponteiro = &vetor[0]; //aqui informo a posicao

      printf("%d", *ponteiro);

    //int *ponteiro = vetor; // aponto exclusivamente para o primeiro valor
/*
    int *ponteiro = vetor;
    *(ponteiro + 1 ) = 10; //faz mudar a posicao 1 do vetor

     printf("%d", vetor[1]);
*/



    return 0;
}
