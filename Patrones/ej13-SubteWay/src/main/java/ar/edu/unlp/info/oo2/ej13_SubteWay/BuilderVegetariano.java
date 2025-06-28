package ar.edu.unlp.info.oo2.ej13_SubteWay;

public class BuilderVegetariano extends SandwichBuilder {


    @Override
    public void prepararPan() {
        this.getSandwich().setPan("Pan con semillas");
        this.getSandwich().setPrecioPan(120);
    }

    @Override
    public void prepararAderezo() {
        this.getSandwich().setAderezo("Sin aderezo");
        this.getSandwich().setPrecioAderezo(0);
    }

    @Override
    public void prepararPrincipal() {
        this.getSandwich().setPrincipal("Provoleta grillada");
        this.getSandwich().setPrecioPrincipal(200);
    }

    @Override
    public void prepararAdicional() {
        this.getSandwich().setAdicional("Berenjenas al escabeche");
        this.getSandwich().setPrecioAdicional(100);
    }
}
