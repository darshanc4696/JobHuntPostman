package com.telusko.JobHuntPostman.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.JobHuntPostman.model.JobPost;
import com.telusko.JobHuntPostman.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	private JobRepo jobrepo;
	
	public void addJob(JobPost jobPost)
	{
		jobrepo.saveJob(jobPost);
	}

	public List<JobPost> viewAllJobs() {
		
		return jobrepo.viewAllJobs();
	}

	public void update(JobPost jobPost) {
		jobrepo.update(jobPost);
		
	}

	public void delete(int jobId) {
		jobrepo.delete(jobId);
		
	}

}
