package character.game;

public class Ghost extends Character {
    //�вδ���Ghost
    double presenceProbability=1.0;
    //��������
    private double intensify(int chapter,int level){
        double intense=0;
        if(chapter==1||chapter==2){
            //��һ�º͵ڶ��� ���������  �Ѷȴ���Ϊ��������
            //chapter 1��{<1:0.05>,<2:0.1>...,<6:0.3>,<7:0.6>}
            //chapter 2:{<1:0.45>,<2:0.5>,...,<6:0.75>,<7:1.2>}
            //chapter 3:{<1:>}
            if(level==7){
                intense=0.8*chapter;
                return intense;
            }
            intense=0.5*(chapter-1)+0.08*level;
        }
        else if(chapter==3){
            if(level==8){
                return 3;
            }
            intense=0.9+0.08*level;
        }
        return intense;
    }
    //��д���캯��
    //���������Źؿ����½ڡ���ζ��ɳ�
    public Ghost(String name, int chapter,int layer){
        double intenseRate =intensify(chapter,layer);
        this.name=name;
        this.attack_power+=(intenseRate+strengthenRate) *this.attack_power;
        //this.attack_power= (int) Math.pow(this.attack_power,intenseRate);
        this.magic_power+=(intenseRate *this.magic_power);
        this.hp+=1.5* intenseRate *this.hp;
        this.cur_hp=hp;
        this.armor+=intenseRate*this.armor;
    }
    public void specialEffect(Character character){
        System.out.println("Action on"+character.name);
    }



}
