#include<stdio.h>
#include<stdlib.h>

int *get_int(char *str);
void draw(int height);
int main(void){
    int *height = get_int("Height : ");
    draw(*height);
}
/*
    recursion에서 언제 끝나는지 시작점 잡아주기
    아래에서 위로 가는 형식임, draw(3) 호출시 draw(2) 호출되고 이는 draw(1)까지 가능형식임
    그래서 1 -> 2 -> 3 ... 순서대로 그려줌
*/
void draw(int height){
    if(height == 0){
        return;
    }    
    draw(height - 1);
    for(int i = 0; i < height; i++){
        printf("#");
    }
    printf("\n");    
}

int *get_int(char *str){
    int *height = (int *)malloc(sizeof(int));
    printf("%s",str);
    scanf("%i",height);
    return height;
}