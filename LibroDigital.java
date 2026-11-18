package herencia;

public class LibroDigital extends Libro {
    String formato;
    double tamanioMN;
    public LibroDigital(String titulo,String autor,int anio,String formato,double tamanioMB){
        super (titulo,autor,anio);
        this.formato=formato;
        this.tamanioMN=tamanioMB;
    }
    public void mostrarInf(){
        System.out.println("titulo: "+titulo+" autor: "+autor+" año: "+anio+" formato: "+formato+" tamaño MB: "+tamanioMN);
    }
}