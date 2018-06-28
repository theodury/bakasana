package fr.etudiantsdefrance.bakasana.tools;

public class Tools {

	public static String concatId(String p_id) {
		return p_id.substring(0, p_id.length()-2) + '/' + p_id.substring(p_id.length()-2, p_id.length());
	}

}
