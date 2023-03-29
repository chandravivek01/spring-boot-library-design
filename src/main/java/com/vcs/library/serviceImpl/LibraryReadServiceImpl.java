package com.vcs.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcs.library.entity.Library;
import com.vcs.library.repository.LibraryRepository;

@Service
public class LibraryReadServiceImpl {
	
	@Autowired
	LibraryRepository libraryRepository;
	
	public List<Library> getAllLibrary() {
		return libraryRepository.findAll();
	}

}
