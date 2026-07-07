
void main() {
    // Crear alumno
    Alumno alumno1 = new Alumno("Juan", "Perez", "A-2024-001", 8);

    //UTILIZACION DEL METODO PARA INSCRIBIRLO A LAS MATERIAS
    alumno1.agregarMaterias("Matemática");
    alumno1.agregarMaterias("Programación");
    alumno1.agregarMaterias("POO");


    //Crear otro alumno

    Alumno alumno2 = new Alumno("Maria", "Perez", "A-2024-002", 9);

    // Crear profesor
    Docente profesor = new Docente("Ana", "Martínez");
    profesor.agregarAlumno(alumno1);
    profesor.agregarAlumno(alumno2);


    // Crear no docente
    NoDocente noDocente = new NoDocente("Carlos", "Lopez", "Administración");

    // Mostrar información
    System.out.println("=== ALUMNO ===");
    System.out.println("Nombre: " + alumno1.getNombre() + " " + alumno1.getApellido());
    System.out.println("Matrícula: " + alumno1.getMatricula());
    System.out.println("Materias: " + alumno1.getMaterias());

    System.out.println("=== ALUMNO ===");
    System.out.println("Nombre: " + alumno2.getNombre() + " " + alumno2.getApellido());
    System.out.println("Matrícula: " + alumno2.getMatricula());
    System.out.println("Materias: " + alumno2.getMaterias());

    System.out.println("\n=== PROFESOR ===");
    System.out.println("Nombre: " + profesor.getNombre() + " " + profesor.getApellido());
    System.out.println("Cantidad de alumnos: " + profesor.getAlumnos().size());

    System.out.println("\n=== NO DOCENTE ===");
    System.out.println("Nombre: " + noDocente.getNombre() + " " + noDocente.getApellido());
    System.out.println("Área: " + noDocente.getArea());


    // METODOS @OVERRIDE

    profesor.Saludar();

    alumno1.Saludar();

    noDocente.Saludar();

    //METODOS SOBRECARGADOS

    profesor.Calificar(alumno1,10);

    System.out.println("NOTA DEL ALUMNO UNO ANTES DE USAR EL OTRO METODO: " + alumno1.getNota());
    System.out.println("NOTA DEL ALUMNO DOS ANTES DE USAR EL OTRO METODO: " + alumno2.getNota());


    profesor.Calificar(7);

    System.out.println("NOTA DEL ALUMNO UNO DESPUES DE USAR EL OTRO METODO: " + alumno1.getNota());

    System.out.println("NOTA DEL ALUMNO UNO DESPUES DE USAR EL OTRO METODO: " + alumno2.getNota());







}


