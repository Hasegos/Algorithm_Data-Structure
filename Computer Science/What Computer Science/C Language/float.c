#include <stdlib.h>
#include <stdio.h>

float get_float(char *str){
    float *price = (float *)malloc(sizeof(float));
    printf("%s",str);
    scanf("%f",price);
    return *price;
}
int main(void){
    float price = get_float("What's the price\n");
    printf("Your total is %.2f\n", price * 1.0625);
}