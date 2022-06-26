import java.util.*;
import java.lang.Math;  

class cricket {
  static int random() {
    return (int)(Math.random()*(300-1+1)+1);
  }
    public static void main(String[] args) {
       
        String firstplayer= "Manu";  
        String secondplayer= "Arun" ;
        System.out.println("player :"+firstplayer);
        int score1=0;
        int score2=0;
        int count1=0;
        int count2=0;
        int score=0;
        do{
          score=random()%7;
          score1=score1+score;
          count1=count1+1;  
        }while(score>0);
      System.out.println(firstplayer+"Total score :"+score1);
      System.out.println(firstplayer+"Takes :"+count1+" Rounds");
      System.out.println(secondplayer+" Needs "+(score1+1)+" In "+ count1+" Rounds To WIN MATCH");
      System.out.println("player :"+secondplayer);
      do{
          score=random()&7;
          score2=score2+score;
          count2=count2+1;  
        }while(score>0);
      if(score1>score2){
        System.out.println(firstplayer+" WIN Match !!");
       }
      else if(score2>score1){
        System.out.println(secondplayer+" WIN Match !!");
      }
      else{
        if(count1>count2){
          System.out.println(secondplayer+" WIN Match !!");
        }
        else{
          System.out.println(firstplayer+" WIN Match !!");
        }
      }
     
 }
}
