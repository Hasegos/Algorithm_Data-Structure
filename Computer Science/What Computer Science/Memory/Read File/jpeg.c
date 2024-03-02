#include<stdio.h>

typedef char* string;
int main(int argc, string argv[]){
    // Ensure user ran program with two words at prompt
    // 즉, clang으로 파일이랑 이름을 줬냐 확인
    if(argc != 2){
        return 1;
    }

    // Open file
    FILE *file = fopen(argv[1], "r");
    if(file == NULL){
        return 1;
    }

    // Read 3 bytes from file
    // -128 ~ 127이 아닌 0 ~ 255까지의 범위기때문
    unsigned char bytes[3];
    // 배열, 읽을 바이트 수, 읽을 횟수, 읽을 파일
    fread(bytes, 3, 1, file);

    // Check if bytes are 0xff 0xd8 0xff
    // jpeg 파일은 무조건 세바이트로 시작함 FF, D8, FF  
    if(bytes[0] == 0xff && bytes[1] == 0xd8 && bytes[2] == 0xff){
        printf("Maybe\n");
    }
    else{
        printf("No\n");
    }
}