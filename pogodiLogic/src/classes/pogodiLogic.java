package classes;

import interfaces.ioperations;
import java.util.*;

import Enum.Stanje;

public class pogodiLogic implements ioperations{

	public String nizReci[]= {"autobus","skolarina","oblakoid","sunce","mastati"};
	public Random rand=new Random();
	public int randomBroj=rand.nextInt(nizReci.length);
	public int brojgreski=nizReci[randomBroj].length()+5;
	public String seq;
	Stanje stanje;
	
	public String[] getNizReci() {
		return nizReci;
	}
	public void setNizReci(String[] nizReci) {
		this.nizReci = nizReci;
	}
	public Random getRand() {
		return rand;
	}
	public void setRand(Random rand) {
		this.rand = rand;
	}
	public int getRandomBroj() {
		return randomBroj;
	}
	public void setRandomBroj(int randomBroj) {
		this.randomBroj = randomBroj;
	}
	public int getBrojgreski() {
		return brojgreski;
	}
	public void setBrojgreski(int brojgreski) {
		this.brojgreski = brojgreski;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}


	public Stanje getStanje() {
		return stanje;
	}
	public void setStanje(Stanje stanje) {
		this.stanje = stanje;
	}
	@Override
	public void proveri() {
		if(nizReci[randomBroj].contains(seq)==false)
			{
			this.stanje=stanje.NijePogodjenja;
			brojgreski--;
			if(brojgreski==0)
				System.exit(0);
			}
		if(nizReci[randomBroj].contains(seq)==true)
			{
			this.stanje=stanje.PodRec;
			brojgreski--;
			if(brojgreski==0)
				System.exit(0);
			}
		if(nizReci[randomBroj].equals(seq))
			this.stanje=stanje.Pogodjenja;
	}



}
