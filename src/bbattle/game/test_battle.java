package bbattle.game;

import bbattle.Login;
import character.game.*;
import character.game.Character;
import episode.game.Episode;
import episode.game.EpisodeData;

import java.util.Scanner;

public class test_battle {

public void intoCircle(Player player){
    while(true){
        //������˳������˳�����
        if(1!=0){
            break;
        }
    }
}
public void reward(Ghost ghost,Player player){

}
    public static void main(String[] args) {
        new test_battle().testAttack();
//        EliteGhost test_ghost=new EliteGhost("test1",2,3);
//        Player player=new Player("Mr.Fire");
//        test_ghost.showHp();
//        player.attack(test_ghost);
//        test_ghost.showHp();
//        player.attack(test_ghost);
//        test_ghost.showHp();
//        test_ghost.skill_Q();
//        test_ghost.showHp();
//        test_ghost.attack(player);
//        player.showHp();
    }
    public void testAttack(){
        int chapter=1;
        int level=1;
        Login login=new Login();
        Player player=login.createRole();
        Scanner scanner=new Scanner(System.in);
        String choice;
        //��Ϸѭ��
        while(true){
            //�����½�
            level=1;
            while(true){
                //������
                Episode episode_Now=new Episode(chapter,level,player);

                //�����ֳ����˹��
                while(episode_Now.ghost!=null){
                    //ս��ѭ��
                    player.attack(episode_Now.ghost);
                    episode_Now.ghost.showHp();
                    episode_Now.ghost.attack(player);
                    player.showHp();

                    if(player.live==0){
                        intoCircle(player);
                        player.recover();
                        break;
                    }
                    else if(episode_Now.ghost.live==0){
                        //������Ӧ�Ĺ�꣬Ϊplayer�ṩ���ܽ���
                        reward(episode_Now.ghost,player);
                        //ͨ�غ󲻿ɻ�ͷ��ͨ�ؼ�¼�����뵵��
                        EpisodeData.episodes[chapter-1][level-1]=episode_Now;
                        //�Ƿ���Ҫ��Ѫ������
                        //player.recover();
                        break;
                    }
                }
                //�����ֳ������¼�
                while(episode_Now.ghost==null){
                    System.out.println("hello"+player.name);
                    //�����¼�
                    break;
                }
                level++;
                if(chapter<=2&&level>7){
                    //��chapter1��2 ����ڰ˲�
                    //�����½ڽ���
                    break;
                }
                else if(chapter==3&&level>8){
                    //��Ϸ��������ϲͨ��
                    System.out.println("��Ӣ�����ִ�����"+Episode.countElite);
                    System.out.println("��ͨ�����ִ�����"+Episode.countNormal);
                    System.out.println("�����¼����ִ�����"+Episode.countEvent);
                    return ;
                }
            }
            chapter++;
            if(chapter>3){
                break;
            }

        }
//        for (int i = 1; i <=3; i++) {
//            System.out.println("==========Chapter:"+i+"==========");
//            for (int j = 1; j <=8; j++) {
//                if(i==1&&j==8||i==2&&j==8){
//                    continue;
//                }
//                if(player.live==0){
//                    break;
//                }
//                System.out.println("=========layer"+j+"==========");
//                EliteGhost test_ghost=new EliteGhost("test:layer-"+j+"/chapter-"+i,i,j);
//                test_ghost.attack(player);
//                player.showHp();
//                test_ghost.showHp();
//                player.recover();
//            }
//        }


    }
}
