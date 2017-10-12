/**
 * Acest fisier face parte din aplicatia de Chat dezvoltata
 * in sprijinul studentilor de anul 2 de la facultatea de
 * Electronica, Telecomunicatii si Tehnologia Informatiei din
 * cadrul Universitatii Politehnica Bucuresti.
 */
package ro.upb.etti.poo.chat_application.structs;

/**
 * Clasa main este utilizata pentru testarea claselor Message si
 * PrivateMessage din acest pachet.
 *
 * @author Radu Hobincu
 */
public class Main {

    public static void main(String[] args) {
        Message m1 = new Message("Ion", "Am plecat la coasa.");
        Message m2 = new Message("Vasile", "Eu raman sa dorm.");
        Message m3 = new Message("Ion", "Da, e o idee mai buna.");
        
        PrivateMessage p1 = new PrivateMessage("Vasile", "Ion", "Ce faci, sefule?");
        PrivateMessage p2 = new PrivateMessage("Ion", "Vasile", "Bine, ma intorc de la stupi,productie buna anul asta.");
        PrivateMessage p3 = new PrivateMessage("Vasile", "Ion", "Sa-mi vinzi si mie niste miere cand termini.");

        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        
    }
}
