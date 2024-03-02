import java.util.ArrayList;

public class ListSample {
    /*
        ArrayList는 Thread safe하지않기때문에 여러 쓰레드 사용시 객체를 만들어야한다.
        List list = Collections.synchronizedList(new ArrayList(...));
    
    */
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList1();
        sample.checkArrayList2();
        sample.checkArrayList3();
        sample.checkArrayList4();
        sample.checkArrayList5();
        sample.checkArrayList6();
        sample.checkArrayList7();
        sample.checkArrayList8();
    }
    @SuppressWarnings({ "unused" })
    public void checkArrayList1(){
        ArrayList<String> list = new ArrayList<>();

        // 오류 유발때문에 주석처리
        // list.add(new Object());
        list.add("ArrayListSample");        
        // list.add(new Double(1));
        
        // 초기값 지정안하면 10개의 공간임으로 예측이 가능하면 초기값 넣기
        ArrayList<String> list2 = new ArrayList<>(100);
    }
    
    public void checkArrayList2(){
        // 초기 배열크기는 10임으로 그이상의 위치에 넣으면 IndexOutOfBoundsException 이 발생한다.
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1,"A1");                
        // for(타입이름 임시변수명 : 반복대상 객체)
        for(String tempData : list){
            System.out.println(tempData);
        }
    }
    
    @SuppressWarnings("unused")
    public void checkArrayList3(){
        // 초기 배열크기는 10임으로 그이상의 위치에 넣으면 IndexOutOfBoundsException 이 발생한다.
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1,"A1");                
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0 ");
        list2.addAll(list);        
        for(String tempData : list2){
            System.out.println("List2 " + tempData);
        }
        
        // 만약 list 전체를 저장할 경우가 생기면 이방법이 편하다.
        ArrayList<String> list3 = new ArrayList<>(list);        
    }
    
    public void checkArrayList4(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        
        ArrayList<String> list2 = list;
        list.add("Ooops");
        // 여기서 Ooops까지 출력이 되는 이유는 list2가 list 객체를 참조하기때문이다.
        for(String tempData : list2){
            System.out.println("List2 " + tempData);
        }
    }
    
    public void checkArrayList5(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        
        int listSize = list.size();
        for(int loop = 0; loop < listSize; loop++){
            System.out.println("list.get(" + loop + ") = " + list.get(loop));
        }
    }
    
    public void checkArrayList6(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        
        String[] strList = list.toArray(new String[0]);
        System.out.println(strList[0]);        
    }
    
    public void checkArrayList7(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
        String[] tempArray = new String[3];
        String[] strList = list.toArray(tempArray);
        for(String tempData : strList)
        System.out.println(tempData);        
    }
    
    public void checkArrayList8(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        
        // System.out.println("Removed " + list.remove(0));
        // System.out.println(list.remove("A"));
        
        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        list.removeAll(temp);        
        
        // set(int index, E element) : 해당위치를 해당값으로 변경한다.
        // 해당위치값을 바꾸기위한 삭제, 추가를 변경으로 한단계만 사용해도된다.
        list.set(0,"A");
        for(int loop = 0; loop < list.size(); loop++){
            System.out.println("list.get(" + loop +")" + list.get(loop));
        }
        
    }
}
