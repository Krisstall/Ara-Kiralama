/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabakiralamauygulaması;

/**
 *
 * @author Oğuz
 */
public class Kira {
    String marka;
    double süre;
    Double tutar;
    
    
    
    public Kira(String marka,double süre){
            
        this.marka=marka;
        this.süre=süre;
    }
    
    public double kira(){
        
        if(this.marka=="Audi"){
            tutar =  80*this.süre;
            
        }
        else if(this.marka=="Honda"){
         tutar =  90*süre;   
            
        }
        else if(this.marka=="Man"){
            tutar =  250*this.süre;
            
        }
        else if(this.marka=="Peugeot"){
            tutar =  80*this.süre;
            
        }
        else if(this.marka=="Volkswagen"){
            tutar =  90*this.süre;
            
        }
        else if(this.marka=="Mercedes"){
            tutar =  60*this.süre;
            
        }
        else if(this.marka=="Kia"){
            tutar =  80*this.süre;
            
        }
        else
            tutar =  70*this.süre;
        
    return tutar;
    }
    
}
