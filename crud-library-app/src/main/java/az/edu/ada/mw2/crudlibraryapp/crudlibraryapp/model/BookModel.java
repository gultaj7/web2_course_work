package az.edu.ada.mw2.crudlibraryapp.crudlibraryapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookModel {
    private String title;
    private Integer year;
}


