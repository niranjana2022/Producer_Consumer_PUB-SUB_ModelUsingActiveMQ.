package com.nt.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Students implements Serializable  {
	private  Integer sno;		
	private  String sname;		
	private  String saddrs;		
	private  Float ssal;

	@Override
	public String toString() {
		return "Students [sno=" + sno + ", sname=" + sname + ", saddrs=" + saddrs + ", ssal=" + ssal + "]";
	}
}
