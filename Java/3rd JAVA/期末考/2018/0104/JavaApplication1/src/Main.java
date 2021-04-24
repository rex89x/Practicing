import com.abc.MyThread;

public class Main {
    public static void main(String[] argv) {
        //生成執行緒物件
        MyThread t1=new MyThread("小白","https://www.mobile01.com/", "1.txt");
        MyThread t2=new MyThread("小黑","https://tw.yahoo.com/", "2.txt");
		
        //啟動執行緒
        t1.start();
        t2.start();
        
    }
}