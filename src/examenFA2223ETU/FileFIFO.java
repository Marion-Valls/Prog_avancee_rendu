package examenFA2223ETU;

import java.util.Collection;

/**
 * @author prost
 *
 *         Structure de file d'attente, aussi appelee "First In, First Out"
 *         (premier arrive, premier servi). Permet d'ajouter en queue (i.e. a la
 *         fin), et retirer en tete (i.e. au debut).
 * @param <E>
 */
public interface FileFIFO<E> {
    /**
     * @param elem
     * 
     *             Ajoute un element a la fin de la file.
     */
    public void ajouter(E elem);

    /**
     * Ajoute à la fin de la file tous les elements de la collection donnee en
     * parametre.
     * 
     * @param elements
     */
    public void ajouterTous(Collection<E> elements);

    /**
     * 
     * Supprime et retourne l'element au debut de la file.
     * 
     * Leve une exception <code>AucunElementException</code> si la file est vide.
     * 
     * @return
     * @throws AucunElementException
     */
    public E retirer() throws AucunElementException;

    /**
     * Retourne, mais ne supprime pas, l'element au debut de la file. Retourne
     * <code>null</code> si la file est vide.
     * 
     * @return
     */
    public E voirTete();

    /**
     * Retourn <code>true</code> si et seulement si la file ne contient aucun
     * element.
     * 
     * @return
     */
    public boolean estVide();

    /**
     * Modifie l'ordre des elements dans la liste de facon aleatoire.
     */
    public void melanger();

    /**
     * Vide la structure de tous ces elements.
     */
    public void vider();
}
