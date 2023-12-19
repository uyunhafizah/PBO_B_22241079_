package com.tutorial;

class Player{
   //Data Mamber
   String name; // default, bisa diakses oleh class lain
   public int exp; //npublic, bisa diakses oleh class lain
   private int health; // private, tidak bisa diakses oleh class lain

   Player(String name, int exp, int health) {
      this.name = name;
      this.exp = exp;
      this.health = health;
   }

   void Display() {
      System.out.println("Nama Player : " + this.name);
      System.out.println("Pleyer EXP :" + this.exp);
      System.out.println("Player Health : " + this.health);
   }
}


public class Main {
   public static void main(String[] args) {
      // instansiasi atau pembuat objek baru
      Player hero_1 = new Player ("Saitama", 20, 100);

      hero_1.Display();
   } 
}
