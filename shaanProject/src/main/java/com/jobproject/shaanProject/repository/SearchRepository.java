package com.jobproject.shaanProject.repository;

import com.jobproject.shaanProject.models.Post;

import java.util.List;

public interface SearchRepository
{
    List<Post> findByText(String text);

}
