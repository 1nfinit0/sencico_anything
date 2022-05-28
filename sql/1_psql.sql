/*
Primeros pasos en la terminal interactiva de postgresql
Autor: Luis Huatay
Mayo 2022
*/

-- Luego de instalar postgresql (terminal) primera vez:

/*
Para poder usar postgresql es una buena práctica la primera vez que nos logueamos como root
cambiar la contraseña de root y crear un nuevo rol que será nuestro usuario para poder hacer
todas las consultas que queramos para eso desde terminal:

    > sudo -u postgres psql
    > alter user postgres with password 'contraseñaderoot';
    ALTER ROLE
    > create user nombredeusuario with password 'contraseñadeusuario';
    CREATE ROLE
    > alter user nombredelusuario with superuser;
    ALTER ROLE
    > \q

Con eso ahora solo queda editar las configuraciónes para que postgres permita este tipo 
de logue por socket unix: En terminal:

    > cd /etc/postgresql/12/main/
    > sudo vim pg_hba.conf

Editar lo siguiente:

    local   all             postgres                                peer

    POR

    local   all             postgres                                md5

(creo que era en dos líneas de ese archivo, primero en "all" y luego en "local")
Por último reiniciar el servidor de base de datos:

    sudo service postgresql restart

También se puede usar:

    sudo service postgresql stop
    sudo service postgres start
    sudo postgreql status
*/

/*
Para loguearse en psql:

    > psql -d postgres -U nombreusuario -W

donde postgres es el nombre de la base de datos default o de bienvenida,
-U es flag para usuario
-W es flag para password
Usar el rol creado anteriormente (buenas prácticas)
*/

-- listar las bases de datos:

\l

-- listar roles o usuarios

\du

-- conectarse a una base de datos:

\c postgres

-- listar los esquemas

\dn

-- listar las extensiones (de la base de datos actual)

\dx

-- listar tablas (current database)

\dt

-- imprimir el usuario actual (versión db de whoami)

SELECT current_user;

/*
    Listar sesiones activas  en una determinada base de datos
    (no colocar el where si se quiere ver todas las sesion incluidas la del gestor)
*/

SELECT datid, pid, usename, datname FROM pg_stat_activity WHERE datname = 'postgres';

/*
A partir de este archivo comenzaré haciendo,uso de solo ficheros sql, en consola para ejecutar
estos mismos lo siguiente:

Ejecutar este u otro fichero (no hacerlo porque crea un bucle infinito XD,
si no hiciste cancela el bucle con ctl + z o ctl + c)

*/

\i 1_psql.sql

-- salir de psql

\q