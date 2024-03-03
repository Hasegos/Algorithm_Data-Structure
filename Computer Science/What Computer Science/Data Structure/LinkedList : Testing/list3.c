// Implements a list of numbers with linked list
#include<stdio.h>
#include<stdlib.h>

// Represents a node
typedef struct  Node
{
    int number;
    struct Node *next;        
}Node;
Node *AddNode(Node *node, int number);

int main(void){
    // List of size 1
    Node *list = NULL;
    // Add number to list 
    Node *n = (Node *)malloc(sizeof(Node));
    if(n == NULL){
        return 1;
    }
    list = n;    
    for(int i = 1; i <= 10; i++){
        list = AddNode(list,i);
    }
    // Print list
    for(Node *tmp = list; tmp != NULL; tmp = tmp -> next){
        printf("%d\n",tmp -> number);
    }
    // Free list
    while(list != NULL){
        Node *tmp = list -> next;
        free(list);
        list = tmp;
    }
}
Node *AddNode(Node *node, int number){
    if(node == NULL){
        // Add number to list
        Node *node = (Node *)malloc(sizeof(Node));
        node -> number = number;
        node -> next = NULL;
        
        return node;        
    }
    node -> next = AddNode(node -> next,number);
    return node;
}