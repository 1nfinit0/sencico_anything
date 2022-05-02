UPDATE sencico.tinsurance 
	SET geom = ST_SetSRID(ST_MakePoint(point_longitude,point_latitude),4326);
