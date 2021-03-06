package repository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.EventDTO;
import server.EventServer;

import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventServerRepo {
	private List<EventDTO> events = new ArrayList<EventDTO>();
	
	private EventServer integration = new EventServer();


		@RequestMapping("/all")
		public List<EventDTO> getCompetitions() throws IOException, JSONException  {
			events = integration.getAllEventsFromApplicationServer();
			return events;
			
		}	
}
