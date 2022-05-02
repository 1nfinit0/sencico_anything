CREATE SCHEMA sencico;
CREATE TABLE sencico.tinsurance(
    policyID integer not null primary key,
    statecode varchar,
    county varchar,
    eq_site_limit numeric,
    hu_site_limit numeric,
    fl_site_limit numeric,
    fr_site_limit numeric,
    tiv_2011 numeric,
    tiv_2012 numeric,
    eq_site_deductible numeric,
    hu_site_deductible numeric,
    fl_site_deductible numeric,
    fr_site_deductible numeric,
    point_latitude numeric,
    point_longitude numeric,
    line varchar,
    construction varchar,
    point_granularity numeric
);
