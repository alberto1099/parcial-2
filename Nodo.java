public class Nodo {
    Persona info;
   Nodo sig;
   Nodo ant;

   Nodo(Persona info) {
       this.info = info;
       sig = null;
       ant = null;
   }
}