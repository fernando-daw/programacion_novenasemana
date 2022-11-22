public class perro {
   private  String pelo, color;
   private  int chip;
   private int peso,altura;

   public  int getChip() {
      return chip;
   }

   public  String getcolor() {
      return color;
   }

   public  String getPelo() {
      return pelo;
   }

   public int getAltura() {
      return altura;
   }

   public int getPeso() {
      return peso;
   }

   public void  setChip(int Chip){
      this.chip= chip;
   }
   public void  setPelo(String Pelo){
      this.pelo= pelo;
   }
   public void  setColor(String Color){
      this.color= color;
   }

   public void setAltura(int altura) {
      this.altura = altura;
   }

   public void setPeso(int peso) {
      this.peso = peso;
   }
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

