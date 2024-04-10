package B5;

public class main {


    public static void main(String[] args) {
//            DiaSemana dia = DiaSemana.DOMINGO;
//
//            if (dia == DiaSemana.DOMINGO || dia==DiaSemana.LUNES){
//                System.out.println("Es dia de trabajar");
//            }else {
//                System.out.println("Hoy se descansa");
//            }
//        }

        TiposProductos productos = TiposProductos.Cargadores;
        System.out.println("Seleccionando producto celular: " + productos);

        for (TiposProductos d : TiposProductos.values()) {
            System.out.println("Productos en bodega de celulares: " + d);
        }
    }
}
