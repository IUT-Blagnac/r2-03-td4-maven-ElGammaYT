public class Main {
    /**
     * Fonction Main
     * @param argv
     * @throws Exception
     */
    public static void main(String argv[]) {
        Pile maPile = new Pile(10);
        if (!maPile.est_vide()) System.out.println("NOK1");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK2");
        
        try {
        	int element = maPile.depiler();
            if (!maPile.est_vide()) System.out.println("NOK3");
            if (element != 5) System.out.println("NOK4");
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }

        System.out.println("Executé.");   
    }
}