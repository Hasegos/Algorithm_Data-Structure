#include<stdio.h>
#include<stdlib.h>

int *get_int(char *str);
void draw(int *height);
int main(void){
    int *height = get_int("Height : ");
    draw(height);
}
void draw(int *height){    
    for(int i = 0; i < *height; i++){
        for(int j = 0; j <= i; j++){
            printf("#");
        }
        printf("\n");
    }    
}

int *get_int(char *str){
    int *n = (int *)malloc(sizeof(int));
    printf("%s",str);
    scanf("%i",n);
    return n;
}