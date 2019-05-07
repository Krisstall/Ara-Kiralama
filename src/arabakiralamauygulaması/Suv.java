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
public class Suv extends Araç{
    
    static int toplamAraç=0;
    private final int günlükKira = 80;
    public Suv() {
        super();
        toplamAraç += 1;
    }
    
}
