#include <stdio.h>

int main()
{   int ti = 7;
    int *pointer;

    pointer = &ti;

    //impresso o valor para quem o ponteiro aponta
    printf("Valor armazenado --> %d", *pointer);

    //ser� impresso o endere�o de memoria para quem o ponteiro apotna
    printf("\nAddress memory --> %d", pointer);

    return 0;
}
