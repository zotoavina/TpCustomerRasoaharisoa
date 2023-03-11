/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpcustomerrasoaharisoa.jsf;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import mg.itu.tpcustomerrasoaharisoa.ejb.CustomerManager;
import mg.itu.tpcustomerrasoaharisoa.entities.Customer;

/**
 * Backing bean de la page customerList.xhtml
 * @author ASUS
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {

    @EJB
    private CustomerManager customerManager;
    
    private List<Customer> customerList;
    
    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
    
    public List<Customer> getCustomers(){
        if(customerList == null){
            customerList = customerManager.getAllCusomers();
        }
        return customerList;
    }
    
}
