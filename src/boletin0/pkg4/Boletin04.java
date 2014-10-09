/*obxetos*/
package boletin0.pkg4;

public class Boletin04 {

    public static void main(String[] args) {
//instancio obxeto tipo semaforo
        Semaforo sema1=new Semaforo();
        String valor=sema1.dameCor();
       System.out.println("cor antes darlle un valor "+valor);
       sema1.ponCor("verde");
       valor=sema1.dameCor();
       System.out.println("cor="+valor);
       //outro xeito
       System.out.println("cor:"+sema1.dameCor());
       
    }
    
}
