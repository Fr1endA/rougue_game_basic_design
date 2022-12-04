package character.game;

import java.text.DecimalFormat;

// character.game.Character �к����вμӶ�ս�Ľ�ɫ����������ҡ���꣨��ͨ�;�Ӣ����
public class Character implements Mortal{
    public String name="Untitled";
    public int attack_power=80;
    public int magic_power=30;
    public int armor=30;
    public int magic_resistance=20;
    //���ڿ��ԡ����������ʵȵȿ��ܲ��������˺�������ֵΪ����ֵ
    protected double hp=1000;
    public double cur_hp=hp;
    //Type=0��ʾδ���壬1��ʾ��ң�2��ʾ��ͨ��꣬3��ʾ��Ӣ��꣬4��ʾBoss
    int Type=0;
    public int live=1;//1������ţ�0����������
    //ǿ����
    double strengthenRate=0.1;
    public void attack(){
        System.out.println(this.name+"attacked but no target");

    }
    public void attack(Character character){
        double damage=this.attack_power  * (1-character.resistanceRate(character.armor) );
        //��damageת��Ϊ��λС�����
        damage=Double.parseDouble(new DecimalFormat("#.00").format(damage));
        System.out.println(this.name+" inflicted "+damage+" damage on "+character.name);
        character.cur_hp-=damage;
        if(character.cur_hp<=0){
            character.die();
        }
        return;
    }
    public void defence(){
        System.out.println(this.name+" has alleviated the damage");
    }
    public int die(){
        System.out.println(this.name + " has been slain");
        this.cur_hp=0;
        this.live=0;
        return 1;
    }
    public void showHp(){
        System.out.print(this.name);
        System.out.printf("��%.2f/%.2f\n",this.cur_hp,(float)this.hp);
    }
    public void skill_Q(){
        System.out.println(this.name + " release Q");
    }
    public void skill_W(){
        System.out.println(this.name+ " release W");
    }
    public void skill_E(){
        System.out.println(this.name+" release E");
    }
    public double resistanceRate(int resilience){
        double resistanceRate=0;
        resistanceRate = resilience/(double)(resilience+50);
        return resistanceRate;
    }
   
}
