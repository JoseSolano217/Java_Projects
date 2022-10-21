package projects;

import java.util.*;

public class Main {
    Aerolinea aerolinea = new Aerolinea();
    Grafo grafo;
    Usuario datosUsuario = new Usuario();
    public static void main(String[] args) {
        Main m = new Main();
        m.obtenerValoresIniciales();

        m.datosUsuario = m.menu();
        if (m.datosUsuario != null) {
            if (m.datosUsuario.getTipo() == 1) {
                Cliente clienteActivo = new Cliente(m.datosUsuario.getNombre(), m.datosUsuario.getPassword(), new ArrayList<>());
                System.out.println("¿Que desea hacer?");
                System.out.println("""
                        1. Revisar vuelos disponibles desde mi ciudad
                        2. Pedir un tiquete
                        3. Salir""");
                // instanceOf
                switch (new Scanner(System.in).nextInt()) {
                    case 1 -> {
                        System.out.println("Ingrese el nombre de la ciudad para revisar sus vuelos");
                        Ciudad ciudadABuscar = m.aerolinea.buscarCiudades(new Scanner(System.in).nextLine());
                        if (ciudadABuscar != null) {
                            List<Ruta> vuelosTemporales = m.aerolinea.buscarRutas(ciudadABuscar);
                            for (Ruta ruta : vuelosTemporales) {
                                System.out.println("Hay un vuelo disponible desde la ciudad seleccionada hasta la ciudad " + ruta.getDestino().getNombre());
                            }
                            System.out.println("¿Desea ordenar un tiquete a uno de los vuelos mostrados?");
                            System.out.println("""
                                1. Si
                                2. No""");
                            if (new Scanner(System.in).nextInt() == 1) {
                                System.out.println("¿A qué destino quiere ir?");
                                Ciudad ciudad = m.aerolinea.buscarCiudades(new Scanner(System.in).nextLine());
                                Ruta ruta = m.aerolinea.buscarVuelos(ciudadABuscar, ciudad);
                                System.out.println("¿En que fecha quiere salir?");
                                String fecha = new Scanner(System.in).nextLine();
                                Tiquete tiquete = (m.aerolinea.dispensarTiquetes(ruta, clienteActivo, fecha));
                                clienteActivo.addTicket(tiquete);
                                System.out.println("Tiquete añadido correctamente");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Ingrese el nombre de la ciudad de origen para revisar sus vuelos");
                        Ciudad ciudadABuscar = m.aerolinea.buscarCiudades(new Scanner(System.in).nextLine());
                        if (ciudadABuscar != null) {
                            List<Ruta> vuelosTemporales = m.aerolinea.buscarRutas(ciudadABuscar);
                            for (Ruta ruta : vuelosTemporales) {
                                System.out.println("Hay un vuelo disponible desde la ciudad seleccionada hasta la ciudad " + ruta.getDestino().getNombre());
                            }
                            System.out.println();
                            System.out.println("¿A qué destino quiere ir?");
                            Ciudad ciudad = m.aerolinea.buscarCiudades(new Scanner(System.in).nextLine());
                            Ruta ruta = m.aerolinea.buscarVuelos(ciudadABuscar, ciudad);
                            System.out.println("¿En que fecha quiere salir?");
                            String fecha = new Scanner(System.in).nextLine();
                            Tiquete tiquete = (m.aerolinea.dispensarTiquetes(ruta, clienteActivo, fecha));
                            clienteActivo.addTicket(tiquete);
                            System.out.println("Tiquete añadido correctamente");
                        }
                    }
                    case 3 -> System.out.println("Tenga un buen día");
                    default -> System.out.println("Opcion invalida");
                }
            } else {
                Trabajador trabajadorActivo = new Trabajador(m.datosUsuario.getNombre(), m.datosUsuario.getPassword());
                System.out.println("¿Que desea hacer?");
                System.out.println("""
                        1. Añadir ciudades
                        2. Salir""");
                switch (new Scanner(System.in).nextInt()) {
                    case 1 -> {
                        System.out.println("Inserte el nombre de la nueva ciudad");
                        String nombre = new Scanner(System.in).nextLine();
                        System.out.println("Inserte el Pais en el que se encuentra");
                        String pais = new Scanner(System.in).nextLine();
                        System.out.println("Inselte la altura de la ciudad");
                        double altura = new Scanner(System.in).nextDouble();
                        System.out.println("Inserte el clima de la ciudad");
                        String clima = new Scanner(System.in).nextLine();
                        System.out.println("Inserte las cordenadas en X de la capital del país");
                        int x = new Scanner(System.in).nextInt();
                        System.out.println("Inserte las coordenadas en Y de la capital del país");
                        int y = new Scanner(System.in).nextInt();
                        int[] coordenadas = {x, y};
                        m.aerolinea.guardarCiudad(new Ciudad(nombre, pais, altura, clima, coordenadas, m.grafo.getCiudades()));
                        m.aerolinea.crearVuelos(new Ciudad(nombre, pais, altura, clima, coordenadas, m.grafo.getCiudades()));
                        System.out.println("Añadido con exito");
                    }
                    case 2 -> {
                        System.out.println("Tenga un buen día, " + trabajadorActivo.getNombre());
                    }
                }
            }
        }
    }

    public void obtenerValoresIniciales() {
        for (int i = 0; i < 5; i++) {
            grafo.guardarCiudad(new Ciudad("Ciudad" + i, "Pais" + i, 0.0, "String clima", new int[]{(int) (Math.random() * 10), (int) (Math.random() * 10)}, new ArrayList<>()));
            aerolinea.guardarCiudad(new Ciudad("Ciudad" + i, "Pais" + i, 0.0, "String clima", new int[]{(int) (Math.random() * 10), (int) (Math.random() * 10)}, new ArrayList<>()));
        }
        // Tipo 1 = Cliente, tipo 2 = Trabajador, tipo 0 = por defecto
        // Ya está en los constructores, así que
        for (int i = 0; i < 10; i++) {
            aerolinea.guardarTrabajador(new Trabajador("Trab" + i, "Pass" + i, new Ruta(), 0.0, "No", false));
            aerolinea.guardarCliente(new Cliente("Client" + i, "Pass" + i, new ArrayList<>()));
        }
        for (Ciudad ciudad : grafo.getCiudades()) {
            for (Ciudad ciudad1 : grafo.getCiudades()) {
                if (ciudad1 != ciudad) {
                    ciudad.addCiudad(ciudad1);
                }
            }
        }
        for (Ciudad ciudad : aerolinea.getCiudades()) {
            for (Ciudad ciudad1 : aerolinea.getCiudades()) {
                if (ciudad1 != ciudad) {
                    ciudad.addCiudad(ciudad1);
                }
            }
        }
        aerolinea.crearVuelosIniciales();
        for (Ciudad ciudad : grafo.getCiudades()) {
            grafo.crearRutas(ciudad);
        }
    }

    public Usuario registrarCliente() {
        Cliente cliente;
        System.out.println("Introduzca el nombre del nuevo cliente");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduzca la contraseña del nuevo cliente");
        String pass = new Scanner(System.in).nextLine();
        cliente = new Cliente(nombre, pass, new ArrayList<>());
        aerolinea.agregarCliente(cliente);
        System.out.println("Datos validos");
        return cliente;
    }

    public Usuario iniciarSesionUsuario(String usuario) {
        switch (usuario) {
            case "cliente" -> {
                while (true) {
                    System.out.println("Introduzca el nombre de cliente");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Introduzca la contraseña de cliente");
                    String pass = new Scanner(System.in).nextLine();
                    if (aerolinea.revisarLoginCliente(nombre, pass)) {
                        Cliente clienteActivo = aerolinea.buscarCliente(nombre);
                        System.out.println("Aceptado, bienvenido " + clienteActivo.getNombre());
                        return clienteActivo;
                    } else {
                        System.out.println("Invalido");
                    }
                }
            }
            case "trabajador" -> {
                while (true) {
                    System.out.println("Introduzca el nombre de trabajador");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Introduzca la contraseña de trabajador");
                    String pass = new Scanner(System.in).nextLine();
                    if (aerolinea.revisarLoginTrabajador(nombre, pass)) {
                        Trabajador trabajadorActivo = aerolinea.buscarTrabajador(nombre);
                        System.out.println("Aceptado, bienvenido " + trabajadorActivo.getNombre());
                        return trabajadorActivo;
                    } else {
                        System.out.println("Invalido");
                    }
                }
            }
            default -> {
                return null;
            }
        }
    }

    public Usuario menu() {
        while (true) {
            System.out.println("Bienvenido, ¿Tiene una cuenta existente o desea registrarse con una cuenta nueva? (No valido para cuentas de trabajadores)");
            System.out.println("""
                    1. Cuenta existente
                    2. Cuenta nueva
                    3. Salir
                    """);
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    boolean check1 = false;
                    while (!check1) {
                        System.out.println("¿A qué cuenta desea ingresar?");
                        System.out.println("""
                                1. Cuenta cliente
                                2. Cuenta trabajador
                                3. Salir
                                """);
                        switch (new Scanner(System.in).nextInt()) {
                            case 1 -> {
                                return iniciarSesionUsuario("cliente");
                            }
                            case 2 -> {
                                return iniciarSesionUsuario("trabajador");
                            }
                            case 3 -> {
                                check1 = true;
                            }
                            default -> System.out.println("La opción seleccionada es invalida");
                        }
                    }
                }
                case 2 -> {
                     return registrarCliente();
                }
                case 3 -> {
                    System.out.println("Tenga un buen día");
                    return null;
                }
                default -> System.out.println("La opción seleccionada es invalida");
            }
        }
    }


}
