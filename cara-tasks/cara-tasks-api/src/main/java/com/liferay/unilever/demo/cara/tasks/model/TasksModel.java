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

package com.liferay.unilever.demo.cara.tasks.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Tasks service. Represents a row in the &quot;cara_Tasks&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.unilever.demo.cara.tasks.model.impl.TasksModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.unilever.demo.cara.tasks.model.impl.TasksImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tasks
 * @see com.liferay.unilever.demo.cara.tasks.model.impl.TasksImpl
 * @see com.liferay.unilever.demo.cara.tasks.model.impl.TasksModelImpl
 * @generated
 */
@ProviderType
public interface TasksModel extends BaseModel<Tasks>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tasks model instance should use the {@link Tasks} interface instead.
	 */

	/**
	 * Returns the primary key of this tasks.
	 *
	 * @return the primary key of this tasks
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tasks.
	 *
	 * @param primaryKey the primary key of this tasks
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this tasks.
	 *
	 * @return the uuid of this tasks
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this tasks.
	 *
	 * @param uuid the uuid of this tasks
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the task ID of this tasks.
	 *
	 * @return the task ID of this tasks
	 */
	public long getTaskId();

	/**
	 * Sets the task ID of this tasks.
	 *
	 * @param taskId the task ID of this tasks
	 */
	public void setTaskId(long taskId);

	/**
	 * Returns the group ID of this tasks.
	 *
	 * @return the group ID of this tasks
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tasks.
	 *
	 * @param groupId the group ID of this tasks
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this tasks.
	 *
	 * @return the company ID of this tasks
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tasks.
	 *
	 * @param companyId the company ID of this tasks
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this tasks.
	 *
	 * @return the user ID of this tasks
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tasks.
	 *
	 * @param userId the user ID of this tasks
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tasks.
	 *
	 * @return the user uuid of this tasks
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tasks.
	 *
	 * @param userUuid the user uuid of this tasks
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tasks.
	 *
	 * @return the user name of this tasks
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tasks.
	 *
	 * @param userName the user name of this tasks
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tasks.
	 *
	 * @return the create date of this tasks
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tasks.
	 *
	 * @param createDate the create date of this tasks
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tasks.
	 *
	 * @return the modified date of this tasks
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tasks.
	 *
	 * @param modifiedDate the modified date of this tasks
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the job ID of this tasks.
	 *
	 * @return the job ID of this tasks
	 */
	public Long getJobId();

	/**
	 * Sets the job ID of this tasks.
	 *
	 * @param jobId the job ID of this tasks
	 */
	public void setJobId(Long jobId);

	/**
	 * Returns the taskname of this tasks.
	 *
	 * @return the taskname of this tasks
	 */
	@AutoEscape
	public String getTaskname();

	/**
	 * Sets the taskname of this tasks.
	 *
	 * @param taskname the taskname of this tasks
	 */
	public void setTaskname(String taskname);

	/**
	 * Returns the task status of this tasks.
	 *
	 * @return the task status of this tasks
	 */
	public long getTaskStatus();

	/**
	 * Sets the task status of this tasks.
	 *
	 * @param taskStatus the task status of this tasks
	 */
	public void setTaskStatus(long taskStatus);

	/**
	 * Returns the complete date of this tasks.
	 *
	 * @return the complete date of this tasks
	 */
	public Date getCompleteDate();

	/**
	 * Sets the complete date of this tasks.
	 *
	 * @param completeDate the complete date of this tasks
	 */
	public void setCompleteDate(Date completeDate);

	/**
	 * Returns the user assigned of this tasks.
	 *
	 * @return the user assigned of this tasks
	 */
	public long getUserAssigned();

	/**
	 * Sets the user assigned of this tasks.
	 *
	 * @param userAssigned the user assigned of this tasks
	 */
	public void setUserAssigned(long userAssigned);

	/**
	 * Returns the super assigned of this tasks.
	 *
	 * @return the super assigned of this tasks
	 */
	public long getSuperAssigned();

	/**
	 * Sets the super assigned of this tasks.
	 *
	 * @param superAssigned the super assigned of this tasks
	 */
	public void setSuperAssigned(long superAssigned);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Tasks tasks);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Tasks> toCacheModel();

	@Override
	public Tasks toEscapedModel();

	@Override
	public Tasks toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}