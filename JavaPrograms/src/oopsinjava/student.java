package oopsinjava;

public class student {
    public static void  main(String[] args){
        StudentProfile profile= new StudentProfile();
        profile.setName("SatyamSharma");
        profile.setEmail("ss9655@gmail.com");
        profile.setAddress("Gorakhpur");
        profile.setMobilenumber(Long.parseLong("675352412"));
        System.out.println(profile.getName() +" "+ profile.getEmail()+" "+profile.getAddress()+" "+profile.getMobilenumber());


    }
}
 class StudentProfile{
    String name;
    String email;

     public long getMobilenumber() {
         return mobilenumber;
     }

     public void setMobilenumber(long mobilenumber) {
         this.mobilenumber = mobilenumber;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
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

     String address;
    long mobilenumber;
 }