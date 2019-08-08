package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 2/28/16.
 */
public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    public Playlist(String name){
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

//    public void addSong(Song song){
//        if(addSong(song.getTitle(), song.getDuration())){
//            System.out.println("Song added.");
//        }
//        System.out.println("Unable to add song.");
//    }

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

    public void showSongs(){
        for(int i = 0; i < this.songs.size(); i++){
            String songName = this.songs.get(i).getTitle();
            Double songDuration = this.songs.get(i).getDuration();
            System.out.println((i+1) + ": " + songName +
            "\nDuration: " + songDuration);
        }
    }

}
