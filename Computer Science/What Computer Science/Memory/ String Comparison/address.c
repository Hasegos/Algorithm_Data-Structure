#include<stdio.h>
#include<stdlib.h>

// 컴파일러에서 s[1] -> *(s+1) 바꿔준다.
typedef char* string;
int main(void){
    string s = "EMMA";
    printf("%c\n",*s);
    printf("%c\n", *(s+1));
    printf("%c\n", *(s+2));
    printf("%c\n", *(s+3));
}   