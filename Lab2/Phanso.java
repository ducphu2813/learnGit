import java.util.Scanner;
public class Phanso {
    public int tu;
    public int mau;
     
    public Phanso cong(Phanso fr){
        Phanso frcong= new Phanso();
        frcong.tu=this.tu*fr.mau + this.mau*fr.tu;
        frcong.mau=this.mau*fr.mau;
        return frcong;
    }
    public Phanso tru(Phanso fr){
        Phanso frtru= new Phanso();
        frtru.tu=this.tu*fr.mau - this.mau*fr.tu;
        frtru.mau=this.mau*fr.mau;
        return frtru;
    }
    public Phanso nhan(Phanso fr){
        Phanso frnhan=new Phanso();
        frnhan.tu=this.tu*fr.tu;
        frnhan.mau=this.mau*fr.mau;
        return frnhan;
    }
    public Phanso chia(Phanso fr){
        Phanso frchia= new Phanso();
        frchia.tu=this.tu*fr.mau;
        frchia.mau=this.mau*fr.tu;
        return frchia;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Phanso x=new Phanso();
        System.out.println("Phan so thu nhat: ");
        x.tu=scanner.nextInt();
        x.mau=scanner.nextInt();
        Phanso y=new Phanso();
        System.out.println("Phan so thu hai: ");
        y.tu=scanner.nextInt();
        y.mau=scanner.nextInt();
        Phanso z=new Phanso();
        z=x.cong(y);
        System.out.printf("Ket qua= "+z.tu+"/"+z.mau);
        TG(z.tu,z.mau);
    }
    public int UCLN(int a,int b){
        int r=a%b;
        while (a!=0){
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
    public void TG(int a,int b){
        if(a%UCLN(a,b)==0&&b%UCLN(a,b)==0)
            System.out.println("Phan so da toi gian");
        else 
            System.out.println("Phan so chua toi gian");
    }
}