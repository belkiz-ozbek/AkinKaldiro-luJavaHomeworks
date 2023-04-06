/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statik;

/**
 *
 * @author belkizozbek
 */
public class CitizenStatikDemo {
    public static void main(String[] args) {
        Citizen person1 = new Citizen();
        Citizen person2 = new Citizen();
        
        person1.firstName = "Belkiz";
        person1.lastName = "Ozbek";
        person1.tckn = "3274823744";
        
        person2.firstName = "Gulistan";
        person2.lastName = "Taş";
        person2.tckn = "487873473874";
         
        Citizen.nationality = "T.C";
        
        person1.printInfo();
        person2.printInfo();
        System.out.println(Citizen.getNationality());;
        
    }
}
