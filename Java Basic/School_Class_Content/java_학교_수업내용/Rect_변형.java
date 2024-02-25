public class Rect_변형 {
    

    private int width = 0 , height = 0;
    void setWidth(int i) // 넓이 값을 받을 함수
    {
        width = i;
    }
    int getWidth() // 넓이 값받은거 리턴해줄 함수
    {
        return width;
    }
    void setHeight(int j) // 높이 값을 받을 함수
    {
        height = j;
    }
    int getHeight() // 높이 값받은거 리턴해줄 함수
    {
        return height;
    }
    int getArea() // 계산 공식 함수를 반환 해줄 함수
    {
        return width * height;
    }
    
}
