/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romplan;

/**
 *
 * @author patrick
 */
public interface Data {
    public Reservasjon[] hente();
    public void lagre();
}
