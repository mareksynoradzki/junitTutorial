package com.synoradzki.JunitTutorial.MockitoEntity;

import java.util.Date;

public abstract class BaseEntity {

	protected Long id;
	protected Date created;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
