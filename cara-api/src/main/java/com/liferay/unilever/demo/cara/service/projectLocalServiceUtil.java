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

package com.liferay.unilever.demo.cara.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for project. This utility wraps
 * {@link com.liferay.unilever.demo.cara.service.impl.projectLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see projectLocalService
 * @see com.liferay.unilever.demo.cara.service.base.projectLocalServiceBaseImpl
 * @see com.liferay.unilever.demo.cara.service.impl.projectLocalServiceImpl
 * @generated
 */
@ProviderType
public class projectLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.unilever.demo.cara.service.impl.projectLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the project to the database. Also notifies the appropriate model listeners.
	*
	* @param project the project
	* @return the project that was added
	*/
	public static com.liferay.unilever.demo.cara.model.project addproject(
		com.liferay.unilever.demo.cara.model.project project) {
		return getService().addproject(project);
	}

	/**
	* Creates a new project with the primary key. Does not add the project to the database.
	*
	* @param projectId the primary key for the new project
	* @return the new project
	*/
	public static com.liferay.unilever.demo.cara.model.project createproject(
		long projectId) {
		return getService().createproject(projectId);
	}

	/**
	* Deletes the project from the database. Also notifies the appropriate model listeners.
	*
	* @param project the project
	* @return the project that was removed
	*/
	public static com.liferay.unilever.demo.cara.model.project deleteproject(
		com.liferay.unilever.demo.cara.model.project project) {
		return getService().deleteproject(project);
	}

	/**
	* Deletes the project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the project
	* @return the project that was removed
	* @throws PortalException if a project with the primary key could not be found
	*/
	public static com.liferay.unilever.demo.cara.model.project deleteproject(
		long projectId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteproject(projectId);
	}

	public static com.liferay.unilever.demo.cara.model.project fetchproject(
		long projectId) {
		return getService().fetchproject(projectId);
	}

	/**
	* Returns the project matching the UUID and group.
	*
	* @param uuid the project's UUID
	* @param groupId the primary key of the group
	* @return the matching project, or <code>null</code> if a matching project could not be found
	*/
	public static com.liferay.unilever.demo.cara.model.project fetchprojectByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchprojectByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.unilever.demo.cara.model.project getProjectByProjectRefId(
		java.lang.String projectRefId) {
		return getService().getProjectByProjectRefId(projectRefId);
	}

	/**
	* Returns the project with the primary key.
	*
	* @param projectId the primary key of the project
	* @return the project
	* @throws PortalException if a project with the primary key could not be found
	*/
	public static com.liferay.unilever.demo.cara.model.project getproject(
		long projectId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getproject(projectId);
	}

	/**
	* Returns the project matching the UUID and group.
	*
	* @param uuid the project's UUID
	* @param groupId the primary key of the group
	* @return the matching project
	* @throws PortalException if a matching project could not be found
	*/
	public static com.liferay.unilever.demo.cara.model.project getprojectByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getprojectByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the project in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param project the project
	* @return the project that was updated
	*/
	public static com.liferay.unilever.demo.cara.model.project updateproject(
		com.liferay.unilever.demo.cara.model.project project) {
		return getService().updateproject(project);
	}

	/**
	* Returns the number of projects.
	*
	* @return the number of projects
	*/
	public static int getprojectsCount() {
		return getService().getprojectsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.model.impl.projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.model.impl.projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.liferay.unilever.demo.cara.model.project> getAssignmentsByProjectName(
		java.lang.String projectName, int start, int end) {
		return getService().getAssignmentsByProjectName(projectName, start, end);
	}

	public static java.util.List<com.liferay.unilever.demo.cara.model.project> getProjectsByProjectCategory(
		java.lang.String projectCategory, int start, int end) {
		return getService()
				   .getProjectsByProjectCategory(projectCategory, start, end);
	}

	public static java.util.List<com.liferay.unilever.demo.cara.model.project> getProjectsByProjectType(
		java.lang.String projectType, int start, int end) {
		return getService().getProjectsByProjectType(projectType, start, end);
	}

	/**
	* Returns a range of all the projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.unilever.demo.cara.model.impl.projectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of projects
	*/
	public static java.util.List<com.liferay.unilever.demo.cara.model.project> getprojects(
		int start, int end) {
		return getService().getprojects(start, end);
	}

	/**
	* Returns all the projects matching the UUID and company.
	*
	* @param uuid the UUID of the projects
	* @param companyId the primary key of the company
	* @return the matching projects, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.unilever.demo.cara.model.project> getprojectsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getprojectsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of projects matching the UUID and company.
	*
	* @param uuid the UUID of the projects
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching projects, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.unilever.demo.cara.model.project> getprojectsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.unilever.demo.cara.model.project> orderByComparator) {
		return getService()
				   .getprojectsByUuidAndCompanyId(uuid, companyId, start, end,
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

	public static void deleteProjects() {
		getService().deleteProjects();
	}

	public static projectLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<projectLocalService, projectLocalService> _serviceTracker =
		ServiceTrackerFactory.open(projectLocalService.class);
}