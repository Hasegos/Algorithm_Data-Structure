#include<stdio.h>

// 문자열 string처럼 사용하고 싶으면 구조체를 통해 미리 정의해놓자. 
// string == char *변수명 
// 주소를 가르키면 첫 글자만 가르키는데 프로그램안에서 \0을 확인해서 문자열을 전체를 가르켜줌
typedef char* string;
int main(void){
    string s = "EMMA";
    printf("%p\n",s);
    printf("%p\n",&s[0]);
    printf("%p\n",&s[1]);
    printf("%p\n",&s[2]);
    printf("%p\n",&s[3]);
}