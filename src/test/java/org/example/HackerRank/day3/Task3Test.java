package org.example.HackerRank.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    Task3 task3 = new Task3();

    @Test
    void caesarCipher_first() throws Exception {
        String message = "www.abc.xy";

        String result =  task3.caesarCipher(message, 87);

        assertEquals("fff.jkl.gh", result);
    }
    @Test
    void caesarCipher_second() throws Exception {
        String message = "marek Roszak";

        String result =   task3.caesarCipher(message, 3);

        assertEquals("pduhnUrvcdn", result);
    }
    @Test
    void caesarCipher_third() throws Exception {
        String message = "Witaj. Tu Cezar";

           String result =  task3.caesarCipher(message, 10);


        assertEquals("Gsdkt.DeMojkb", result);
    }
}