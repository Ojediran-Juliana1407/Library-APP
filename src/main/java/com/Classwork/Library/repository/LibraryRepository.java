package com.Classwork.Library.repository;

import com.Classwork.Library.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LibraryRepository extends  JpaRepository<Library, Long> {
}
