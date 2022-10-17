package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idInteger;
	private String name;
	
	public Department() {
	}

	public Department(Integer idInteger, String name) {
		this.idInteger = idInteger;
		this.name = name;
	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idInteger);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(idInteger, other.idInteger);
	}

	@Override
	public String toString() {
		return "Department [idInteger=" + idInteger + ", name=" + name + "]";
	}
	
	
	
	
}
