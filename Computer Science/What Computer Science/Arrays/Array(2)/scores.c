#include<stdio.h>
#include<string.h>
// const : 상수
// const int N = 3;

int N = 0;
float average(int lenght,int arr[]);
int get_int(char *str);

int main(void){    
    int n = get_int("Number of scores :");    
    int scores[n];

    for(int i = 0; i < n; i++){
        N = i + 1;
        scores[i] = get_int("Score");         
    }
    printf("Average: %.1f \n", average(n, scores));
}
// float가 int 보다 더강력한 자료형이다.
float average(int lenght,int array[]){
    float sum = 0.0; 
    for(int i = 0; i < lenght; i++){
        sum += array[i];
    }    
    return sum / lenght;    
}

int get_int(char *str){        
    int n;
    int m = strcmp(str,"Score");    
    if(m == 0){
        printf("%s %d : ",str , N);
    } 
    else{
        printf("%s",str);
    }    
    scanf("%i", &n);
    return n;
}