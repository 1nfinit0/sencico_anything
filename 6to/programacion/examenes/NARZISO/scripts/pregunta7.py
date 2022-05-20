import geopandas as gpd
from sqlalchemy import create_engine

db_connection_url = "postgresql://postgres:postgres@localhost:5432/unid2"
engine = create_engine(db_connection_url)
gdf = gpd.read_file("C:\examen\shp\descarga\geodir_ubigeo_inei.shp")
gdf = gdf.to_crs("EPSG:4326")

gdf.columns = ['ubigeo','distrito','provincia','departamento','poblacion','superficie','geometry']
print(gdf.dtypes)

esquema="esta"
tabla="geodir_ubigeo_inei"
