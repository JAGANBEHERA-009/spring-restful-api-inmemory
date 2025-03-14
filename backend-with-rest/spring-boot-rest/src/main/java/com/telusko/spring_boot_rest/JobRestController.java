package com.telusko.spring_boot_rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.spring_boot_rest.model.JobPost;

import com.telusko.spring_boot_rest.repo.JobRepo;
import com.telusko.spring_boot_rest.service.JobService;

@RestController
public class JobRestController {
	@Autowired
	private JobService service;
	@Autowired
	private JobRepo repo;
	         //for negotiation
	@GetMapping(path="jobPosts",produces= {"application/json"})
	public List<JobPost> getAllJobs(){
		return service.getAllJobs();	
	}
	@GetMapping("jobPost/{postId}")
	public JobPost getJob( @PathVariable("postId") int postId) {
		return service.getJob(postId);
	}
	@PostMapping(path="jobPost",consumes= {"application/json"})
	public JobPost addJob(@RequestBody JobPost jobPost) {
		service .addJob(jobPost);
		return service.getJob(jobPost.getPostId());
			
	}
	@PutMapping("jobPost")
	public JobPost updateJob(@RequestBody JobPost jobPost) {
		service.updateJob(jobPost);
		return service.getJob(jobPost.getPostId());
	}

	@DeleteMapping("jobPost/{postId}")
	public String deleteJob(@PathVariable int postId) {
		
		service.deleteJob(postId);
		return "Deleted";
		
	}
	
	
	
	
	
	
	

}
