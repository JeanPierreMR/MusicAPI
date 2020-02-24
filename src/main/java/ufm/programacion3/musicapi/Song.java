package ufm.programacion3.musicapi;
/*1.Write an API to serve as backend implementing any Linked List to allow the following music playlist operations:a.Add to the listb.Play Nowc.Play Nextd.Play Previouse.List Songs*/
public class Song {
    private String author, name, type, url;

    public Song(String author, String name, String type, String url) {
        this.author = author;
        this.name = name;
        this.type = type;
        this.url = url;
    }
    public Song(String name) {
        this.author = "";
        this.name = name;
        this.type = "";
        this.url = "";
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
