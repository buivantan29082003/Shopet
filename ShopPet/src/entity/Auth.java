
package entity;


public class Auth {
    public static NhanVien user=null;
    
    public static void clear(){
        user=null;
    }
    
    
    public static boolean isLogin(){
        return user!=null;
    }
    
    
    public static boolean isManager(){
        return isLogin()&&user.getVaitro()==1;
    }
}
