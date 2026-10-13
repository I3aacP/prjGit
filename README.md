# **prjGit de programacion II**

Proyecto para aprender Git

    - git init
    - git add .
    - git commit -m "mensaje"                   -> Respaldo de lo add
    - git config user.name                      -> Verificar usuario
    - git config --global user.name "Nombre"    -> Editar usuario
    - git config user.email                     -> Verificar email
    - git config --global user.email EMAIL      -> Editar email
    - git branch -m main                        -> Cambiar el nombre de la rama maestra a main
    - git version
    - git help
    - git log                                   -> Se visualizan todos los commits hechos
    - git checkout nombreArchivo.extension      -> Se acualiza el archivo hasta el ultimo commit (SOLO EL ARCHIVO)
    - git diff                                  -> Se comparan archivos modificados
    - git log --decorate --oneline              -> Se visualiza el historial de commits iniciando con el codigo
    - git checkout #codigo                      -> Se actualiza TODOS LOS ARCHIVOS hasta la version del commit colocada
    - git tag NOMBREVERSION                     -> Va despues del commit, remarca la version tageandola
    - git brach NOMBRERAMA                      -> Se crea una rama (copiando la rama sobre la que se crea)
    - git switch NOMBRERAMA                     -> Se ubica en la rama deseada
    - git merge NOMBRERAMA                      -> Se incrusta la rama sobre la que se trabaja con main (Primero hay que ubicarse en main "git switch main")
    - git revert                                -> Regreso al ultimo commit que tengo


Push a Github de diferentes dueños
***Crear canal seguro***

    -Colocarse en directorio    -> cd 
    -Verificar directorio       -> pwd
    -mkdir .shh
    - en Bash                   -> $ ssh-keygen -t ed25

Git de Modificaciones (Estado)

    - U -> Sin seguimiento
    - A -> Añadido (anteriormente git add .)
    - M -> Modificado (anteriormente git add .)
    - ! -> Con error (No se puede realizar el merge)


Proyecto para aprender Linux

    - ls        -> ls -a
                -> ls -al (Archivos que se encuentran en el directorio)
    - cd        -> Ejemplo *cd d:/EPN* (Me voy a la carpeta EPN que esta en el disco d)
    - mkdir
    - rm
    - pwd       -> ¿Qué directorio me encuentro?
    - clear
    - cat       -> Imprimir en consola
    - cp
    - mv
    - rmdir

Comandos para BASH

    - echo "Mensaje" -> escribe en consola el Mensaje
    - echo "Mensaje" >> nombreArchivo.extension -> crea un archivo y escribe lo que se encentra en el mensaje
    - touch nombreArchivo.extension -> crea un archivo

Ramas de Github

    -feature    -> Mejoras Generales (Ejemplo: Login, Funciones, etc).
    -release    -> unión de feature's (Para versiones nuevas que tienen como destino main)
    -hotflix    -> Reparación de Errores (Para feature's con errores)
    -issue      -> Reparación de errores menos urgentes (Errores de compilacion - arreglables)