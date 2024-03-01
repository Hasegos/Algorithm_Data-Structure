#include<stdio.h>

int main(void){
    int number[6] = {4, 8 , 16, 23, 42};
    for(int i = 0; i < 6; i ++){
        if(50 == number[i]){
            printf("Found\n");
        }
    }
    printf("Not found\n");
}