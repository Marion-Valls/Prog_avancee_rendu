package examenFA2223ETU;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class FileFIFOListe implements FileFIFO {
	
	private List<Carte> list = new ArrayList<>();
	@Override
	public void ajouter(Object elem) {
		if(elem != null) {
			list.add((Carte) elem);
		}
	}

	@Override
	public void ajouterTous(Collection elements) {
		list.addAll((Collection<Carte>)elements);
	}

	@Override
	public Object retirer() throws AucunElementException {
		if(list.size()<=0) {
			throw new AucunElementException("Liste vide");
		}
		Carte first = list.get(0);
		list.remove(0);
		return first;
	}

	@Override
	public Object voirTete() {
		if(list.size()<=0) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public boolean estVide() {
		return list.size()==0;
	}

	@Override
	public void melanger() {
		Collections.shuffle(list);
	}

	@Override
	public void vider() {
		list.clear();
	}

	@Override
	public String toString() {
		return ""+list;
	}
}
