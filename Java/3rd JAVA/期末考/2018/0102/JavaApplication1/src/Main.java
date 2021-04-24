import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.abc.NervousBox;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("執行緒測試");  
                
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));   
                
        //產生小方形物件, 並加入面板中
        ArrayList<NervousBox> arrayList = new ArrayList();
        for(int i=0; i<30; i++){
            NervousBox box = new NervousBox();
            arrayList.add(box);
            container.add(box);
            System.out.println(i);
        }              
		
        //將面板加入畫面中
        frame.add(container);
                
        frame.setSize(1100, 900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        for(int i=0; i<250; i++){
            //將小方形物件包裝成執行緒
            NervousBox box = arrayList.get(i);            
            Thread t = new Thread(box);
        
            //啟動執行緒
            t.start();
        }
    }
}