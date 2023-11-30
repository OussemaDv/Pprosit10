import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<departement>{
    Set depSet=new HashSet();

    public void ajouterDepartement(departement d){
        depSet.add(d);
    }
    public boolean rechercherDepartement(String nom){
        Iterator<departement> iterator= depSet.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getNomDep().equals(nom))
                return true;
        }
        return false;
    }
    public boolean rechercherDepartement(departement d){
        Iterator<departement> iterator= depSet.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(d))
                return true;
        }
        return false;
    }
    public void supprimerDepartement(departement d){
        if(rechercherDepartement(d))
            depSet.remove(d);
    }
    public void displayDepartement(){
        Iterator<departement> iterator= depSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
    public TreeSet<departement> trierDepartementById(){
        return  new TreeSet<departement>(depSet);
    }
}
