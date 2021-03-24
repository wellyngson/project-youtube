package main;
import video.Video;
import visualization.Visualization;
import person.Locust;

public class Main {

	public static void main(String[] args) {

		// CRIANDO O VETOR DOS VIDEOS
		Video video[] = new Video[3];
		
		// ANEXANDO OS VÍDEOS NO VETOR
		video[0] = new Video("Aula 01 de POO");
		video[1] = new Video("Aula 12 de PHP");
		video[2] = new Video("Aula 10 de HTML5");
		
		// CRIANDO O VETOR DE PESSOAS
		Locust locust[] = new Locust[2];
		
		// ANEXANDO AS PESSOAS AO VETOR
		locust[0] = new Locust("Jubileu", 22, "Masculino", "juba");
		locust[1] = new Locust("Creuza", 12, "Feminino", "creuzita");
		
		// FAZENDO UMA PESSOA ASSISTIR UM VÍDEO
		Visualization visualization = new Visualization(locust[0], video[1]); // JUBILEU ASSISTE PHP
		
		// MOSTRANDO OS RESULTADOS APÓS ASSISTIR UM VÍDEO
		System.out.println(visualization.toString());

	}

}
