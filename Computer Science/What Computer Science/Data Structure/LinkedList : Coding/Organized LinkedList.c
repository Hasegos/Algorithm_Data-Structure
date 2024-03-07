#include <stdio.h>
#include <stdlib.h>

// LinkedList 구현 (추가, 삭제, 삽입)
// 추가 - 재귀형식
typedef struct Node
{
    int number;
    struct Node *Next;    
}Node;
Node *addNode(Node *next, int number); // 추가
Node *DeletNode(Node *next, int number); // 삭제
Node *Search(Node *node, int number); // 탐색
void ShowAllData(Node *node); // 전체보기

Node *printNumber01(Node *list, int number); // 메뉴 1번
void printNumber02(Node *list,int number); // 메뉴 2번
Node *printNumber03(Node *list, int number); // 메뉴 3번

int check = 0; // 숫자 존재하지않을때 체크
int main(void){   
    Node *list = NULL; // 널로 초기화
    int input, number = 0;    
    printf("하고싶은 일을 고르세요.  (0번 : 종료  1번: 추가  2번 : 탐색  3번 : 삭제  4번 : 전체보기)\n");
    while(1){       
        printf("입력 >>>>>>>>> ");        
        scanf("%d",&input);
        if(input == 0){
            printf("시스템을 종료합니다.\n");            
            free(list); // 종료시 메모리해제
            break;         
        }        
        if(input == 1){           
            list = printNumber01(list,number);
        }
        else if(input == 2){             
            printNumber02(list,number);
        }
        else if(input == 3){   
            list = printNumber03(list,number);
        } 
        else if(input == 4){            
            if(list == NULL){
                printf("존재하는 숫자가 없습니다\n");
                continue;
            }
            ShowAllData(list);
        }       
        else{
            printf("잘못 입력하셨습니다. 다시입력해주세요\n");
            continue;
        }
    }    
}
// 추가함수
Node *addNode(Node *node, int number){ 
    if(node == NULL){
        Node *tmpNode = (Node *)malloc(sizeof(Node));
        tmpNode -> number = number;
        tmpNode -> Next = NULL;
        return tmpNode;
    }
    node -> Next = addNode(node -> Next, number);    
    return node;  
}
// 삭제 함수
Node *DeletNode(Node *node, int number){
    if(node == NULL) return NULL;
    // 해당 숫자가 있는 경우
    if(node -> number == number){
        check = 1;
        Node *nextNode = node -> Next;
        free(node);
        return nextNode;
    }       
    // 해당 숫자 삭제후
    node -> Next = DeletNode(node -> Next, number);
    return node;    
}
// 탐색 함수
Node *Search(Node *node, int number){    
    if(node == NULL) return NULL;
    // 해당 숫자가 있는 경우
    if(node -> number == number){
        check = 1;
        return node;
    }
    // 없는 경우
    return Search(node -> Next, number);    
}
// 전체보여주기 함수
void ShowAllData(Node *node){
    if(node == NULL){
        return;
    }   
    printf("%d\n",node -> number);
    ShowAllData(node -> Next);
}
// 메뉴 1번 : 추가
Node *printNumber01(Node *list, int number){
    printf("\n------추가 하고싶은 숫자를 입력해주세요------\n");
    printf("입력을 정지하고 싶으면 0을 입력해주세요.\n");
    while (1){                
        printf("입력 >>>>>>>>> ");        
        scanf("%d",&number);                
        if(number == 0){
            printf("\n하고싶은 일을 고르세요. (0 번 : 종료  1번: 추가  2번 : 탐색  3번 : 삭제  4번 : 전체보기)\n");                    
            break;
        }
        list = addNode(list,number);
    }
    return list;     
}
// 메뉴 2번 : 탐색
void printNumber02(Node *list,int number){
    printf("\n------탐색 하고싶은 숫자를 입력해주세요------\n");
    printf("입력을 정지하고 싶으면 0을 입력해주세요.\n");
    while (1){
        printf("입력 >>>>>>>>> ");
        scanf("%d",&number);
        if(number == 0){
            printf("\n하고싶은 일을 고르세요. (0 번 : 종료  1번: 추가  2번 : 탐색  3번 : 삭제  4번 : 전체보기)\n");                    
            break;
        }
        Node *search = Search(list,number);
        if(search == NULL){                        
            printf("해당 숫자는 존재하지 않습니다.\n");   
            continue;           
        }        
        else{            
            printf("%d\n",search -> number);               
        }        
    }
}
//메뉴 3번 : 삭제
Node *printNumber03(Node *list, int number){
    printf("\n------삭제하고싶은 숫자를 입력해주세요------\n");         
    printf("입력을 정지하고 싶으면 0을 입력해주세요.\n");
    while (1){
        printf("입력 >>>>>>>>> ");
        scanf("%d",&number);            
        if(number == 0){
            printf("\n하고싶은 일을 고르세요. (0 번 : 종료  1번: 추가  2번 : 탐색  3번 : 삭제  4번 : 전체보기)\n");                    
            break;
        }
        list = DeletNode(list,number);
        if(list == NULL){
            printf("더이상 지울 숫자가 존재하지않습니다.\n");
            continue;
        }
        if(check == 0){
            printf("해당 숫자는 존재하지 않습니다.\n");            
        }
        check = 0;
    }     
    return list;
}