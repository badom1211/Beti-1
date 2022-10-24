package main.java.hr.java.vjezbe.glavna;

import hr.java.vjezbe.entitet.Predmet;
import hr.java.vjezbe.entitet.Profesor;
import hr.java.vjezbe.entitet.Student;
import hr.java.vjezbe.entitet.Ispit;
import java.math.BigDecimal;
import java.util.Scanner;

public class Glavna {
//Konstante
    private static final int broj_profesora = 2;
    private static final int broj_predmeta = 3;
    private static final int broj_studenta = 2;
    private static final int broj_ispitnih_rokova = 1;

    public static class Main {
        public static void main(String[] args) {
            Scanner unos= new Scanner(System.in);
/*
            Profesor[] profesor= new Profesor[broj_profesora];
            for(int i=0;i<broj_profesora;i++){
                System.out.println("Unesite " + (i+1) + ". profesora:");

                System.out.println("Unesite sirfu profesora: ");
                String sifra= unos.nextLine();

                System.out.println("Unesite ime profesora: ");
                String ime= unos.nextLine();

                System.out.println("Unesite prezime profesora: ");
                String prezime= unos.nextLine();

                System.out.println("Unesite titulu profesora: ");
                String titula= unos.nextLine();

                profesor[i]=new Profesor (sifra, ime, prezime, titula);
            }
//STUDENT
          for(int i=0;i<broj_studenta;i++){
           /*     System.out.println("Unesite " + (i+1) + ". ime:");

                System.out.println("Unesite sirfu profesora: "+i);
                String sifra= unos.nextLine();
*/
                System.out.println("Unesite ime profesora: ");
                String ime= unos.nextLine();

                System.out.println("Unesite prezime profesora: ");
                String prezime= unos.nextLine();

                System.out.println("Unesite titulu profesora: ");
                String titula= unos.nextLine();
            }
            Student[] student= new Student(ime,prezime,jmbag,datumRodjenja);
            //PREDMET
//ispit na koji su priavljeni studenti:


            System.out.println("Ispit na koji su prijavljeni studenti: ");
/*
            Predmet[] predmet= new Predmet[broj_predmeta];
            for(int i=0;i<broj_predmeta;i++){
                System.out.println("Unesite " + (i+1) + ". predmet:");

                System.out.println("Unesite sirfu predmeta: ");
                String sifra= unos.nextLine();

                System.out.println("Unesite naziv predmeta: ");
                String naziv= unos.nextLine();

                System.out.println("Unesite broj ECTS bodova za predmet '"+predmet[i].getNaziv()+"' :");
                Integer ects= unos.nextInt();
                unos.nextLine();

                System.out.println("Unesite titulu profesora: ");
                String titula= unos.nextLine();

                System.out.println("Odaberite profesora: ");
                for(int j=0;j<broj_profesora;j++){
                    System.out.println((j+1)+". "+profesor[j].getIme()+" "+profesor[j].getPrezime());
                }
                Integer odabir = 0;
                if(odabir<1 || odabir>broj_profesora){
                    odabir = unos.nextInt();
                }

                unos.nextLine();
                predmet[i]=new Predmet(sifra, naziv, ects, profesor[odabir],student[]);

            }

            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
            //LocalDate datumRodjenja = LocalDate.parse(datumRodjenjaString, formatter);
//PROFESOR
          /*  System.out.println("Odaberite profesora:");
            for(int i=0;i<broj_profesora;i++){
                System.out.println((i+1) + profesor[i].getIme()+" "+profesor[i].getPrezime());
            }
            //System.out.println("Odabir >> ");

            for(int i=0; i<broj_profesora;i++){

            }
*/
    //ISPIT


/*
    //PREDMET ODABIR
            System.out.println("Odaberite predmet: ");
            for(int i=0;i<broj_predmeta;i++){
                System.out.println((i+1) +". " +predmet[i].getNaziv());
            }
  */
//STUDENT
          for(int i=0;i<broj_studenta;i++){
           /*     System.out.println("Unesite " + (i+1) + ". ime:");

                System.out.println("Unesite sirfu profesora: "+i);
                String sifra= unos.nextLine();
*/
            System.out.println("Unesite ime studenta: ");
            String ime= unos.nextLine();

            System.out.println("Unesite prezime studenta: ");
            String prezime= unos.nextLine();

            System.out.println("Unesite jmbg studenta: ");
            String titula= unos.nextLine();

            System.out.println("Unesite datum rodjenja  studenta: ");
            String titula= unos.nextLine();
        }
        Student[] student= new Student(ime,prezime, jmbg, )
        }
    }
}
