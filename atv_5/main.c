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

    depois->  hora = 7; // para atraves do ponteiro acessar as variaveis da struct e atribuir um valor
    depois -> minuto = 1;
    depois->  segundo = 90; // forma antiga (*depois).hora = 20;


    // INICIO BLOCO 1

    int somatorio = 100;

    struct horario antes;


    antes.hora = somatorio + depois -> segundo;
    antes.minuto = agora.hora + depois-> minuto;
    antes.segundo = depois->minuto + depois->segundo;

    //printer
    printf("\nantes.hora =  %d", antes.hora);
    printf("\nantes.minuto = %d",antes.minuto);
    printf("\nantes.segundo = %d", antes.segundo);
    // printf("%d: %d : %d", agora.hora, agora.minuto, agora.segundo);

    // FIM BLOCO 1


    /* INICIO BLOCO 2, esse  bloco eh diferente do bloco 1 para funcionar bloco 2, copie na area do bloco 1

    struct horario antes, *pt2;
    pt2 = &antes;

    pt2 -> minuto = 33;

    antes.hora = somatorio + depois -> segundo;
    antes.minuto = agora.hora + depois-> minuto;
    antes.segundo = depois->minuto + depois->segundo;


    printf("\nantes.minuto = %d",antes.minuto);
    printf("\nantes.minuto pelo pointer = %d",pt2->minuto);
    printf("\ndepois.minuto = %d",depois->minuto);


     FIM BLOCO 2 */

    return 0;
}
