public class Pile {
	private int[] listePile;
	private int sommetPile;

    /**
     * Constructeur de la classe Pile
     * 
     * @param i la taille de la pile
     */
	public Pile(int i) {
		listePile = new int[i];
		sommetPile = -1;
	}

    /**
     * Vérifie si la pile est vide
     * @return true si la pile est vide, false sinon
     */
	public boolean est_vide() {
		return sommetPile == -1;
	}

    /**
     * Empile un entier dans la pile
     * @param i l'entier à empiler
     */
	public void empiler(int i) {
		sommetPile++;
		listePile[sommetPile] = i;
	}

    /**
     * Dépile un entier de la pile
     * @return l'entier dépiler
     * @throws Exception si la pile est vide
     */
	public int depiler() throws Exception {
		if (!this.est_vide()) {
			sommetPile--;
			return listePile[sommetPile + 1];
		} else {
			throw new Exception("La pile est vide.");
		}
		
	}
}