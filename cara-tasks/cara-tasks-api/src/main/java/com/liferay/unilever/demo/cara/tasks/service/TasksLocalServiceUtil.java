/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.unilever.demo.cara.tasks.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Tasks. This utility wraps
 * {@link com.liferay.unilever.demo.cara.tasks.service.impl.TasksLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TasksLocalService
 * @see com.liferay.unilever.demo.cara.tasks.service.base.TasksLocalServiceBaseImpl
 * @see com.liferay.unilever.demo.cara.tasks.service.impl.TasksLocalServiceImpl
 * @generated
 */
@ProviderType
public class TasksLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.unilever.demo.cara.tasks.service.impl.TasksLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the tasks to the database. Also notifies the appropriate model listeners.
	*
	* @param tasks the tasks
	* @return the tasks that was added
	*/
	public static com.liferay.unilever.demo.cara.tasks.model.Tasks addTasks(
		com.liferay.unilever.demo.cara.tasks.model.Tasks tasks) {
		return getService().addTasks(tasks);
	}

	/**
	* Creates a new tasks with the primary key. Does not add the tasks to the database.
	*
	* @param taskId the primary key for the new tasks
	* @return the new tasks
	*/
	public static com.liferay.unilever.demo.cara.tasks.model.Tasks createTasks(
		long taskId) {
		return getService().createTasks(taskId);
	}

	/**
	* Deletes the tasks from the database. Also notifies the appropriate model listeners.
	*
	* @param tasks the tasks
	* @return the tasks that was removed
	*/
	public static com.liferay.unilever.demo.cara.tasks.model.Tasks deleteTasks(
		com.liferay.unilever.demo.cara.tasks.model.Tasks tasks) {
		return getService().deleteTasks(tasks);
	}

	/**
	* Deletes the tasks with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskId the primary key of the tasks
	* @return the tasks that was removed
	* @throws PortalException if a tasks with the primary key could not be found
	*/
	public static com.liferay.unilever.demo.cara.tasks.model.Tasks deleteTasks(
		long taskId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTasks(taskId);
	}

	public static com.liferay.unilever.demo.cara.tasks.model.Tasks fetchTasks(
		long taskId) {
		return getService().fetchTasks(taskId);
	}

	/**
	* Returns the tasks matching the UUID and group.
	*
	* @param uuid the tasks's UUID
	* @param groupId the primary key of the group
	* @return the matching tasks, or <code>null</code> if a matching tasks could not be found
	*/
	public static com.liferay.unilever.demo.cara.tasks.model.Tasks fetchTasksByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchTasksByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the tasks with the primary key.
	*
	* @param taskId the primary key of the tasks
	* @return the tasks
	* @throws PortalException if a tasks with the primary key could not be found
	*/
	public static com.liferay.unilever.demo.cara.tasks.model.Tasks getTasks(
		long taskId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTasks(taskId);
	}

	/**
	* Returns the tasks matching the UUID and group.
	*
	* @param uuid the tasks's UUID
	* @param groupId the primary key of the group
	* @return the matching tasks
	* @throws PortalException if a matching tasks could not be found
	*/
	public static com.liferay.unilever.demo.cara.tasks.model.Tasks getTasksByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTasksByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the tasks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tasks the tasks
	* @return the tasks that was updated
	*/
	public static com.liferay.unilever.demo.cara.tasks.model.Tasks updateTasks(
		com.liferay.unilever.demo.cara.tasks.model.Tasks tasks) {
		return getService().updateTasks(tasks);
	}

	/**
	* Returns the number of taskses.
	*
	* @return the number of taskses
	*/
	public static int getTasksesCount() {
		return getService().getTasksesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.tasks.model.impl.TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.tasks.model.impl.TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.unilever.demo.cara.tasks.model.Tasks> getTasksByJobId(
		long jobId, int start, int end) {
		return getService().getTasksByJobId(jobId, start, end);
	}

	/**
	* Returns a range of all the taskses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.tasks.model.impl.TasksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @return the range of taskses
	*/
	public static java.util.List<com.liferay.unilever.demo.cara.tasks.model.Tasks> getTaskses(
		int start, int end) {
		return getService().getTaskses(start, end);
	}

	/**
	* Returns all the taskses matching the UUID and company.
	*
	* @param uuid the UUID of the taskses
	* @param companyId the primary key of the company
	* @return the matching taskses, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.unilever.demo.cara.tasks.model.Tasks> getTasksesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getTasksesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of taskses matching the UUID and company.
	*
	* @param uuid the UUID of the taskses
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of taskses
	* @param end the upper bound of the range of taskses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching taskses, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.unilever.demo.cara.tasks.model.Tasks> getTasksesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.unilever.demo.cara.tasks.model.Tasks> orderByComparator) {
		return getService()
				   .getTasksesByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static TasksLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TasksLocalService, TasksLocalService> _serviceTracker =
		ServiceTrackerFactory.open(TasksLocalService.class);
}