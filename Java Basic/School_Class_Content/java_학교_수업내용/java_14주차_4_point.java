public class java_14주차_4_point{ // point 클래스 만들기
    private int x,y; // 외부 노출 안할 x 와 y 선언
    void setXY(int x, int y){ // setXY 함수로부터 두개의 파라미터 받을 예정
        this.x = x; // this < -  메소드의 x 와 파라미터 x 구분을위해 사용
         this.y =y;
    }
    void showXY(){ // 결과 도출 할 함수
        System.out.println("(x:"+ x+", y:"+y+")");
    }
    
}
