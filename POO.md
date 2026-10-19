## ***P.O.O.***

Conceptualizar el objeto a crear es importante

Objetos ->         Class 
            /                \
    Atributo/Propiedades    Métodos(Aciones/Verbos y Propiedades)

Todos los metodos tiene que tener un atributo bien definido

Todos los atributos deben cumplir tres requisito:

Ambito 
(Todos los objetos que estan al rededor pueden observarlo): + Public
(Solo el mismo puede observarse): - Private
(Solo ciertos objetos pueden observarlo): # Protected

Eventos: Metodos que pueden enviar y trasmitir mensajes

Directorio
Proyecto
    -Carpeta de Libreria
    -.bin 
    -doc (Documentacion / Requerimientos)
    - src (Solo aqui va a estar el codigo (CODIGO FUENTE))
        -app.java (Archivo de arranque para probar que java funcione)
            {static void main()} -> No se programa nada aqui 
        -package (Dominios)
            - Aqui todos los archivo .java
            - Aqui existira un archivo controller que controlara todos los archivos del paquete
            