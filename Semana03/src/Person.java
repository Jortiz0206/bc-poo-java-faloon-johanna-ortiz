public abstract class Person { // Usamos 'abstract' si nunca instanciamos una "Persona" genérica
    protected int id; // 'protected' permite que las clases hijas accedan directamente
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Método que será heredado por todas las clases hijas
    public String getInfo() {
        return "ID: " + this.id + ", Nombre: " + this.name;
    }

    // Getters esenciales
    public int getId() { return id; }
    public String getName() { return name; }
}
