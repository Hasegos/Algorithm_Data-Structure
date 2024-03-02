#include<stdio.h>

// & : 의 주소
// %p : 주소 
int main(void){
    int n = 50;    
    printf("%i\n",*&n);
}