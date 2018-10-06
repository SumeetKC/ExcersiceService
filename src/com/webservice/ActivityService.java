/**
 * 
 */
package com.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservice.dao.ActivityResourceDao;
import com.webservice.dao.ActivityResourceDaoImpl;
import com.webservice.model.Activity;

/**
 * @author Sumeet
 *
 */
@Path("activities")
public class ActivityService {

	private ActivityResourceDao activityResourceDao = new ActivityResourceDaoImpl();

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Activity> getAllActivities() {
		return activityResourceDao.findAllActivities();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Activity findActivitiy() {
		return null;
	}

}
