package com.robertabreu;

import java.util.ArrayList;

/**
 * Created by robertabreu on 2/28/16.
 */
public class Storage {
    private ArrayList<Album> album;

    public Storage(){
        this.album = new ArrayList<Album>();
    }

    public ArrayList<Album> getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList<Album> album) {
        this.album = album;
    }
}
