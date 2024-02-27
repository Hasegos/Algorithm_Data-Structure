/* 
    컴퓨터에게 어디 파일에 저장되어있는지 알려줘야한다.
    printf()를 사용하기위해서 (stdio.h)라는 파일을 들여다봐라
    clang : 컴파일러 시켜주는 명령어
    ./a.out : 현재 있는 디렉토리에 a.out 파일을 실행해라
    ./ : 현재 폴더 위치
    파일의 * : 머신코드로 변환했으니 실행이 가능한 파일
    rm : 삭제 ls : 전체 폴더 or 파일 확인    
    mkdir : 폴더 만들기 rmdir : 폴더 삭제
    
*/
#include <stdio.h>

int main(void){
    /*
        여기서 f는 형식화된 형태
        즉, 형식화된 텍스트를 출력
    */
    printf("hello, world\n");
}
