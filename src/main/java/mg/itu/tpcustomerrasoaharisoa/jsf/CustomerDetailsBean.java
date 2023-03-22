/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tpcustomerrasoaharisoa.jsf;

import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import mg.itu.tpcustomerrasoaharisoa.ejb.CustomerManager;
import mg.itu.tpcustomerrasoaharisoa.entities.Customer;

/**
 *
 * @author ASUS
 */
@Named
@ViewScoped
public class CustomerDetailsBean {
    
    private int idCustomer;
    
    private Customer customer;
    
    @EJB
    private CustomerManager customerManager;

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * 
     * @return les details du client courant (contenu dans l'attribut customer 
     */
    public Customer getCustomer() {
        return customer;
    }
    
    /**
     * Met à jour dans la base de donnée du client
     * contenu de la variable d'instance customer
     * @return la prochaine page contenant la liste des clients
     */
    public String update(){
        customer = customerManager.update(customer);
        return "customerList";
    }
    
    public void loadCustomer(){
        this.customer = customerManager.findById(idCustomer);
    }
    
    
    
}
