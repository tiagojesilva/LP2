#include <stdio.h>
#include <stdlib.h>

int main()
{
    //lista concatenada

    struct lista {
        int valor;
        struct lista *proximo;

    };

    struct lista m1, m2, m3;
    struct lista *gancho = &m1;

    m1.valor = 7;
    m2.valor = 1;
    m3.valor = 1990;

    m1.proximo = &m2; // ou struct lista *proximo = &m2;
    m2.proximo = &m3; // ou struct lista *proximo = &m3;
    m3.proximo = (struct lista *)0; //INFORMANDO QUE N TEM MAIS NINGUEM PARA APONTAR
  //  m3.proximo = NULL; ou //m3.proximo = 0;

    while(gancho != (struct lista *)0){

        printf("\n%d",gancho->valor);
        gancho = gancho -> proximo;

    }
/* INICIO BLOCO 2
{
  struct lista
  {
    int valor;
    struct lista *proximo;
  };

  struct lista m1, m2, m3;
  struct lista *gancho = &m1;

  m1.valor = 2;
  m2.valor = 3;
  m3.valor = 4;

  struct lista *proximio;

  m1.proximo = &m2;
  m2.proximo = &m3;
  m3.proximo = (struct lista *) 0;

  printf ("%d", gancho->valor);

  gancho = gancho->proximo;
  printf ("%d", gancho->valor);

   gancho = gancho -> proximo;
   printf("%d", gancho -> valor);

 FIM BLOCO 2*/

    return 0;
}
