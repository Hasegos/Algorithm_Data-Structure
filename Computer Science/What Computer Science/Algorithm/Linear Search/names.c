#include<stdio.h>
#include<string.h>

// 관습적으로 0은 성공, 1는 실패
int main(void){
    char *names[4] = {"EMMA", "RODRIGO", "BRIAN", "DAVID"};

    for(int i = 0; i < 4; i++){        
        if(strcmp(names[i], "EMMA") == 0){
            printf("Found\n");
            return 0;
        }
    }
    printf("Not found\n");
    return 1;
}