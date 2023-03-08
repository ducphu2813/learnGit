
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.circleview;

public class listener implements ActionListener {
    
    circleview cv;

    public listener(circleview cv) {
        this.cv = cv;
    }
     
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.cv.run();
    }
    
}
