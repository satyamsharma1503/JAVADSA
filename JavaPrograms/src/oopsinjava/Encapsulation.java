package oopsinjava;

public class Encapsulation {
    public static void main(String[] args){
        Trainer trainer=new Trainer();
        trainer.name="satyem sharma";
        trainer.email ="ss@gmail";
        trainer.technoligy="computer";
        System.out.println(trainer.name +" " +trainer.email +" " +trainer.technoligy);
        

        trainer.printProfile("Satyam Sharma", "ss96@gmail.com", "java");


        trainer.setName("Chandresh");
        trainer.setEmail("chandresh324@gmail.com");
        trainer.setTechnology("Python");
        System.out.println(trainer.getName()+" "+ trainer.getEmail()+" "+ trainer.getTechnology());
    }

}

  class Trainer{
    String name;
    String email;

      public String getTechnology() {
          return technoligy;
      }

      public void setTechnology(String technoligy) {
          this.technoligy = technoligy;
      }

      public String getEmail() {
          return email;
      }

      public void setEmail(String email) {
          this.email = email;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      String technoligy;

      public void printProfile(String satyamSharma, String mail, String computer) {
          System.out.println(satyamSharma+ mail+computer);
      }
  }
