package ufm.programacion3.musicapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Manager {
    MusicLinkedList mList = new MusicLinkedList();

    @PostMapping("/addSong")
    public void addSong(String name){
        Song newSong = new Song(name);
        mList.append(newSong);
    }
    @GetMapping("/list")
    public String getList(){
        return mList.getAll();
    }
    @PostMapping("/play")
    public String getSong1(){
        return(mList.gethead().getName());

    }
    @PostMapping("/playNext")
    public String getNextSong(String name){
        return(mList.getNext(name).getName());
    }
    @PostMapping("/playPrevious")
    public String getPreviousSong(String name){
        return(mList.getPrevious(name).getName());
    }
    public void addSong(String name, String author, String url, String genre){
        Song newSong = new Song(author, name, genre, url);
        mList.append(newSong);
    }
    public void removeSong(String name){
        mList.remove(name);
    }
}
