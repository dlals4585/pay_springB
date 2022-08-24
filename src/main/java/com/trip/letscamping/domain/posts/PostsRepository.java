package com.trip.letscamping.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//DAO (DB Layer 접근자)
public interface PostsRepository extends JpaRepository<Posts,Long> {

}
