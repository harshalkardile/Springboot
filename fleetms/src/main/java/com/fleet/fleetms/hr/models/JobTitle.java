package com.fleet.fleetms.hr.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fleet.fleetms.parameters.models.CommonObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.*;
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class JobTitle extends CommonObject {

}
