#include<stdio.h>

void swap(int *a, int *b);
int main(void){
    int x = 1;
    int y = 2;

    printf("x is %i, y is %i\n",x,y);
    // &로 주소 가져오고 *로 주소 값을 변경
    swap(&x,&y);
    printf("x is %i, y is %i\n",x,y);
}

void swap(int *a, int *b){
    int tmp = *a;
    *a = *b;
    *b = tmp;    
}