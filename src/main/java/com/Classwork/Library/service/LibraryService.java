package com.Classwork.Library.service;

import com.Classwork.Library.DTO.LibraryDto;
import com.Classwork.Library.model.Library;
import com.Classwork.Library.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class LibraryService {
    private final LibraryRepository LibraryRepository;

    public LibraryService(LibraryRepository LibraryRepository){
        this.LibraryRepository = LibraryRepository;
    }

    public Object addBook(LibraryDto libraryDto) {
        Library library = new Library();

        library.setTitle(libraryDto.getTitle());
        library.setAuthor(library.getAuthor());
        library.setISBN(library.getISBN());
        library.setCreatedAt(libraryDto.getCreatedAt());
        library.setUpdatedAt(library.getUpdatedAt());

        return LibraryRepository.save(library);
    }

    public Object updateBook(LibraryDto libraryDto, long id) {
        Library library = LibraryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("book not found"));

        library.setTitle(libraryDto.getTitle());
        library.setAuthor(libraryDto.getAuthor());
        library.setISBN(libraryDto.getISBN());
        library.setCreatedAt(libraryDto.getCreatedAt());
        library.setUpdatedAt(libraryDto.getUpdatedAt());

        return LibraryRepository.save(library);
    }

    public Object deleteBook(long id) {
        Library library = LibraryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("book not found"));

        LibraryRepository.delete(library);
        return "book has been deleted";
    }

    public Object fetchBook(){
        return LibraryRepository.findAll();
    }



}
