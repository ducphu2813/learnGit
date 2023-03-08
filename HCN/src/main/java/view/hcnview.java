package view;

import controller.listener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.hcnmodel;

public class hcnview extends JFrame {
    private hcnmodel hm;
    private JLabel lcd, lcr, p, s;
    private JTextField tcd, tcr, tp, ts;
    private JButton run;
    Border b = BorderFactory.createLineBorder(Color.red, 10);
    public hcnview() {
        this.hm = new hcnmodel();
        this.init();
    }
    
    public void init(){
        this.setTitle("Hinh Chu Nhat");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        
        lcd = new JLabel("Chieu dai");
        tcd = new JTextField(10);
        lcr = new JLabel("Chieu rong");
        tcr = new JTextField(10);
        p = new JLabel("Chu vi");
        tp = new JTextField(50);
        s = new JLabel("Dien tich");
        ts = new JTextField(50);
        
        ActionListener ac = new listener(this);
        run = new JButton("RUN");
        run.addActionListener(ac);
        
        JPanel pcanh = new JPanel(new GridLayout(2,2,5,5));
        pcanh.add(lcd);
        pcanh.add(tcd);
        pcanh.add(lcr);
        pcanh.add(tcr);
        JPanel pchuvi = new JPanel(new GridLayout(2,1,5,5));
        pchuvi.add(p);
        pchuvi.add(tp);
        JPanel pdientich = new JPanel(new GridLayout(2,1,5,5));
        pdientich.add(s);
        pdientich.add(ts);
        JPanel p = new JPanel(new GridLayout(2,2,5,5));
        p.add(pcanh);
        p.add(run);
        p.add(pchuvi);
        p.add(pdientich);
        
        
        
        
        
        this.setLayout(new BorderLayout());
        this.add(p, BorderLayout.CENTER);
        this.setVisible(true);
        
    }
    
    public void run(){
        double x = Double.valueOf(this.tcd.getText());
        double y = Double.valueOf(this.tcr.getText());
        this.hm.setCd(x);
        this.hm.setCr(y);
        this.hm.cv();
        this.tp.setText(this.hm.getKq()+"");
        this.hm.dt();
        this.ts.setText(this.hm.getKq()+"");
    }
    
    
}
