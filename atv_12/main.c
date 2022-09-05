#include <stdio.h>
#include <stdlib.h>

void copiarString (char *copiarDaqui, char *colarAqui){

    while(*copiarDaqui != '\0'){ //caracter nulo '\0'
        *colarAqui = *copiarDaqui;
        ++copiarDaqui;
        ++colarAqui;
    }
    *colarAqui = '\0'; // adicionando o caractere nulo
}


int main()
{
    //copiar uma string utilizando ponteiros


    void copiarString (char *copiarDaqui, char *colarAqui);

    char string1 [] = "pao com mortadela";
    char string2 [20];

    copiarString (string1, string2);
    printf("%s\n",string2);


    return 0;
}
