#include <stdio.h>
#include <stdlib.h>

int main()
{
    //variables

    int x = 10;
    double y = 20.50;
    char z = 'T';

    int *pointerX = &x;
    double *pointerY = &y;
    char *pointerZ = &z;

    //operation
    // somando os valores das variaveis para quem cada ponteiro aponta
    double soma = *pointerX + *pointerY;

    //printer

    printf("Address memory of X = %i - Value of X = %i", pointerX, *pointerX);
    printf("\nAddress memory of Y = %i - Value of Y = %f", pointerY, *pointerY);
    printf("\nAddress memory of Z = %i - Value of Z = %c\n", pointerZ, *pointerZ);
    printf("Value of Soma: %f\n",soma);

    //printf("Hello world!\n");




    return 0;
}
