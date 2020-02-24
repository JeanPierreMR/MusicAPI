package ufm.programacion3.musicapi;

public class SongNode {
    private Song music;
    private SongNode next;
    private SongNode previous;

    SongNode(Song cancion)
    {
        this.music = cancion;
        this.next = this;
        this.previous = this;
    }
    SongNode(Song cancion, SongNode next)
    {
        this.music = cancion;
        this.next = next;
        this.previous = this;
    }
    SongNode(Song cancion, SongNode next, SongNode previous)
    {
        this.music = cancion;
        this.next = next;
        this.previous = previous;
    }

    public Song getCancion() {
        return music;
    }

    public void setCancion(Song cancion) {
        this.music = cancion;
    }

    public SongNode getNext() {
        return next;
    }

    public void setNext(SongNode next) {
        this.next = next;
    }

    public SongNode getPrevious() {
        return previous;
    }

    public void setPrevious(SongNode previous) {
        this.previous = previous;
    }
}
