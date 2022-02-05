package com.project.test.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.test.enums.gender;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Data
@ToString
@Getter
@Setter
@Table(name ="employee",schema = "myschemadb")
public class EmployeeEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int eid;
	private String name;
	private String designation;
	private double experiance;
	@Enumerated(EnumType.STRING)
	private gender gender;
	

}
