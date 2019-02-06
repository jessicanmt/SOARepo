package server;
import org.json.JSONException;
import org.json.JSONObject;

import model.EventDTO;

/**
 * Mapper class for converting from json data 
 
 */
public class EventMapper {
	
	private static final String ID = "id";
	private static final String EVENT_ID = "event_id";
	private static final String EVENT_NAME = "event_name";
	private static final String DESCRIPTION = "description";
	private static final String EVENT_TYPE = "event_type";
	private static final String URL = "url";

	/**
	 * Convert from json object to competition object
	 * @param object the json
	 * @return the competition object
	 * @throws JSONException 
	 */
	public EventDTO convertFromJSON(JSONObject object) throws JSONException {
		EventDTO event = null;

		
		if (null != object) {
		
			String id = object.getString(ID);
			int eventId = object.getInt(EVENT_ID);
			String event_type = object.getString(EVENT_TYPE);
			String description = object.getString(DESCRIPTION);
			String event_name = object.getString(EVENT_NAME);
			String url = object.getString(URL);

			if(url.equals("null")) {
				url="None available";
			}
			event = new EventDTO(id, event_type, description, event_name,  eventId, url);
		}
		
		return event;

	}

}
