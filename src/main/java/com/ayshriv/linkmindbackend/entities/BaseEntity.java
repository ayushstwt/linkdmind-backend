package com.ayshriv.linkmindbackend.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseEntity implements Serializable {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	@JsonProperty("id")
	private Long id;

	@Basic(optional = true)
	@Column(name = "CREATED_ON", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonProperty("created_on")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "GMT+5:30")
	@JsonIgnore
	private Date createdOn;

	@Basic(optional = true)
	@Column(name = "UPDATED_ON", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonProperty("updated_on")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "GMT+5:30")
	@JsonIgnore
	private Date updatedOn;

	@Basic(optional = true)
	@Column(name = "IS_ACTIVE", columnDefinition = "boolean default true")
	@JsonIgnore
	private boolean isActive;

	@Basic(optional = true)
	@Column(name = "IS_DELETED", columnDefinition = "boolean default false")
	@JsonIgnore
	private boolean isDeleted;

}
