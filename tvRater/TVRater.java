/**
 * 
 */
package tvRater;

/**
 * This is the TVRater class
 */
public class TVRater {

	// Instance variables

	private String programmeName;
	private String broadcaster;
	private int rating;
	private double audience;

	// Constructors

	/**
	 * Default constructor
	 */
	public TVRater() {

	}

	/**
	 * Constructor with args
	 * 
	 * @param programmeName
	 * @param broadcaster
	 * @param rating
	 * @param audience
	 */
	public TVRater(String programmeName, String broadcaster, int rating, double audience) {
		this.setProgrammeName(programmeName);
		this.setBroadcaster(broadcaster);
		this.setRating(rating);
		this.setAudience(audience);
	}

	// Getters and setters

	/**
	 * @return the programmeName
	 */
	public String getProgrammeName() {
		return programmeName;
	}

	/**
	 * @param programmeName the programmeName to set
	 */
	public void setProgrammeName(String programmeName) {
		this.programmeName = programmeName;
	}

	/**
	 * @return the broadcaster
	 */
	public String getBroadcaster() {
		return broadcaster;
	}

	/**
	 * @param broadcaster the broadcaster to set
	 */
	public void setBroadcaster(String broadcaster) {
		this.broadcaster = broadcaster;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the audience
	 */
	public double getAudience() {
		return audience;
	}

	/**
	 * @param audience the audience to set
	 */
	public void setAudience(double audience) {
		this.audience = audience;
	}

	// toString Method

	@Override
	public String toString() {
		return "TVRater [programmeName=" + programmeName + ", broadcaster=" + broadcaster + ", rating=" + rating
				+ ", audience=" + audience + "]";
	}

	// Methods

}
