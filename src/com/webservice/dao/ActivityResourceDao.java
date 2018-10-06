package com.webservice.dao;

import java.util.List;

import com.webservice.model.Activity;

public interface ActivityResourceDao {

	List<Activity> findAllActivities();

}