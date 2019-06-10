/**
 * 
 */
package p440008228;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Nicola Mc Nally
 * 40008228
 *
 */
public class MP3Test {
	
	// test data
	int refNumberValid, refNumberInvalid, ratingValid, ratingInvalidUpper, ratingInvalidLower, songLengthValid, songLengthInvalid;
	String songNameValid, songNameInvalid, artistvalid, artistInvalid;
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//ints
		refNumberValid = 1; 
		refNumberInvalid = -1;
		ratingValid = 5;
		ratingInvalidLower = 0;
		ratingInvalidUpper = 6;
		songLengthValid = 500;
		songLengthInvalid = -1;
		
		//strings
		songNameValid = "validSongName";
		songNameInvalid = "invalidSongName";
		artistvalid = "validArtist";
		artistInvalid = "invalidArtist";
		
	}

	/**
	 * Test default constructor
	 * Test method for {@link p440008228.MP3#MP3()}.
	 */
	@Test
	public void testMP3DefaultConstructor() {
		MP3 myMp3 = new MP3();
		assertNotNull(myMp3);
		
	}

	/**
	 * Test constructor with args
	 * Test method for {@link p440008228.MP3#MP3(int, java.lang.String, java.lang.String, int, int)}.
	 */
	@Test
	public void testMP3ConstructorWithArgs() {
		MP3 myMp3 = new MP3(refNumberValid, artistvalid, songNameValid, ratingValid, songLengthValid);
		assertNotNull(myMp3);
		
		//testing values
		assertEquals(refNumberValid, myMp3.getRef());
		
		assertEquals(artistvalid, myMp3.getArtist());
		
		assertEquals(songNameValid, myMp3.getSongName());
		
		assertEquals(ratingValid, myMp3.getRating());
		
		assertEquals(songLengthValid, myMp3.getSongLength());
		
	}

	/**
	 * Test method for {@link p440008228.MP3#getRef()}.
	 */
	@Test
	public void testGetSetRefValid() {

		MP3 myMp3 = new MP3();
		myMp3.setRef(refNumberValid);
		assertEquals(refNumberValid, myMp3.getRef());	
	}

	/**
	 * Test method for {@link p440008228.MP3#getRef()}.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testGetSetRefInvalid() {

		MP3 myMp3 = new MP3();
		myMp3.setRef(refNumberInvalid);
		
	}

	/**
	 * Test method for {@link p440008228.MP3#getArtist()}.
	 */
	@Test
	public void testGetSetArtistValid() {
		
		MP3 myMp3 = new MP3();
		myMp3.setArtist(artistvalid);
		assertEquals(artistvalid, myMp3.getArtist());
	}
	
	/**
	 * Test method for {@link p440008228.MP3#getArtist()}.
	 */
	@Test
	public void testGetSetArtistInvalid() {
		
		MP3 myMp3 = new MP3();
		myMp3.setArtist(artistInvalid);
		assertEquals(artistInvalid, myMp3.getArtist());
	}

	/**
	 * Test method for {@link p440008228.MP3#getSongName()}.
	 */
	@Test
	public void testGetSetSongNameValid() {
		
		MP3 myMp3 = new MP3();
		myMp3.setSongName(songNameValid);
		assertEquals(songNameValid, myMp3.getSongName());
	}
	
	/**
	 * Test method for {@link p440008228.MP3#getSongName()}.
	 */
	@Test
	public void testGetSetSongNameInvalid() {
		
		MP3 myMp3 = new MP3();
		myMp3.setSongName(songNameInvalid);
		assertEquals(songNameInvalid, myMp3.getSongName());
	}


	/**
	 * Test method for {@link p440008228.MP3#getRating()}.
	 */
	@Test
	public void testGetSetRating() {
		
		MP3 myMp3 = new MP3();
		myMp3.setRating(ratingValid);
		assertEquals(ratingValid, myMp3.getRating());
	}
	
	/**
	 * Test method for {@link p440008228.MP3#getRating()}.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testGetSetInvalidRatingLower() {
		
		MP3 myMp3 = new MP3();
		myMp3.setRating(ratingInvalidLower);	
	}
	
	/**
	 * Test method for {@link p440008228.MP3#getRating()}.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testGetSetInvalidRatingUpper() {
		
		MP3 myMp3 = new MP3();
		myMp3.setRating(ratingInvalidUpper);	
	}

	/**
	 * Tests valid song length
	 */
	@Test
	public void testGetSetSongLengthValid()	{
		
		MP3 myMp3 = new MP3();
		myMp3.setSongLength(songLengthValid);
		assertEquals(songLengthValid, myMp3.getSongLength());
	}
	
	/**
	 * Test invalid song length
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testGetSetSongLengthInvalid()	{
		
		MP3 myMp3 = new MP3();
		myMp3.setSongLength(songLengthInvalid);
		assertEquals(songLengthInvalid, myMp3.getSongLength());
	}

}
