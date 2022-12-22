package com.track.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.track.entity.Candidate;
import com.track.exception.CandidateNotFoundException;
import com.track.repository.CandidateRepository;
import com.track.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateRepository candidateRepo;
	@Override
	public Candidate addCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		return candidateRepo.save(candidate);
	}

	@Override
	public Candidate viewCandidate(int userID) throws CandidateNotFoundException {
		// TODO Auto-generated method stub
		Optional<Candidate>candidate=candidateRepo.findById(userID);
		Candidate candi=null;
		if(candidate.isPresent()) {
			candi=candidate.get();
		}
		else {
			throw new CandidateNotFoundException("No such Candidate");
		}
		return candi;
	}

	@Override
	public List<Candidate> viewCandidates() {
		// TODO Auto-generated method stub
		return candidateRepo.findAll();
	}

	
}
