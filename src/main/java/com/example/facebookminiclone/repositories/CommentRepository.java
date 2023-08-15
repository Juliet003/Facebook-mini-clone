package com.example.facebookminiclone.repositories;

import com.example.facebookminiclone.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {

   // List<Comment> findCommentsByPost_PostId();
}
