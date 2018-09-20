package com.vd11.opentimesheet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author beou on 9/20/18 09:47
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project implements Serializable {

    private static final long serialVersionUID = -8875983648142730710L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
