/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public abstract class SystemAdminRole extends Role{

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
