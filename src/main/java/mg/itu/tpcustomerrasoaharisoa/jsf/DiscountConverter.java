/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tpcustomerrasoaharisoa.jsf;

import jakarta.ejb.EJB;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import mg.itu.tpcustomerrasoaharisoa.ejb.DiscountManager;
import mg.itu.tpcustomerrasoaharisoa.entities.Discount;

/**
 *
 * @author ASUS
 */
@FacesConverter(value="discountConverter", managed=true)
public class DiscountConverter implements Converter<Discount>{

    @EJB
    private DiscountManager discountManager;
    
    @Override
    public Discount getAsObject(FacesContext fc, UIComponent uic, String value) {
        return (value == null)? null : discountManager.findById(value);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Discount discount) {
        return (discount == null)?  "" : discount.getCode();
    }
    
    
}
