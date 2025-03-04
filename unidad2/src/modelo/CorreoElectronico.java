package modelo;

public class CorreoElectronico {
    private String usuario;
    private String proveedor;
    
    public CorreoElectronico(String direccion) {
        super();
        String[] partes = direccion.split("@");
        this.usuario = partes[0];
        this.proveedor = partes[1];
    }

    @Override
    public String toString() {
        return "Correo electrónico -> [usuario= " + usuario + ", proveedor= " + proveedor + "]";
    }

    public static boolean esCorreoValido(String direccion) {
        return direccion.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}