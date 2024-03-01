#include<stdlib.h>
#include<stdio.h>

float get_float(char *str){
    float *f = (float *)malloc(sizeof(float));
    printf("%s", str);
    scanf("%f",f);
    return *f;
}

int main(void){
    float x = get_float("x : ");
    float y = get_float("y : ");
    // 부동소수점 부정확성
    // 저장할수 있는 수가 한계가있다. 32비트임
    printf("x / f = %.10f\n", x / y);
}
