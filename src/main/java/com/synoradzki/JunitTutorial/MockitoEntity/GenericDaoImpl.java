package com.synoradzki.JunitTutorial.MockitoEntity;

import java.util.Calendar;
import java.util.Date;

public abstract class GenericDaoImpl<T extends BaseEntity> {

	public T save(T entity) {
		Calendar calendarInstance = Calendar.getInstance();
		calendarInstance.setTime(new Date());
		entity.setCreated(calendarInstance.getTime());
		entity.setId(1L);//fake
		return entity;
	}
}
