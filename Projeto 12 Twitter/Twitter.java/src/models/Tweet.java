package models;

import java.util.ArrayList;

public class Tweet 
{
    private static int idTw = 1;
    private int id;
    private String username;
    private String msg;
    private ArrayList<String> likes;

    public Tweet(String userId, String msg){
        this.username = userId;
        this.msg = msg;
        this.id = Tweet.idTw;
        Tweet.idTw += 1;
        likes = new ArrayList<>();
    }

    public int getId(){return this.id;}
    public String getUsername(){return this.username;}
    public String getMsg(){return this.msg;}
    public ArrayList<String> getLikes(){return this.likes;}
    
    public void like(String userName){
        likes.add(userName);
    }

    public String toString(){   
        return this.id + ":" + this.username + "( " + this.msg + " )" + this.likes;
    }
}
