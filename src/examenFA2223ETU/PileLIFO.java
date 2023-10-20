package examenFA2223ETU;

import java.util.List;

public interface PileLIFO<E> {
    /**
     * @param elem
     * 
     *             Empile un élément dans la pile.
     */
    public void empiler(E elem);

    /**
     * Dépile un élément de la liste. Autrement dit, supprime et retourne l'élément
     * au sommet de cette pile, c'est-à-dire le dernier élément empilé.
     * 
     * Lève l'exception <code>AucunElementException</code> si la pile est vide.
     * 
     * @return
     * @throws AucunElementException
     */
    public E depiler() throws AucunElementException;

    /**
     * Lit et retourne, mais ne supprime pas, l'élément au sommet de la pile, ou
     * retourne <code>null</code> si la pile est vide.
     * 
     * @return
     */
    public E sommet();

    /**
     * Return <code>true</code> si et seulement si la pile est vide.
     * 
     * @return
     */
    public boolean estVide();

    /**
     * Retourne le contenu de la pile dans un objet de type <code>List</code>.
     * 
     * @return
     */
    public List<E> asList();

    /**
     * Vide la pile de tous les elements qu'elle contient.
     */
    public void vider();
}
