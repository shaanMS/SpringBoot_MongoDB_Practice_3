package com.jobproject.shaanProject.repository;
import com.jobproject.shaanProject.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String>
{

}
