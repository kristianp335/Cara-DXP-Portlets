create table Cara_project (
	uuid_ VARCHAR(75) null,
	projectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	projectRefId VARCHAR(75) null,
	projectName VARCHAR(75) null,
	projectType VARCHAR(75) null,
	brand VARCHAR(75) null,
	brandPosition VARCHAR(75) null,
	projectCategory VARCHAR(75) null,
	charterGateApproval DATE null,
	productDesignLock DATE null,
	contractGateApproval DATE null,
	marketReadyApproval DATE null,
	marketDeployment DATE null,
	shipToTrade DATE null,
	marketingUserId LONG,
	rndUserId LONG,
	rndProductUserId LONG,
	supplyChainUserId LONG,
	customerDevelopmentUserId LONG,
	techLeaderUserId LONG
);