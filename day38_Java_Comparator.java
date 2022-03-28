,import java.util.*;

// Tulis kelas Checker anda di sini

Pemeriksa kelas melaksanakan Comparator<Player>{

    @Override

    public int compare(Pemain a, Pemain b){

        jika(a.skor == b.skor){

            kembalikan a.name.compareTo(b.name);

        }lain{

            pulangan b.skor - a.skor;

        }

    }

}

Pemain kelas{

    Nama rentetan;

    skor int;

    

    Pemain(Nama rentetan, skor int){

        ini.nama = nama;

        ini.skor = skor;

    }

}

Penyelesaian kelas {

    public static void main(String[] args) {

        Imbasan pengimbas = Pengimbas baharu(System.in);

        int n = scan.nextInt();

        Pemain[] pemain = Pemain baharu[n];

        Pemeriksa pemeriksa = Pemeriksa baharu();

        

        untuk(int i = 0; i <n; i++){

            pemain[i] = Pemain baharu(scan.next(), scan.nextInt());

        }

        scan.close();

     

        Arrays.sort(pemain, penyemak);

        for(int i = 0; i <player.length; i++){

            System.out.printf("%s %s\n", player[i].name, player[i].score);

        }

    }

}
