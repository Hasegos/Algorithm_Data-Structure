#include <stdlib.h>
#include <stdio.h>

int get_int(char *str){
    int *n = (int *)malloc(sizeof(int));
    printf("%s",str);
    scanf("%i",n);
    return *n;
}
int main(void){
   int n = get_int("n : ");
    
    if(n % 2 == 0){
        printf("even\n");
    }
    else{
        printf("odd\n");
    }
}