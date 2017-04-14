/**
 * 
 * @author mike91doby
 *
 */

public class Movie {
	// rating enumerator
	public enum mpaaRatingEnum {G, PG, PG13, R}
	
	// instance properties
	private String movieName = "";
	private mpaaRatingEnum mpaaRating;
	private int rating1 = 0;
	private int rating2 = 0;
	private int rating3 = 0;
	private int rating4 = 0;
	private int rating5 = 0;
	
	// constructors
	public Movie() {}
	
	public Movie(String movieName, mpaaRatingEnum mpaaRating) {
		this();
		this.setMovieName(movieName);
		this.setMpaaRating(mpaaRating);
	}
	
	// getters
	public String getMovieName() {
		return movieName;
	}
	
	public mpaaRatingEnum getMPAARating() {
		return mpaaRating;
	}
	
	// setters
	private void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	private void setMpaaRating(mpaaRatingEnum mpaaRating) {
		this.mpaaRating = mpaaRating;
	}
	
	// instance methods
	public boolean addRating(int rating) {
		switch(rating) {
			case 1:
				++rating1;
				return true;
			case 2:
				++rating2;
				return true;
			case 3:
				++rating3;
				return true;
			case 4:
				++rating4;
				return true;
			case 5:
				++rating5;
				return true;
			default:
				return false;
		}
		
	}
	
	public float getAverage() {
		int totalPoints = 0;
		int totalRatings = 0;
		
		totalPoints += (rating1 * 1);
		totalRatings += rating1;
		
		totalPoints += (rating2 * 2);
		totalRatings += rating2;

		totalPoints += (rating3 * 3);
		totalRatings += rating3;
		
		totalPoints += (rating4 * 4);
		totalRatings += rating4;
		
		totalPoints += (rating5 * 5);
		totalRatings += rating5;
		
		return(((float)(totalPoints))/totalRatings);
	}
	
}
