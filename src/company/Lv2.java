package company;

import java.util.Scanner;

class Leading{
    private String name;
    private int life;
    private int atk;
    private int def;
    public Leading(){}

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
class Monster{
    private String name;
    private int life;
    private int atk;
    public Monster(){}

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Fighting{
    public void fight(int q){
        System.out.println("\n" + "第" + q +"回合开始：");
    }

    public void end(int q){
        System.out.println("第" + q + "回合结束。");
    }
}
public class Lv2 {
    public static void main(String[] args) {
        Fighting fight = new Fighting();
        Scanner w = new Scanner(System.in);
        System.out.println("请输入主角的名称：");
        String n = w.nextLine();
        System.out.println("请输入主角的生命值：");
        int l = w.nextInt();
        System.out.println("请输入主角的攻击力：");
        int a = w.nextInt();
        System.out.println("请输入主角的防御力：");
        int d = w.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("请输入怪物的名称：");
        String n1 = y.nextLine();
        System.out.println("请输入怪物的生命值:");
        int l1 = y.nextInt();
        System.out.println("请输入怪物的攻击力：");
        int a1 = y.nextInt();
        Leading per = new Leading();
        Monster mon = new Monster();
        per.setName(n);
        per.setLife(l);
        per.setAtk(a);
        per.setDef(d);
        mon.setName(n1);
        mon.setLife(l1);
        mon.setAtk(a1);
        System.out.println("主角的名称为：" + per.getName() + ",生命值为：" + per.getLife() + ",攻击力为：" + per.getAtk() +
                ",防御力为：" + per.getDef());
        System.out.println("怪物的名称为：" + mon.getName() + ",生命值为：" + mon.getLife() + ",攻击力为：" + mon.getAtk());

        System.out.println("战斗开始！");
        int hurt1 = a;
        int hurt2;
        if (a1 > d) {
            hurt2 = (a1 - d);
        } else {
            hurt2 = 1;
        }
        int i = 1;

        while(l>=0 && l1>=0) {
            fight.fight(i);
            System.out.println(n + "对" + n1 + "造成了" + hurt1 + "点伤害");
            System.out.println(n1 + "对" + n + "造成了" + hurt2 + "点伤害");
            l = l - hurt2;
            l1 = l1 - hurt1;
            fight.end(i);
            i++;
            System.out.print("此时主角的血量为：");
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.print("\n" + "此时怪物的血量为：");
            for (int m = 0; m < l1; m++) {
                System.out.print("*");
            }


                if (l <= 0 && l1 > 0) {
                    System.out.println("\n" + n + "阵亡," + n1 + "获胜");
                    System.exit(1);
                }
                if (l > 0 && l1 <= 0) {
                    System.out.println("\n" + n1 + "阵亡," + n + "获胜");
                    System.exit(1);
                }
                if (l <= 0 && l1 <= 0) {
                    System.out.println("\n" + "同归于尽");
                    System.exit(1);
                }

        }


    }
}
