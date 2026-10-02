package ejericio1;

public class InvocacionMetodos {
  public static void pruebaEjercicio1(){
C obj = new D();
    
        obj.p(obj);
        
        ((D)obj).p(obj);

        obj.p((D) obj);     
  }
        

  }

