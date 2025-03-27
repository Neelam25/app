package com.linkedin;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {
    private final LibraryRepository libraryRepository;
    private final Map<String, Member> members;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
        this.members = new HashMap<>();
    }

    public void addBook(String bookTitle, int quantity){
        libraryRepository.addBook(bookTitle, quantity);
    }

    public void registerMember(String memberId, String memberName){
        members.put(memberId,new Member(memberId, memberName));
    }

    public boolean lendBook(String bookTitle, String memberId){
        if(members.containsKey(memberId)){
            return libraryRepository.lendBook(bookTitle);
        }
        return false;
    }

    public Map<String, Member> getMembers() {
        return members;
      }

}
