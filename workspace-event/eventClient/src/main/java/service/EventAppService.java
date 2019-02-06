package service;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import model.EventDTO;


public class EventAppService {
	private static final String URL="http://localhost:8080/events/all";
	private RestTemplate rest = new RestTemplate();
	
	@SuppressWarnings("unchecked")
	public List<EventDTO>getAllEvents(){
       return rest.getForObject(URL, List.class);
	}
	

}
