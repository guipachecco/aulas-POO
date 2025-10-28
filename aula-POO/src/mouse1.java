public class mouse1 {

    private String material;
    private double peso;
    private int dpi;

    public mouse1(String material, double peso, int dpi){
        this.material = "plástico";
        this.peso = 24.3;
        this.dpi = 800;
    }
    public String getMaterial(){
        return material;
    }

    public double getPeso(){
        return peso;
    }

    public int getDpi(){
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = 800;
    }

    public void setPeso(double peso) {
        this.peso = 65;
    }

    public void setMaterial(String material) {
        this.material = "plástico";
    }
}
