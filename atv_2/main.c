#include <stdio.h>
#include <stdlib.h>

int main(  )
{
    //variables
int x = 10;
int *ponteiro;
ponteiro = &x; // ponteiro est� apontando para o endere�o de x. Aqui quer dizer que se esse ponteiro receber algum valor, automaticamente x tamb�m receber�.

int y = 1990;
*ponteiro = y; // o ponteiro est� recebendo o valor de y, e esse mesmo valor ser� atribu�do na vari�vel x, pois o ponteiro est� apontando para x na linha superior.

printf("%d, %d", x, y); // o resultado ser� 20, 20 pois quando o ponteiro apontou para x ele automaticamente conseguiu inserir qualquer valor que receber.


    return 0;
}
