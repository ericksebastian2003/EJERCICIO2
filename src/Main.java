import javax.swing.border.EtchedBorder;

class Estudiantes {
    //Atributos
    public String nombre ;
    public int edad ;



    //Método constructor
    public Estudiantes(String nombre,int edad)
    {
        //tipo asignación
        //  atributos = parametros
        this.nombre = nombre;
        this.edad = edad;

    }

    //metodo-funciones
    // public + tipo de metodo + nombre del metodo
    public void saludar() {


        System.out.println("Nombre: " + nombre);
        System.out.println("Edad : " + edad);
    }



    // Llamada

    public static void main (String [] args){
        Estudiantes estudiantes_desarrollo = new Estudiantes("Sebas",20);
        estudiantes_desarrollo.saludar();

        Estudiantes estudiantes_redes = new Estudiantes("Deisy",19);
        estudiantes_redes.saludar();

        Estudiantes estudiantes_electro=new Estudiantes("PEPITO", 25);
        estudiantes_electro.saludar();
    }

}