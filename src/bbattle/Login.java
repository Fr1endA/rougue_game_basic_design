package bbattle;

import character.game.Player;

import java.util.Scanner;

public class Login {
    public Player createRole(){
        System.out.println("��ӭ����ۺ��ҹ��¼��Ϊ��Ľ�ɫ������ְ�");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        Player role =new Player(name);
        System.out.println("hello "+name+"����ӭ����ۺ��ҹ��¼������");

        return role;
    }
    public void load(){
        createRole();
        //load_in_game;
    }
}
