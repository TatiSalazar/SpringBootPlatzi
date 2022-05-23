# SpringBootPlatzi
Desarrollo del curso spring boot de platzi

# ¿Qué es Spring Boot?

* Proyecto basado en Spring. No es lo mismo que Spring. 
* Es un proyecto que forma parte del core de Spring, al igual que Spring Cloud, etc.
* El objetivo principal es que sólo te centres en correr la aplicación, sin preocuparte por temas de configuración, etc.
* Tiene la gran ventaja poder integrar librerías de terceros de manera muy sencilla.
* No tendremos que preocuparnos por configuraciones a nivel de XML, sólo configuraciones mínimas a nivel de properties (ponerle el puerto, etc).
* No tendremos que preocuparnos de desplegar nuestra aplicación en un servidor web local cuando queramos hacer pruebas, Spring Boot también contempla esto y lleva incorporado un servidor web dónde se desplegará nuestra aplicación automáticamente.

# Características principales de Spring Boot

**Independiente**: no tenemos que preocuparnos de las dependencias del core de Spring ni de la compilación de estas.
**Incrustado Tomcat, Jetty o Undertow:** Spring Boot trae consigo un servidor web como los tres mencionados donde podemos correr nuestra aplicación sin preocuparnos de generar un artefacto WAR o JAR y desplegarlo nosotros mismos.
**Proporción de dependencias**: no debemos preocuparnos por las configuraciones de depndencias de terceros o del core de Spring, Spring Boot se encargará de inyectar todo lo necesario.
**Sin generación de XML**: No debemos preocuparnos de configuración XML para que nuestra aplicación funcione.
**Métricas de salud del aplicativo:** podemos validar el estado de un servicio desplegado, sus dependencias, estado de memoria, magnitud de configuración, etc.

# ¿Qué es una dependencia?

Pequeña característica de un objeto especifico, que puede impactar de manera particular en el funcionamiento de una unidad.

**Alta cohesión:** Involucra que la entidad ejecute sus acciones sin involucrar otra clase o entidad.

**Bajo acoplamiento** Hablamos de acoplamiento bajo cuando existe una independencia entre los componentes entre si, por el contrario un alto acoplamiento es cuando tenemos varias dependencias relacionadas a un solo componente.

Entonces podemos afirmar que en la definición de un buen diseño de software se debe tener una ALTA COHESIÓN y un BAJO ACOPLAMIENTO.

# ¿Qué es inversión de control?
Se refiere a la transferencia del control del flujo de un programa a un contenedor o framework.
En un website o una app móvil el contenedor sería el usuario.
Los objetos que son administrados por el contenedor, spring boot los denomina beans. Un bean seria los objetos administrados por el usuario en un website.
* Desacoplamiento.
* Segregación de interfaces.
* Fácil testing.
* Mayor modularidad.

# ¿Qué es inyección de dependencias?
Patrón que utiliza inversión de control para utilizar las dependencias inicializadas con el contenedor Spring.

# Qué es un bean? 
Un bean básicamente son módulos desarrollados en Spring estos se encargan de brindarnos toda la lógica que necesitamos para nuestra aplicación.

# ¿QUE ES UNA ANOTACION EN SPRING BOOT?

Una Anotación es una forma de añadir metadatos al código fuente Java que están disponibles para la aplicación en tiempo de ejecución o de compilación. Es una alternativa mas sencilla al uso de XML.

# TIPOS DE ANOTACIONES

**@Controller:** Para indicar que esta será la clase que gestionara las peticiones del usuario por get, post, put, patch o delete.

**@Service:** Con esta notación especificamos que en esta clase se encontrara toda nuestra lógica de negocio, cálculos o llamadas a otras API externas.

**@Repository:** Se usa para las clases o interfaces que funcionaran con el acceso a la base de datos.

Si nuestra clase o interfaz no tiene una especificación clara como @Service, @Repository o @Controller, simplemente recurrimos a @Component y le indicamos que sencillamente es un componente.

Por otro lado, no es estrictamente necesario que cumplas con colocar una notación especifica, pero es una buena practica.

# Qué son los logs y cómo usarlos

Son una herramienta que nos permite debugear la información, es decir; saber por donde esta pasando la información, por cual método, cual clase y con que nivel de depuración lo queremos mostrar.

Para esto tenemos en Spring, la Liberia Apache Commons la cual tiene lo siguientes niveles de log:

* Error: Nos permite mostrar información cuando ocurre un error.

* Info: Nos muestra información muy general

* Debug: Este nos sirve para depurar por donde esta pasando la información a nivel de código fuente.

Otros, ver documentación:

Apache Commons - Apache Commons

# Que es JPA (Java Persistence API )
Especificacion de Java para acceder, conservar y administrar datos entre objetos o clases y una base de datos relacional.

# Programación funciona

* En el paradigma, un programa se considera una funcion matematica, la cual describe una relacion entre una entrada y una salida, y donde el concepto de estado de una variables se elimina completamente
* Fácil de combinar con la programacion orientada a objetos 
* Uso de listas como estructuras de datos funcionales. No hay bucles, solo vas a iterar arrays o listas.
* No existen los bucles "for" y "while", para su iteracion se usa la recursividad.
* Funciones como tipos de datos primitivos, expresiones lambda y funciones de orden superior.
## Beneficios
* Testing: Al tener el codigo mas granular, se facilita la ejecucion de pruebas.
* Legibilidad: Funciones mas explicitas en cuanto a lo que hacen y no en como lo hacen.
* Comportamientos mas definidos: los comportamientos son definidos a traves de funciones simples (siendo estas fdaciles de entender)
*  Concurrencia: es posible liberar muchos procesos simultaneos a partir de una sola funcion.
*  Menos manejo de estados: no nos preocupamos por la complejidad que puede agregar otros paradigmas de programacion como POO.

## Que es una funcion?
Una funcion es un tipo de dato que puede operar sobre un dato x y genera un valor y, igualmente por cada x siempre genera y. 
* Serie de pasos parametrizados
* Puede o no devolver un resultado
* Se puede definir, almacenr o declarar bajo demanda


