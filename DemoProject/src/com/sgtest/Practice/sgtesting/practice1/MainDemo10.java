package com.sgtest.Practice.sgtesting.practice1;
class Player {
    Player(String name) {
        System.out.println("playername:" + name);
    }

    Player(String nickname, int code)
    {
        System.out.println("nickname:"+nickname+"code:"+code);
    }
    Player(String game,String noofplayers)
    {
        System.out.println("gamename:" + game + "noofplayers:" + noofplayers);
    }
    Player(int winmatch,String rating)
    {
        System.out.println("winmatchs:"+winmatch+"rating:"+rating);
    }

}

public class MainDemo10 {
    public static void main(String[] args)
    {
        Player o1=new Player("srikantha");
        Player o2=new Player("siri",001);
        Player o3=new Player("football","five");
        Player o4=new Player(5,"five");
    }
}
