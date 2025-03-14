package  com.telusko.spring_boot_rest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.spring_boot_rest.model.JobPost;
import com.telusko.spring_boot_rest.repo.JobRepo;

@Service
public class JobService {
	@Autowired
	private JobRepo repo;
	
	                          //DTO object 
	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);	
	}
	
	public List<JobPost> getAllJobs(){
		return repo.getAllJobs();
		
	}

	public JobPost getJob(int postId) {
		// TODO Auto-generated method stub
		
		return  repo.getJob(postId);
		
		
	}

	public void updateJob(JobPost jobPost) {
		// TODO Auto-generated method stub
		
		 repo.updateJob(jobPost);
	}

	public void deleteJob(int postId) {
		repo.deleteJob(postId);
		// TODO Auto-generated method stub
		
	}
	

}
