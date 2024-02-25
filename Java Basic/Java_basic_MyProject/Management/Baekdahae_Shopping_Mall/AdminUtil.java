// package Baekdahae_Shopping_Mall;

import java.util.Scanner;

public class AdminUtil {
    
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
        }
        catch(ClassNotFoundException e){
            // 예외 발생한 메세지 출력
            e.printStackTrace();
            System.exit(0);
        }
    }
    // ShopDAO 작성 : 매점 DB 연결 
    private static ShopDAO dao = null;
    
    public ShopDAO(){        
    }
    /*
        getInstance() : 싱글톤 패턴으로 고정된 메모리 영역내에서만 사용하기위해서
        매번 객체 생성 X 즉, new를 통해 생성자를 생성못한다.
        그래서 생성이 안됨으로 가져올 수라도 있어야한다.
        자바의 getter, setter 느낌인 getInstance()를 사용한다. 
        대신 private로 접근제어자를 둔다.
    */
    public static ShopDAO getInstance(){
        if(dao == null){
            dao = new ShopDAO();
        }
        return dao;
    }
    // 여기서부터 Connection 정리
    
    private Connection getConnection(){
        Connection conn = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try{
            conn = DriverManager.getConnection(url, "JAVADB", "1234");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    
    // 닫기 - pstmt, conn
    private void close(PreparedStatement pstmt, Connection conn){
        try{
            if(pstmt != null)
                pstmt.close();
            if(conn != null)
                conn.close();            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    private void close(ResultSet rs, PreparedStatement pstmt, Connection conn){
        try{
            if(pstmt != null)
                pstmt.close();
            if(conn != null)
                conn.close();            
            if(rs != null)
                rs.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    // 회원가입(관리자)
    public int insetAdmin(String phone, String password, String position){
        int result = 0;
        Connection conn = this.getConnection();
        PreparedStatement pstmt = null;
        String sql = null;
        sql = "insert into shop_admin values (?,?,?)";
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phone);
            pstmt.setString(2, pwdEncrypt(password + phone));
            pstmt.setString(3, position);
            result = pstmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            this.close(pstmt,conn);
        }
        return result;
    }
    
    public void mainPage(Scanner sc){
        int menu = -1;        
        while(true){
            try{
                System.out.println
                    ("..........................................................");
                System.out.println("1.로그인");
                System.out.println("2.회원가입");
                System.out.println("0.이전화면");
                System.out.println
                    ("..........................................................");
                System.out.println("메뉴 선택 >>");
                menu = sc.nextInt();
            }            
            catch(Exception E){
                sc.nextLine();
                System.err.println("잘못 입력하셨습니다.");
                System.err.println("1, 2, 0 중에서 입력해주세요.");
                continue;
            }
            if(menu < 0 || menu > 2){
                System.err.println("잘못 입력하셨습니다.");
                System.err.println("1, 2, 0 중에서 입력해주세요.");
                continue;
            }
            else if(menu == 1){
                int submenu = -1;
                
                HashMap<String, String> map = dao.loginAdmin(sc);
                if(map != null){
                    phone = map.get("phone");
                    System.out.println();
                    System.out.println
                        ("..........................................................");
                    System.out.println("  " + phone + "님");
                    System.out.println("         ♡환영합니다.♡");
                    admin(sc);
                }
                else{
                    System.err.println("아이디 또는 비밀번호가 일치하지 않습니다.");    
                }
            }
            else if(menu == 2){
                adminJoin(sc);
            }
            else {
                System.err.println("이전 화면으로 돌아갑니다.");                
                break;
            }
        } 
    }
    
}
