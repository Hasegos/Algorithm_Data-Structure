#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef int *Int;
typedef char* string;
int *get_int(char *str);
char *get_string(char *str);

int main(void){    
    Int i = get_int("i : ");
    Int j = get_int("j : ");
    if(strcmp(i,j) == 0){
        printf("Same\n");
    }
    else{
        printf("Different\n");
    }

    string s = get_string("s : ");
    string t = get_string("t : ");
    printf("%p\n",s);
    printf("%p\n",t);
    
    if(strcmp(s,t) == 0){
        printf("Same\n");
    }
    else{
        printf("Different\n");
    }
}

int *get_int(char *str){
    int *i = (int *)malloc(sizeof(int));
    printf("%s",str);
    scanf("%i", i);
    return i;
}

char *get_string(char *str){
    char *s = (char *)malloc(sizeof(char));
    printf("%s",str);
    scanf("%s", s);
    return s;
}