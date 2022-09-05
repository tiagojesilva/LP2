#include <stdio.h>
#include <stdlib.h>

int main()
{
    //passar ponteiro como parametro de uma funcao


    void testeVariavel (int x);
    void testePonteiro (int *pX);

    int teste = 1;
    int *pTeste = &teste; //recebendo o valor da variavel teste

    testePonteiro(pTeste); //passando por parametro o valor
    printf("%d",teste);


    return 0;
}

void testeVariavel (int x){
    ++x;
}

void testePonteiro (int *pX){
    ++*pX;
}
