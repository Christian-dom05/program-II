class Alumno {
    private String nacionalidad, pais, estadoOrigen,fecha, categoria, dialecto, estadoCivil, nivelProcedencia, nivel, sede, unidadAcademica, programaEd;
    private int año, edad, grado, grupo, numeroAlumnos;
    private String genero;

    public Alumno(int año, String genero, String nacionalidad, String pais, String estadoOrigen, String fecha, int edad, String categoria/*, String dialecto, String estadoCivil, String nivelProcedencia, String nivel, String sede, String unidadAcademica, String programaEd, int grado, int grupo, int numeroAlumnos*/) {
        this.año = año;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.pais = pais;
        this.estadoOrigen = estadoOrigen;
        this.fecha = fecha;
        this.edad = edad;
        this.categoria = categoria;
        this.dialecto = dialecto;
        this.nivelProcedencia = nivelProcedencia;
        this.estadoCivil = estadoCivil;
        this.nivel = nivel;
        this.sede = sede;
        this.unidadAcademica = unidadAcademica;
        this.programaEd = programaEd;
        this.grado = grado;
        this.grupo = grupo;
        this.numeroAlumnos = numeroAlumnos;
    }

    @Override
    public String toString() {
        return "año: "+ año+ "| género: "+genero+"| nacionalidad: "+ nacionalidad+"| pais: "+ pais+"| estado de origen: "+ estadoOrigen+"| fecha: "+fecha+"| edad: "+edad+"| categoria: "+categoria/*+"| dialecto: "+dialecto+"| estado civil: "+estadoCivil+"| nivel de procedencia: "+nivelProcedencia+"| nivel: "+nivel+"| sede: "+sede+"| unidad académica: "+unidadAcademica+"| programa educacional: "+programaEd+"| grado: "+grado+"| grupo: "+grupo+"| numero alumnos: "+numeroAlumnos*/;
    }
}