package chapter9;

public class Main {
    public static void  main(String[] args){
        Hiro h1 = new Hiro("ミナト");
        System.out.println(h1.name);
        Hiro h2 = new Hiro();
        System.out.println(h2.name);
     //   h1.name = "ミナト";
   //     h1.hp = 100;
    /*    System.out.println(h1.hp);
        System.out.println(h1.name);
        Hiro h2 = new Hiro("アサカ");
        h2.name = "アサカ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);*/
    }
}
