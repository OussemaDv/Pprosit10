import java.util.Scanner;
public class departement implements Comparable<departement>{
    int id;
    String nomDep;
    int nbEmp;

    public departement(int id, String nomDep, int nbEmp) {
        this.id = id;
        this.nomDep = nomDep;
        this.nbEmp = nbEmp;
    }
    public departement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("id: ");
        this.id=scanner.nextInt();
        System.out.println("nom departement: ");
        this.nomDep=scanner.nextLine();
        System.out.println("nombre des employes: ");
        this.nbEmp=scanner.nextInt();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getNbEmp() {
        return nbEmp;
    }

    public void setNbEmp(int nbEmp) {
        this.nbEmp = nbEmp;
    }

    @Override
    public String toString() {
        return "departement{" +
                "id=" + id +
                ", nomDep='" + nomDep + '\'' +
                ", nbEmp=" + nbEmp +
                '}';
    }

    @Override
    public int compareTo(departement o) {
        return this.id - o.id;
    }
}
