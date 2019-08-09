package com.example.easynotes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.Session;
import com.example.easynotes.repository.SessionRepository;

@RestController
@RequestMapping("/api")
public class SessionController {
	
	@Autowired
	SessionRepository sessionRepository;
	
    @GetMapping(path ="/session")
    public List<Session> getAllSession() {
    	/*List<Session> sessions = new ArrayList<>();
    	sessionRepository.findAll().forEach(sessions :: add);
        return sessions;*/
    	
        return sessionRepository.findAll();
    }
    
    
   @GetMapping("/session/{id}")
    public Session getSessionById(@PathVariable(value = "id") Long idSession) {
        return sessionRepository.findById(idSession)
                .orElseThrow(() -> new ResourceNotFoundException("Session", "id", idSession));
    }
   
   
  /* @GetMapping(path ="/video")
   public ObjectListing objectListing = s3client.listObjects(bucketName);
   	for(S3ObjectSummary os : objectListing.getObjectSummaries()) {
   	    LOG.info(os.getKey());
   	}
}*/
}
