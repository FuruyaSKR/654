import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GC {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		int i,j;
		int ano1a = 0, ano1b = 489, ano2a = 0 , ano2b = 486, ano3a = 0, ano3b = 500, ano4a = 0, ano4b = 600,ano = 2016;
		
		System.out.printf("Quantidade de alunos que iniciaram seus estudos no IFC \n");
	

		FileWriter arq = new FileWriter("C:\\Users\\Public\\Alunosquit.html");
		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.printf(
				"<html><head><script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script><script type=\"text/javascript\">google.charts.load('current', {'packages':['corechart']});google.charts.setOnLoadCallback(drawChart);function drawChart() {var data = google.visualization.arrayToDataTable([%n");

		for (int pebolim = 0; pebolim < 4; pebolim++) {
			
			System.out.print("\nInforme a Quantidade de Alunos nos anos de "+ano+": ");
			i = ler.nextInt();
			
			System.out.print("Informe a Quantidade de Alunos que sairam no ano final do ano de "+ano+": ");
			j = ler.nextInt();
			
			switch (pebolim) {
			
			case 0:
				ano1a = i;
				ano1b = j;
				break;
			case 1:
				ano2a = i;
				ano2b = j;
				break;
			case 2:
				ano3a = i;
				ano3b = j;
				break;
			case 3:
				ano4a = i;
				ano4b = j;
				break;
			}
			
			ano++;
		}

		gravarArq.printf("['Anos','Entrada','Saida'],%n"
	    		+  		   "['2016', "+ano1a+","+ano1b+"],%n"
	      		+          "['2017', "+ano2a+","+ano2b+"],%n"
	      		+ 		   "['2018', "+ano3a+","+ano3b+"],%n"
	      		+          "['2019', "+ano4a+","+ano4b+"],%n"  	
	      		);
	   
	    gravarArq.printf("]);var options = {title: '     Quantidade de novos alunos na instituição',curveType: 'function',legend: { position: 'bottom' }};var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));chart.draw(data, options);}</script></head><body><div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div></body></html>");
	    arq.close();
	    ler.close();
	  }
	}