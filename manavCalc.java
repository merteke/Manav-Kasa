/*
 Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

 */




import java.util.*;


public class manavCalc {
    public static void main(String[] args) {

        double armut=2.14, armutkg;
        double elma=3.67, elmakg;
        double domates=1.11, domateskg;
        double muz=0.95, muzkg;
        double patlican=5, patlicankg;

        double tutar;


        Scanner input=new Scanner(System.in);



        System.out.println("Armut kac kg?");
        armutkg=input.nextDouble();
        
        System.out.println("Elma kac kg?");
        elmakg=input.nextDouble();

        System.out.println("Domates kac kg?");
        domateskg=input.nextDouble();

        System.out.println("Muz kac kg?");
        muzkg=input.nextDouble();

        System.out.println("Patlican kac kg?");
        patlicankg=input.nextDouble();


        tutar = (patlican*patlicankg) + (armut*armutkg) + (elma*elmakg) + (domates*domateskg) + (muz*muzkg);


        System.out.println("Odenecek tutar="+tutar+"TL");

        
    }

}
