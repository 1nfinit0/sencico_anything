# Consideraciónes para la aplicación

## Intalación de anaconda

- Nota: Se asume que se tiene instalado python, un editor de código y postgresql.

* Se necesita trabajar en un ambiente anaconda para poder tener un mejor manejo de los paquetes y dependencias que se necesitará
para poder comenzar a trabajar, solo seguir los pasos: (Linux::terminal)

        wget https://repo.anaconda.com/archive/Anaconda3-2022.05-Linux-x86_64.sh

* Eso descargará un paquete de instalación hacia la ruta del directorio donde se encuentre, luego para instalar:

        sudo sh Anaconda3-2022.05-Linux-x86_64.sh
        (PRESIONA ENTER)
        (PRESIONA ENTER HASTA QUE PIDA QUE RESPONDAS ENTONCES)
        yes
        (ENTER)
        yes

- Cierras la terminal y la vuelves a abrir

* Una vez uinstalado la terminal por defecto se encontrará dentro de ambiente "base" antes de nada haremos algunas cosas dentro:

        conda install nb_conda_kernels
        conda install -c conda-forge mamba (este comando en particular demora un poco)
        conda deactivate
        conda config --set auto_activate_base false (con este comando evitamos que se active base automáticamente)

Mamba nos ayudará a manejar el ambiente de na manera más eficaz y también podrá traernos los paquetes sin error o demora

* Creamos nuestro el ambiente de trabajo

        conda create -n gis ipykernel
        y
        conda activate gis
        conda env export --from-history --file gis.yml
        conda deactivate
        conda env remove --name gis
        mamba env create --file gis.yml
        conda acivate gis

* Para instalar un paquete dentro del ambiente de trabajo:

        mamba install <nombre del paquete>
        y

Ahora tenemos nuestro ambiente de trabajo hecho con anaconda, mamba para python.
