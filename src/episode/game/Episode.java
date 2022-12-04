package episode.game;

import character.game.EliteGhost;
import character.game.Ghost;
import character.game.Normal_Ghost;
import character.game.Player;

public class Episode {
    private int levelNum=1;
    private double hardDegree=0.1;
    private int chapterNum=1;
    public Ghost ghost;
    public static int countNormal=0;
    public static int countElite=0;
    public static int countEvent=0;
    public void reward(Player player){
        ;
    }

    public Episode(int chapter, int levelNum, Player player){
        EpisodeData episodeData =new EpisodeData();
        this.chapterNum=chapter;
        this.levelNum=levelNum;
        //������ɹ�� ���ɹ�����ĸ��ʺ��������½ںͲ����ı仯���仯��
        //������Episode������ʱ����֪��κ��½ڣ��Զ�������Ӧ�Ĺ�ꡣ
        //chapter1&&chapter2:1-7Ϊ��������¼��ȣ�8Ϊ�½ڽ�����
        //chapter3:1-8��Ϊ��ꡢ����¼��ȡ�
        double thresholdEGhost=0.2+(chapter-1)*0.1+levelNum*0.05;
        double thresholdEvent=0.15;
        double randomGhost = Math.random();
        double randomEvent =Math.random();
        //��BOSS�ؿ�
        if (!(((chapter==1||chapter==2)&levelNum==7)||(chapter==3&levelNum==8))) {
            //���û���������¼����������ս
            if(randomEvent>thresholdEvent){
                //����Ӣ�����ʴ��������뾫Ӣ����ս
                if(randomGhost<thresholdEGhost){
                    EliteGhost ghost1= new EliteGhost("��Ӣ���"+levelNum+"|"+chapter,chapter,levelNum);
                    episodeData.ghosts[chapter-1][levelNum-1]=ghost1;
                    this.ghost=ghost1;
                    countElite++;
                }
                //��������ͨ����ս
                else{
                    Normal_Ghost ghost1 = new Normal_Ghost("��ͨ���"+levelNum+"|"+chapter,chapter,levelNum);
                    episodeData.ghosts[chapter-1][levelNum-1]=ghost1;
                    this.ghost=ghost1;
                    countNormal++;
                }
            }
            else{
                countEvent++;
                //��Ӧ�������¼�
                ;
            }
        }
        //BOSS�ؿ�
        else{
            if(chapter==1){

            }
            if(chapter==2){

            }
            if(chapter==3){

            }
            //boss
        }
//        episodeData.episodes[chapter][levelNum].levelNum=levelNum;
//        episodeData.episodes[chapter][levelNum].chapterNum=chapterNum;
    }
}
