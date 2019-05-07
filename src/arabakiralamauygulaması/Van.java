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
public class Van extends Araç{
    
    static int toplamAraç=0;
    private final int günlükKira = 70;
    public Van() {
        super();
        toplamAraç += 1;
    }
    
}
