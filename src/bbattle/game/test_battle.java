package bbattle.game;

import bbattle.Login;
import character.game.*;
import character.game.Character;

public class test_battle {


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
        Login login=new Login();
        Player player=login.createRole();
        for (int i = 1; i <=3; i++) {
            System.out.println("==========Chapter:"+i+"==========");
            for (int j = 1; j <=8; j++) {
                if(i==1&&j==8||i==2&&j==8){
                    continue;
                }
                if(player.live==0){
                    break;
                }
                System.out.println("=========layer"+j+"==========");
                EliteGhost test_ghost=new EliteGhost("test:layer-"+j+"/chapter-"+i,i,j);
                test_ghost.attack(player);
                player.showHp();
                test_ghost.showHp();
                player.recover();
            }
        }


    }
}
