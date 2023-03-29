package com.vcs.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcs.library.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long>{
	
}
