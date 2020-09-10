public class Principal {

   
    public static void main(String[] args) {
        Cola x = new Cola();
       
        x.insertar(new Nodo(new Persona( 1006513, "albero", "barrera obregon", 15,5))); 
        x.insertar(new Nodo(new Persona(4078954, "andres","jaramillo", 20,5)));
        x.insertar(new Nodo(new Persona(331464, "maria","corredor sanchez", 40,5)));
        System.out.println(x);
        x.atender();
        System.out.println(x);
        x.atender();
        System.out.println(x);
        x.limpiar();
        System.out.println(x);


      
        
     /*   Cola niños = new Cola();
        Cola joven = new Cola();
        Cola adulto = new Cola();
        Cola anciano = new Cola();
        Cola ninio = new Cola();
        Cola ninia = new Cola();
        Cola aux = new Cola();

        for (int i = 0; i < 20; i++) {
            int aleatorio = (int) (Math.random() * 80) + 1;
            boolean sex;
            if (aleatorio % 2 == 0) {
                sex = true;
            } else {
                sex = false;
            }
            if (aleatorio <= 12) {
                x.insertar(new Nodo(new Persona("niños\n "+i, aleatorio, sex)));

            } else if (aleatorio >= 13 && aleatorio <= 17) {
                x.insertar(new Nodo(new Persona("joven\n "+i, aleatorio, sex)));

            } else if (aleatorio >= 18 && aleatorio <= 60) {
                x.insertar(new Nodo(new Persona("adulto\n "+i, aleatorio, sex)));
            } else {
                x.insertar(new Nodo(new Persona("anciano\n "+i, aleatorio, sex)));
            }
        }
        System.out.println(x);
        Persona tmp;
        for (int i = 0; i < 20; i++) {
            tmp = x.atender();
            if (tmp.getEdad() <= 12) {
                niños.insertar(new Nodo(tmp));

            } else {
                if (tmp.getEdad() >= 13 && tmp.getEdad() <= 17) {
                    joven.insertar(new Nodo(tmp));

                } else {
                    if (tmp.getEdad() >= 10 && tmp.getEdad() <= 60) {
                        adulto.insertar(new Nodo(tmp));

                    } else {
                        x.insertar(new Nodo(tmp));
                    }

                }
            }
        }
        System.out.println("lista niños \n" + niños);
        System.out.println("");
        System.out.println("lista jovenes \n" + joven);
        System.out.println("");
        System.out.println("lista adultos \n" + adulto);
        System.out.println("");
        System.out.println("lista x \n" + x);
            aux.insertar(new Nodo(adulto.atender()));
            aux.insertar(new Nodo(niños.atender()));
            aux.insertar(new Nodo(anciano.atender()));
             for (int i = 0; i < 30; i++) {
            x.insertar(new Nodo(joven.atender()));
        }
             System.out.println(aux);
//         System.out.println(ninia);
//        System.out.println("lista de la niñas\n"+ ninia);
//        System.out.println("lista de la niños\n"+ ninio);*/
    }
}
