public class Objetos_n1 {

    public String material;
    public   double tamanhoAlturaemCM;
    private  boolean aberto;
    private  boolean trancada;
    public   double tamaLarguraemCM;

   public void abrirJanela() {
        if (this.aberto) {
            System.out.println("A porta já está aberta");

        } else if (this.trancada) {
            System.out.println("A janela está trancada e não será aberta!");
        }
        else {
            this.aberto = true;
            System.out.println("A janela foi aberta!");
        } }

   public void fecharJanela() {
        if (!this.aberto) {
            System.out.println("A janela já está fechada");
        } else {
            this.aberto = false;
            System.out.println("A janela foi fechada");
        }
    }

   private void trancarJanela() {
        if (this.trancada) {
            System.out.println("A janela ja esta trancada");
        } else if(this.aberto){
            System.out.println("Feche a janela primeiro, para depois tranca-la");
        } else {
            this.trancada = true;
            System.out.println("A porta agora está trancada!");
        }
    }

   private void destrancarJanela() {
        if (!this.trancada) {
            System.out.println("A janela já está destrancada");
        } else {
            this.trancada = true;
            System.out.println("A janela está trancada");
        }
    }

}