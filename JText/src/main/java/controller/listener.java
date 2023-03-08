package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.calview;

public class listener implements ActionListener {
    private calview cv;

    public listener(calview cv) {
        this.cv = cv;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if(button.equals("+")){
            this.cv.cong();
        }else if(button.equals("-")){
            this.cv.tru();
        }else if(button.equals("*")){
            this.cv.nhan();
        }else if(button.equals("/")){
            this.cv.chia();
        }else if(button.equals("^")){
            this.cv.lt();
        }else if(button.equals("%")){
            this.cv.chianguyen();
        }
    }
    
}
