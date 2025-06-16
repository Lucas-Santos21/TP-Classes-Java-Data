import java.util.Scanner;

class Data{
	
	Scanner scan = new Scanner(System.in);
	
	//atributos

	private int dia;
	private int mes;
	private int ano;
	
	//metodos construtor
	
	public Data(){
		
		entraAno();
		entraMes();
		entraDia();
		
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
			System.out.println("------------------------------------------------");
			System.out.println("Digite o ano: ");

			 
				if(scan.hasNextInt()){
				 
					ano = scan.nextInt();
					
					if(ano > 0){
						
						this.ano = ano;
						
					} else {
						
						System.out.println();
						System.out.println("Digite um valor de ano valido(maior que zero)");
						System.out.println();
						
					}
					
				} else{
				 
				    System.out.println();
					System.out.println("Entrada invalida! digite um numero inteiro");
					System.out.println();
					scan.next();
				 
				}
			
		}while(ano <=0);
		
	}

	public void entraMes(){
		
		int mes = 0;
		
		do{
			System.out.println("-------------------------");
			System.out.println("Digite o numero do mes: ");
			System.out.println("-------------------------");
			System.out.println("1. Janeiro");
			System.out.println("2. Fevereiro");
			System.out.println("3. Marco");
			System.out.println("4. Abril");
			System.out.println("5. Maio");
			System.out.println("6. Junho");
			System.out.println("7. Julho");
			System.out.println("8. Agosto");
			System.out.println("9. Setembro");
			System.out.println("10.  Outubro");
			System.out.println("11. Novembro");
			System.out.println("12. Dezembro");
			System.out.println("-------------------------");
			System.out.print("Mes escolhido: ");
			
			if(scan.hasNextInt()){
				
			mes = scan.nextInt();
				
				if(mes > 0 && mes < 13){
					
					this.mes = mes;
					
				} else{
					
					System.out.println();
					System.out.println("Digite um valor de mes valido(dentro da lista)");
					System.out.println();
					
				}
				
			} else{
				
				System.out.println();
				System.out.println("Entrada invalida! digite um numero inteiro");
				System.out.println();
				
				scan.next();
				
			}
			
		} while(mes < 1 || mes > 12);
		
	}
	
	public void entraDia(){
		
		int dia = 0;
		
		do{
			
			System.out.println();
			System.out.println("Digite o dia do mes: ");
			
			if(scan.hasNextInt()){
				
				dia = scan.nextInt();
				
				switch(this.mes){
					
					case 1: {
						
						if(dia > 0 && dia < 32){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 31)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							
							break;
							
							
							
						}
						
					}
					
					case 2: {
						
						if(bissexto()){
							
							if(dia > 0 && dia < 30){
							
								this.dia = dia;
								break;
							
							} else{
							
								System.out.println("------------------------------------------------");
								System.out.println("Insira um valor de dia valido (entre 1 e 29)");
								System.out.println("------------------------------------------------");
								
								dia = -1;
								break;
							
							}
							
						} else{
							
							if(dia > 0 && dia < 29){
							
								this.dia = dia;
								break;
							
							} else{
								
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 28)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							
								break;
							
							}
							
						}
						
					}
					
					case 3: {
						
						if(dia > 0 && dia < 32){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 31)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
					case 4: {
						
						if(dia > 0 && dia < 31){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 30)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
					case 5: {
						
						if(dia > 0 && dia < 32){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 31)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
					case 6: {
						
						if(dia > 0 && dia < 31){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 30)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
					case 7: {
						
						if(dia > 0 && dia < 32){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 31)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
					case 8: {
						
						if(dia > 0 && dia < 32){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 31)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
					case 9: {
						
						if(dia > 0 && dia < 31){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 30)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
					case 10: {
						
						if(dia > 0 && dia < 32){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 31)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
					case 11: {
						
						if(dia > 0 && dia < 31){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 30)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
					case 12: {
						
						if(dia > 0 && dia < 32){
							
							this.dia = dia;
							break;
							
						} else{
							
							System.out.println("------------------------------------------------");
							System.out.println("Insira um valor de dia valido (entre 1 e 31)");
							System.out.println("------------------------------------------------");
							
							dia = -1;
							break;
							
						}
						
					}
					
				}
				
			} else{
				
				System.out.println("------------------------------------------------");
				System.out.println("Entrada invalida! digite um numero inteiro");
				System.out.println("------------------------------------------------");
				
				scan.next();
				
				dia = -1;
				
			}
			
		} while(dia == -1);
		
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
		
		Data data = new Data();
		
	}
	
}