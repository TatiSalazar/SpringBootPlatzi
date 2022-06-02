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

# Funcion pura
Determinista (resultado predecible). Facil de probar. Su resultado será siempre el mismo al recibir siempre los mismos parametros. No dependen del contexto ,siempre generará el mismo resultado y no generará efectos secundarios, es decir no afectará datos de entrada ni otros datos relativos a otros flujos de datos. No dependen del estado del sistema.
// pura
	var checarEdad = function(edad) {
		var minimo = 18;
		return edad >= minimo;
		};

# Funcion impura
No determinista. Dependen del estado del sistema. Dependen de su contexto. Pueden generar efectos secuendarios, es decir, pueden afectar a otros flujos de datos o verse afectadas por otros flujos de datos subyacentes. No son predecibles.

var minimo = 18;
	var checarEdad = function(edad) {
		return edad >= minimo;
		};
    
En la impura, la var_mininmo es global, por lo tanto su estado puede cambiar(mutable), una misma entrada podría dar resultados distintos, dependiendo de su estado.

# Efecto secundario
Un efecto secundario es todo cambio observable desde fuera del sistema es un efecto secundario.
Los efectos secundarios son inevitables. Ejemplo:
* CRUD sobre archivos
* CRUD sobre una base de datos
* Enviar/Recibir una llamada de red
* Alterar un objeto/variable usada por otras funciones

Sin embargo, se deben reducir los efectos secundarios, porque ayuda a tener una mejor estructura del código (favoreciendo la generación de funciones puras, la modularidad y la testeabilidad).


# Función de orden mayor
* Toma otra funciona como parámetro.
* Retorna una función después de su ejecución

**Ventajas**
* Pasar comportamientos
* Compartir un medio de comunicación
* Compartir logica/reglas

  int foo ( Function param )
  
  retorna una función como resultado
  Function bar (int x)

# Funciones lambda
* Función: Tiene un nombre
* Lambda: Función que no tiene un nombre (anonima)

Parten de un concepto matemático de los años 30 
(Alonzo Church).
Obetener resultados a partir de funciones anónimas.
Son funciones anónimas

**¿Por que usarlas?**
Es un comportamiento de uso único
Una regla que solo se requiere en un lugar
Es una función extremadamente simple.
Una lambda sigue siendo una función.
Es una función muy simple (1 línea).
Es una regla que solo se requiere en un lugar.

**Inmutabilidad**
Inmutabilidad
Un objeto inmutable es aquel cuyo estado no se puede cambiar una vez construído.

 **Ventajas :**
* Una vez creado no se puede alterar.
* Facilidad para crear funciones puras.
* Facilidad para usar threads/concurrencia.
**Desventajas :**
* Cuando se necesecite alterar un datos, se requiere crear una nueva instancia por cada set modificado.
* Requiere especial atención al diseño.
* Los objetos mutables están fuera de nuestro alcance, porque se vuelven inpredecibles

## Predicate: 
Un Predicado es un interface funcional que define una condición que un objeto determinado debe cumplir.
recibe un dato y devuelve un boolean. 
Se invoca con test() 
Predicated<integer> ispar = x -> x % 2 == 0; 
ispar.test(5) //false 
ispar.test(6) // true

## Consumer: 
Es una expresion lambda que acepta un solo valor y no devuelven valor alguno.
Se utiliza para ejecutar la misma operación en un tipo de objeto especifico.
	Consumer -> Consumidor
	Consumer de alguien que RECIBE datos
Ejemplo: Una funcion que reciba una lista de archivos y borre cada uno de ellos, sin devolver nada.
	
Consumer<Student> saveProgressInDataBase = student -> db.updateStudent(student);

Supplier<String> randomPasswordGenerator = () -> complexAlgorithm.generate() ;
	
**Consumer y Supplier** es cuando mandas a llamar una lista de entidades de una tabla en BD. Con **Consumer**conviertes las entidades en DTOS y después lo invocas desde un **Supplier** para que éste genere la lista final.
	
