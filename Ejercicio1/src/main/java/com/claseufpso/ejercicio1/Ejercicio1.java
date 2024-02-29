

package com.claseufpso.ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Character homero = new Character("homero",30,'m',"a la grand le puse cuca"); 
        homero.saySomething();
        
        Character bart = new Character("bartolomeo",10,'m',"¡ay caramba!"); 
        
    }
    
    
        static class Character{
        String name;
        int age;
        char gender;
        String phrase;
        
        public Character(String name, int age, char gender, String phrase){
            this.name = name;
            this.age = age;
            this.gender = gender; 
            this.phrase = phrase; 
        }
        
        void saySomething(){
            System.out.println(this.phrase);
        }
    }
}
