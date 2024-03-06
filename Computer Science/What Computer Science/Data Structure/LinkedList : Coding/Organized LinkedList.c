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

int main(void){
    Node *list = NULL; // 널로 초기화    

    int input, number;    
    printf("노드 하고싶은 일을 고르세요. (0 번 : 종료  1번: 추가  2번 : 탐색  3번 : 삭제  4번 : 전체보기)\n");
    while(1){       
        printf("입력 >>>>>>>>> ");        
        scanf("%d",&input);
        if(input == 0){
            printf("시스템을 종료합니다.\n");   
            break;         
        }        
        if(input == 1){           
            printf("------추가 하고싶은 숫자를 입력해주세요------\n");
            printf("입력을 정지하고 싶으면 0을 입력해주세요.\n");
            while (1)
            {                
                printf("입력 >>>>>>>>> ");        
                scanf("%d",&number);                
                if(number == 0){
                    printf("\n노드 하고싶은 일을 고르세요. (0 번 : 종료  1번: 추가  2번 : 탐색  3번 : 삭제  4번 : 전체보기)\n");                    
                    break;
                }
                list = addNode(list,number);
            }         
        }
        else if(input == 2){             
            printf("------탐색 하고싶은 숫자를 입력해주세요------\n");
            printf("입력을 정지하고 싶으면 0을 입력해주세요.\n");
            while (1)
            {
                printf("입력 >>>>>>>>> ");
                scanf("%d",&number);
                if(number == 0){
                    printf("\n노드 하고싶은 일을 고르세요. (0 번 : 종료  1번: 추가  2번 : 탐색  3번 : 삭제  4번 : 전체보기)\n");                    
                    break;
                }
                Node *search = Search(list,number);
                if(search != NULL){
                    printf("%d\n",search -> number);
                }    
            }           
        }
        else if(input == 3){   
            printf("------삭제하고싶은 숫자를 입력해주세요------\n");         
            printf("입력을 정지하고 싶으면 0을 입력해주세요.\n");
            while (1)
            {
                printf("입력 >>>>>>>>> ");
                scanf("%d",&number);            
                if(number == 0){
                    printf("\n노드 하고싶은 일을 고르세요. (0 번 : 종료  1번: 추가  2번 : 탐색  3번 : 삭제  4번 : 전체보기)\n");                    
                    break;
                }
                list = DeletNode(list,number);printf("해당 숫자가 존재하지않습니다.\n");
            }            
        } 
        else if(input == 4){
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
        Node *nextNode = node -> Next;
        free(node);
        return nextNode;
    }    
    
    // 해당 숫자가 존재하지않는 경우    
    node -> Next = DeletNode(node -> Next, number);
    return node;    
    
}

Node *Search(Node *node, int number){    
    if(node == NULL) return NULL;
    // 해당 숫자가 있는 경우
    if(node -> number == number){
        return node;
    }
    // 없는 경우
    node -> Next = Search(node -> Next, number);
    return node;
}

void ShowAllData(Node *node){
    if(node == NULL)
        return;
    
    printf("%d\n",node -> number);
    ShowAllData(node -> Next);
}


