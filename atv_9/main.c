#include <stdio.h>
#include <stdlib.h>

struct lista {
    int valor;
    struct lista *proximo;
};

// retornando endereco memoria
struct lista *procurarValor(struct lista *pLista, int valor){// struct lista *pLista retornar o endereco inicial de uma lista
    while(pLista != (struct lista *)0){
        if(pLista -> valor == valor){
                return (pLista);
        }else {
            pLista = pLista -> proximo;

        }

    }
    return (struct lista *)0; //sem esse return funciona

};

int main()
{
    //lista concatenada e funcao que retorna ponteiro

     struct lista *procurarValor (struct lista *pLista, int valor);
     struct lista m1, m2, m3;
     struct lista *resultado, *gancho = &m1;
     int resu;

     m1.valor = 1;
     m2.valor = 2;
     m3.valor = 3;
//printf("%d", m3.valor);

     m1.proximo = &m2;
     m2.proximo = &m3;
     m3.proximo = 0;

     printf("Digite um valor da pesquisa " );
     scanf("%d", &resu);

     resultado = procurarValor (gancho, resu);

     if(resultado == (struct lista *)0)   {
        printf("\nValor nao encontrado ");
     }else {
        printf("Valor [ %d ] encontrado", resultado -> valor);
     }

    return 0;
}
