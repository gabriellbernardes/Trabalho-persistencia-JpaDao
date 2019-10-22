import jpa.JPAUtil;

public class Companhia {

    public static void main(String[] args) {
        JPAUtil.getEntityManager();
        JPAUtil.closeEntityManager();
    }

}
