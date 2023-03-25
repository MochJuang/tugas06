import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

       String name;
        String birthPlace;
                String birthDate;
        String phoneNumber;
                String city;
       Scanner input = new Scanner(System.in);
       boolean isNext = true;
       String next;
       ArrayList<Siswa> listSiswa = new ArrayList<>();
       ArrayList<String> availableCity = new ArrayList<>();
       availableCity.add("Bandung");
       availableCity.add("Sukabumi");
       availableCity.add("Bogor");

        System.out.println("----------------");
        System.out.println("Registrasi Siswa");
        System.out.println("----------------");
        System.out.println();
        int totalUpTo17 = 0;
        int totalUnder17 = 0;
        int totalFromSMI = 0;
        int totalFromBGR = 0;
        int totalFromBDG = 0;

        do {

           System.out.print("Nama : ");
           name = input.nextLine();
           System.out.print("Tempat Lahir : ");
           birthPlace = input.nextLine();
           System.out.print("Tanggal Lahir : ");
           birthDate = input.nextLine();
           System.out.print("Nomor Hp : ");
           phoneNumber = input.nextLine();

           boolean inputCity;
           do {
               System.out.print("Kota (Sukabumi, Bandung, Bogor) : ");
               city = input.nextLine();
               if (!availableCity.contains(city)) {
                   inputCity = true;
                    System.out.println("Kota tidak tersedia, silahkan input ulang !");
               }else {
                   inputCity = false;
               }
           } while (inputCity);

           Siswa siswa = new Siswa(
                   name,
                   birthPlace,
                   birthDate,
                   phoneNumber,
                   city
           );

           listSiswa.add(siswa);



           if ( siswa.getAge() >= 17 ) {
               totalUpTo17 += 1;
           }else {
               totalUnder17 += 1;
           }

           if (siswa.city.equals("Sukabumi")) {
               totalFromSMI += 1;
           }
            if (siswa.city.equals("Bogor")) {
                totalFromBGR += 1;
            }
            if (siswa.city.equals("Bandung")) {
                totalFromBDG += 1;
            }

            System.out.print("Apakah menambah lagi siswa ? [Y/n] : ");
            next = input.nextLine();

            if (next.equals("n")) {
                break;
            }


            System.out.println();
            System.out.println();

       } while (isNext);


        System.out.println("Total siswa berumur diatas 17 tahun : " + totalUpTo17);
        System.out.println("Total siswa berumur dibawah 17 tahun : " + totalUnder17);
        System.out.println("Total siswa berasal dari sukabumi : " + totalFromSMI);
        System.out.println("Total siswa berasal dari bandung : " + totalFromBDG);
        System.out.println("Total siswa berasal dari bogor : " + totalFromBGR);

    }

}
