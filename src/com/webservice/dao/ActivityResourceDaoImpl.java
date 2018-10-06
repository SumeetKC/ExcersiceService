package com.webservice.dao;

import java.util.ArrayList;
import java.util.List;

import com.webservice.model.Activity;

public class ActivityResourceDaoImpl implements ActivityResourceDao {

	/* (non-Javadoc)
	 * @see com.webservice.dao.ActivityResourceDao#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		Activity activity =new Activity();
		activity.setDescription("Swimming");
		activity.setDuration(45);
		activities.add(activity);
		Activity activity1 =new Activity();
		activity.setDescription("Running");
		activity.setDuration(120);
		activities.add(activity1);
		
		return activities;
	}

}
