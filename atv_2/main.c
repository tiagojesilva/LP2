#include <stdio.h>
#include <stdlib.h>

int main(  )
{
    //variables
int x = 10;
int *ponteiro;
ponteiro = &x; // ponteiro está apontando para o endereço de x. Aqui quer dizer que se esse ponteiro receber algum valor, automaticamente x também receberá.

int y = 1990;
*ponteiro = y; // o ponteiro está recebendo o valor de y, e esse mesmo valor será atribuído na variável x, pois o ponteiro está apontando para x na linha superior.

printf("%d, %d", x, y); // o resultado será 20, 20 pois quando o ponteiro apontou para x ele automaticamente conseguiu inserir qualquer valor que receber.


    return 0;
}
