package com.codeinvestigator.demopopulatingdata.important;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class PopulateDataWithEntityService {

    private final ImportantNoteRepository importantNoteRepository;

    public PopulateDataWithEntityService(ImportantNoteRepository importantNoteRepository) {
        this.importantNoteRepository = importantNoteRepository;
    }






    @PostConstruct
    public void initEntities(){
        importantNoteRepository.save(new ImportantNote(20, "Entity note 1", LocalDate.now(), BigDecimal.ONE));
        importantNoteRepository.save(new ImportantNote(21, "Entity note 2", LocalDate.now(), BigDecimal.ONE));
        importantNoteRepository.save(new ImportantNote(22, "Entity note 3", LocalDate.now(), BigDecimal.ONE));
        importantNoteRepository.save(new ImportantNote(23, "Entity note 4", LocalDate.now(), BigDecimal.ONE));
        importantNoteRepository.save(new ImportantNote(24, "Entity note 5", LocalDate.now(), BigDecimal.ONE));
      }
}
