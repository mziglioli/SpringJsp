package com.springangular.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User extends DocumentClass implements Serializable {

    private static final long serialVersionUID = 3703605543387427213L;

    @NotNull
    @Size(min = 1, max = 200)
    private String name;

    @Pattern(regexp = "[A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,4}")
    private String email;

    @JsonIgnore
    @NotNull
    @Size(min = 6, max = 100)
    private String password;

   

}
