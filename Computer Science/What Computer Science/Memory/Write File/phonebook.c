#include<stdio.h>
#include<string.h>
#include<stdlib.h>

typedef char* string;
char *get_string(char *str);
int main(void){
    // Open file
    // csv -> 쉽표로 분리해서 값을 넣음
    FILE *file = fopen("phonebook.csv","a");

    // Get strings from user
    string name = get_string("Name : ");
    string number = get_string("Number : ");
    
    // Print (wirte) strings to file
    fprintf(file, "%s,%s\n",name,number);

    // Close file
    fclose(file);
}

char *get_string(char *str){
    string phonebook = (char *)malloc(sizeof(char));
    printf("%s", str);
    scanf("%s",phonebook);
    return phonebook;
}
