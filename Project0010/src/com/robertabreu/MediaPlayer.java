package com.robertabreu;

import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * Created by robertabreu on 2/28/16.
 */

public class MediaPlayer {
    private static char s = '\u0860';
    private static char n = '\u266A';
    public static void main(String[] args) {


//    ArrayList<Album> hybridTheory = new ArrayList<Album>();
//        hybridTheory.add(1, new Album("Space"));

        /**
         * ORIGINAL CODE
         */
        /*
        ArrayList<Album> albumArrayList = new ArrayList<Album>();
        LinkedList<Playlist> playlist1 = new LinkedList<Playlist>();


        Album albumOne = new Album("Hybrid Theory");

        albumOne.addSong("One Step Closer", 2.34);
        albumOne.addSong("Crawling", 3.30);
        albumOne.addSong("In The End", 3.36);

        Album albumTwo = new Album("Meteora");

        albumTwo.addSong("Don't Stay", 3.07);
        albumTwo.addSong("Somewhere I Belong", 3.34);
        albumTwo.addSong("Lying From You", 2.55);
        albumTwo.addSong("Easier To Run", 3.24);
        albumTwo.addSong("Numb", 3.07);

        albumArrayList.add(albumOne);
        albumArrayList.add(albumTwo);

        System.out.println("Title " + albumArrayList.get(0).getSongs().get(0).getTitle());

        System.out.println("\nAlbum: " + albumOne.getTitle());
        for (int i = 0; i < albumOne.getSongs().size(); i++) {
            System.out.println((i + 1) + ": " + albumOne.getSongs().get(i).getTitle());
        }

        System.out.println("\nAlbum: " + albumTwo.getTitle());

        for (int i = 0; i < albumTwo.getSongs().size(); i++) {
            System.out.println((i + 1) + ": " + albumTwo.getSongs().get(i).getTitle());
        }

        addSongToPlaylist(playlist1, albumOne, "One Step Closer");
        addSongToPlaylist(playlist1, albumTwo, "Don't Stay");
        addSongToPlaylist(playlist1, albumOne, "In The End");

        showPlaylist(playlist1);
        */

        ArrayList<Album> album = new ArrayList<Album>();
        LinkedList<Playlist> playlists = new LinkedList<Playlist>();
        LinkedList<Song> playlist = new LinkedList<Song>();

        album.add(new Album("Hybrid Theory"));
        album.get(0).addSong("One Step Closer", 2.34);
        album.get(0).addSong("Crawling", 3.30);
        album.get(0).addSong("In The End", 3.36);

        album.add(new Album("Meteora"));
        album.get(1).addSong("Don't Stay", 3.07);
        album.get(1).addSong("Somewhere I Belong", 3.34);
        album.get(1).addSong("Lying From You", 2.55);
        album.get(1).addSong("Easier To Run", 3.24);
        album.get(1).addSong("Numb", 3.07);

        System.out.println("\nAlbum: " + album.get(0).getTitle());
        for (int i = 0; i < album.get(0).getSongs().size(); i++) {
            Song songs = album.get(0).getSongs().get(i);
            System.out.println("Title: " + songs.getTitle() + "\nDuration: " + songs.getDuration());
        }


        System.out.println("\nAlbum: " + album.get(1).getTitle());
        for (int i = 0; i < album.get(1).getSongs().size(); i++) {
            Song songs = album.get(1).getSongs().get(i);
            System.out.println("Title: " + songs.getTitle() + "\nDuration: " + songs.getDuration());
        }

        playlists.add(new Playlist("X")); // Xero ;)

        addSongToPlaylist(playlist, album, 0, 2);
        addSongToPlaylist(playlist, album, 1, 4);
        addSongToPlaylist(playlist, album, 0, 0);
        addSongToPlaylist(playlist, album, 1, 0);
        addSongToPlaylist(playlist, album, 0, 1);
        addSongToPlaylist(playlist, album, 1, 3);
//        addSongToPlaylist(playlist, album, 0, 5);

        showPlaylist(playlist);


        player(playlist);

    } // End Of Main Method.


    private static void addSong(LinkedList<Playlist> playlists, ArrayList<Album> album, int albumPosition, int songPosition) {
        ListIterator<Playlist> list = playlists.listIterator();
        String songName = album.get(albumPosition).getSongs().get(songPosition).getTitle();
        double songDuartion = album.get(albumPosition).getSongs().get(songPosition).getDuration();

        if (playlists.get(0).addSong(songName, songDuartion)) {
            System.out.println("\nSong added to playlist: " + playlists.get(0).getName() +
                    "\nTitle: " + songName + "\nDuration: " + songDuartion);
        } else {
            System.out.println("Unable to add song.");
        }
    }

