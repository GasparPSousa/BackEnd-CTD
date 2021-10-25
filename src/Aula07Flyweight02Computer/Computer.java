package Aula07Flyweight02Computer;

public class Computer {

    private int ram;
    private int hd;
    private static int contador;

    public Computer(int ram, int hd) {
        super();
        this.ram = ram;
        this.hd = hd;
        contador++;
        System.out.println("contador: " + contador);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Computer.contador = contador;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", hd=" + hd +
                '}';
    }
}
