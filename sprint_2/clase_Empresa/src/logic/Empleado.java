package logic;

public class Empleado {

    private String nombre;
    private String correo;
    private TypeRol typeRol ;
    private String nombreEmpresa;
    private Empresa empresa;

    public Empleado(String nombre, String correo, TypeRol typeRol,String nombreEmpresa, Empresa empresa) {
        this.nombre = nombre;
        this.correo = correo;
        this.typeRol = typeRol;
        this.nombreEmpresa=nombreEmpresa;
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public TypeRol getTypeRol() {
        return typeRol;
    }
    public void setTypeRol(TypeRol typeRol) {
        this.typeRol = typeRol;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", Correo='" + correo + '\'' +
                ", Tipo de rol=" + typeRol +
                ", Nombre empresa=" + nombreEmpresa +
                ", Empresa=" + empresa +
                '}';
    }
}
