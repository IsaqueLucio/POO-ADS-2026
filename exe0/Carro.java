package exe0;

class Carro{ //Classe

  private final String marca; //Atributos
  private final String modelo;
  private final String cor;
  private final String placa;
  private final double potencia;
  private final int ano;
  private  boolean motor;
  private  double velocidade;

  public Carro(String marca, String modelo, String cor,String placa, double potencia, int ano){ //Metodo construtor
    this.marca=marca;
    this.modelo=modelo;
    this.cor=cor;
    this.placa=placa;
    this.potencia=potencia;
    this.ano=ano;
    this.motor=false;
    this.velocidade=0;
  }

 @Override
 public String toString() { //Metodo para exibir o objeto 
    return "Carro \n Marca: " + marca + "\n Modelo: " + modelo + "\n Cor: " + 
    cor + "\n Placa: " + placa + "\n Potencia: " + potencia +" CV \n Ano: " + ano+"\n";
 }

 public void ligar(){ //metodo para ligar o carro
  if(!this.motor){
    this.motor=true;
    System.out.println("O carro foi ligado!");
  }
 }
 public void desligar(){ //metodo para desligar o carro
    if(this.motor){
      this.motor=false;
      this.velocidade = 0;
      System.out.println("O carro foi desligado!");
    }
  }

  public void acelerar(double vel){ //metodo para acelerar o carro
    if(!this.motor){
      this.velocidade = this.velocidade+=vel;
      System.out.println("Carro ligado e acelerando a "+vel+" Km/h.");
    }
    else{
      System.out.println("Não foi possivel acelerar o carro.");
    }
  }

  public void frear(double freio){ //metodo para acelerar o carro
    if (this.motor){
      this.velocidade = this.velocidade-=freio;
      if (!this.motor && this.velocidade - freio >= 0){
            this.velocidade = this.velocidade-=freio;
            System.out.println("carro freado, valor atual " + this.velocidade);
        }
    }
  }
}