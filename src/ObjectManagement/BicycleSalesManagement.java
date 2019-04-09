/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;
import java.time.LocalDateTime;
/**
 *
 * @author 8180651
 */
public class BicycleSalesManagement extends ContainerOfObjects {
    
    private int SaleID;
    private LocalDateTime data;
    private double total;
    
    public BicycleSalesManagement(Bicycle[] objects, int SaleID, LocalDateTime data){
        super(objects);
        this.SaleID = SaleID;
        this.data = data;
        
    }
    
    public BicycleSalesManagement(int maxSize, int SaleID, LocalDateTime data){
        super(maxSize);
        this.SaleID = SaleID;
        this.data = data;
    }
    
    public boolean addBicycle(Bicycle bike){
        super.addObject(bike);
    }
    
    public Bicycle removeBicycle(Bicycle bike){
        int position = super.findObject(bike);
        return (Bicycle) super.removeObject(position); 
    }
    
    public boolean setBicycle(int position, Bicycle bike){
        super.setObject(position, bike);
    }
    
    public int findBicycle(Bicycle bike){
        return super.findObject(bike);
    }
    
    
}
