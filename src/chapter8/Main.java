package chapter8;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hiro h = new Hiro();
        h.name = "ミナト";
        h.hp = 100;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        h.slip();
        h.slip();
        h.slip();
        h.sit(500);
        m1.run();
        m2.run();
        h.run();
        }
    }