#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>

typedef char* string;
char *get_string(char *str);
int main(void){
    string s = get_string("s : ");
    // string t = s;
    string t =(char *)malloc(strlen(s) + 1);    
    /*
    strcpy 대신 방법
    for(int i = 0, n = strlen(s); i < n + 1; i++){
        t[i] = s[i];
    }
    */
    strcpy(t, s);
    for(int i = 0, n = strlen(s); i < n; i++){
        t[i] = toupper(t[i]);
    }
    printf("%s\n",s);
    printf("%s\n",t);
}
char *get_string(char *str){
    string s = (char *)malloc(sizeof(char));
    printf("%s",str);
    scanf("%s",s);
    return s;
}