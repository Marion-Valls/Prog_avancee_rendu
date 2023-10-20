package examenFA2223ETU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class PileLIFOArray implements PileLIFO {

	private ArrayList<Carte> array = new ArrayList<>();
	
	@Override
	public void empiler(Object elem) {
		if(elem != null) {
			array.add((Carte)elem);
		}
	}

	@Override
	public Object depiler() throws AucunElementException {
		if(array.size()<=0) {
			throw new AucunElementException("Array vide");
		}
		Carte last = array.get(array.size()-1);
		array.remove(array.size()-1);
		return last;
	}

	@Override
	public Object sommet() {
		if(array.size()<=0) {
			return null;
		}
		return array.get(array.size()-1);
	}

	@Override
	public boolean estVide() {
		return array.size()==0;
	}

	@Override
	public List asList() {
		return Arrays.asList(array);
	}

	@Override
	public void vider() {
		array.clear();
		
	}

	@Override
	public String toString() {
		return ""+array;
	}
	


}
