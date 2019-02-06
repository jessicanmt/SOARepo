package model;

public class EventDTO {
	private String id;
	private String event_type;
	private String description;
	private String event_name; 
	private int eventId;//	string	Event ISO 4217 currency code.
	private String url; //	boolean	true = Specifies that the Event is online only (i.e. the Event does not have a Venue).
	
	public EventDTO(){};
	
	public EventDTO(String id, String event_type, String description, String event_name, int eventId, String url) {
		super();
		this.id = id;
		this.event_type = event_type;
		this.description = description;
		this.event_name = event_name;
		this.eventId = eventId;
		this.url = url;
	}
	public String getId() {
		return id;
	}
	public String getEvent_type() {
		return event_type;
	}
	public String getDescription() {
		return description;
	}
	public String getEvent_name() {
		return event_name;
	}
	public int getEventId() {
		return eventId;
	}
	public String getUrl() {
		return url;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public void setUrl(String url) {
		this.url = url;
	}


	
	
}
