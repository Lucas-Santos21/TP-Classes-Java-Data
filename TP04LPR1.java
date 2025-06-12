import java.util.Scanner;

class Data{
	
	Scanner scan = new Scanner(System.in);
	
	//atributos

	private int dia;
	private int mes;
	private int ano;
	
	//metodos construtor
	
	public Data(){
		
		entraMes();
		entraDia();
		entraAno();
		
	}
	
	public Data(int d, int m, int a){
		
		entraDia(d);
		entraMes(m);
		entraAno(a);
		
	}
	
	//entradas sem parametro
	
	public void entraAno(){
		
		int ano = -1;
		
		do{
			
			System.out.println("Digite o ano: ");
			 
				if(scan.hasNextInt()){
				 
					ano = scan.nextInt();
					
					if(ano > 0){
						
						this.ano = ano;
						
					} else {
						
						System.out.println("Digite um valor de ano valido(maior que zero)");
						
					}
					
				} else{
				 
					System.out.println("Entrada invalida!");
				 
				}
			
		}while(ano <=0);
		
	}

	public void entraMes(){
		
		
		
	}
	
	public void entraDia(){
		
		
		
	}
	
	//saidas sem parametro
	
	public int retDia(){
		
		return this.dia;
		
	}
	
	public int retMes(){
		
		return this.mes;
		
	}
	
	public int retAno(){
		
		return this.ano;
		
	}
	
	//entradas por parametro
	
	public void entraDia(int d){
		
		this.dia = d;
		
	}
	
	public void entraMes(int m){
		
		this.mes = m;
		
	}
	
	public void entraAno(int a){
		
		this.ano = a;
		
	}
	
	//outros metodos
	
	public boolean bissexto(){
		
		if((retAno() % 4 == 0 && retAno() % 100 != 0)|| (retAno() % 400 == 0)){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}
	
}

public class TP04LPR1{
	
	public static void main(String[] args){
		
		
		
	}
	
}