/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DeliveryMan.DeliverManDirectory;
import Business.EcoSystem;
import Business.Host.HostDirectory;
import Business.Order.Menu;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public abstract class Role {
    
    public enum RoleType{
        RestaurantAdmin("RestaurantAdmin"),
        Host("Host"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business,
            HostDirectory hostDirectory,
            RestaurantDirectory restaurantDirectory,
            DeliverManDirectory deliveryManDirectory,
            Menu menu,
            OrderDirectory orderDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
