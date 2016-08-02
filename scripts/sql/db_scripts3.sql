insert into package (id, name) values (7, 'WMS Server');
insert into package (id, name) values (8, 'Open ADR');

insert into vendor_role_type (id, name) values (6, "Work Mgmt");
insert into interface (id, name, package_id, proxy_flag, required_flag, vendor_role_type_id) values (33, 'WMS(RequestWorkRequest)', 7, 0, 0, 6);
insert into interface (id, name, package_id, proxy_flag, required_flag, vendor_role_type_id) values (34, 'WMS(WorkRequest)', 7, 0, 0, 6);

insert into vendor_role_type (id, name) values (5, "OpenADR");
insert into interface (id, name, package_id, proxy_flag, required_flag, vendor_role_type_id) values (60, 'OpenADR(RequestEventState)', 8, 0, 0, 5);
insert into interface (id, name, package_id, proxy_flag, required_flag, vendor_role_type_id) values (61, 'ADR(EventStatePost)', 8, 0, 0, 5);

delete from packages_vendor_role_types where package_id in (6,7,8);
insert into packages_vendor_role_types(package_id,vendor_role_type_id) values (7,6);
insert into packages_vendor_role_types(package_id,vendor_role_type_id) values (8,5);

insert into package (id, name) values (9, 'Load Mgmt');
insert into vendor_role_type (id, name) values (7, "LM");
insert into interface (id, name, package_id, proxy_flag, required_flag, vendor_role_type_id) values (70, 'LM(RequestInitiate)', 9, 0, 0, 7);
insert into interface (id, name, package_id, proxy_flag, required_flag, vendor_role_type_id) values (71, 'LM(Initiate)', 9, 0, 0, 7);

