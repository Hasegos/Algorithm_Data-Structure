// package Hansong_Food_BaekDahae;

import java.util.ArrayList;
import java.util.Scanner;

public class Myeongchon_052 {        
    
    // 052 명촌 DB값 호출
    public void printMyeongSepyo(){
        Scanner sc = new Scanner(System.in);
        SetMenuData set = new SetMenuData();        
        set.setMenuData();
        
        ArrayList<ArrayList<String>> list = set.list;
        printDB(list,sc);                        
    }
    // 가지고 있는 DB 보여주기
    public void printDB(ArrayList<ArrayList<String>> list, Scanner sc){
        System.out.println
            ("---------------------------------------------------------------"+
             "-------------------------");
        System.out.println("바코드\t\t제품명\t\t규격\t\t수량\t\t단가\t\t합계");
        for(int j = 0; j < list.size(); j++){
            System.out.println
            ("---------------------------------------------------------------"+
            "--------------------------");
            for(String temp : list.get(j)){            
               
                if(temp == list.get(j).get(3)){
                    System.out.print("\t\t\t"+ temp);      
                }
                else {
                    System.out.print(temp + "\t");        
                }                  
            }                            
            System.out.println();
        }
        inputIndex(list,sc);
    }
    // DB값에 입력값 더하고 출력
    public void inputIndex(ArrayList<ArrayList<String>> list, Scanner sc){
        String[] num = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            System.out.println
            ("---------------------------------------------------------------"+
             "-------------------------");
            
            System.out.print(list.get(i).get(1).trim()+" "+ list.get(i).get(2).trim()+"  제품의 수량을 입력해주세요 >>>  ");
            num[i] = input(sc.nextLine());
            list.get(i).add(3,(num[i]+"\t"));
            int result = result(num[i],list.get(i).get(4).replaceAll("," , ""));            
            list.get(i).add(String.valueOf(result));
        }
        
        
        System.out.println
            ("---------------------------------------------------------------"+
             "-------------------------");
        System.out.println("바코드\t\t제품명\t\t규격\t\t수량\t\t단가\t\t합계");
        for(int j = 0; j < list.size(); j++){
            System.out.println
            ("---------------------------------------------------------------"+
            "--------------------------");
            for(String temp : list.get(j)){
                if(list.get(j).get(3) == temp){                                       
                    System.out.print("\t " + temp);                   
                }                
                else if(list.get(j).get(4) == temp){                    
                    System.out.print("\t" + temp);               
                }
                else if(list.get(j).get(5) == temp){
                    System.out.print("\t\t" + temp);               
                }
                else{
                    System.out.print(temp + "\t");               
                }                    
            }                            
            System.out.println();
        }
    }
    // 입력받기
    public String input(String input){
        if(input.equals("")){
            return "0";
        }
        else {
            return input;    
        }       
    }   
    // 계산기
    public int result(String a,String b){
        if(a.equals("")){
            return 0;
        }
        else{
            int A = Integer.valueOf(a);
            int B = Integer.valueOf(b);
            return A * B;    
        }        
    }
}
