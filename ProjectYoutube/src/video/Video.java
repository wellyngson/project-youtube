package video;
import videoAction.VideoAction;

public class Video implements VideoAction {

	// ATRIBUTOS
	private String title;
	private int views, likes;
	private boolean playing;
	
	
	// CONSTRUTOR
	public Video(String title) {
		super();
		this.setTitle(title);
		this.setViews(0);
		this.setLikes(0);
		this.setPlaying(false);
	}

	// MÉTODOS SOBRESCRITOS DA INTERFACE VIDEOACTION
	@Override
	public void play() {
		this.setPlaying(true);
	}

	@Override
	public void pause() {
		this.setPlaying(false);
	}

	@Override
	public void like() {
		this.setLikes(getLikes() + 1);
	}
	
	@Override
	public String toString() {
		return  "Nome do filme: " + title + "\n" +
				"Quantidade de vezes que o filme foi assistido: " + views + "\n";
	}
	

	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public boolean getPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	
}
