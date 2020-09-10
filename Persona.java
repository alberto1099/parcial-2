public class Persona {
    private int id;
    private String nombre;
    private String apellidos;
    private int h_traba;
    private int precio_hora;
    
  

   public Persona(int id, String nombre, String apellidos, int h_traba, int precio) {
       this.id = id;
       this.nombre = nombre;
       this.apellidos =apellidos;
       this.h_traba = h_traba;
       this. precio = precio_hora;
   }

   public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
  


/*public int calcular_sueldo(){

     

    return h_traba * precio;
}*/


   @Override
   public String toString() {
//      
        return "Persona{" + "id= " +id + " nombre= " + nombre + " apellidos "+ apellidos+'}';
   }

   }