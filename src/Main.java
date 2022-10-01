import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ay;
        int gun;
        System.out.print("Doğduğunuz ayı türkçe ve küçük harflerle giriniz: ");
        ay = input.nextLine();
        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();

        if(ay.equals("ocak")){
            if(gun<=21 && gun>=1){
                System.out.println("oğlak");
            }else if (gun>21 && gun <=31){
                System.out.println("kova");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("şubat")) {
            if(gun<=19 && gun>=1){
                System.out.println("kova");
            }else if (gun>19 && gun<=29){
                System.out.println("balık");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("mart")){
            if(gun<=20 && gun>=1){
                System.out.println("balık");
            }else if (gun>20 && gun <=31){
                System.out.println("koç");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("nisan")){
            if(gun<=20 && gun>=1){
                System.out.println("koç");
            }else if (gun>20 && gun <=30){
                System.out.println("boğa");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("mayıs")){
            if(gun<=21 && gun>=1){
                System.out.println("boğa");
            }else if (gun>21 && gun <=31){
                System.out.println("ikizler");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("haziran")){
            if(gun<=22 && gun>=1){
                System.out.println("ikizler");
            }else if (gun>22 && gun <=30){
                System.out.println("yengeç");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("temmuz")){
            if(gun<=22 && gun>=1){
                System.out.println("yengeç");
            }else if (gun>22 && gun <=31){
                System.out.println("aslan");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("ağustos")){
            if(gun<=22 && gun>=1){
                System.out.println("aslan");
            }else if (gun>22 && gun <=31){
                System.out.println("başak");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("eylül")){
            if(gun<=22 && gun>=1){
                System.out.println("başak");
            }else if (gun>22 && gun <=30){
                System.out.println("terazi");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("ekim")){
            if(gun<=22 && gun>=1){
                System.out.println("terazi");
            }else if (gun>22 && gun <=31){
                System.out.println("akrep");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("kasım")){
            if(gun<=21 && gun>=1){
                System.out.println("akrep");
            }else if (gun>21 && gun <=30){
                System.out.println("yay");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else if(ay.equals("aralık")){
            if(gun<=21 && gun>=1){
                System.out.println("yay");
            }else if (gun>21 && gun <=31){
                System.out.println("oğlak");
            }else{
                System.out.println("geçersiz bir gün girdiniz");
            }
        }else{
            System.out.println("geçersiz bir ay girdiniz. bütün harflerin küçük olduğuna emin olun.");
        }
    }
}