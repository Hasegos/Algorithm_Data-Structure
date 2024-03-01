#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>

// 1.API 문서 사용법 
// 2.아스키코드 보는법

char *get_string(char *str);
int main(void){
    char *s = get_string("Before : ");
    printf("After : ");
    for(int i = 0, n = strlen(s); i < n; i++){
        // if(s[i] >= 'a' && s[i] <= 'z'){                                  
        //     printf("%c",s[i] - 32);
        // }
        // else{
        //     printf("%c",s[i]);
        // }

        printf("%c",toupper(s[i]));
    }
    printf("\n");
}

char *get_string(char *str){
    char *s = (char *)malloc(sizeof(char));
    printf("%s",str);
    scanf("%s",s);
    return s;
}