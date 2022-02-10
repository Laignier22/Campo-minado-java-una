package campominado;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		Random A = new Random();
		int[][] campoE = {/*Sorteia O valor de cada casa*/
								{A.nextInt(2), A.nextInt(2), A.nextInt(2), A.nextInt(2), A.nextInt(2),},
								{A.nextInt(2), A.nextInt(2), A.nextInt(2), A.nextInt(2), A.nextInt(2),},
								{A.nextInt(2), A.nextInt(2), A.nextInt(2), A.nextInt(2), A.nextInt(2),},
								{A.nextInt(2), A.nextInt(2), A.nextInt(2), A.nextInt(2), A.nextInt(2),},
								{A.nextInt(2), A.nextInt(2), A.nextInt(2), A.nextInt(2), A.nextInt(2),}
		};
		
		System.out.println("          *** ----Campo minado---- ***         ");
		System.out.println("Cuidado, este lugar está cheio de armadilhas!!!");
		System.out.println("-----------------------------------------------");
		System.out.println("Ao iníciar o jogo você deverá informar as ");
		System.out.println("cordenadas de onde quer pisar, você terá 5 ");
		System.out.println("vidas sendo que perderá uma a cada bomba ");
		System.out.println("explodida.");
		System.out.println("-----------------------------------------------");
		System.out.println("É isso aí, vamos lá, o campo está em 5x5.");
		System.out.println("-----------------------------------------------");
		
		int life = 5;
		int x, y;
		int[][] M = new int[5][5];
		String[][] N = new String[5][5];
		
		
		
		JOGADA: do{
			/* Converte os resultados obtidos por M para texto 2=limpo 3=bomba*/
			switch(M[0][0]){ case 2: N[0][0] = "Limpo"; break; case 3: N[0][0] = "Bomba"; break; default: N[0][0] = "     "; break; } switch(M[0][1]){ case 2: N[0][1] = "Limpo"; break;  case 3: N[0][1] = "Bomba"; break;  default: N[0][1] = "     "; break; } switch(M[0][2]){ case 2: N[0][2] = "Limpo"; break;  case 3: N[0][2] = "Bomba"; break;  default: N[0][2] = "     "; break; } switch(M[0][3]){ case 2: N[0][3] = "Limpo"; break;  case 3: N[0][3] = "Bomba"; break;  default: N[0][3] = "     "; break; } switch(M[0][4]){ case 2: N[0][4] = "Limpo"; break;  case 3: N[0][4] = "Bomba"; break;  default: N[0][4] = "     "; break; }
			switch(M[1][0]){ case 2: N[1][0] = "Limpo"; break; case 3: N[1][0] = "Bomba"; break; default: N[1][0] = "     "; break; } switch(M[1][1]){ case 2: N[1][1] = "Limpo"; break;  case 3: N[1][1] = "Bomba"; break;  default: N[1][1] = "     "; break; } switch(M[1][2]){ case 2: N[1][2] = "Limpo"; break;  case 3: N[1][2] = "Bomba"; break;  default: N[1][2] = "     "; break; } switch(M[1][3]){ case 2: N[1][3] = "Limpo"; break;  case 3: N[1][3] = "Bomba"; break;  default: N[1][3] = "     "; break; } switch(M[1][4]){ case 2: N[1][4] = "Limpo"; break;  case 3: N[1][4] = "Bomba"; break;  default: N[1][4] = "     "; break; }
			switch(M[2][0]){ case 2: N[2][0] = "Limpo"; break; case 3: N[2][0] = "Bomba"; break; default: N[2][0] = "     "; break; } switch(M[2][1]){ case 2: N[2][1] = "Limpo"; break;  case 3: N[2][1] = "Bomba"; break;  default: N[2][1] = "     "; break; } switch(M[2][2]){ case 2: N[2][2] = "Limpo"; break;  case 3: N[2][2] = "Bomba"; break;  default: N[2][2] = "     "; break; } switch(M[2][3]){ case 2: N[2][3] = "Limpo"; break;  case 3: N[2][3] = "Bomba"; break;  default: N[2][3] = "     "; break; } switch(M[2][4]){ case 2: N[2][4] = "Limpo"; break;  case 3: N[2][4] = "Bomba"; break;  default: N[2][4] = "     "; break; }
			switch(M[3][0]){ case 2: N[3][0] = "Limpo"; break; case 3: N[3][0] = "Bomba"; break; default: N[3][0] = "     "; break; } switch(M[3][1]){ case 2: N[3][1] = "Limpo"; break;  case 3: N[3][1] = "Bomba"; break;  default: N[3][1] = "     "; break; } switch(M[3][2]){ case 2: N[3][2] = "Limpo"; break;  case 3: N[3][2] = "Bomba"; break;  default: N[3][2] = "     "; break; } switch(M[3][3]){ case 2: N[3][3] = "Limpo"; break;  case 3: N[3][3] = "Bomba"; break;  default: N[3][3] = "     "; break; } switch(M[3][4]){ case 2: N[3][4] = "Limpo"; break;  case 3: N[3][4] = "Bomba"; break;  default: N[3][4] = "     "; break; }
			switch(M[4][0]){ case 2: N[4][0] = "Limpo"; break; case 3: N[4][0] = "Bomba"; break; default: N[4][0] = "     "; break; } switch(M[4][1]){ case 2: N[4][1] = "Limpo"; break;  case 3: N[4][1] = "Bomba"; break;  default: N[4][1] = "     "; break; } switch(M[4][2]){ case 2: N[4][2] = "Limpo"; break;  case 3: N[4][2] = "Bomba"; break;  default: N[4][2] = "     "; break; } switch(M[4][3]){ case 2: N[4][3] = "Limpo"; break;  case 3: N[4][3] = "Bomba"; break;  default: N[4][3] = "     "; break; } switch(M[4][4]){ case 2: N[4][4] = "Limpo"; break;  case 3: N[4][4] = "Bomba"; break;  default: N[4][4] = "     "; break; }
			
			/*Imprime os textos obtidos*/
			System.out.println("X|   0   |   1   |   2   |   3   |   4   |");
			System.out.println("------------------------------------------");
			System.out.println("0| "+N[0][0]+" | "+N[0][1]+" | "+N[0][2]+" | "+N[0][3]+" | "+N[0][4]+" | ");
			System.out.println("------------------------------------------");
			System.out.println("1| "+N[1][0]+" | "+N[1][1]+" | "+N[1][2]+" | "+N[1][3]+" | "+N[1][4]+" | ");
			System.out.println("------------------------------------------");
			System.out.println("2| "+N[2][0]+" | "+N[2][1]+" | "+N[2][2]+" | "+N[2][3]+" | "+N[2][4]+" | ");
			System.out.println("------------------------------------------");
			System.out.println("3| "+N[3][0]+" | "+N[3][1]+" | "+N[3][2]+" | "+N[3][3]+" | "+N[3][4]+" | ");
			System.out.println("------------------------------------------");
			System.out.println("4| "+N[4][0]+" | "+N[4][1]+" | "+N[4][2]+" | "+N[4][3]+" | "+N[4][4]+" | ");
			System.out.println("------------------------------------------");
			
			System.out.println("");
			System.out.println("Você tem "+life+" vidas.");
			System.out.println("");
			System.out.println("Por favor, informe as cordenadas da jogada");
			System.out.println("Linha: "); x = in.nextInt();
			System.out.println("Coluna: "); y = in.nextInt();
			
			M[x][y] = (campoE[x][y])+2;
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			
			if(M[x][y] == 2){ System.out.println("Você está indo bem, pisou no lugar certo.");}else{ if(M[x][y] == 3){ life-=1; System.out.println("Opa! pisou em uma bomba.");}}
			
			
			if(life == 0){System.out.println("------------------------------------------"); System.out.println("Você morreu!!!"); System.out.println("Até a próxima");}
			
			/*CHECAR*/{
				if(M[0][0]>=1){
					if(M[0][1]>=1){
						if(M[0][2]>=1){
							if(M[0][3]>=1){
								if(M[0][4]>=1){
									if(M[1][0]>=1){
										if(M[1][1]>=1){
											if(M[1][2]>=1){
												if(M[1][3]>=1){
													if(M[1][4]>=1){
														if(M[2][0]>=1){
															if(M[2][1]>=1){
																if(M[2][2]>=1){
																	if(M[2][3]>=1){
																		if(M[2][4]>=1){
																			if(M[3][0]>=1){
																				if(M[3][1]>=1){
																					if(M[3][2]>=1){
																						if(M[3][3]>=1){
																							if(M[3][4]>=1){
																								if(M[4][0]>=1){
																									if(M[4][1]>=1){
																										if(M[4][2]>=1){
																											if(M[4][3]>=1){
																												if(M[4][4]>=1){
																													System.out.println("----------------------------------------------------------------------");
																													System.out.println("Parabén, você venceu a partida! você pisou em todos os lugares certos.");
																													break JOGADA;
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}/**/
			
		}while(life > 0);
	}
}			