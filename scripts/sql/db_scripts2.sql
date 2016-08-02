/*------------ ---------
// DROP EVERYTHING
//--------------------
*/

drop table EpriLog;
drop table vendor_role;
drop table vendor_role_type;
drop table interface;
drop table proxypath;
drop table package;



/*
// TODO:  create full list of app packages and interfaces

//-------------------------------------------
// EPRILOG
//
// Table logs all requests, their data and
// success or failure
//-------------------------------------------
*/


/** interface_id is foreign to interface.id */

/*
//-------------------------------------------
// PACKAGE
//
// Indicates the test document from which
// the tests were derived
//-------------------------------------------
*/

create table package (
id int(11) not null primary key,
name varchar(20)
);

/*-- unique index on name */
create unique index i_package_name on package(name); 

insert into package (id, name) values (1, 'Meter Connect');
insert into package (id, name) values (2, 'OnDemand Read');
insert into package (id, name) values (3, 'Scheduled Read');
insert into package (id, name) values (4, 'Meter Tamper');
insert into package (id, name) values (5, 'Outage Management');

/*

//-------------------------------------------
// VENDOR ROLE TYPE
//
// This table indicates which interface the
// vendor (entity testing their software against
// epriTest) is testing from their side
//-------------------------------------------
*/

create table vendor_role_type (
	id int(11) not null primary key,
	name varchar(10)
);

/*--TODO:  add constraint on names*/
insert into vendor_role_type (id, name) values (1, "CIS");
insert into vendor_role_type (id, name) values (2, "MDMS");
insert into vendor_role_type (id, name) values (3, "AMI");

/*
//-------------------------------------------
// VENDOR
// I STILL DO NOT UNDERSTAND WHAT SHOULD BE
// PUT IN THIS TABLE, AM USING NA
//-------------------------------------------
*/

create table vendor_role(
        id int(11)  not null auto_increment primary key,
	name varchar(10),
	vendor_role_type_id int(11) not null
);
alter table vendor_role
   add foreign key(vendor_role_type_id) references vendor_role_type(id);

/* Need a single vendor_role_type*/
insert into vendor_role (id, name,vendor_role_type_id) values (1, 'NA', 1);

/*---------------------------------------------
// INTERFACE
//
// Defines the tests that are to be run
//-------------------------------------------
*/

create table interface (
id int(11) not null primary key,
name varchar(40),
package_id int(11) not null,
proxy_flag int(1) default 0,
required_flag int(1) default 1,
vendor_role_type_id int(11) not null
);
/* unique index on name
/ names can repeated (and are in this case)
*/ 
create  index i_interface_name on interface(name); 

alter table interface
   add foreign key(package_id) references package(id);

alter table interface
   add foreign key(vendor_role_type_id) references vendor_role_type(id);

/* MeterConnect package, CIS, create disconnect req, required, can be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (1, 'Create(DisconnectRequest)', 1, 1, 1, 1);

/* MeterConnect package, CIS, hook to send service request reply, not required
/ cannot be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (2, 'Request Reply(MeterServiceRequest)', 1, 0, 0, 1);

/* MeterConnect package, CIS, hook to send Updated(MeterServiceRequest), 
// not required, cannot be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (3, 'Request Updated(MeterServiceRequest)', 1, 0, 0, 1);

/* all entries for MDM, MeterConnect package
// MeterConnect package, MDM, create disconnect req, required, can be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (4, 'Create(DisconnectRequest)', 1, 1, 1, 2);

/* MeterConnect package, MDM, reply disconnect req, not required, cannot be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (5, 'Request Reply(DisconnectRequest)', 1, 0, 0, 2);

/* MeterConnect package, MDM, create read req, required, can be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (6, 'Create(MeterReadings)', 1, 1, 1, 2);

/* MeterConnect package, MDM, reply meter readings req, not required, cannot be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (7, 'Request Reply(MeterReadings)', 1, 0, 0, 2);

/* MeterConnect package, MDM, Create meter readings req, not required, cannot be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (8, 'Request Create(MeterReadings)', 1, 0, 0, 2);

/* MeterConnect package, MDM, updated meter service request, required, can be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (9, 'Updated(MeterServiceRequest)', 1, 1, 1, 2);

/* MeterConnect package, AMI, create disconnect req, required, can be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (10, 'Request Create(DisconnectRequest)', 1, 0, 0, 3);

/* MeterConnect package, AMI, reply disconnect req, not required, cannot be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (11, 'Reply(DisconnectRequest)', 1, 1, 1, 3);

/* MeterConnect package, AMI, create read req, required, can be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (12, 'Request Create(MeterReadings)', 1, 0, 0, 3);

/* MeterConnect package, AMI, reply meter readings req, not required, can be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (13, 'Reply(MeterReadings)', 1, 1, 1, 3);

/* MeterConnect package, AMI, Create meter readings req, not required, can be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (14, 'Create(MeterReadings)', 1, 1, 1, 3);

/*     CIS
/ MeterOnDemand package, CIS, Get meter readings, required, can be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (15, 'Get(MeterReading)', 2, 1, 1, 1);

/* MeterOnDemand package, CIS, Reply Get meter readings, not required, cannot be proxied
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (16, 'Request Reply(MeterReading)', 2, 0, 0, 1);

     MDM
*/

/* MeterOnDemand package, MDM, Get meter readings, required, can be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (17, 'Get(MeterReading) 3', 2, 1, 1, 2);

/* MeterOnDemand package, MDM, Get meter readings, not required, cannot be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (18, 'Request Get(MeterReading) 1,7', 2, 0, 0, 2);

/* assumes that the get request from CIS call is the same regardless of whether
/ or not an AMI headend is involved
*/

/* MeterOnDemand package, MDM, reply meter readings, required, can be proxied*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (19, 'Reply(MeterReading) 2,8', 2, 1, 1, 2);

/* MeterOnDemand package, MDM, reply meter readings, not required, cannot be proxied*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (20, 'Reply(MeterReading) 4', 2, 0, 0, 2);

/*      AMI */
/* MeterOnDemand package, AMI, get meter readings, not required, cannot be proxied
*/
insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (21, 'Request Get(MeterReading) 3', 2, 0, 0, 3);

insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (22, 'Reply(MeterReading) 4', 2, 1, 1, 3);

insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (23, 'Create(EndDeviceControls)', 1, 1, 1, 3);

insert into interface(id,name,package_id,proxy_flag, required_flag, vendor_role_type_id) 
   values (24, 'Reply(EndDeviceControls)', 1, 1, 1, 3);
/*//-------------------------------------------
// PROXY 
//
// Allows for proxying calls to another location
//
// there will be at most one proxy for any interface
// separate table not needed?
//-------------------------------------------
*/

create table proxy_interface (
   id int not null auto_increment primary key,
   interface_id int(11),
   proxy_url varchar(512)
);

/* foreign key interface_id*/
alter table proxy_interface
   add foreign key(interface_id) references interface(id);

create table EpriLog (
 id            int(11)  not null auto_increment primary key,
 address       longtext,
 contentType   varchar(255),
 create_date   datetime, 
 data          varchar(255),
 encoding      varchar(255),
 faultCode     longtext,
 header        longtext,
 httpMethod    longtext,
 message       varchar(255),
 messageId     varchar(255),
 operation     varchar(255),
 payload       longtext,
 responseCode  longtext,
 resultCode    varchar(255),
 INTERFACE_ID  int(11),
 stage varchar(50)
);

alter table EpriLog
   add foreign key(interface_id) references interface(id);

