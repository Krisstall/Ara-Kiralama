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
public class Spor extends Araç{
    
    static int toplamAraç=0;
    int günlükKira = 80;
    public Spor() {
        super();
        toplamAraç += 1;
    }
    public int kiraBedeli(){
        
    return günlükKira;
    }
    
}
