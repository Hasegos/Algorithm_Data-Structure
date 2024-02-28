// #include<cs50.h>
#include<stdio.h>
#include<stdlib.h>

char *get(char *s){    
    char *str = (char *)malloc(sizeof(char));
    printf("%s", s);
    scanf("%s",str);    
    return str;
}

int main(void){           
    char *answer ;
    answer = get("What's your name\n");
    printf("hello, %s", answer);
}
