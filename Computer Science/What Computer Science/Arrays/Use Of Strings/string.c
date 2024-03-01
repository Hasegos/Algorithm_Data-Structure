#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *get_string(char *str);
int main(void){
    char *s = get_string("Input : ");    
    printf("Output : ");
    int n = strlen(s);
    for(int i = 0; i < n;  i++){
        printf("%c",s[i]);
    }
    printf("\n");
}

char *get_string(char *str){
    char *s = (char *)malloc(sizeof(char));
    printf("%s",str);
    scanf("%s",s);
    return s;
}