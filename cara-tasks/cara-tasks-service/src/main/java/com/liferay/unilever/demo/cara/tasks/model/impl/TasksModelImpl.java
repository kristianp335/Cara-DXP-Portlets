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

package com.liferay.unilever.demo.cara.tasks.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.unilever.demo.cara.tasks.model.Tasks;
import com.liferay.unilever.demo.cara.tasks.model.TasksModel;
import com.liferay.unilever.demo.cara.tasks.model.TasksSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Tasks service. Represents a row in the &quot;cara_Tasks&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link TasksModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TasksImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TasksImpl
 * @see Tasks
 * @see TasksModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class TasksModelImpl extends BaseModelImpl<Tasks> implements TasksModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tasks model instance should use the {@link Tasks} interface instead.
	 */
	public static final String TABLE_NAME = "cara_Tasks";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "taskId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "jobId", Types.BIGINT },
			{ "taskname", Types.VARCHAR },
			{ "taskStatus", Types.BIGINT },
			{ "completeDate", Types.TIMESTAMP },
			{ "userAssigned", Types.BIGINT },
			{ "superAssigned", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("taskId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("jobId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("taskname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("taskStatus", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("completeDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("userAssigned", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("superAssigned", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table cara_Tasks (uuid_ VARCHAR(75) null,taskId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,jobId LONG,taskname VARCHAR(75) null,taskStatus LONG,completeDate DATE null,userAssigned LONG,superAssigned LONG)";
	public static final String TABLE_SQL_DROP = "drop table cara_Tasks";
	public static final String ORDER_BY_JPQL = " ORDER BY tasks.taskId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY cara_Tasks.taskId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.unilever.demo.cara.tasks.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.unilever.demo.cara.tasks.model.Tasks"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.unilever.demo.cara.tasks.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.unilever.demo.cara.tasks.model.Tasks"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.unilever.demo.cara.tasks.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.unilever.demo.cara.tasks.model.Tasks"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long JOBID_COLUMN_BITMASK = 4L;
	public static final long UUID_COLUMN_BITMASK = 8L;
	public static final long TASKID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Tasks toModel(TasksSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Tasks model = new TasksImpl();

		model.setUuid(soapModel.getUuid());
		model.setTaskId(soapModel.getTaskId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setJobId(soapModel.getJobId());
		model.setTaskname(soapModel.getTaskname());
		model.setTaskStatus(soapModel.getTaskStatus());
		model.setCompleteDate(soapModel.getCompleteDate());
		model.setUserAssigned(soapModel.getUserAssigned());
		model.setSuperAssigned(soapModel.getSuperAssigned());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Tasks> toModels(TasksSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Tasks> models = new ArrayList<Tasks>(soapModels.length);

		for (TasksSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.unilever.demo.cara.tasks.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.unilever.demo.cara.tasks.model.Tasks"));

	public TasksModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _taskId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTaskId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _taskId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Tasks.class;
	}

	@Override
	public String getModelClassName() {
		return Tasks.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("taskId", getTaskId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("jobId", getJobId());
		attributes.put("taskname", getTaskname());
		attributes.put("taskStatus", getTaskStatus());
		attributes.put("completeDate", getCompleteDate());
		attributes.put("userAssigned", getUserAssigned());
		attributes.put("superAssigned", getSuperAssigned());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long taskId = (Long)attributes.get("taskId");

		if (taskId != null) {
			setTaskId(taskId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long jobId = (Long)attributes.get("jobId");

		if (jobId != null) {
			setJobId(jobId);
		}

		String taskname = (String)attributes.get("taskname");

		if (taskname != null) {
			setTaskname(taskname);
		}

		Long taskStatus = (Long)attributes.get("taskStatus");

		if (taskStatus != null) {
			setTaskStatus(taskStatus);
		}

		Date completeDate = (Date)attributes.get("completeDate");

		if (completeDate != null) {
			setCompleteDate(completeDate);
		}

		Long userAssigned = (Long)attributes.get("userAssigned");

		if (userAssigned != null) {
			setUserAssigned(userAssigned);
		}

		Long superAssigned = (Long)attributes.get("superAssigned");

		if (superAssigned != null) {
			setSuperAssigned(superAssigned);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getTaskId() {
		return _taskId;
	}

	@Override
	public void setTaskId(long taskId) {
		_columnBitmask = -1L;

		_taskId = taskId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public Long getJobId() {
		return _jobId;
	}

	@Override
	public void setJobId(Long jobId) {
		_columnBitmask |= JOBID_COLUMN_BITMASK;

		if (!_setOriginalJobId) {
			_setOriginalJobId = true;

			_originalJobId = _jobId;
		}

		_jobId = jobId;
	}

	public Long getOriginalJobId() {
		return _originalJobId;
	}

	@JSON
	@Override
	public String getTaskname() {
		if (_taskname == null) {
			return StringPool.BLANK;
		}
		else {
			return _taskname;
		}
	}

	@Override
	public void setTaskname(String taskname) {
		_taskname = taskname;
	}

	@JSON
	@Override
	public long getTaskStatus() {
		return _taskStatus;
	}

	@Override
	public void setTaskStatus(long taskStatus) {
		_taskStatus = taskStatus;
	}

	@JSON
	@Override
	public Date getCompleteDate() {
		return _completeDate;
	}

	@Override
	public void setCompleteDate(Date completeDate) {
		_completeDate = completeDate;
	}

	@JSON
	@Override
	public long getUserAssigned() {
		return _userAssigned;
	}

	@Override
	public void setUserAssigned(long userAssigned) {
		_userAssigned = userAssigned;
	}

	@JSON
	@Override
	public long getSuperAssigned() {
		return _superAssigned;
	}

	@Override
	public void setSuperAssigned(long superAssigned) {
		_superAssigned = superAssigned;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Tasks.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Tasks.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Tasks toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Tasks)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TasksImpl tasksImpl = new TasksImpl();

		tasksImpl.setUuid(getUuid());
		tasksImpl.setTaskId(getTaskId());
		tasksImpl.setGroupId(getGroupId());
		tasksImpl.setCompanyId(getCompanyId());
		tasksImpl.setUserId(getUserId());
		tasksImpl.setUserName(getUserName());
		tasksImpl.setCreateDate(getCreateDate());
		tasksImpl.setModifiedDate(getModifiedDate());
		tasksImpl.setJobId(getJobId());
		tasksImpl.setTaskname(getTaskname());
		tasksImpl.setTaskStatus(getTaskStatus());
		tasksImpl.setCompleteDate(getCompleteDate());
		tasksImpl.setUserAssigned(getUserAssigned());
		tasksImpl.setSuperAssigned(getSuperAssigned());

		tasksImpl.resetOriginalValues();

		return tasksImpl;
	}

	@Override
	public int compareTo(Tasks tasks) {
		int value = 0;

		if (getTaskId() < tasks.getTaskId()) {
			value = -1;
		}
		else if (getTaskId() > tasks.getTaskId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Tasks)) {
			return false;
		}

		Tasks tasks = (Tasks)obj;

		long primaryKey = tasks.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		TasksModelImpl tasksModelImpl = this;

		tasksModelImpl._originalUuid = tasksModelImpl._uuid;

		tasksModelImpl._originalGroupId = tasksModelImpl._groupId;

		tasksModelImpl._setOriginalGroupId = false;

		tasksModelImpl._originalCompanyId = tasksModelImpl._companyId;

		tasksModelImpl._setOriginalCompanyId = false;

		tasksModelImpl._setModifiedDate = false;

		tasksModelImpl._originalJobId = tasksModelImpl._jobId;

		tasksModelImpl._setOriginalJobId = false;

		tasksModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Tasks> toCacheModel() {
		TasksCacheModel tasksCacheModel = new TasksCacheModel();

		tasksCacheModel.uuid = getUuid();

		String uuid = tasksCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			tasksCacheModel.uuid = null;
		}

		tasksCacheModel.taskId = getTaskId();

		tasksCacheModel.groupId = getGroupId();

		tasksCacheModel.companyId = getCompanyId();

		tasksCacheModel.userId = getUserId();

		tasksCacheModel.userName = getUserName();

		String userName = tasksCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tasksCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tasksCacheModel.createDate = createDate.getTime();
		}
		else {
			tasksCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tasksCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			tasksCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		tasksCacheModel.jobId = getJobId();

		tasksCacheModel.taskname = getTaskname();

		String taskname = tasksCacheModel.taskname;

		if ((taskname != null) && (taskname.length() == 0)) {
			tasksCacheModel.taskname = null;
		}

		tasksCacheModel.taskStatus = getTaskStatus();

		Date completeDate = getCompleteDate();

		if (completeDate != null) {
			tasksCacheModel.completeDate = completeDate.getTime();
		}
		else {
			tasksCacheModel.completeDate = Long.MIN_VALUE;
		}

		tasksCacheModel.userAssigned = getUserAssigned();

		tasksCacheModel.superAssigned = getSuperAssigned();

		return tasksCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", taskId=");
		sb.append(getTaskId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", jobId=");
		sb.append(getJobId());
		sb.append(", taskname=");
		sb.append(getTaskname());
		sb.append(", taskStatus=");
		sb.append(getTaskStatus());
		sb.append(", completeDate=");
		sb.append(getCompleteDate());
		sb.append(", userAssigned=");
		sb.append(getUserAssigned());
		sb.append(", superAssigned=");
		sb.append(getSuperAssigned());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.liferay.unilever.demo.cara.tasks.model.Tasks");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskId</column-name><column-value><![CDATA[");
		sb.append(getTaskId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobId</column-name><column-value><![CDATA[");
		sb.append(getJobId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskname</column-name><column-value><![CDATA[");
		sb.append(getTaskname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskStatus</column-name><column-value><![CDATA[");
		sb.append(getTaskStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>completeDate</column-name><column-value><![CDATA[");
		sb.append(getCompleteDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userAssigned</column-name><column-value><![CDATA[");
		sb.append(getUserAssigned());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>superAssigned</column-name><column-value><![CDATA[");
		sb.append(getSuperAssigned());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Tasks.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Tasks.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _taskId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private Long _jobId;
	private Long _originalJobId;
	private boolean _setOriginalJobId;
	private String _taskname;
	private long _taskStatus;
	private Date _completeDate;
	private long _userAssigned;
	private long _superAssigned;
	private long _columnBitmask;
	private Tasks _escapedModel;
}