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

package cara.jobs.model.impl;

import aQute.bnd.annotation.ProviderType;

import cara.jobs.model.Jobs;
import cara.jobs.model.JobsModel;
import cara.jobs.model.JobsSoap;

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

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Jobs service. Represents a row in the &quot;Jobs_Jobs&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link JobsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JobsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JobsImpl
 * @see Jobs
 * @see JobsModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class JobsModelImpl extends BaseModelImpl<Jobs> implements JobsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jobs model instance should use the {@link Jobs} interface instead.
	 */
	public static final String TABLE_NAME = "Jobs_Jobs";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "jobId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "projectId", Types.BIGINT },
			{ "jobType", Types.VARCHAR },
			{ "variant", Types.VARCHAR },
			{ "format", Types.VARCHAR },
			{ "visualDesign", Types.BOOLEAN },
			{ "visualDesignCu", Types.BOOLEAN },
			{ "noticableConsumers", Types.BOOLEAN },
			{ "changePackaging", Types.BOOLEAN },
			{ "changeFormulation", Types.BOOLEAN },
			{ "visualDesignComplete", Types.TIMESTAMP },
			{ "artworkApproved", Types.TIMESTAMP },
			{ "separationFilesToPrinter", Types.TIMESTAMP },
			{ "marketDeployment", Types.TIMESTAMP },
			{ "shipToTrade", Types.TIMESTAMP },
			{ "designAgency", Types.BIGINT },
			{ "pmaUser", Types.BIGINT },
			{ "localMarketing", Types.BIGINT },
			{ "rndLocalDeployUser", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("jobId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("projectId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("jobType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("variant", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("format", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("visualDesign", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("visualDesignCu", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("noticableConsumers", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("changePackaging", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("changeFormulation", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("visualDesignComplete", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("artworkApproved", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("separationFilesToPrinter", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("marketDeployment", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("shipToTrade", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("designAgency", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("pmaUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("localMarketing", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("rndLocalDeployUser", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table Jobs_Jobs (uuid_ VARCHAR(75) null,jobId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,projectId LONG,jobType VARCHAR(75) null,variant VARCHAR(75) null,format VARCHAR(75) null,visualDesign BOOLEAN,visualDesignCu BOOLEAN,noticableConsumers BOOLEAN,changePackaging BOOLEAN,changeFormulation BOOLEAN,visualDesignComplete DATE null,artworkApproved DATE null,separationFilesToPrinter DATE null,marketDeployment DATE null,shipToTrade DATE null,designAgency LONG,pmaUser LONG,localMarketing LONG,rndLocalDeployUser LONG)";
	public static final String TABLE_SQL_DROP = "drop table Jobs_Jobs";
	public static final String ORDER_BY_JPQL = " ORDER BY jobs.jobId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Jobs_Jobs.jobId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.unilever.demo.cara.jobs.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.cara.jobs.model.Jobs"), true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.unilever.demo.cara.jobs.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.cara.jobs.model.Jobs"), true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.unilever.demo.cara.jobs.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.cara.jobs.model.Jobs"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long PROJECTID_COLUMN_BITMASK = 4L;
	public static final long UUID_COLUMN_BITMASK = 8L;
	public static final long JOBID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Jobs toModel(JobsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Jobs model = new JobsImpl();

		model.setUuid(soapModel.getUuid());
		model.setJobId(soapModel.getJobId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setProjectId(soapModel.getProjectId());
		model.setJobType(soapModel.getJobType());
		model.setVariant(soapModel.getVariant());
		model.setFormat(soapModel.getFormat());
		model.setVisualDesign(soapModel.getVisualDesign());
		model.setVisualDesignCu(soapModel.getVisualDesignCu());
		model.setNoticableConsumers(soapModel.getNoticableConsumers());
		model.setChangePackaging(soapModel.getChangePackaging());
		model.setChangeFormulation(soapModel.getChangeFormulation());
		model.setVisualDesignComplete(soapModel.getVisualDesignComplete());
		model.setArtworkApproved(soapModel.getArtworkApproved());
		model.setSeparationFilesToPrinter(soapModel.getSeparationFilesToPrinter());
		model.setMarketDeployment(soapModel.getMarketDeployment());
		model.setShipToTrade(soapModel.getShipToTrade());
		model.setDesignAgency(soapModel.getDesignAgency());
		model.setPmaUser(soapModel.getPmaUser());
		model.setLocalMarketing(soapModel.getLocalMarketing());
		model.setRndLocalDeployUser(soapModel.getRndLocalDeployUser());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Jobs> toModels(JobsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Jobs> models = new ArrayList<Jobs>(soapModels.length);

		for (JobsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.unilever.demo.cara.jobs.service.util.ServiceProps.get(
				"lock.expiration.time.cara.jobs.model.Jobs"));

	public JobsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _jobId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJobId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jobId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Jobs.class;
	}

	@Override
	public String getModelClassName() {
		return Jobs.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jobId", getJobId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("projectId", getProjectId());
		attributes.put("jobType", getJobType());
		attributes.put("variant", getVariant());
		attributes.put("format", getFormat());
		attributes.put("visualDesign", getVisualDesign());
		attributes.put("visualDesignCu", getVisualDesignCu());
		attributes.put("noticableConsumers", getNoticableConsumers());
		attributes.put("changePackaging", getChangePackaging());
		attributes.put("changeFormulation", getChangeFormulation());
		attributes.put("visualDesignComplete", getVisualDesignComplete());
		attributes.put("artworkApproved", getArtworkApproved());
		attributes.put("separationFilesToPrinter", getSeparationFilesToPrinter());
		attributes.put("marketDeployment", getMarketDeployment());
		attributes.put("shipToTrade", getShipToTrade());
		attributes.put("designAgency", getDesignAgency());
		attributes.put("pmaUser", getPmaUser());
		attributes.put("localMarketing", getLocalMarketing());
		attributes.put("rndLocalDeployUser", getRndLocalDeployUser());

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

		Long jobId = (Long)attributes.get("jobId");

		if (jobId != null) {
			setJobId(jobId);
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

		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		String jobType = (String)attributes.get("jobType");

		if (jobType != null) {
			setJobType(jobType);
		}

		String variant = (String)attributes.get("variant");

		if (variant != null) {
			setVariant(variant);
		}

		String format = (String)attributes.get("format");

		if (format != null) {
			setFormat(format);
		}

		Boolean visualDesign = (Boolean)attributes.get("visualDesign");

		if (visualDesign != null) {
			setVisualDesign(visualDesign);
		}

		Boolean visualDesignCu = (Boolean)attributes.get("visualDesignCu");

		if (visualDesignCu != null) {
			setVisualDesignCu(visualDesignCu);
		}

		Boolean noticableConsumers = (Boolean)attributes.get(
				"noticableConsumers");

		if (noticableConsumers != null) {
			setNoticableConsumers(noticableConsumers);
		}

		Boolean changePackaging = (Boolean)attributes.get("changePackaging");

		if (changePackaging != null) {
			setChangePackaging(changePackaging);
		}

		Boolean changeFormulation = (Boolean)attributes.get("changeFormulation");

		if (changeFormulation != null) {
			setChangeFormulation(changeFormulation);
		}

		Date visualDesignComplete = (Date)attributes.get("visualDesignComplete");

		if (visualDesignComplete != null) {
			setVisualDesignComplete(visualDesignComplete);
		}

		Date artworkApproved = (Date)attributes.get("artworkApproved");

		if (artworkApproved != null) {
			setArtworkApproved(artworkApproved);
		}

		Date separationFilesToPrinter = (Date)attributes.get(
				"separationFilesToPrinter");

		if (separationFilesToPrinter != null) {
			setSeparationFilesToPrinter(separationFilesToPrinter);
		}

		Date marketDeployment = (Date)attributes.get("marketDeployment");

		if (marketDeployment != null) {
			setMarketDeployment(marketDeployment);
		}

		Date shipToTrade = (Date)attributes.get("shipToTrade");

		if (shipToTrade != null) {
			setShipToTrade(shipToTrade);
		}

		Long designAgency = (Long)attributes.get("designAgency");

		if (designAgency != null) {
			setDesignAgency(designAgency);
		}

		Long pmaUser = (Long)attributes.get("pmaUser");

		if (pmaUser != null) {
			setPmaUser(pmaUser);
		}

		Long localMarketing = (Long)attributes.get("localMarketing");

		if (localMarketing != null) {
			setLocalMarketing(localMarketing);
		}

		Long rndLocalDeployUser = (Long)attributes.get("rndLocalDeployUser");

		if (rndLocalDeployUser != null) {
			setRndLocalDeployUser(rndLocalDeployUser);
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
	public long getJobId() {
		return _jobId;
	}

	@Override
	public void setJobId(long jobId) {
		_columnBitmask = -1L;

		_jobId = jobId;
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
	public long getProjectId() {
		return _projectId;
	}

	@Override
	public void setProjectId(long projectId) {
		_columnBitmask |= PROJECTID_COLUMN_BITMASK;

		if (!_setOriginalProjectId) {
			_setOriginalProjectId = true;

			_originalProjectId = _projectId;
		}

		_projectId = projectId;
	}

	public long getOriginalProjectId() {
		return _originalProjectId;
	}

	@JSON
	@Override
	public String getJobType() {
		if (_jobType == null) {
			return StringPool.BLANK;
		}
		else {
			return _jobType;
		}
	}

	@Override
	public void setJobType(String jobType) {
		_jobType = jobType;
	}

	@JSON
	@Override
	public String getVariant() {
		if (_variant == null) {
			return StringPool.BLANK;
		}
		else {
			return _variant;
		}
	}

	@Override
	public void setVariant(String variant) {
		_variant = variant;
	}

	@JSON
	@Override
	public String getFormat() {
		if (_format == null) {
			return StringPool.BLANK;
		}
		else {
			return _format;
		}
	}

	@Override
	public void setFormat(String format) {
		_format = format;
	}

	@JSON
	@Override
	public Boolean getVisualDesign() {
		return _visualDesign;
	}

	@Override
	public void setVisualDesign(Boolean visualDesign) {
		_visualDesign = visualDesign;
	}

	@JSON
	@Override
	public Boolean getVisualDesignCu() {
		return _visualDesignCu;
	}

	@Override
	public void setVisualDesignCu(Boolean visualDesignCu) {
		_visualDesignCu = visualDesignCu;
	}

	@JSON
	@Override
	public Boolean getNoticableConsumers() {
		return _noticableConsumers;
	}

	@Override
	public void setNoticableConsumers(Boolean noticableConsumers) {
		_noticableConsumers = noticableConsumers;
	}

	@JSON
	@Override
	public Boolean getChangePackaging() {
		return _changePackaging;
	}

	@Override
	public void setChangePackaging(Boolean changePackaging) {
		_changePackaging = changePackaging;
	}

	@JSON
	@Override
	public Boolean getChangeFormulation() {
		return _changeFormulation;
	}

	@Override
	public void setChangeFormulation(Boolean changeFormulation) {
		_changeFormulation = changeFormulation;
	}

	@JSON
	@Override
	public Date getVisualDesignComplete() {
		return _visualDesignComplete;
	}

	@Override
	public void setVisualDesignComplete(Date visualDesignComplete) {
		_visualDesignComplete = visualDesignComplete;
	}

	@JSON
	@Override
	public Date getArtworkApproved() {
		return _artworkApproved;
	}

	@Override
	public void setArtworkApproved(Date artworkApproved) {
		_artworkApproved = artworkApproved;
	}

	@JSON
	@Override
	public Date getSeparationFilesToPrinter() {
		return _separationFilesToPrinter;
	}

	@Override
	public void setSeparationFilesToPrinter(Date separationFilesToPrinter) {
		_separationFilesToPrinter = separationFilesToPrinter;
	}

	@JSON
	@Override
	public Date getMarketDeployment() {
		return _marketDeployment;
	}

	@Override
	public void setMarketDeployment(Date marketDeployment) {
		_marketDeployment = marketDeployment;
	}

	@JSON
	@Override
	public Date getShipToTrade() {
		return _shipToTrade;
	}

	@Override
	public void setShipToTrade(Date shipToTrade) {
		_shipToTrade = shipToTrade;
	}

	@JSON
	@Override
	public long getDesignAgency() {
		return _designAgency;
	}

	@Override
	public void setDesignAgency(long designAgency) {
		_designAgency = designAgency;
	}

	@JSON
	@Override
	public long getPmaUser() {
		return _pmaUser;
	}

	@Override
	public void setPmaUser(long pmaUser) {
		_pmaUser = pmaUser;
	}

	@JSON
	@Override
	public long getLocalMarketing() {
		return _localMarketing;
	}

	@Override
	public void setLocalMarketing(long localMarketing) {
		_localMarketing = localMarketing;
	}

	@JSON
	@Override
	public long getRndLocalDeployUser() {
		return _rndLocalDeployUser;
	}

	@Override
	public void setRndLocalDeployUser(long rndLocalDeployUser) {
		_rndLocalDeployUser = rndLocalDeployUser;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Jobs.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Jobs.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Jobs toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Jobs)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		JobsImpl jobsImpl = new JobsImpl();

		jobsImpl.setUuid(getUuid());
		jobsImpl.setJobId(getJobId());
		jobsImpl.setGroupId(getGroupId());
		jobsImpl.setCompanyId(getCompanyId());
		jobsImpl.setUserId(getUserId());
		jobsImpl.setUserName(getUserName());
		jobsImpl.setCreateDate(getCreateDate());
		jobsImpl.setModifiedDate(getModifiedDate());
		jobsImpl.setProjectId(getProjectId());
		jobsImpl.setJobType(getJobType());
		jobsImpl.setVariant(getVariant());
		jobsImpl.setFormat(getFormat());
		jobsImpl.setVisualDesign(getVisualDesign());
		jobsImpl.setVisualDesignCu(getVisualDesignCu());
		jobsImpl.setNoticableConsumers(getNoticableConsumers());
		jobsImpl.setChangePackaging(getChangePackaging());
		jobsImpl.setChangeFormulation(getChangeFormulation());
		jobsImpl.setVisualDesignComplete(getVisualDesignComplete());
		jobsImpl.setArtworkApproved(getArtworkApproved());
		jobsImpl.setSeparationFilesToPrinter(getSeparationFilesToPrinter());
		jobsImpl.setMarketDeployment(getMarketDeployment());
		jobsImpl.setShipToTrade(getShipToTrade());
		jobsImpl.setDesignAgency(getDesignAgency());
		jobsImpl.setPmaUser(getPmaUser());
		jobsImpl.setLocalMarketing(getLocalMarketing());
		jobsImpl.setRndLocalDeployUser(getRndLocalDeployUser());

		jobsImpl.resetOriginalValues();

		return jobsImpl;
	}

	@Override
	public int compareTo(Jobs jobs) {
		int value = 0;

		if (getJobId() < jobs.getJobId()) {
			value = -1;
		}
		else if (getJobId() > jobs.getJobId()) {
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

		if (!(obj instanceof Jobs)) {
			return false;
		}

		Jobs jobs = (Jobs)obj;

		long primaryKey = jobs.getPrimaryKey();

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
		JobsModelImpl jobsModelImpl = this;

		jobsModelImpl._originalUuid = jobsModelImpl._uuid;

		jobsModelImpl._originalGroupId = jobsModelImpl._groupId;

		jobsModelImpl._setOriginalGroupId = false;

		jobsModelImpl._originalCompanyId = jobsModelImpl._companyId;

		jobsModelImpl._setOriginalCompanyId = false;

		jobsModelImpl._setModifiedDate = false;

		jobsModelImpl._originalProjectId = jobsModelImpl._projectId;

		jobsModelImpl._setOriginalProjectId = false;

		jobsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Jobs> toCacheModel() {
		JobsCacheModel jobsCacheModel = new JobsCacheModel();

		jobsCacheModel.uuid = getUuid();

		String uuid = jobsCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			jobsCacheModel.uuid = null;
		}

		jobsCacheModel.jobId = getJobId();

		jobsCacheModel.groupId = getGroupId();

		jobsCacheModel.companyId = getCompanyId();

		jobsCacheModel.userId = getUserId();

		jobsCacheModel.userName = getUserName();

		String userName = jobsCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			jobsCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			jobsCacheModel.createDate = createDate.getTime();
		}
		else {
			jobsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			jobsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			jobsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		jobsCacheModel.projectId = getProjectId();

		jobsCacheModel.jobType = getJobType();

		String jobType = jobsCacheModel.jobType;

		if ((jobType != null) && (jobType.length() == 0)) {
			jobsCacheModel.jobType = null;
		}

		jobsCacheModel.variant = getVariant();

		String variant = jobsCacheModel.variant;

		if ((variant != null) && (variant.length() == 0)) {
			jobsCacheModel.variant = null;
		}

		jobsCacheModel.format = getFormat();

		String format = jobsCacheModel.format;

		if ((format != null) && (format.length() == 0)) {
			jobsCacheModel.format = null;
		}

		jobsCacheModel.visualDesign = getVisualDesign();

		jobsCacheModel.visualDesignCu = getVisualDesignCu();

		jobsCacheModel.noticableConsumers = getNoticableConsumers();

		jobsCacheModel.changePackaging = getChangePackaging();

		jobsCacheModel.changeFormulation = getChangeFormulation();

		Date visualDesignComplete = getVisualDesignComplete();

		if (visualDesignComplete != null) {
			jobsCacheModel.visualDesignComplete = visualDesignComplete.getTime();
		}
		else {
			jobsCacheModel.visualDesignComplete = Long.MIN_VALUE;
		}

		Date artworkApproved = getArtworkApproved();

		if (artworkApproved != null) {
			jobsCacheModel.artworkApproved = artworkApproved.getTime();
		}
		else {
			jobsCacheModel.artworkApproved = Long.MIN_VALUE;
		}

		Date separationFilesToPrinter = getSeparationFilesToPrinter();

		if (separationFilesToPrinter != null) {
			jobsCacheModel.separationFilesToPrinter = separationFilesToPrinter.getTime();
		}
		else {
			jobsCacheModel.separationFilesToPrinter = Long.MIN_VALUE;
		}

		Date marketDeployment = getMarketDeployment();

		if (marketDeployment != null) {
			jobsCacheModel.marketDeployment = marketDeployment.getTime();
		}
		else {
			jobsCacheModel.marketDeployment = Long.MIN_VALUE;
		}

		Date shipToTrade = getShipToTrade();

		if (shipToTrade != null) {
			jobsCacheModel.shipToTrade = shipToTrade.getTime();
		}
		else {
			jobsCacheModel.shipToTrade = Long.MIN_VALUE;
		}

		jobsCacheModel.designAgency = getDesignAgency();

		jobsCacheModel.pmaUser = getPmaUser();

		jobsCacheModel.localMarketing = getLocalMarketing();

		jobsCacheModel.rndLocalDeployUser = getRndLocalDeployUser();

		return jobsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", jobId=");
		sb.append(getJobId());
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
		sb.append(", projectId=");
		sb.append(getProjectId());
		sb.append(", jobType=");
		sb.append(getJobType());
		sb.append(", variant=");
		sb.append(getVariant());
		sb.append(", format=");
		sb.append(getFormat());
		sb.append(", visualDesign=");
		sb.append(getVisualDesign());
		sb.append(", visualDesignCu=");
		sb.append(getVisualDesignCu());
		sb.append(", noticableConsumers=");
		sb.append(getNoticableConsumers());
		sb.append(", changePackaging=");
		sb.append(getChangePackaging());
		sb.append(", changeFormulation=");
		sb.append(getChangeFormulation());
		sb.append(", visualDesignComplete=");
		sb.append(getVisualDesignComplete());
		sb.append(", artworkApproved=");
		sb.append(getArtworkApproved());
		sb.append(", separationFilesToPrinter=");
		sb.append(getSeparationFilesToPrinter());
		sb.append(", marketDeployment=");
		sb.append(getMarketDeployment());
		sb.append(", shipToTrade=");
		sb.append(getShipToTrade());
		sb.append(", designAgency=");
		sb.append(getDesignAgency());
		sb.append(", pmaUser=");
		sb.append(getPmaUser());
		sb.append(", localMarketing=");
		sb.append(getLocalMarketing());
		sb.append(", rndLocalDeployUser=");
		sb.append(getRndLocalDeployUser());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(82);

		sb.append("<model><model-name>");
		sb.append("cara.jobs.model.Jobs");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobId</column-name><column-value><![CDATA[");
		sb.append(getJobId());
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
			"<column><column-name>projectId</column-name><column-value><![CDATA[");
		sb.append(getProjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobType</column-name><column-value><![CDATA[");
		sb.append(getJobType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>variant</column-name><column-value><![CDATA[");
		sb.append(getVariant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>format</column-name><column-value><![CDATA[");
		sb.append(getFormat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visualDesign</column-name><column-value><![CDATA[");
		sb.append(getVisualDesign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visualDesignCu</column-name><column-value><![CDATA[");
		sb.append(getVisualDesignCu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noticableConsumers</column-name><column-value><![CDATA[");
		sb.append(getNoticableConsumers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>changePackaging</column-name><column-value><![CDATA[");
		sb.append(getChangePackaging());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>changeFormulation</column-name><column-value><![CDATA[");
		sb.append(getChangeFormulation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visualDesignComplete</column-name><column-value><![CDATA[");
		sb.append(getVisualDesignComplete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>artworkApproved</column-name><column-value><![CDATA[");
		sb.append(getArtworkApproved());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>separationFilesToPrinter</column-name><column-value><![CDATA[");
		sb.append(getSeparationFilesToPrinter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>marketDeployment</column-name><column-value><![CDATA[");
		sb.append(getMarketDeployment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipToTrade</column-name><column-value><![CDATA[");
		sb.append(getShipToTrade());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>designAgency</column-name><column-value><![CDATA[");
		sb.append(getDesignAgency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pmaUser</column-name><column-value><![CDATA[");
		sb.append(getPmaUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>localMarketing</column-name><column-value><![CDATA[");
		sb.append(getLocalMarketing());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rndLocalDeployUser</column-name><column-value><![CDATA[");
		sb.append(getRndLocalDeployUser());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Jobs.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Jobs.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _jobId;
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
	private long _projectId;
	private long _originalProjectId;
	private boolean _setOriginalProjectId;
	private String _jobType;
	private String _variant;
	private String _format;
	private Boolean _visualDesign;
	private Boolean _visualDesignCu;
	private Boolean _noticableConsumers;
	private Boolean _changePackaging;
	private Boolean _changeFormulation;
	private Date _visualDesignComplete;
	private Date _artworkApproved;
	private Date _separationFilesToPrinter;
	private Date _marketDeployment;
	private Date _shipToTrade;
	private long _designAgency;
	private long _pmaUser;
	private long _localMarketing;
	private long _rndLocalDeployUser;
	private long _columnBitmask;
	private Jobs _escapedModel;
}