## Supplier:
Es una expresion que no tienen parámetros pero devuelven un resultado.
Se utiliza para generar objetos de un tipo
	Supplier -> Proveedor
	Supplier es alguien que SUMINISTRA datos
Ejemplo: Se crea un supplier de tipo CLIArguments llamado generator que no recibe ni un parametro pero que crea un nuevo objeto CLIArguments y retorna generator, Se pueden crear archivos bajo demanda.

## UnaryOPerator
Solo se especifica un solo tipo de dato. Se entiende que tendrá como resultado el mismo tipo.

## BinaryOperator 
Solo se especifica un tipo de dato. Se entiende que tendrá 2 parámetros de entrada y el uno de retorno del mismo tipo de dato.

## Bifunction 
2 parámetros de entrada, se tiene que especificar el tipo de dato. Puede tener diferentes tipos de entradas como también diferente tipo de salida.

## SAM  -> Single Abstrab Method
Es una interfaz que tiene un solo método sin definir. 

## @FuctionalInterface
Una interfaz funcional es una interfaz que contiene solo un método abstracto. 
Solo pueden tener una funcionalidad para exhibir. Desde Java 8 en adelante, las expresiones lambda se pueden usar para representar la instancia de una interfaz funcional. Una interfaz funcional puede tener cualquier número de métodos predeterminados. Runnable, ActionListener, Comparable son algunos de los ejemplos de interfaces funcionales. Antes de Java 8, teníamos que crear objetos de clase internos anónimos o implementar estas interfaces.

La anotación se utiliza para garantizar que la interfaz funcional no pueda tener más de un método abstracto. En caso de que haya más de un método abstracto presente, el compilador marca un mensaje de 'anotación @FunctionalInterface inesperada'. Sin embargo, no es obligatorio utilizar esta anotación.
	
## Sintaxis de lambda
Si la lambda NO recibe argumentos:
** ( ) -> operación **
Si la lambda recibe 1 argumento:
**_argumento -> operación**
**( argumento ) -> operación_**
Si la lambda recibe mas de 1 argumento:
**( argumento1, argumento2) -> operación**
Si la lambda recibe varias operaciones:
**( ) -> { operacion1; return operación2; }
argumento -> { operacion1; return operacion2; }
( argumento ) -> { operacion1; return operacion2; }
( argumento1, argumento2) -> { operacion1; return operacion2 }**

Si la lambda tiene mas de una operación debemos retornar un valor mediante.
**return**

Pero si NO devuelve nada, solo hay que indicar el tipo de entrada vacío.

**( ) -> { operación }**

Para evitar errores es mejor usar
**( ) -> { operación }**
para cualquier caso.

## Stream
Se puede ver a un Stream como un iterador con esteroides, aumentado con el paradigma funcional. Por supuesto, esto es una forma muy básica de definirlo, pero al inicio facilita mucho imaginarlos de esta manera.
La clase Stream esta pensada para que las iteraciones o el procesamiento de los elementos sea un poco mas “dinamicos”.
	
En un for pones todas las operaciones dentro del for o escribes multiples for. En Stream cada operacion modifica el Stream y genera un nuevo Stream. Idealmente un Stream tiene nuevos elementos constantemente, por ello no puedes tener un metodo size() o un atributo/metodo length, pues no sabes cuantos elementos apareceran en el Stream. En teoria no puedes determinar cuando un Stream dejara de publicar elementos (idealmente). Sin embargo tienes la posibilidad de operara cada nuevo elemento que aparezca en el Stream.
	
**Algunos pros de tener un Stream:**

