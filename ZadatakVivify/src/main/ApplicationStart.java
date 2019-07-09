package main;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import classes.Poslodavac;
import classes.Radnik;
import classes.singleton.DoktorSingleton;
import classes.singleton.ProgramerSingleton;
import classes.singleton.SezonskiRadnikSingleton;

public class ApplicationStart {

	public static void main(String[] args) {
		
		
		/*
		 	Klase Nezaposlen i NezaposlenSingleton sam napravio pre nego sto sam video da radnik moze da bude nezaposlen i ima odgovarajucu struku.
		  	Struku student sam slucajno zamenio sa "sezonski radnik", i tek pri kraju uvideo gresku.
		*/
		
		
		
		//Instanciranje singleton klasa, koje ce nam vracati struke, pomocu kojih cemo isplacivati radnike
		DoktorSingleton doktorSingleton = new DoktorSingleton();
		ProgramerSingleton programerSingleton = new ProgramerSingleton();
		SezonskiRadnikSingleton sezonskiRadnikSingleton = new SezonskiRadnikSingleton();
		
		
		//kreiranje 4 poslodavca
		
		Poslodavac p1 = new Poslodavac("Programerska firma 1", programerSingleton.getProgramer(), "12", "Vojvodjanskih brigada", "Novi Sad");
		Poslodavac p2 = new Poslodavac("Programerska firma 2", programerSingleton.getProgramer(), "33", "Bulevar Oslobodjenja", "Novi Sad");
		Poslodavac p3 = new Poslodavac("Bolnica", doktorSingleton.getDoktor(), "144", "Futoski put", "Novi Sad");
		Poslodavac p4 = new Poslodavac("Strand", sezonskiRadnikSingleton.getSezonskiRadnik(), "1", "Limanska", "Novi Sad");
		
		String[] imena = {"Dragan", "Jovan", "Milica", "Petar", "Djordje", "Milos", "Jelena", "Marija", "Jasmina"};
		String[] prezimena = {"Jovanovic", "Peric", "Kondic", "Savic", "Milic", "Kovacevic", "Jelena", "Marija", "Jasmina"};
		
		Radnik r1 = new Radnik("Dragan", "Jovanovic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r2 = new Radnik("Milica", "Peric", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r3 = new Radnik("Jovan", "Kondic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r4 = new Radnik("Petar", "Milic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r5 = new Radnik("Milos", "Milic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r6 = new Radnik("Dragan", "Jovanovic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r7 = new Radnik("Milica", "Peric", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r8 = new Radnik("Djordje", "Kondic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r9 = new Radnik("Dragan", "Savic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r10 = new Radnik("Jelena", "Jovanovic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r11 = new Radnik("Djordje", "Peric", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r12 = new Radnik("Jovan", "Kondic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r13 = new Radnik("Jelena", "Savic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r14 = new Radnik("Dragan", "Jovanovic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r15 = new Radnik("Djordje", "Kovacevic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r16 = new Radnik("Milica", "Peric", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r17 = new Radnik("Djordje", "Milic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r18 = new Radnik("Jovan", "Kondic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r19 = new Radnik("Marija", "Jovanovic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r20 = new Radnik("Dragan", "Kovacevic", programerSingleton.getProgramer(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r21 = new Radnik("Milos", "Peric", doktorSingleton.getDoktor(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r22 = new Radnik("Petar", "Jovanovic", doktorSingleton.getDoktor(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r23 = new Radnik("Milica", "Kovacevic", doktorSingleton.getDoktor(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r24 = new Radnik("Marija", "Kondic", doktorSingleton.getDoktor(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r25 = new Radnik("Djordje", "Jovanovic", doktorSingleton.getDoktor(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r26 = new Radnik("Jovan", "Kovacevic", doktorSingleton.getDoktor(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r27 = new Radnik("Milos", "Peric", doktorSingleton.getDoktor(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r28 = new Radnik("Marija", "Kovacevic", doktorSingleton.getDoktor(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r29 = new Radnik("Milica", "Kondic", doktorSingleton.getDoktor(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r30 = new Radnik("Jasmina", "Jovanovic", doktorSingleton.getDoktor(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r31 = new Radnik("Milos", "Kovacevic", sezonskiRadnikSingleton.getSezonskiRadnik(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r32 = new Radnik("Jovan", "Peric", sezonskiRadnikSingleton.getSezonskiRadnik(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r33 = new Radnik("Jasmina", "Kovacevic", sezonskiRadnikSingleton.getSezonskiRadnik(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r34 = new Radnik("Milos", "Jovanovic", sezonskiRadnikSingleton.getSezonskiRadnik(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r35 = new Radnik("Jasmina", "Kovacevic", sezonskiRadnikSingleton.getSezonskiRadnik(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r36 = new Radnik("Petar", "Peric", sezonskiRadnikSingleton.getSezonskiRadnik(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r37 = new Radnik("Jelena", "Kovacevic", sezonskiRadnikSingleton.getSezonskiRadnik(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r38 = new Radnik("Petar", "Kondic", sezonskiRadnikSingleton.getSezonskiRadnik(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r39 = new Radnik("Jelena", "Petrovic", sezonskiRadnikSingleton.getSezonskiRadnik(), false, "22a", "Futoski put", "Novi Sad");
		Radnik r40 = new Radnik("Petar", "Savic", sezonskiRadnikSingleton.getSezonskiRadnik(), false, "22a", "Futoski put", "Novi Sad");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		
		
		p1.zaposli(r1);
		System.out.println("Radnik 1 zaposlen kao programer u :" + dtf.format(LocalDateTime.now()));
		p1.zaposli(r2);
		System.out.println("Radnik 2 zaposlen kao programer u :" + dtf.format(LocalDateTime.now()));
		p1.zaposli(r3);
		System.out.println("Radnik 3 zaposlen kao programer u :" + dtf.format(LocalDateTime.now()));
		p1.zaposli(r4);
		System.out.println("Radnik 4 zaposlen kao programer u :" + dtf.format(LocalDateTime.now()));
		p1.zaposli(r5);
		System.out.println("Radnik 5 zaposlen kao programer u :" + dtf.format(LocalDateTime.now()));
		p1.zaposli(r6);
		System.out.println("Radnik 6 zaposlen kao programer u :" + dtf.format(LocalDateTime.now()));
		p1.zaposli(r7);
		System.out.println("Radnik 7 zaposlen kao programer u :" + dtf.format(LocalDateTime.now()));
		p1.zaposli(r8);
		System.out.println("Radnik 8 zaposlen kao programer u :" + dtf.format(LocalDateTime.now()));
		p1.zaposli(r9);
		System.out.println("Radnik 9 zaposlen kao programer u :" + dtf.format(LocalDateTime.now()));
		p1.zaposli(r10);
		System.out.println("Radnik 10 zaposlen kao programer u :" + dtf.format(LocalDateTime.now()));
		
		p3.zaposli(r21);
		System.out.println("Radnik 21 zaposlen kao doktor u :" + dtf.format(LocalDateTime.now()));
		p3.zaposli(r22);
		System.out.println("Radnik 22 zaposlen kao doktor u :" + dtf.format(LocalDateTime.now()));
		p3.zaposli(r23);
		System.out.println("Radnik 23 zaposlen kao doktor u :" + dtf.format(LocalDateTime.now()));
		p3.zaposli(r24);
		System.out.println("Radnik 24 zaposlen kao doktor u :" + dtf.format(LocalDateTime.now()));
		p3.zaposli(r25);
		System.out.println("Radnik 25 zaposlen kao doktor u :" + dtf.format(LocalDateTime.now()));
		
		p4.zaposli(r31);
		System.out.println("Radnik 31 zaposlen kao sezonski radnik u :" + dtf.format(LocalDateTime.now()));
		p4.zaposli(r32);
		System.out.println("Radnik 32 zaposlen kao sezonski radnik u :" + dtf.format(LocalDateTime.now()));
		p4.zaposli(r33);
		System.out.println("Radnik 33 zaposlen kao sezonski radnik u :" + dtf.format(LocalDateTime.now()));
		p4.zaposli(r34);
		System.out.println("Radnik 34 zaposlen kao sezonski radnik u :" + dtf.format(LocalDateTime.now()));
		p4.zaposli(r35);
		System.out.println("Radnik 35 zaposlen kao sezonski radnik u :" + dtf.format(LocalDateTime.now()));
		
		r1.ideNaOdmor(10);
		r2.ideNaOdmor(10);
		r3.ideNaOdmor(10);
		r4.ideNaOdmor(10);
		r5.ideNaOdmor(10);
		r6.ideNaOdmor(10);
		r7.ideNaOdmor(10);
		r8.ideNaOdmor(10);
		r9.ideNaOdmor(10);
		r10.ideNaOdmor(10);
		
		r21.ideNaOdmor(10);
		r22.ideNaOdmor(10);
		r23.ideNaOdmor(10);
		r24.ideNaOdmor(10);
		r25.ideNaOdmor(10);
		
		r31.ideNaOdmor(10);
		r32.ideNaOdmor(10);
		r33.ideNaOdmor(10);
		r34.ideNaOdmor(10);
		r35.ideNaOdmor(10);
		
		r1.primaPlatu();
		r2.primaPlatu();
		r3.primaPlatu();
		r4.primaPlatu();
		r5.primaPlatu();
		r6.primaPlatu();
		r7.primaPlatu();
		r8.primaPlatu();
		r9.primaPlatu();
		r10.primaPlatu();
		
		r21.primaPlatu();
		r22.primaPlatu();
		r23.primaPlatu();
		r24.primaPlatu();
		r25.primaPlatu();
		
		r31.primaPlatu();
		r32.primaPlatu();
		r33.primaPlatu();
		r34.primaPlatu();
		r35.primaPlatu();
		
		r31.setZaposlen(false);
		r32.setZaposlen(false);
		r33.setZaposlen(false);
		r34.setZaposlen(false);
		r35.setZaposlen(false);
		r36.setZaposlen(false);
		r37.setZaposlen(false);
		r38.setZaposlen(false);
		r39.setZaposlen(false);
		r40.setZaposlen(false);
		
		r31.setZanimanje(programerSingleton.getProgramer());
		r32.setZanimanje(programerSingleton.getProgramer());
		r33.setZanimanje(programerSingleton.getProgramer());
		r34.setZanimanje(programerSingleton.getProgramer());
		r35.setZanimanje(programerSingleton.getProgramer());
		
		r36.setZanimanje(doktorSingleton.getDoktor());
		r37.setZanimanje(doktorSingleton.getDoktor());
		r38.setZanimanje(doktorSingleton.getDoktor());
		r39.setZanimanje(doktorSingleton.getDoktor());
		r40.setZanimanje(doktorSingleton.getDoktor());
	}

}


















