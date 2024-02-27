#include<cs50.h>
#include<stdio.h>
/*
    원래는 cs50.h 자체적으로 제작하신 헤더파일에있는데,
    여기서는 적용이 불가능함
    make : 동작을 제어하는 선택적 인자
    클라우드 기반 만들어짐
    라이브러리 가져왔는데 안됨;;
*/
int main(void){       
    string answer = get_string("What's your name\n");
    printf("hello, %s", answer);
}

