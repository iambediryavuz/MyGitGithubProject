public class AtmProject {
    public static void main(String[] args) {
        /*
        main metod icinde mesajimizi yazdiktan sonra en alt kisimda Terminal'i secince classimiz alt kisminda
terminal acildi.

Terminalde son sirada nerede oldugumuz sirali olarak yazili. Biz MyGitGitHubProject icindeyiz.

Ilk yapmamiz gereken komut git init'dir. git init komutu kullanarak repository'i baslatiriz.
git status ile durumumuzu gormek istedik. Bazi degisiklikler yapmisiz, kirmizi renkle .idea/
projemizin ismi, pom.xml, src/ nin yazili oldugunu gorduk. Degisikliklerin Stage'e almak,
takip edebilmek icin git add .
Daha sonra clasimiz icinde sout'un alt satirina \\version1 yazarak bir degisiklik yaptik ve yeni degisikligi git add . yazarak Staging area;ya aldik.
devaminda git commit -m"v1" yazinca v1'de kac file degisti, kac ekleme yapildi gorduk.
Clasimiz icine yeni ozellikler ekledik. Yeni degisikligi stage'a almadan dogrudan commit olusturmayi
yapmak icin git commit -am"v2" yazdik
sout icine yine mesaj yazdiktan sonra version3 olarak bunu adlandirdik. Ayni sekilde git commit -am"v3" yazdik.
Boylece updated 1 path from ...seklinde yazildigini gorduk. Versiyon5 ve 6'yi iptal edip versiyon 4'de
kalmak istersek git commit -m"yeni_v4" yazinca Head->master yeni_v4 oldu. Su sekilde goruldu:
65ce4fe (HEAD -> master) yeni_v4
versiyon 6'ya geri donmek istersek git checkout yanina versiyon 6'nin  hashcodunu bir bosluk sonrasi
nokta koyarak versiyon 6'ya tekrar gidiyoruz ve bu defa son versiyonumuz olan v6 Head->master oluyor.
         */
        System.out.println("Bu bir ATM projesidir");
        //version1
        System.out.println("Java is easy");
        //version2
        System.out.println("Learn Java Earn Money");
        //version3
        System.out.println("Git ogrenmek cok kolay");
        //version4

        //version5
        System.out.println("Java ogrenmek ne kadarda zevkliymis!!");
        //version6

        System.out.println("bedir branch'i kodlarini yazdi");
        //version bdr1
        System.out.println("bir kisim kodlar");
        //bdr2





    }//main


}//class