package com.codeinvestigator.demopopulatingdata.important;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ImportantNoteRepositoryTest {

    @Autowired
    ImportantNoteRepository importantNoteRepository;

    @Test
    public void testData(){
        System.out.println("Begin");
        long count = importantNoteRepository.count();
        System.out.println("Elements: " + count);
        importantNoteRepository.findAll().forEach(System.out::println);
        System.out.println("End");
    }

}