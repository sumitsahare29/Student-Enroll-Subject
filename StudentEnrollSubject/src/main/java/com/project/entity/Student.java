package com.project.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "info_students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer std_id;

	private String std_name;
	private String std_address;
	
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "info_student_subject",
			joinColumns = { @JoinColumn(name="std_id")},
			inverseJoinColumns = { @JoinColumn(name="sub_id")}
			)
	private Set<Subject> subjects=new HashSet<>();
}
