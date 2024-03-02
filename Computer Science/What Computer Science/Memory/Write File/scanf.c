#include<stdio.h>
#include<stdlib.h>

typedef char* string;
int main(void){    
    // int x;
    // printf("x : ");
    // scanf("%i",&x);
    // printf("x : %i\n",x);

    string s = (char *)malloc(sizeof(char));
    printf("s : ");
    scanf("%s",s);
    printf("s : %s\n",s);
    free(s);
}