# **Programacion orrientada a objetos (POO)**

Java es un Lenguaje derivado de C, creado para enfocarse con la Programacion Orientada a Objetos (POO)
*Creado por: James Gosling*

# **¿Como funciona JAVA?**

El compilador devuelve un Bytecode (Codigo intermedio que esta semi-compilado), hacia el Java Virtual Machine, el cual interpreta las instrucciones del Bytecode y hace posible que sea ejeutado en cualquier plataforma (Linux, Windows, etc).

*En otras palabras, Java es un lenguaje intermedio*, se compila el codigo fuente si su sistaxis es correcta y lo trasforma a Bytecode.

Se utilian librerias, Variables(Locales o Globales), Procedimientos o Funciones
*Empaquetados* -> Package: Conjuntos de libreria (extension .war o .jar)
*Propiedades / Atributos* -> Similares a las variables globales (Las variables se encuentran dentro de los metodos) 
*Metodos*   -> Similar a las funciones

Java utiliza *Java Virtual Machine* como intermediario entre el lenguaje de maquina y lo que nosotros codificamos

    - Ambito -> Transforma las Propiedades en atributos

# ***UML (Lenguaje de Modelado Unificado)***

# **Estructura de Declaracion de Propiedades**

***Public int variable = 0***  -> Al momento de declarar es importante encerar int = 0, string = "", etc.

                Variable
                ↑ Nombre de la Propiedad: Siempre se usa camelCase y NO DEBE SER UN VERBO, nada de ( . / ñ / - ), que sea totalmete descriptiva (Nombre completa de la variable)

            int
            ↑ Tipo de Dato: Primitivos(Metodos) -> int, double, string, float, char, etc. (Aquellas variables que estan escritas con mayuscuas tienen mayores carateristicas: De Referencia -> Int, Double, Char)
            TODO MAYUSCULA unicamente para constantes

        Public
        ↑Ambito: Public, Private, Protected

Buenas Practicas
No comentarios -> Se permite la DOCUMENTACION dentro de los Metodos
README -> No es para explicar que hace el codigo, mas bien explica lo que hace el proyecto


# **Estructura de Metodos**

***Public void variable ( parametro/s ) {
    return TipodeDatoDevuelto
}***

                    (parametros/s)
                    ↑ Parametros: Variables con las que va a trabajar el Metodo

                Variable
                ↑ Nombre del Metodo: Siempre se usa camelCase y SIEMPRE DEBE SER UN VERBO (Infinitivo ar, er, ir), nada de ( . / ñ / - ), que sea totalmete descriptiva (Nombre completa de la variable)

            void
            ↑
            Tipo de Dato: En su mayoria se usa Void para aquellas que no regresen un valor, pero puede ser reemplazado por el tipo de dato con el que se trabaja

        Public
        ↑
        Ambito: Public, Private, Protected


***Tipos de Lenguaje:***
    
# *Compiladores:*
Se asegura que toda la sintaxis del codigo este bien escrita para compilar 
*Traduce todo el código fuente de un programa de una sola vez antes de la ejecución.*

    -Interpretes: Van compilando linea a linea hasta encontrar un error o el final del codigo
    -Intermdio:  