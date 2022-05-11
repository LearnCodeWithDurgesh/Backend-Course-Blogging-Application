package com.codewithdurgesh.blog;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.entities.User;
import com.codewithdurgesh.blog.repositories.PostRepo;
import com.codewithdurgesh.blog.repositories.UserRepo;

@SpringBootTest
class BlogAppApisApplicationTests {

	
	@Autowired
	private UserRepo userRepo;
	

	@Autowired
	private PostRepo postRepo
;

	@Test
	void contextLoads() {

	}

	@Test
	public void repoTest()
	{
	
//		
//		User user =new User();
//		user.setId(2);
////		
//		List<Post> findByUser = this.postRepo.findByTitleContaining("what");
//		List<Post> findByUser1 = this.postRepo.findByTitleContaining("java");
//		System.out.println(findByUser);
//		System.out.println(findByUser1);
////		
	}
	

}
