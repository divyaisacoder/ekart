package com.project.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
        public static Integer custId;

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		Customer.custId = custId;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(custId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return Objects.equals(custId, Customer.custId);
	}
	
}
