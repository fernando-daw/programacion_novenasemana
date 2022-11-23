
public class Perro {
   /**
    * Atributos
    * @param pelo,color
    * @param chip,peso,altura.
    */
   private  String pelo, color;
   private  int chip;
   private int peso,altura;
   /**
    * Getter.
    * @return chip
    */
   public  int getChip() {
      return chip;
   }
   /**
    * Getter.
    * @return color
    */
   public  String getcolor() {
      return color;
   }
   /**
    * Getter.
    * @return pelo
    */
   public  String getPelo() {
      return pelo;
   }
   /**
    * Getter.
    * @return altura
    */
   public int getAltura() {
      return altura;
   }
   /**
    * Getter.
    * @return peso
    */
   public int getPeso() {
      return peso;
   }
   /**
    * Setter.
    * @param Chip a definir
    */
   public void  setChip(int Chip){
      this.chip= chip;
   }
   /**
    * Setter.
    * @param Pelo a definir
    */
   public void  setPelo(String Pelo){
      this.pelo= pelo;
   }
   /**
    * Setter.
    * @param Color a definir
    */
   public void  setColor(String Color){
      this.color= color;
   }
   /**
    * Setter.
    * @param altura a definir
    */

   public void setAltura(int altura) {
      this.altura = altura;
   }
   /**
    * Setter.
    * @param peso a definir
    */
   public void setPeso(int peso) {
      this.peso = peso;
   }
   /**
    * Metodo para establecer el ladrido dependiendo del perro. (peso y altura)
    * @param peso,altura.
    * @return ladrido.
    */
   public static String ladrar (int peso, int altura) {
      String ladrido="";
      if (peso > 10 && altura > 10) {
         System.out.println("GUAU GUAU");
      } else {
         System.out.println("guau guau");
      }
      return ladrido;
   }

}

