/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;

/**
 *
 * @author 8180651
 */
public class ClassedeTestes {
    
    public static void main(String[] args){
        
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        Object obj5 = new Object();
        
        ContainerOfObjects teste = new ContainerOfObjects();
        teste.addObject(obj1);
        System.out.println("1- " + obj1.toString());
        teste.addObject(obj2);
        System.out.println("2- " + obj2.toString());
        teste.addObject(obj3);
        System.out.println("3- " + obj3.toString());
        teste.addObject(obj4);
        System.out.println("4- " + obj4.toString());
        teste.addObject(obj5);
        System.out.println("5- " + obj5.toString());
        
        System.out.println("Eliminado- " + teste.removeObject(0).toString());
    }
    
}
