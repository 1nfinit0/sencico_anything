# Arquitectura cleinte - servidor

Son uno de lo modelos más utilizados en la implementación de sistemas de información en el que 
un conjunto de clientes hacen peticiones de información a servidores.

## Qué es un cliente?

Es el proceso u ordenador que realiza peticiones de servicios a otros ordenadores o procesos (servidor)

1. Cliente ligero:
    * El que hace peticiones a partir de un navegador
    * Tiene muy poca lógica del programa, las gestiones que se realizan se concentran en el servidor
    * Los procesos son realizados principalmente por el servidor

2. Cliente pesado:
    * Del que realiza peticiones a partir de programas como sig, google earth, etc
    * Realiza la mayor parte del procesamiento de datos
    * Los datos son almacenados en el servidor

## Qué es un servidor?

Procesa la repetición recibida del cliente y envía el resultado de vuelta al cliente. Es el que procesa
y responde a las solicitudes y requerimientos del cliente.

1. Características:
    * El servidor brinda servicio a múltiples clientes
    * El servidor presenta a todos sus clientes una interfaz única y bien definida
    * El cliente no necesita conocer la lógica del servidor ni el hardware ni el S.O.
    * Es posible repartir la cega de procesamiento entre el cliente y el servidor
    * Los cambios en el servidor implican pocos o ningún cambio en el cliente
    * La comunicación con el servidor es transparente para el usuario

## Arquitectura web

Se caracteriza (Para este caso) por ser una arquitectura cliente-servidor en el que
los clientes conocidos como navegador. 

### Servidor Web

Es un programa que implementa el protocolo HTTP para comunicarse con el usuario o con otras aplicaciones web, 
cuando el cliente haga una petición el servidor se encargará de devolver una página web o ejecutará un programa.

