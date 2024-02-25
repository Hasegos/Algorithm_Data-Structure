package java_책_3단원;
class ReturnArray { // public 은  하나만있어야한다.        

    static int[] makeArray(){  // 주소 반환을 위해 함수 자체 배열 공간 만들기.
    int temp[] = new int[4];
        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = i ;
        }
        return  temp; 
    }
}

public class 배열_리턴 {
    public static void main(String[] args) {                 

        int[] intArray  ;
        intArray =  ReturnArray.makeArray();
        for(int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i]+" ");
        }
    }
    
}


