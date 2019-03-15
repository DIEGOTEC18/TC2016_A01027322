public class Main {

    public static void main(String[] args) {

        GerentePolanco gerentePolanco = GerentePolanco.getInstance();
        GerenteSantaFe gerenteSantaFe = GerenteSantaFe.getInstance();

        Chef chefPolanco = new Chef("Manuel Polanco");
        Chef chefSantaFe = new Chef("Javier SantaFe");

        Ayudante ayudantePolanco = new Ayudante("Isaac Polanco");
        Ayudante ayudanteSantaFe = new Ayudante("Andrea SantaFe");

        Cajero cajeroPolanco = new Cajero("Esteban Polanco");
        Cajero cajeroSantafe = new Cajero("Alfredo SantaFe");

        Repartidor repartidorPolanco = new Repartidor("Mariana Polanco");
        Repartidor repartidorSantaFe = new Repartidor("Samuel SantaFe");

        sucursalPolanco SBizarroPolanco = new sucursalPolanco(gerentePolanco, chefPolanco, ayudantePolanco, cajeroPolanco, repartidorPolanco);
        sucursalSantaFe SbizarroSantaFe = new sucursalSantaFe(gerenteSantaFe, chefSantaFe, ayudanteSantaFe, cajeroSantafe, repartidorSantaFe);

        SbizarroSantaFe.ordenarPizza("Mexicana");
        SbizarroSantaFe.crearPizza();

        SbizarroSantaFe.contarGanancias();

        SBizarroPolanco.ordenarPizza("Vegetariana");
        SBizarroPolanco.crearPizza();

        SbizarroSantaFe.ordenarPizza("TuCreacion");
        SbizarroSantaFe.crearPizza();

        SbizarroSantaFe.contarGanancias();

    }
}
