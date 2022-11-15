# Java 2022 - Módulo VII

### Programa
Uso de Maven. JSON. Persistencia de datos. JDBC.

### Uso de Maven
https://www.javiergarzas.com/2014/06/maven-en-10-min.html

### JSON
JSON es el acrónimo para JavaScript Object Notation, y aunque su nombre lo diga, no es necesariamente parte de
JavaScript, de hecho es un estándar basado en texto plano para el intercambio de información, por lo que se usa en
muchos sistemas que requieren mostrar o enviar información para ser interpretada por otros sistemas, la ventaja de JSON
al ser un formato que es independiente de cualquier lenguaje de programación, es que los servicios que comparten
información por éste método, no necesitan hablar el mismo idioma, es decir, el emisor puede ser Java y el receptor PHP,
cada lenguaje tiene su propia librería para codificar y decodificar cadenas de JSON.

#### ¿Cómo se forma una cadena de JSON?

El principio básico es con pares atributo-valor, éstos deben estar encerrados entre llaves { , } que es lo que
definen el inicio y el fin del objeto.

Para entender ésto de mejor forma, vamos a formar un objeto JSON para los datos de una persona:

    //Ejemplo de JSON para un objeto tipo Persona
    {
     "nombre":"Juan Vates",
     "edad":27,
     "nacionalidad":"Argentino",
     "altura":"172 cm",
     "peso":75,
     "casado":true
     }

JSON también puede almacenar arreglos y otros objetos:

    //Ejemplo de JSON para un objeto tipo Persona
    {
        "nombre":"Juan Vates",
        "edad":27,
        "nacionalidad":"Argentino",
        "altura":"172 cm",
        "peso":75,
        "casado":true,
        "cursosRealizados": ["matematica", "Golang", "Php"],
        "hijo": {
                    "nombre":"Pedro",
                    "edad": 12
                }
    }

Por último, si tuviera mas de un hijo deberiamos declarar un arreglo de objetos hijo

    {
         "nombre":"Juan Vates",
         "edad":27,
         "nacionalidad":"Argentino",
         "altura":"172 cm",
         "peso":75,
         "casado":true,
         "CursosRealizados": ["matematica", "Golang", "Php"],
         "hijos": [{
                        "nombre":"Pedro",
                        "edad": 12
                    },
                    {
                        "nombre":"Ana",
                        "edad": 24
                    }]
    }

# JDBC
*¿Qué es JDBC?* JDBC es el API para la ejecución de sentencias SQL. (Como punto de interés JDBC es una marca registrada y no un acrónimo, no obstante a menudo es conocido como “Java Database Connectivity”).  Consiste en un conjunto de clases e interfases escritas en el lenguaje de programación Java. JDBC suministra un API estándar para los desarrolladores y hace posible escribir aplicaciones de base de datos usando un API puro Java. Usando JDBC es fácil enviar sentencias SQL virtualmente a cualquier sistema de base de datos. En otras palabras, con el API JDBC, no es necesario escribir un programa que acceda a una base de datos Sybase, otro para acceder a Oracle y otro para acceder a Informix. Un único programa escrito usando el API JDBC y el programa será capaz de enviar sentencias SQL a la base de datos apropiada. Y, con una aplicación escrita en el lenguaje de programación Java, tampoco es necesario escribir diferentes aplicaciones para ejecutar en diferentes plataformas. La combinación de Java y JDBC permite al programador escribir una sola vez y ejecutarlo en cualquier entorno.

*¿Qué hace JDBC?* Simplemente JDBC hace posible estas tres cosas:
- Establece    una    conexión    con la base de datos.
- Envía sentencias SQL
- Procesa los resultados.

# Persistencia de datos
H2 Database: https://www.h2database.com/html/main.html
Vamos a utilizar el ejemplo de esta web: https://www.tutorialspoint.com/h2_database/h2_database_jdbc_connection.htm