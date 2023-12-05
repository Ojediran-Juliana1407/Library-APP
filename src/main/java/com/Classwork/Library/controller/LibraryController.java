package com.Classwork.Library.controller;

import com.Classwork.Library.DTO.LibraryDto;
import com.Classwork.Library.service.LibraryService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService){
        this.libraryService = libraryService;
    }

    @GetMapping("/library")
    public String library() {
        return  "Books Here";
    }

    @PostMapping(value = "/library/add")
    public Object addBook(@RequestBody LibraryDto libraryDto) {
        return libraryService.addBook(libraryDto);
    }

    @PutMapping("/library/{id}")
    public Object updateBook(@RequestBody LibraryDto libraryDto,@PathVariable long id ){
        return libraryService.updateBook(libraryDto,id);
    }

    @DeleteMapping("/library/{id}")
    public Object deleteBook(@PathVariable long id) {
        return libraryService.deleteBook(id);
    }


}
