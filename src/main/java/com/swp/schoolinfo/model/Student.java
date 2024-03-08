package com.swp.schoolinfo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
@Data
public class Student {
    @Schema(example = "123", description = "individual student number")
    private long id;
    @Schema(example = "Adsada", description = "student's name")
    private String name;
    @Schema(example = "Aryusom", description = "student's surname")
    private String surname;
    @Schema(example = "Earth", description = "student's nickname")
    private String nickname;
    @Schema(example = "M4_4", description = "индивидуальный номер студента")
    private Mattayom mattayom;

    public Student() {
    }

    public Student(int id, String name, String surname, String nickname, Mattayom mattayom) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.mattayom = mattayom;
    }
}