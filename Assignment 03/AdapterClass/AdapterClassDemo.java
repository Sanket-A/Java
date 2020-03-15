import java.awt.* ;
import java.awt.event.*;


public class AdapterClassDemo extends Frame {
    
	AdapterClassDemo(){

        TextField t = new TextField("Enter") ;
        
		t.addKeyListener(new KeyAdapter(){

			public void keyTyped(KeyEvent e){

                System.out.println("Key Typed") ;
                
            }
            
        }) ;
        
        add(t) ;
        
		setVisible(true) ;
		setSize(400, 400) ;
    }

	public static void main(String[] args){
		new AdapterClassDemo() ;
	}
}