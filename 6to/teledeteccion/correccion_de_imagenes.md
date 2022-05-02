<div style="align-items: justify">

#Corección de Imágenes

Para imágenes monocromáticas o en escala de grises:
* Inverse
* Reverse
* Crisp (Realce espacial)

##Transformación de Fourier

Prensenta más configuraciónes, la estructura de trabajo es la misma, sirve para:

- Análisis de distorsión de imagen compuesta.
- Análisis de distorsión por bandas.
- Generación de archivos de frecuencias.
- Edición de archivos de frecuencias.
- Tipos de filtros de enmascaramiento.
- Uso de máscara angular / circular.
- Inversión de frecuencias a imagen.
- Integración de bandas corregidas.
- Análisis de resultados.

Los Archivos de frecuencias no son imágenes en si pero tiene su propia forma de análisis

#### Análisis de Distorción de imágen compuesta
El efecto o presencia de bandeamiento cuando aparcen en la imágen multiespectral compuesta lineas blancas, pueden deberse a:
	* Problemas atmosféricos
	* Fallas del sensor al momento de la toma

De esta desprende:

#### Archivos de Frecuencia
Cuando uno aplica una técnica de frecuencia (Que se obtiene a partir de una imagenen original con bandeamiento) siempre los errores se van a presentar específicamente en el centro del archivo como un "haz" de luz, se denominan errores probables.
Además también tiene otras áreas donde se ven lineas de brillo
	Al dividir en cuatro cuadrantes el archivo de frecuencias cada cuadrante tiene su contraparte en el cuadrante diagonal opuesto. En primer lugar para el proceso solo se considera el haz que cruza el centro de lado a lado, el principal.
Se genera un archivo de frecuencia por banda, y se trabaja el enmascaramiento una por una
Los archivos de frencuencia se consideran editados cuando se ha pasado por el enmascaramientos. Existen filtros de enmascaramiento de archivos de frecuencia:
- Máscara angular
- Mascara Circular, que esta se aplica en la mascara angular posterior a su generación
Aplicado esto, se hace:
- Inversión de mascara angular, esta gracias a la composición
Finalmente se muestra la composición hecha que a diferencia de la anterior ya no cuenta con el problema de bandeo





</div>
