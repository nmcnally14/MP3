/**
 * 
 */
package p440008228;

/**
 * @author Nicola Mc Nally
 * 40008228
 *
 */
public class MP3 {

	/**
	 * 
	 */
	public final static int LOWER_RATING = 1; 
	
	//declare instant vars
	private int ref;
	private String artist;
	private String songName;
	private int rating;
	
	//part 3 - song length var
	private int songLength;
	
	/**
	 * Default constructor
	 */
	public MP3()	{
		
	}
	
	/**
	 * constructor with args
	 * @param ref
	 * @param artist
	 * @param songName
	 * @param rating
	 */
	public MP3(int ref, String artist, String songName, int rating, int songLength) {
		this.setRef(ref);
		this.artist = artist;
		this.songName = songName;
		this.setRating(rating);
		this.setSongLength(songLength);
	}
	
	/**
	 * Gets the ref
	 * @return
	 */
	public int getRef() {
		return ref;
	}
	    
	/**
	 * Sets the ref
	 * If less than zero then throw exception
	 * @param ref
	 */
	public void setRef(int ref) throws IllegalArgumentException {
		
		if (ref > 0)	{
			this.ref = ref;
		} else	{
			throw new IllegalArgumentException("Ref less than 0");
		}	
	}
	
	/**
	 * Get the artist
	 * @return
	 */
	public String getArtist() {
		return artist;
	}
	
	/**
	 * Sets the artist
	 * @param artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	/**
	 * Gets the song name
	 * @return
	 */
	public String getSongName() {
		return songName;}
	
	/**
	 * Sets the song name
	 * @param songName
	 */
	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	/**
	 * Gets the rating
	 * @return
	 */
	public int getRating() {
		return rating;
 	}
	
	/**
	 * Sets the rating - 1 to 5 stars
	 * @param rating
	 */
	public void setRating(int rating) throws IllegalArgumentException	{
	if ((rating >= LOWER_RATING) && (rating <= 5))	{	
		this.rating = rating;
	} else	{
		throw new IllegalArgumentException("Invalid rating, outisde of range");
	}
	
}
	/**
	 * Gets the song
	 * @return the songLength
	 */
	public int getSongLength() {
		return songLength;
	}

	/**
	 * Sets the songLength - between 1-2500 seconds
	 * @param songLength the songLength to set
	 */
	public void setSongLength(int songLength) throws IllegalArgumentException {
		if (songLength >= 1 && songLength <= 2500)	{
			this.songLength = songLength;
		} else	{
			throw new IllegalArgumentException("Invalid song length");
		}
		
	}

	
	
	
	
	
	
	

	
	




	
	


}
