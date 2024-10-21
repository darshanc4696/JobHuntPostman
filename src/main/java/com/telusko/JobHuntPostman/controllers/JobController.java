package com.telusko.JobHuntPostman.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.JobHuntPostman.model.JobPost;
import com.telusko.JobHuntPostman.services.JobService;

@RestController
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@PostMapping("jobpost")
	public String addjob(@RequestBody JobPost jobpost)
	{
		jobService.addJob(jobpost);
		return "added";
	}
	
	@GetMapping("jobposts")
	public List<JobPost> viewJobs()
	{
		return jobService.viewAllJobs();
	}
	
	@PutMapping("jobpost")
	public String updateJob(@RequestBody JobPost jobPost)
	{
		jobService.update(jobPost);
		return "modified";
	}
	
	@DeleteMapping("jobpost/{id}")
	public String deleteJob(@PathVariable("id") int jobId)
	{
		jobService.delete(jobId);
		return "deleted";
	}

}
