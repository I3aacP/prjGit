# ***Sintaxis Basica de JAVA***

**Imprimir en pantalla**

    - System.out.println("Hola Mundo");     -> Se realiza un salto de linea y luego se imprime  
    - System.out.print("Hola Mundo");       -> No se realiza un salto de linea

**Leer de Consola**

Libreria -> Scanner

**Tipos de Datos**

Primitivos: Van todos con minuscula

    - byte, short, int, long, float, double, etc.

No Primitivos: Todas empiezan en mayusculas

    - String, Arrays, Classes, Enums y Records.

**Condicionales**

Estructura if - if else - else

    if(Condicion)
        El valor de verdad de la condicion determinara si el contenido del if se ejecuta o no.

    else if(Condicion)
        El antecedente else if determina una nueva condicion para complementar el caso

    else 
        El argumento else determmina todos aqellos casos en donde la o las condiciones anteriores no sean cumplidas. Hay que tener cuidado con el else, ya que abre la puerta issues y malas practicas como: la anidacion explotada de if (en lugar de usar la estructura switch).

Estructura switch - case - default - break

    switch (expresión) {
    case valor1:
        // Código a ejecutar si expresión == valor1
        break;
    case valor2:
        // Código a ejecutar si expresión == valor2
        break;
    default:
        // Código a ejecutar si no coincide con ningún caso
    }

**Metodos**: Un metodo es una funcion creada por el programador para llevar a cabo acciones repetitivas

    - Inputs: Parametros(λ) que va a usar el programa para funcionar 
    - Outputs: Salida o Tipo de dato que devuelve el programa una vez efectuada la funcion

*Estructura:* El metoodo unicamente reibe el mismo tipo de dato con el que fue declarada

      ↓Tipo de dato 
                    ↓ Conjunto de elementos
    
     void Licuar ( Fruta Banana ) {

        Estrutura de codigo 

        return valor;       -> Opcional si es void
    }

**Estructura Repetitivas (Bucles):**

-For: Perfecto para cuando se conce el numero de interaciones que se deben realiza, primero analiza una condicion y si se cumpe se muestra el bucle


            ↓ Inicializador
                    ↓ Condicion
                        ↓ Iterador

    - for ( i=0 ; i<5 ; i++ ){

        Estructura interna del bucle (Bloque de Codigo)

    }

- While: Cuando no se conoce cuantas iteraciones se van a realizar, primero se analiza la condicion y si se cumple ejecuta el bloque, una vez fializada la ejecucoion del codigo vuelve a analizar la condicion.

        Iniciador int i
        
        while ( Condicion ){

            Estructura interna del bucle (Bloque de Codigo)

            interador i++

        }

- Do While: Cuando no se conoce cuantas iteraciones se van a realizar, primero se ejecuta el bloque, una vez finalizada la ejecucion del codigo analiza la condicion.

        Iniciador int i

        do {

            Estructura interna del bucle (Bloque de Codigo)

            interador i++

        } while( Condicion ); 