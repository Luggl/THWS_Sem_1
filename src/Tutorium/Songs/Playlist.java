package Tutorium.Songs;

import java.io.FileNotFoundException;

public class Playlist {
    Song start;

    public void addSong(String titel, String interpret, int dauer){

        try{
            Song in = new Song(titel, interpret, dauer);
            if(start == null){
                this.start = in;
            }else {
                in.next = start;
                start = in;
            }
        }catch(RuntimeException e){
            System.out.println("Es ist ein Fehler aufgetreten");
        }

    }

    public Playlist filter(String interpret){
        Playlist out = new Playlist();

        Song temp = start;
        while(temp != null){
            if(temp.getInterpret().equals(interpret)){
                out.addSong(temp.getTitel(), temp.getInterpret(), temp.getDauer());
            }
            temp = temp.next;

        }


        return(out);
    }

    public static void main(String[] args) {
        Playlist play = new Playlist();
        play.addSong("The Cantina Band", "John Williams", 9900);
        play.addSong("3 Uhr Nachts", "Mehnersmoos", 8000);
    }
}
