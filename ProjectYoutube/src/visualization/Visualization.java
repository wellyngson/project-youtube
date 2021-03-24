package visualization;
import person.Locust;
import video.Video;

public class Visualization {

	// ATRIBUTOS
	private Locust viewer;
	private Video movie;
	
	// CONSTRUTOR
	public Visualization(Locust viewer, Video movie) {
		super();
		this.viewer = viewer;
		this.movie = movie;
		this.viewer.setTotalAssisted(this.viewer.getTotalAssisted() + 1);
		this.movie.setViews(this.movie.getViews() + 1);
	}

	// MÉTODO TOSTRING
	@Override
	public String toString() {
		return  "\n" + "### VISUALIZAÇÃO ###" + "\n" 
				+ "\n" + viewer + movie;
	}
	
	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public Locust getViewer() {
		return viewer;
	}

	public void setViewer(Locust viewer) {
		this.viewer = viewer;
	}

	public Video getMovie() {
		return movie;
	}

	public void setMovie(Video movie) {
		this.movie = movie;
	}
	
}
