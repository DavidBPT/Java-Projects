import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Tamagotchi {
	
	ImageIcon back = new ImageIcon("back.png");
	ImageIcon backmorreu = new ImageIcon("backmorreu.png");
	ImageIcon backSleep = new ImageIcon("BackSleep.png");
	ImageIcon Monster = new ImageIcon("monster.png");
	ImageIcon Sleep = new ImageIcon("zzz.png");
	ImageIcon wantfood = new ImageIcon("wantfood.png");
	ImageIcon poop = new ImageIcon("poop.png");
	ImageIcon wantgame = new ImageIcon("wantgamepng");
	int vida,energia,fome,higiene,diversao,segundos=0;
	boolean f=true;
	Timer timer = new Timer();
	Timer timerA = new Timer();
	Timer timerB = new Timer();
	Timer timerH = new Timer();
	
	TimerTask Sujar,PerderFun,ficarfome,Energia,Vida;
	
	public Tamagotchi(){
		
		vida=100;
		energia=100;
		fome=90;
		higiene=100;
		diversao=100;
		
	}
	public Tamagotchi(int vida,int energia,int fome,int higiene,int diversao){
		this.vida=vida;
		this.energia=energia;
		this.fome=fome;
		this.higiene=higiene;
		this.diversao=diversao;
		
	}
	public Tamagotchi(Tamagotchi Tama){
		vida=Tama.getVida();
		energia=Tama.getEnergia();
		fome=Tama.getFome();
		higiene=Tama.getHigiene();
		diversao=Tama.getDiversao();
	}
	
	
	
	
	public int getDiversao() {
		return diversao;
	}
	public void setDiversao(int diversao) {
		this.diversao = diversao;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getFome() {
		return fome;
	}
	public void setFome(int fome) {
		this.fome = fome;
	}
	public int getHigiene() {
		return higiene;
	}
	public void setHigiene(int higiene) {
		this.higiene = higiene;
	}
	
	//Gets e sets
	
	
	public void Alimentar(Tamagotchi bicho, JProgressBar fome2,JProgressBar ener,JLabel lblwantfood){
		if(bicho.getFome()>0 && bicho.getFome()<=105 && bicho.getEnergia()>0){
			
			bicho.setFome(bicho.getFome()-Utility.aleatorio(1, 5));
			fome2.setValue(bicho.getFome());
			bicho.setEnergia(bicho.getEnergia()-Utility.aleatorio(2,4));
			ener.setValue(bicho.getEnergia());
		}
		
	}
	public void FicarFome(Tamagotchi bicho, JProgressBar fome2,JLabel lblwantfood){
		ficarfome = new TimerTask(){
			@Override
			public void run() {
				
				if(bicho.getFome()<100 && f==true && bicho.getVida()>0){
					bicho.setFome(bicho.getFome()+Utility.aleatorio(2, 5));
					fome2.setValue(bicho.getFome());
				}
				
			};
			};timerA.scheduleAtFixedRate(ficarfome,0,Utility.aleatorio(30000,60000));
} 
	public void Brincar(Tamagotchi bicho, JProgressBar divertir,JProgressBar energy){
		if(bicho.getDiversao()<100 && bicho.getEnergia()>0 && bicho.getVida()>0){
			bicho.setDiversao(bicho.getDiversao()+Utility.aleatorio(1, 5));
			bicho.setEnergia(bicho.getEnergia()-Utility.aleatorio(5,10));
			divertir.setValue(bicho.getDiversao());
			energy.setValue(bicho.getEnergia());
		}
	}
	public void PerderFun(Tamagotchi bicho, JProgressBar Divertir){
		
		PerderFun = new TimerTask(){
			@Override
			public void run() {
				if(bicho.getDiversao()>0 && f==true && bicho.getVida()>0){
					bicho.setDiversao(bicho.getDiversao()-Utility.aleatorio(2, 5));
					Divertir.setValue(bicho.getDiversao());
				}
			};
			};timerB.scheduleAtFixedRate(PerderFun,0,Utility.aleatorio(30000,60000));
}
	public void Limpar(Tamagotchi bicho, JProgressBar Hig,JProgressBar Ene){
		if(bicho.getHigiene()<100 && bicho.getEnergia()>0 && bicho.getVida()>0){
		bicho.setHigiene(bicho.getHigiene()+Utility.aleatorio(1, 5));
		bicho.setEnergia(bicho.getEnergia()-Utility.aleatorio(2,4));
		Ene.setValue(bicho.getEnergia());
		Hig.setValue(bicho.getHigiene());
		}
	}
	public void Sujar(Tamagotchi bicho, JProgressBar Hig){
		Sujar = new TimerTask(){
			@Override
			public void run() {
				if(bicho.getHigiene()>0 && f==true && bicho.getVida()>0){
					bicho.setHigiene(bicho.getHigiene()-Utility.aleatorio(5, 10));
					Hig.setValue(bicho.getHigiene());
				}
			};
			
			};timerH.scheduleAtFixedRate(Sujar, 0,Utility.aleatorio(60000,120000));
}
	
	public void Energia(Tamagotchi bicho,JProgressBar EnergiaJP,JProgressBar Higiene,JProgressBar Fome,JButton Alimentar,JButton Brincar,JButton Higien,JLabel background,JLabel Monstro,JLabel Zzz){ 
		Energia = new TimerTask(){
			@Override
			public void run() {
				if(bicho.getEnergia()<=0 && bicho.getVida()>0){
					f=false;
					Alimentar.setEnabled(false);
					Brincar.setEnabled(false);
					Higien.setEnabled(false);
					background.setIcon(backSleep);
					Monstro.setIcon(null);
					Zzz.setIcon(Sleep);
					
				while(bicho.getEnergia() <100 && bicho.getVida()>0){ // "DORMIR"
					
					bicho.setEnergia(bicho.getEnergia()+Utility.aleatorio(10,20));
					EnergiaJP.setValue(bicho.getEnergia());
					if(bicho.getEnergia()<100){
						try {
							Thread.sleep(20000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				}
				else if(bicho.getEnergia()<100 && bicho.getVida()>0){
					bicho.setEnergia(bicho.getEnergia()+Utility.aleatorio(1,4));
					EnergiaJP.setValue(bicho.getEnergia());
					Higiene.setValue(bicho.getHigiene());
					Fome.setValue(bicho.getFome());
				}
				f=true;
				Zzz.setIcon(null);
				Monstro.setIcon(Monster);
				background.setIcon(back);
				Alimentar.setEnabled(true);
				Brincar.setEnabled(true);
				Higien.setEnabled(true);
			};};timer.scheduleAtFixedRate(Energia,0,10000);
	}
	public void Vida(Tamagotchi bicho,JProgressBar vida,JButton Alimentar,JButton Brincar,JButton Higiene,JLabel background,JLabel Monstro){
		Vida = new TimerTask(){
			@Override
			public void run() {
				if(bicho.getVida()<=0){
					Morreu(Alimentar, Brincar,Higiene,background,Monstro);
					
				}
				else if(bicho.getVida()>0 && bicho.getFome()>30 && bicho.getDiversao()<25 && bicho.getHigiene()<50 || 
						bicho.getVida()>0 && bicho.getFome()>100 ||
						bicho.getVida()>0 && bicho.getDiversao()<=0 ||
						bicho.getVida()>0 && bicho.getHigiene()<=0){
					
					if(!(bicho.getVida()<=0)){
						bicho.setVida(bicho.getVida()-Utility.aleatorio(1,3));
						vida.setValue(bicho.getVida());
					}
				}
			};};timer.scheduleAtFixedRate(Vida,0, Utility.aleatorio(1000,2000));
	}
	public void Morreu(JButton Alimentar,JButton Brincar,JButton Higiene,JLabel background,JLabel Monstro){
		Alimentar.setEnabled(false);
		Brincar.setEnabled(false);
		Higiene.setEnabled(false);
		Monstro.setIcon(null);
		background.setIcon(backmorreu);
	}
	public void Alertas(Tamagotchi bicho,JProgressBar Fome, JLabel lblwantfood,JLabel poop1,JLabel poop2,JLabel poop3,JLabel lblGames){
		TimerTask Alertas = new TimerTask(){
			@Override
			public void run() {
				if(bicho.getHigiene()<60){
					poop1.setIcon(poop);
				}
				else if(bicho.getHigiene()<40){
					poop2.setIcon(poop);
				}
				else if(bicho.getHigiene()<20){
					poop3.setIcon(poop);
				}
				else{
					poop1.setIcon(null);
					poop2.setIcon(null);
					poop3.setIcon(null);
				}//Higiene 
				
				if(bicho.getFome()<80){
					Fome.setForeground(Color.green);
					lblwantfood.setIcon(null);
					
				}
				else{
					lblwantfood.setIcon(wantfood);
					Fome.setForeground(Color.red);
				}//comida
				if(bicho.getDiversao()<50){
					lblGames.setIcon(wantgame);
				}
				else{
					lblGames.setIcon(null);
				}				
			};};timer.scheduleAtFixedRate(Alertas,0,1);		
	}

	
}

