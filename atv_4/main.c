#include <stdio.h>
#include <stdlib.h>

int main()
{
    struct horario {

    int hora;
    int minuto;
    int segundo;

    }; struct horario agora, *depois;

    depois = &agora; // apontando para a variavel agora

    depois->hora = 7; // para atraves do ponteiro acessar as variaveis da struct e atribuir um valor
    depois ->minuto = 1;
    depois->segundo = 90;
    // forma antiga (*depois).hora = 20;

    //printer

    printf("%d: %d : %d", agora.hora, agora.minuto, agora.segundo);



    return 0;
}
