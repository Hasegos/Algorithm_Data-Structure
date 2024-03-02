#include<stdio.h>

void noswap(int a, int b);
int main(void){
    int x = 1;
    int y = 2;

    printf("x is %i, y is %i\n",x,y);
    noswap(x,y);
    printf("x is %i, y is %i\n",x,y);
}

void noswap(int a, int b){
    int tmp = a;
    a = b;
    b = tmp;    
}