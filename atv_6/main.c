#include <stdio.h>
#include <stdlib.h>

int main()
{
    struct horario {

    int *pHora;
    int *pMinuto;
    int *pSegundo;

    };

    struct horario hoje;

    int hora = 200;
    int minuto = 300;
    int segundo = 400;

    hoje.pHora = &hora;
    hoje.pMinuto = &minuto;
    hoje.pSegundo = &segundo;

    printf("\nHora: %d", *hoje.pHora);
    printf("\nMinuto: %d", *hoje.pMinuto);
    printf("\nSegundo: %d", *hoje.pSegundo);

    //se eu quiser alterar o valor diretamente faria assim

    *hoje.pSegundo = 500;
     printf("\nSegundo, `alterado`: %d", *hoje.pSegundo);








    return 0;
}
