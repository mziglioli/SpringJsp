package com.springangular.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public abstract class DocumentClass {

    @Id
    private ObjectId id;

}
