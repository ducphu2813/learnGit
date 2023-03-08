
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.hcnview;

public class listener implements ActionListener {
    private hcnview hv;

    public listener(hcnview hv) {
        this.hv = hv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String scr = e.getActionCommand();
        this.hv.run();
    }

    
    
    
}
