package jp.genuine.training.scheduler.model.performance;

public class Venue {
	private VenueName venueName;
	private VenueUrl venueUrl;

	public Venue() {
		venueName = new VenueName();
		venueUrl = new VenueUrl();
	}

	public VenueName getVenueName() {
		return venueName;
	}

	public VenueUrl getVenueUrl() {
		return venueUrl;
	}

	public void setVenueName(VenueName venueName) {
		this.venueName = venueName;
	}

	public void setVenueUrl(VenueUrl venueUrl) {
		this.venueUrl = venueUrl;
	}

	public Venue(VenueName venueName, VenueUrl venueUrl) {
		this.venueName = venueName;
		this.venueUrl = venueUrl;
	}

	@Override
	public String toString() {
		return String.format("Venue [venueName=%s, venueUrl=%s]", venueName, venueUrl);
	}

}
