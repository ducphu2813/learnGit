package view;

import controller.listener;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.calmodel;

public class calview extends JFrame {
    private calmodel cm;
    private JTextField ta;
    private JTextField tb;
    private JTextField tkq;

    public calview() {
        this.cm = new calmodel();
        this.init();
    }
    
    public void init(){
        this.setSize(500, 500);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        Font font = new Font("Arial", Font.BOLD, 30);
        
        JLabel la = new JLabel("So thu nhat");
        la.setFont(font);
        JLabel lb = new JLabel("So thu hai");
        lb.setFont(font);
        JLabel lkq = new JLabel("Ket qua");
        lkq.setFont(font);
        
        ta = new JTextField(50); //50 la do rong
        ta.setFont(font);
        tb = new JTextField(50);
        tb.setFont(font);
        tkq = new JTextField(50);
        tkq.setFont(font);
        
        ActionListener ac = new listener(this);
        JButton cong = new JButton("+");
        cong.setFont(font);
        cong.addActionListener(ac);
        JButton tru = new JButton("-");
        tru.setFont(font);
        tru.addActionListener(ac);
        JButton nhan = new JButton("*");
        nhan.setFont(font);
        nhan.addActionListener(ac);
        JButton chia = new JButton("/");
        chia.setFont(font);
        chia.addActionListener(ac);
        JButton lt = new JButton("^");
        lt.setFont(font);
        lt.addActionListener(ac);
        JButton chianguyen = new JButton("%");
        chianguyen.setFont(font);
        chianguyen.addActionListener(ac);
        
        
        JPanel p = new JPanel(new GridLayout(3,2,10,10));
        p.add(la);
        p.add(ta);
        p.add(lb);
        p.add(tb);
        p.add(lkq);
        p.add(tkq);
        JPanel pb = new JPanel(new GridLayout(2,3));
        pb.add(cong);
        pb.add(tru);
        pb.add(nhan);
        pb.add(chia);
        pb.add(lt);
        pb.add(chianguyen);
        
        this.setLayout(new BorderLayout());
        this.add(p, BorderLayout.CENTER);
        this.add(pb,BorderLayout.SOUTH);
        this.setVisible(true);
    }
    
    public void cong(){
        double x = Double.valueOf(this.ta.getText());
        double y = Double.valueOf(this.tb.getText());
        this.cm.setA(x);
        this.cm.setB(y);
        this.cm.cong();
        this.tkq.setText(this.cm.getKq()+"");
    }
    
    public void chia(){
        double x = Double.valueOf(this.ta.getText());
        double y = Double.valueOf(this.tb.getText());
        this.cm.setA(x);
        this.cm.setB(y);
        this.cm.chia();
        this.tkq.setText(this.cm.getKq()+"");
    }
    
    public void tru(){
        double x = Double.valueOf(this.ta.getText());
        double y = Double.valueOf(this.tb.getText());
        this.cm.setA(x);
        this.cm.setB(y);
        this.cm.tru();
        this.tkq.setText(this.cm.getKq()+"");
    }
    
    public void nhan(){
        double x = Double.valueOf(this.ta.getText());
        double y = Double.valueOf(this.tb.getText());
        this.cm.setA(x);
        this.cm.setB(y);
        this.cm.nhan();
        this.tkq.setText(this.cm.getKq()+"");
    }
    
    public void lt(){
        double x = Double.valueOf(this.ta.getText());
        double y = Double.valueOf(this.tb.getText());
        this.cm.setA(x);
        this.cm.setB(y);
        this.cm.luythua();
        this.tkq.setText(this.cm.getKq()+"");
    }
    
    public void chianguyen(){
        double x = Double.valueOf(this.ta.getText());
        double y = Double.valueOf(this.tb.getText());
        this.cm.setA(x);
        this.cm.setB(y);
        this.cm.chiadu();
        this.tkq.setText(this.cm.getKq()+"");
    }
    
}
