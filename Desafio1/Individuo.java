
public class Individuo {
    protected int moeda;
    protected int sobrevivencia = 1;
    protected double azar = 0.1;
    

    Individuo(){}

    public int getMoeda() {
        return moeda;
    }
    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }
    public int getSobrevivencia() {
        return sobrevivencia;
    }
    public void setSobrevivencia(int sobrevivencia) {
        this.sobrevivencia = sobrevivencia;
    }
    public double getAzar() {
        return azar;
    }
    public void setAzar(double azar) {
        this.azar = azar;
    }
    
    protected boolean GameOver(){
        if(moeda == 0){
            return true;
        }
        return false;
    }

    protected int custoSobrevivencia(){
        if(this.moeda <= 0){
            GameOver();
        }
        this.moeda -= 1;
        return 0;
    }

}
