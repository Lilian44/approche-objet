package fr.diginamic.maison;

public class Maison {
	private Piece[] rooms;

	public Maison() {
		super();
		this.rooms = new Piece[0];

	}

	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.getEtage() > -1 && piece.getSuperficie() > 0) {

			Piece[] newRoom = new Piece[rooms.length + 1];
			for (int i = 0; i <= rooms.length - 1; i++) {
				newRoom[i] = rooms[i];
			}
			rooms = newRoom;

			rooms[rooms.length - 1] = piece;
		}

	}

	public double getSuperficieTotale() {
		double superficieTotale = 0;
		for (int i = 0; i <= rooms.length - 1; i++) {
			superficieTotale += rooms[i].getSuperficie();
		}
		System.out.println("La superficie totale de la maison est de :" + superficieTotale);
		return superficieTotale;
	}

	public double superficieEtage(int etg) {
		double superficieEtage = 0;
		for (int i = 0; i <= rooms.length - 1; i++) {
			if (rooms[i].getEtage() == etg) {
				superficieEtage += rooms[i].getSuperficie();
			}
		}
		System.out.println("la superficie de l'�tage" + etg + " est de " + superficieEtage + "m�");
		return superficieEtage;

	}

	public double superfSpecificPiece(String typePiece) {
		double superfPiece = 0;
		for (int i = 0; i <= rooms.length - 1; i++) {
			if (rooms[i].afficherType() == typePiece) {
				superfPiece += rooms[i].getSuperficie();

			}
		}
		System.out.println("la superficie pour ce type de pi�ce est de :" + superfPiece);
		return superfPiece;
	}

	public double nbrTypePiece(String typePiece) {
		int nbrTypePiece = 0;
		for (int i = 0; i <= rooms.length - 1; i++) {
			if (rooms[i].afficherType() == typePiece) {
				nbrTypePiece++;

			}
		}

		System.out.println("il y a " + nbrTypePiece + " pi�ces de type " + typePiece);
		return nbrTypePiece;
	}

}
