package com.telusko.JobHuntPostman.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.telusko.JobHuntPostman.model.JobPost;

@Repository
public class JobRepo {
	
	List<JobPost> jobs = new ArrayList<>();
	List<String> techstack =  new ArrayList<>();
	
	public void saveJob(JobPost jobPost)
	{
		jobs.add(jobPost);
	}

	public List<JobPost> viewAllJobs() {
		jobs.add(new JobPost(1, "JAVA developer", "Good in JSE", 3, new ArrayList<>(Arrays.asList("Java","MySQL"))));
		return jobs;
	}

	public void update(JobPost jobPost) {
		
		for(JobPost job : jobs)
		{
			if(job.getPostId() == jobPost.getPostId())
			{
				job.setPostProfile(jobPost.getPostProfile());
				job.setPostDesc(jobPost.getPostDesc());
				job.setReqExperience(jobPost.getReqExperience());
				job.setPostTechStack(jobPost.getPostTechStack());
			}
		}
		
	}

	public void delete(int jobId) {
		
		for(JobPost job : jobs)
		{
			if(job.getPostId() == jobId)
			{
				jobs.remove(job);
				break;
			}
		}
		
	}

}
