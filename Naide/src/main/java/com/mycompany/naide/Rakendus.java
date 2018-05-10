package com.mycompany.naide;

import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Rakendus {
    @RequestMapping("/arvutamine")
    String lahendus(int a, int b) {
        String vastus;
        //ax + b = 0 väärtuse leidmine \ ax = -b \ x = -b/a
        int vaartus = -(b / a);
        vastus = "Vastus on: x = " + vaartus;
            return vastus;
    }
}
