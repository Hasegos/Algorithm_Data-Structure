#include<stdio.h>
#include<unistd.h>

int main(void){
    // 정수 오버플로일어나면서 앞으로 넘어갈 1의자리가 사라진다.
    for(int i = 1; i *=2;){        
        printf("%i\n",i);
        sleep(1);
    }
}