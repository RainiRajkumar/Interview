package com.track.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.track.entity.Candidate;
import com.track.service.CandidateService;

@RestController
@CrossOrigin(origins="http://localhost",maxAge=3600)
public class CandidateController {

	@Autowired
	private CandidateService candidateService;
	
	@PostMapping(value="/add")
	public Candidate addCandidate(@RequestBody  Candidate candidate) {
		return candidateService.addCandidate(candidate);
	}
	
	@GetMapping(value="/viewCandidate/{id}")
	public Candidate viewCandidate (@PathVariable("id") int userID)
	{
		return candidateService.viewCandidate(userID);
	}
	@GetMapping(value="/viewall")
	public List<Candidate>viewCandidate(){
		return candidateService.viewCandidates();
	}
	
}
