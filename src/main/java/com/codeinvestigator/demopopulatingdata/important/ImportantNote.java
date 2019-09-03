package com.codeinvestigator.demopopulatingdata.important;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="IMPORTANTNOTE", schema="IMPORTANTSCHEMA")
public class ImportantNote {
    @Id
    private Integer id;
    private String note;
    private LocalDate datecreated;
    private BigDecimal price;
}
