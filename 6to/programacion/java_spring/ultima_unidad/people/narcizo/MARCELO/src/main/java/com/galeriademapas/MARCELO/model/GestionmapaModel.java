package com.galeriademapas.MARCELO.model;

public class GestionmapaModel {

    private Long id;
    
    private String titulo;
    
    private String descripcion;

    private String dniResponsable;
    
    private String url;
    
    private String service;
    
    private String version;
    
    private String request;
    
    private String layers;
    
    private String styles;

    private Double longitudIzquierda;

    private Double latitudIzquierda;

    private Double longitudDerecha;
    
    private Double latitudDerecha;
    
    private Integer width;
    
    private Integer height;
    
    private String srs;
    
    private String format;
    
    //Aqui se debe colocar los campos requeridos por el usuario final
    
    private String urlcompleta;
    
    private String urlwfs;
    
    private String urlLegendGraphic;
    
	public GestionmapaModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(String dniResponsable) {
        this.dniResponsable = dniResponsable;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getLayers() {
        return layers;
    }

    public void setLayers(String layers) {
        this.layers = layers;
    }

    public String getStyles() {
        return styles;
    }

    public void setStyles(String styles) {
        this.styles = styles;
    }

    public Double getLongitudIzquierda() {
        return longitudIzquierda;
    }

    public void setLongitudIzquierda(Double longitudIzquierda) {
        this.longitudIzquierda = longitudIzquierda;
    }

    public Double getLatitudIzquierda() {
        return latitudIzquierda;
    }

    public void setLatitudIzquierda(Double latitudIzquierda) {
        this.latitudIzquierda = latitudIzquierda;
    }

    public Double getLongitudDerecha() {
        return longitudDerecha;
    }

    public void setLongitudDerecha(Double longitudDerecha) {
        this.longitudDerecha = longitudDerecha;
    }

    public Double getLatitudDerecha() {
        return latitudDerecha;
    }

    public void setLatitudDerecha(Double latitudDerecha) {
        this.latitudDerecha = latitudDerecha;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getSrs() {
        return srs;
    }

    public void setSrs(String srs) {
        this.srs = srs;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getUrlcompleta() {
        return urlcompleta;
    }

    public void setUrlcompleta(String urlcompleta) {
        this.urlcompleta = urlcompleta;
    }

    public String getUrlwfs() {
        return urlwfs;
    }

    public void setUrlwfs(String urlwfs) {
        this.urlwfs = urlwfs;
    }

    public String getUrlLegendGraphic() {
        return urlLegendGraphic;
    }

    public void setUrlLegendGraphic(String urlLegendGraphic) {
        this.urlLegendGraphic = urlLegendGraphic;
    }

    
    
}
