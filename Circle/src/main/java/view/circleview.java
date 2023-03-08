
package view;

import controller.listener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.circlemodel;

public class circleview extends JFrame {
    private JButton run;
    private JLabel lr, lp, ls;
    private JTextField tr, tp, ts;
    circlemodel cm;

    public circleview() {
        this.cm = new circlemodel();
        this.init();
    }
    
    public void init(){
        this.setTitle("Circle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        
        lr = new JLabel("Ban kinh");
        tr = new JTextField(10);
        lp = new JLabel("Chu vi");
        tp = new JTextField(10);
        ls = new JLabel("Dien tich");
        ts = new JTextField(10);
        
        ActionListener ac = new listener(this);
        run = new JButton("RUN");
        run.addActionListener(ac);
        
        JPanel pbankinh = new JPanel(new GridLayout(1,2));
        pbankinh.add(lr);
        pbankinh.add(tr);
        JPanel pchuvi = new JPanel(new GridLayout(2,1));
        pchuvi.add(lp);
        pchuvi.add(tp);
        JPanel pdientich = new JPanel(new GridLayout(2,1));
        pdientich.add(ls);
        pdientich.add(ts);
        JPanel pmain = new JPanel(new GridLayout(2,2));
        pmain.add(pbankinh);
        pmain.add(run);
        pmain.add(pchuvi);
        pmain.add(pdientich);
        
        
        this.setLayout(new BorderLayout());
        this.add(pmain,BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    public void run(){
        double x = Double.valueOf(this.tr.getText());
        this.cm.setR(x);
        this.cm.cv();
        this.tp.setText(this.cm.getKq()+"");
        this.cm.dt();
        this.ts.setText(this.cm.getKq()+"");
    }
    
    
    
}
