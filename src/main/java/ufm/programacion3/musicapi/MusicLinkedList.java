package ufm.programacion3.musicapi;

import javax.validation.constraints.Null;

public class MusicLinkedList {
    SongNode head;
    public MusicLinkedList(){
        head = null;
    }
    public void append(Song newSong){
        //creating the new node
        SongNode newNode = new SongNode(newSong);
        //checks if there is a head
        if(head == null){
            //set the node as head
            head = newNode;
        }else{
            //sets the conections behind the head
            SongNode last = head.getPrevious();
            last.setNext(newNode);
            head.setPrevious(newNode);
            newNode.setNext(head);
            newNode.setPrevious(last);
        }

    }
    public Song gethead(){
        return head.getCancion();
    }
    public void remove(String name){
        removeNode(searchNode(name));
    }
    public String getAll(){
        if(head == null){
            return null;
        }
        //starting the list with the name of the song head
        String list = head.getCancion().getName();
        //Iteration over the linked list appending the name of each song
        SongNode actualNode = head.getNext();
        while(actualNode != head){
            list = list.concat(" " + actualNode.getCancion().getName());
            actualNode = actualNode.getNext();
        }
        return list;
    }
    public Song getNext(String name){
        return searchNode(name).getNext().getCancion();
    }
    public Song getPrevious(String name){
        return searchNode(name).getPrevious().getCancion();
    }
    private SongNode searchNode(String name){
        if(head.getCancion().getName().equals(name)){
            return head;
        }
        SongNode actualNode = head.getNext();
        while(actualNode != head){
            if(actualNode.getCancion().getName().equals(name)){
                return actualNode;
            }else{
                actualNode = actualNode.getNext();
            }
        }
        return null;
    }
    private void removeNode(SongNode song){
        if(song == head) {
            head = song.getNext();
        }
        song.getPrevious().setNext( song.getNext());
        song.getNext().setPrevious(song.getPrevious());


    }
    private void removeConections(SongNode song){
        song.setPrevious(null);
        song.setNext(null);
    }


}
