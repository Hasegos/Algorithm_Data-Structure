#include<stdio.h>
#include<stdlib.h>

//  list 연결할 구조체를 생성 
// 생성시 struct를 붙어야함 생성과, 연결시킬 주소
typedef struct node
{
    int number; // <- 값 저장
    struct node *next;  // <- 리스트를 연결시킬 주소
}node;
int main(void){
    
    node *list = NULL;   //  LinkedList로 사용할 변수 NULL 초기화
    node *n = (node *)malloc(sizeof(node)); // node 타입으로 메모리 할당

    // NULL 체크
    if(n == NULL){
        return 1;
    }
    list = n;
    // 할당 받은 메모리로 list 연결 & 값 넣기
    n -> number = 1;
    n -> next = NULL;
    // 새로운 리스트 연결
    list -> next = n;    
    n = (node *)malloc(sizeof(node)); // 다시할당

    if(n == NULL){
        return  1;
    }
    // 할당 받은 메모리로 list 연결 & 값 넣기
    n -> number = 2;
    n -> next = NULL;

    list -> next = n;
    n = (node *)malloc(sizeof(node));
    if(n == NULL){
        return 1;        
    }
    n -> number = 3;
    n -> next = NULL;
    // 리스트를 각 주소에 맞게 연결
    list -> next -> next = n;
    // list에 입력된 값이 없을때까지 next 주소를 연결 시켜 number 값 출력
    for(node *tmp = list; tmp != NULL; tmp = tmp -> next ){
        printf("%i\n",tmp -> number);
    }
    // list에 입력된 값이 없을때까지
    while(list != NULL){
        // 주소에 할당된걸 가져와서 메모리 해제.
        node *tmp = list -> next;
        free(list);
        list = tmp;
    }
}