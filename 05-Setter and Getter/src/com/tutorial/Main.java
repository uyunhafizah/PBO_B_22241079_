package com.tutorial;

class User{
   // Data Member dengan keyword private
   private String username;
   private String password;

   User(String username, String password) {
      this.username = username;
      this.password = password;
   }

   // method getter
   public String getUsername(){
      return this.username;
   }

   public String getPassword() {
      return this.password;
   }

   // method Setter untuk ganti password
   public void setPassword(String password) {
      this.password = password;
   }
}

public class Main {
   public static void main(String[] args) {
      // intensiasi atau buat objek
      User person_1 = new User("undikma", "jayajayajaya");

      // get username
      System.out.println(person_1.getUsername());
      System.out.println(person_1.getPassword());

      person_1.setPassword("sukses");

      System.out.println("Password Baru : " + person_1.getPassword());
   } 
}
