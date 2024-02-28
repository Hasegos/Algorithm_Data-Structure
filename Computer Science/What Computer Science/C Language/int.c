#include<stdlib.h>
#include<stdio.h>

int get_int(char *str){
    int *age = (int *)malloc(sizeof(int));
    printf("%s",str);
    scanf("%d",age);
    return *age;
}
int main(void){
    int age = get_int("What's your age\n");    
    printf("You are at least %i days old.\n",age * 365);    
}