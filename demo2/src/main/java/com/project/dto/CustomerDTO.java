package com.project.dto;

public class CustomerDTO {
	 public static Integer custId;

		public static Integer getCustId() {
			return custId;
		}

		public void setCustId(Integer custId) {
			CustomerDTO.custId = custId;
		}

		@Override
		public String toString() {
			return "Customer [custId=" + custId + "]";
		}

}
