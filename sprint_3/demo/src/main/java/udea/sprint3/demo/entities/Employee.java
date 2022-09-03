package udea.sprint3.demo.entities;

public class Employee {

    private String name;
    private String email;
    private TypeRol typeRol;
    private String nameEnterprise;
    private Enterprise enterprise;

    public Employee() {

    }

    public Employee(String name, String email, TypeRol typeRol, String nameEnterprise, Enterprise enterprise) {
        this.name = name;
        this.email = email;
        this.typeRol = typeRol;
        this.nameEnterprise = nameEnterprise;
        this.enterprise = enterprise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeRol getTypeRol() {
        return typeRol;
    }

    public void setTypeRol(TypeRol typeRol) {
        this.typeRol = typeRol;
    }

    public String getNameEnterprise() {
        return nameEnterprise;
    }

    public void setNameEnterprise(String nameEnterprise) {
        this.nameEnterprise = nameEnterprise;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", typeRol=" + typeRol +
                ", nameEnterprise='" + nameEnterprise + '\'' +
                ", enterprise=" + enterprise +
                '}';
    }
}
