package liste;

/**
 * Classe représentant un nœud dans une liste chaînée.
 */
public class Noeud {
    private Object element;
    private Noeud suivant;

    /**
     * Constructeur d'un nœud
     * @param e La valeur à stocker dans le nœud
     * @param suivant Le nœud suivant dans la liste
     */
    public Noeud(int e, Noeud suivant) {
        element = e;
        this.suivant = suivant;
    }

    /**
     * Récupère l'élément stocké dans le nœud
     * @return L'élément stocké
     */
    public Object getElement() {
        return element;
    }

    /**
     * Modifie l'élément stocké dans le nœud
     * @param element Le nouvel élément à stocker
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * Récupère le nœud suivant dans la liste
     * @return Le nœud suivant
     */
    public Noeud getSuivant() {
        return suivant;
    }

    /**
     * Modifie le nœud suivant dans la liste
     * @param suivant Le nouveau nœud suivant
     */
    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    /**
     * Renvoie une représentation textuelle du nœud
     * @return Une chaîne de caractères représentant le nœud
     */
    public String toString() {
        return "Noeud(" + element + ")";
    }
}
