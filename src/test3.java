import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
            String username="patikadev", pass, npass, upass="java101";
            int slc;
            Scanner input = new Scanner(System.in);

            System.out.print("Kullanici adini giriniz: ");
            username = input.nextLine();

            System.out.print("parola giriniz: ");
            pass = input.nextLine();

            if (username.equals(username)){
                if (pass.equals(upass)){
                    System.out.println("Giris basarili.");
                } else {
                    System.out.println("Hatali parola");
                    System.out.println("Parolanizi sifirlamak icin:1 - cikmak icin:2");
                    System.out.print("islem seciniz: ");

                    slc = input.nextInt();
                    switch (slc){
                        case 1:
                            System.out.print("Yeni parola olustur: ");
                            Scanner input2 = new Scanner(System.in);
                            npass = input2.nextLine();
                            if (npass.equals(pass) || npass.equals(upass)){
                                System.out.println("Yeni parola eski yada hatali girilen parola olamaz!");
                            }else{
                                System.out.println("Sifirlama islemi basarili!");
                            }

                            break;
                        case 2:
                            System.out.println("cikis.");
                            break;
                        default:
                            System.out.println("yanlıs girdi!");
                                }
                         }
                }else {
                        System.out.println("Gecerli verileri giriniz.");
                        }

    }
 }


