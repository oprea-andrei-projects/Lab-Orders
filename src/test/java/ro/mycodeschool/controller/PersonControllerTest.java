package ro.mycodeschool.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonControllerTest {

    @Test
    void test_personinList(){


        PersonController personController = new PersonController();

        String s = personController.isInList("mymail","mypass");

        assertEquals("user",s);
    }

}