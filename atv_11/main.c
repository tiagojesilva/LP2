#include <stdio.h>
#include <stdlib.h>

int somarVetor (int vetor [], const int n){

    int soma = 0;
    int *ponteiro;
    int *const finalVetor = vetor + n; // apontando para o final do vetor

    for (ponteiro = vetor; ponteiro < finalVetor; ++ponteiro){ // percorrendo a posicao de memoria
        soma += *ponteiro;
    }

    return soma;
}

int main()
{
     int somarVetor (int vetor [], const int n);
     int vetor [10] = {5,5,5,5,5,5,5,5,5,5};

     printf("A soma dos membros do vetor = %d", somarVetor (vetor, 10)); // recebendo a soma dos itens do vetor


    return 0;
}
