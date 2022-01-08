package ro.mycodeschool.controller;

import org.junit.jupiter.api.Test;
import ro.mycodeschool.repository.ODRepo;

import static org.junit.jupiter.api.Assertions.*;

class ODControllerTest {

    @Test
    void test_m1(){

        ODRepo odRepo = new ODRepo();
        odRepo.updateM1(3,10);
    }

    @Test
    void test_m2(){

        ODRepo odRepo = new ODRepo();
        odRepo.updateM2(3,20);
    }

    @Test
    void test_m3(){

        ODRepo odRepo = new ODRepo();
        odRepo.updateM3(3,30);
    }

}