    private static void player(LinkedList<Song> playlist) {
        System.out.println("\n\nPlayer Loading..." + "\n\n");
        ListIterator<Song> list = playlist.listIterator();
        Scanner input = new Scanner(System.in);
        Scanner remove = new Scanner(System.in);
        int listMaxSize = playlist.size();
        boolean quit = false;
        boolean nextSong = true;
        int choice;

        if (playlist.isEmpty()) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing: " + n + " " + list.next().getTitle()+" "+ n);
            playerMenu();
        }
        while (!quit) {
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 0:
                    playerMenu();
                    break;

                case 1: // Previous Song
                    if (nextSong) {
                        if (list.hasPrevious()) {
                            list.previous();
                            nextSong = false;
                        }
                    }
                    if (list.hasPrevious()) {
                        System.out.println("\n< Playing: " + n + " " + list.previous().getTitle() + " " +n +" <" );
                    } else {
                        System.out.println("\nTop of the playlist.");
                        System.out.println("Tap 'Next Song' [2] to play.");
                        nextSong = true;
                    }
                    break;

                case 2: // Next Song
                    if (!nextSong) {
                        if (list.hasNext()) {
                            list.next();
                            nextSong = true;
                        }
                    }
                    if (list.hasNext()) {
                        System.out.println("\n> Playing: " + n + " " + list.next().getTitle()+" "+ n + " >");
                    } else {
                        System.out.println("\n"+ s + " PLAYLIST: END " + s);
                        nextSong = false;
                    }
                    break;

                case 3: // Replay Current Song
                    if ((list.nextIndex() == listMaxSize) || (list.previousIndex() == -1)) {
                        System.out.println("\nNo Song To Replay.\n");
                        break;
                    }
                    if(nextSong) { // replay song while going forward
                        System.out.println("\n Replaying: " + n+ " " + list.previous().getTitle()+" "+n + " ");
                        list.next();
                    } else {
                        System.out.println("\n Replaying: " + n+ " " + list.next().getTitle()+" "+n + " ");
                        list.previous();
                    }

                    break;

                case 4: // Remove Song
                    if ((list.nextIndex() == listMaxSize) || (list.previousIndex() == -1)) {
                        System.out.println("\nNo Song Selected To Delete! \n");
                        break;
                    }
                    if (nextSong) {
                        list.previous();
                        System.out.println("Remove: [" + list.next().getTitle() + "]?");
                        System.out.print("Y/N: ");
                        String answer = remove.nextLine();

                        if (answer.contains("y")) {
                            list.previous();
                            System.out.println("[" + list.next().getTitle() + "] Removed.");
                            list.remove();
                            list.next();
                        } else {
                            System.out.println("No Song Deleted.");
                            break;
                        }
                    } else if (!nextSong) {
                        list.next();
                        System.out.println("Remove: [" + list.previous().getTitle() + "]?");
                        System.out.print("Y/N: ");
                        String answer = remove.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            list.next();
                            System.out.println("[" + list.previous().getTitle() + "] Removed.");
                            list.remove();
                            list.next();
                        } else {
                            System.out.println("No Song Deleted.");
                            break;
                        }
                    } else {
                        System.out.println("Well something broke...");
                        break;
                    }
                    break;

                case 5:
                    showPlaylist(playlist);
                    break;

                case 6:
                    quit = true;
                    break;

                case 7:
                    System.out.println("HEYYY YOU'RE NOT SUPPOSE TO BE HERE!!!");
                    int nextIndex = list.nextIndex();
                    int previousIndex = list.previousIndex();

                    System.out.println("Next: " + nextIndex +
                            "\nPrevious: " + previousIndex +
                    "\nList Size: " + listMaxSize);
                    break;

                case 8:
                    if(playlist.size() > 0) {
                        list.remove();
                        if (list.hasNext()) {
                            System.out.println("\n> Playing: " + n + " " + list.next().getTitle()+" "+ n + " >");
                        } else if(list.hasPrevious()) {
                            System.out.println("\n< Playing: " + n + " " + list.previous().getTitle() + " " +n +" <" );
                        }
                    }
                    break;

            }
        }
    }

    private static void playerMenu() {
        System.out.println("Menu Options");
        System.out.println("\t\t0 - Show Menu");
        System.out.println("\t\t1 - Previous Song");
        System.out.println("\t\t2 - Next Song");
        System.out.println("\t\t3 - Replay Song");
        System.out.println("\t\t4 - Delete Song");
        System.out.println("\t\t5 - Show Playlist");
        System.out.println("\t\t6 - Quit");
    }


    private static void addSongToPlaylist(LinkedList<Song> playlist, ArrayList<Album> album, int albumPosition, int songPosition) {
//        ListIterator<Playlist> list = playlist.listIterator();
//        int songPosition = album.songPosition(songName);
//        if (songPosition >= 0) {
        Album checkAlbum = album.get(albumPosition);
        if(genuineAlbum(checkAlbum)){
            Song song = album.get(albumPosition).getSongs().get(songPosition);
            playlist.add(song);
            System.out.println("Added " + song.getTitle() + " to playlist");
            System.out.println("Title: " + song.getTitle() + "\nDuration: " + song.getDuration());
        } else {
            System.out.println("Album is not genuine.");
        }
//        } else {
//            System.out.println("Song does not exist.");
//        }

    }


    private static void showPlaylist(LinkedList<Song> playlist) {
        ListIterator<Song> list = playlist.listIterator();
        System.out.println("\nSongs in playlist");
        while (list.hasNext()) {
            System.out.println("\nTrack: " + (list.nextIndex()+1));
            System.out.println("Song Title: " + list.next().getTitle());
            list.previous();
            System.out.println("Duration: " + list.next().getDuration());
        }
        System.out.println("\n" + s + " END " + s);
//        int j = 0;
//
//        while(i.hasNext()){
//            System.out.println("" + i.next().getSongs().get(j).getTitle() + "\nDuration: ");
//            j++;
//        }
//        System.out.println("Finished");
    }


    public static boolean genuineAlbum(Album album){
        int counter = 0;
        int albumSize = album.getSongs().size();
        ArrayList<Song> genuineSongs = album.getSongs();
        if (albumSize > 0) {
            for (int i = 0; i < genuineSongs.size(); i++) {
                String songName = genuineSongs.get(i).getTitle();
                double songDuration = genuineSongs.get(i).getDuration();
                if(songDuration <= 0.01)
                    counter += 1;
                if(songName.length() <= 2)
                    counter += 1;
                if(counter > 3){
                    System.out.println("Too many corrupt songs in album.");
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}