* Es mucho mas facil hacer operaciones en paralelo
* Es mas legible porque las operaciones son un poco mas explicitas (aunque depende del estilo de cada quien)
* Tienes operaciones ya predefinidas
* Hay muchas operaciones que son optimizadas en tiempo de compilacion
* Puedes convertir facilmente un Stream<A> en un Stream<B> usando los metodos ya existentes en Stream
* Puedes convertir facilmente muchas clases a Stream (por ejemplo, Collection#stream() )
* Al ser un tipo de dato puedes recibir o retornar Stream parcialmente operado:

public Stream<User> getUserNamesStream(){
	//Obtener los nombres de usuario
	return userNamesStream;
}
    
public Stream<String> getUserNamesByActiveStatus(Stream<String> users){
	return users.filter(User::isActive)
	.map(User::getUserName);
}

## Algunos contras:

* Cuando necesitas un dato final para mostrar o retornar algun dato final, tienes que convertir tu Stream
* No tienes forma directa de frenar o saltarte pasos de una iteracion de un Stream a diferencia de un for donde puedes usar break y continue
* Debes aprender la API de Stream
* Buscar errores puede ser un poco mas complicado

**Ejemplo**
Stream<String> coursesStream = Utils.getListOf("Java", "Node.js", "Kotlin").stream();

Stream<String> javaCoursesStream = coursesStream.filter(course -> course.contains("Java"));


// En realidad, es lo mismo que:

Stream<String> explicitOperationStream = coursesStream.filter(new Predicate<String>() {
    public boolean test(String st) {
        return st.contains("Java");
    }
});
	
* Consumer<T>: recibe un dato de tipo T y no genera ningún resultado
* Function<T,R>: toma un dato de tipo T y genera un resultado de tipo R
* Predicate<T>: toma un dato de tipo T y evalúa si el dato cumple una condición
* Supplier<T>: no recibe ningún dato, pero genera un dato de tipo T cada vez que es invocado
* UnaryOperator<T> recibe un dato de tipo T y genera un resultado de tipo T
	
public class PlatziStream<T> implements Stream {
    private List<T> data;

    public Stream<T> filter(Predicate<T> predicate) {
        List<T> filteredData = new LinkedList<>();
        for(T t : data){
            if(predicate.test(t)){
                filteredData.add(t);
            }
        }

        return filteredData.stream();
    }
}
## Operaciones
A estas funciones que reciben lambdas y se encargan de trabajar (operar) sobre los datos de un Stream generalmente se les conoce como Operaciones.
Existen dos tipos de operaciones: intermedias y finales.

Cada operación aplicada a un Stream hace que el Stream original ya no sea usable para más operaciones. Es importante recordar esto, pues tratar de agregar operaciones a un Stream que ya esta siendo procesado es un error muy común.

En este punto seguramente te parezcan familiares todas estas operaciones, pues vienen en forma de métodos de la interfaz Stream. Y es cierto. Aunque son métodos, se les considera operaciones, puesto que su intención es operar el Stream y, posterior a su trabajo, el Stream no puede volver a ser operado.

En clases posteriores hablaremos más a detalle sobre cómo identificar una operación terminal de una operación intermedia.

## Collectors
Una vez que has agregado operaciones a tu Stream de datos, lo más usual es que llegues a un punto donde ya no puedas trabajar con un Stream y necesites enviar tus datos en otro formato, por ejemplo, JSON o una List a base de datos.

Existe una interfaz única que combina todas las interfaces antes mencionadas y que tiene como única utilidad proveer de una operación para obtener todos los elementos de un Stream: Collector.

Collector<T, A, R> es una interfaz que tomará datos de tipo T del Stream, un tipo de dato mutable A, donde se iran agregando los elementos (mutable implica que podemos cambiar su contenido, como un LinkedList), y generara un resultado de tipo R.
	
public List<String> getJavaCourses(Stream<String> coursesStream) {
    List<String> javaCourses =
        coursesStream.filter(course -> course.contains("Java"))
            .collect(Collectors.toList());

    return javaCourses;
}

## Tipos de Retorno
La operación de findAny trata de encontrar cualquier elemento que cumpla con la condición del Predicate que le pasamos como parámetro. Sin embargo, la operación dice que se devuelve un Optional. 

## Paralelismo
A través del método .parallel() podremos poner a trabajar los demás procesadores de nuestro equipo para que compilen más rápido el Stream y esto va ser ideal cuanto se manejen grandes cantidades de datos.

