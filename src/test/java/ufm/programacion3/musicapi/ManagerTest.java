package ufm.programacion3.musicapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void addSong() {
        Manager lista = new Manager();
        lista.addSong("doctor alivi");
        assertEquals("doctor alivi", lista.getList());
    }

    @Test
    void getList() {
        Manager lista = new Manager();
        assertEquals(null, lista.getList());
        lista.addSong("doctor alivi");
        assertEquals("doctor alivi", lista.getList());
        lista.addSong("doctor");
        assertEquals("doctor alivi doctor", lista.getList());
    }

    @Test
    void getSong1() {
        Manager lista = new Manager();
        lista.addSong("doctor alivi");
        lista.addSong("doctor");
        assertEquals("doctor alivi", lista.getSong1());
    }

    @Test
    void getNextSong() {
        Manager lista = new Manager();
        lista.addSong("doctor alivi");
        lista.addSong("doctor");
        assertEquals("doctor", lista.getNextSong("doctor alivi"));
    }

    @Test
    void getPreviousSong() {
        Manager lista = new Manager();
        lista.addSong("doctor alivi");
        lista.addSong("doctor");
        assertEquals("doctor alivi", lista.getPreviousSong("doctor"));
    }
}