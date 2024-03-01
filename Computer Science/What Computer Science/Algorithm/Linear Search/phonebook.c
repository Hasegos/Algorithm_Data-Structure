#include<stdio.h>
#include<string.h>

// 구조체를 통해 자바의 캡슐화 처럼 묶어서 저장이가능
typedef struct 
{
    char *name;
    char *number;
}person;

int main(void){

    // char *names[4] = {"EMMA", "RODRIGO", "BRIAN", "DAVID"};
    // char *numbers[4] = {"617-555-0100","617-555-0101","617-555-0102","617-555-0103"};

    person people[4];

    people[0].name = "EMMA";
    people[0].number = "617-555-0100";

    people[1].name = "RODRIGO";
    people[1].number = "617-555-0101";

    people[2].name = "BRIAN";
    people[2].number = "617-555-0102";

    people[3].name = "DAVID";
    people[3].number = "617-555-0103";  

    for(int i = 0; i < 4; i++){
        if(strcmp(people[i].name, "EMMA") == 0){
            printf("%s\n",people[i].number);
            return 0;
        }
    }
    printf("Not found\n");
    return 1;
}