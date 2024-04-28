package com.project.library.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.library.model.Book;

@Repository
public interface LibraryRepository extends JpaRepository<Book, Long>{
	
	@Modifying
	@Query(value="update Book b set b.book_title=?1, b.author=?2, b.description=?3, b.rack_no=?4, b.borrowed=?5, b.member_id=?6 where b.id=?7", nativeQuery = true)
	@Transactional
	int updateBookByID(String bookTitle, String author, String description, String rackNo, boolean borrowed, long memberId, long id);

}
