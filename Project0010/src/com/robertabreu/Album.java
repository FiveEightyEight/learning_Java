package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 2/28/16.
 */
public class Album {
    private String title;
    private ArrayList<Song> songs;

    public Album(String title){
        this.title = title;
        this.songs = new ArrayList<Song>();
    }

    public String getTitle(){
        return this.title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, double duration){
        Song checkSong = findSong(title);
        if(checkSong == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
            return false;
    }


    public int songPosition(String title){
        Song song = findSong(title);
        if(song != null){
            for(int i = 0; i < getSongs().size(); i++){
                if(song == getSongs().get(i)){
                    return i;
                }
            }
        }
        return -1;
    }



    private Song findSong(String title){
        for(int i = 0; i < this.songs.size(); i++){
            Song checkSong = this.songs.get(i);
            if(checkSong.getTitle().equals(title)){
                return checkSong;
            }
        }
        return null;
    }
}
