package com.claseufpso.ejercicio1;
import people.character;
public class Ejercicio1 {

    public static void main(String[] args) {
        character homero = new character("homero",30,'m',"a la grand le puse cuca"); 
        homero.saySomething();
        
        character bart = new character("bartolomeo",10,'m',"ay caramba!"); 
        bart.saySomething();
        
        character apu = new character();
        apu.setName("apu");
        apu.setPhrase("buelva prontos");
        
        apu.saySomething();
    }    
    }