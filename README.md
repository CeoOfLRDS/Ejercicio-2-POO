# Ejercicio-2-POO
Implementación de Clases y Diagrama UML.

## Estudiantes y Carné
 - Juan Miguel Cordon, 26342
 - Alvaro Elias Flores, 261868

## Análisis

### 1. ¿Qué propiedades y métodos tendrá cada clase?

#### Clase `Jugador`
* **Propiedades**:
  * `nombre`: Almacena el nombre completo del jugador.
  * `nickname`: Almacena el apodo o nombre de usuario del jugador.
  * `edad`: Almacena la edad del jugador.
  * `puntajes`: Arreglo de números enteros para almacenar los puntajes obtenidos en cada partida.
  * `cantidadPartidas`: Contador de la cantidad de partidas registradas actualmente.
  * `MAX_PARTIDAS`: Constante con el número máximo de partidas permitidas (10).
* **Métodos**:
  * `Jugador(nombre, nickname, edad)`: Constructor para inicializar un nuevo jugador.
  * `registrarPuntaje(puntaje)`: Registra un puntaje en la siguiente posición libre.
  * `modificarPuntaje(numeroPartida, nuevoPuntaje)`: Modifica el puntaje de una partida registrada previa.
  * `obtenerPuntaje(numeroPartida)`: Devuelve el puntaje obtenido en una partida específica.
  * `calcularPromedio()`: Calcula y retorna el promedio de las partidas registradas.
  * `obtenerMejorPuntaje()`: Devuelve el puntaje máximo registrado.
  * `obtenerPeorPuntaje()`: Devuelve el puntaje mínimo registrado.
  * `getCantidadPartidas()`: Devuelve la cantidad de partidas registradas.
  * `getPartidasDisponibles()`: Devuelve la cantidad de partidas que aún se pueden registrar.
  * `getNombre()`: Devuelve el nombre del jugador.
  * `getNickname()`: Devuelve el nickname del jugador.
  * `getEdad()`: Devuelve la edad del jugador.

#### Clase `Torneo`
* **Propiedades**:
  * `jugadorActivo`: Instancia del jugador que está compitiendo actualmente.
* **Métodos**:
  * `Torneo()`: Constructor para inicializar un torneo sin jugador activo.
  * `crearNuevoJugador(nombre, nickname, edad)`: Crea una nueva instancia de `Jugador` y la asigna como `jugadorActivo`.
  * `registrarPartida(puntaje)`: Delega el registro del puntaje al `jugadorActivo`.
  * `modificarPartida(partida, puntaje)`: Delega la modificación del puntaje al `jugadorActivo`.
  * `consultarPuntajePartida(partida)`: Obtiene el puntaje de una partida específica a través del `jugadorActivo`.
  * `obtenerPromedio()`: Retorna el promedio calculado por el `jugadorActivo`.
  * `obtenerMejor()`: Retorna el mejor puntaje obtenido por el `jugadorActivo`.
  * `obtenerPeor()`: Retorna el peor puntaje obtenido por el `jugadorActivo`.
  * `tieneJugadorActivo()`: Verifica si existe un jugador activo registrado.
  * `getJugadorActivo()`: Devuelve la referencia al `jugadorActivo`.

#### Clase `Main`
* **Métodos**:
  * `main(args)`: Punto de entrada del programa.
  * `mostrarMenu()`: Muestra las opciones disponibles en la consola y gestiona la interacción con el usuario.

---

### 2. ¿Qué tipo deben tener las propiedades y métodos de cada clase?

#### Clase `Jugador`
* **Propiedades**:
  * `nombre`: `String`
  * `nickname`: `String`
  * `edad`: `int`
  * `puntajes`: `int[]`
  * `cantidadPartidas`: `int`
  * `MAX_PARTIDAS`: `int`
* **Métodos**:
  * `Jugador(String, String, int)`: Constructor
  * `registrarPuntaje(int)`: `boolean`
  * `modificarPuntaje(int, int)`: `boolean`
  * `obtenerPuntaje(int)`: `int`
  * `calcularPromedio()`: `double`
  * `obtenerMejorPuntaje()`: `int`
  * `obtenerPeorPuntaje()`: `int`
  * `getCantidadPartidas()`: `int`
  * `getPartidasDisponibles()`: `int`
  * `getNombre()`: `String`
  * `getNickname()`: `String`
  * `getEdad()`: `int`

#### Clase `Torneo`
* **Propiedades**:
  * `jugadorActivo`: `Jugador`
* **Métodos**:
  * `Torneo()`: Constructor
  * `crearNuevoJugador(String, String, int)`: `void`
  * `registrarPartida(int)`: `boolean`
  * `modificarPartida(int, int)`: `boolean`
  * `consultarPuntajePartida(int)`: `int`
  * `obtenerPromedio()`: `double`
  * `obtenerMejor()`: `int`
  * `obtenerPeor()`: `int`
  * `tieneJugadorActivo()`: `boolean`
  * `getJugadorActivo()`: `Jugador`

#### Clase `Main`
* **Métodos**:
  * `main(String[])`: `void`
  * `mostrarMenu()`: `void`

---

### 3. ¿Cuál de las propiedades identificadas debe implementarse utilizando un arreglo? ¿Qué tipo de datos almacenará?

La propiedad **`puntajes`** de la clase `Jugador` debe implementarse utilizando un arreglo. Almacenará datos de tipo primario **`int`** (enteros), los cuales representan la puntuación de cada partida jugada (valores de 0 a 100).

---

### 4. ¿Cuáles deben ser los modificadores de visibilidad de los miembros en cada clase?

* **Atributos**: Todos los atributos de las clases (`Jugador` y `Torneo`) deben ser **privados (`-`)** para garantizar el principio de encapsulamiento.
* **Métodos y Constructores**: Todos los métodos y constructores deben ser **públicos (`+`)** para permitir la comunicación entre clases y la interacción desde el controlador principal (`Main`).

---

### 5. ¿Qué parámetros serán requeridos por los métodos en sus clases?

#### En la clase `Jugador`:
* `Jugador`: requiere `nombre` (`String`), `nickname` (`String`) y `edad` (`int`).
* `registrarPuntaje`: requiere `puntaje` (`int`).
* `modificarPuntaje`: requiere `numeroPartida` (`int`) y `nuevoPuntaje` (`int`).
* `obtenerPuntaje`: requiere `numeroPartida` (`int`).

#### En la clase `Torneo`:
* `crearNuevoJugador`: requiere `nombre` (`String`), `nickname` (`String`) y `edad` (`int`).
* `registrarPartida`: requiere `puntaje` (`int`).
* `modificarPartida`: requiere `partida` (`int`) y `puntaje` (`int`).
* `consultarPuntajePartida`: requiere `partida` (`int`).

#### En la clase `Main`:
* `main`: requiere el arreglo de argumentos de línea de comandos `args` (`String[]`).

*(Los demás métodos no requieren parámetros ya que operan sobre los datos almacenados en la propia instancia).*

---

### 6. ¿Cómo proveerá de valores iniciales a sus objetos? ¿Qué valores iniciales les asignará?

Se proveerán valores iniciales a través de los **constructores** de cada clase:

* **En `Jugador(String nombre, String nickname, int edad)`**:
  * `this.nombre`: asignado con el parámetro `nombre`.
  * `this.nickname`: asignado con el parámetro `nickname`.
  * `this.edad`: asignado con el parámetro `edad`.
  * `this.puntajes`: inicializado como un nuevo arreglo `new int[10]`.
  * `this.cantidadPartidas`: inicializado en `0`.
  * `MAX_PARTIDAS`: inicializado con la constante `10`.

* **En `Torneo()`**:
  * `this.jugadorActivo`: inicializado en `null` (o configurado mediante `crearNuevoJugador`).

---

### 7. ¿Cómo determinará cuál es la siguiente posición disponible dentro del arreglo?

Utilizando el atributo entero **`cantidadPartidas`**. Debido a que los arreglos en Java manejan índices base cero (desde `0` hasta `N-1`), el valor actual de `cantidadPartidas` representa exactamente el índice de la siguiente posición libre del arreglo `puntajes`. 

Por ejemplo, si `cantidadPartidas == 0`, la siguiente posición disponible es `puntajes[0]`. Al registrar el puntaje, se incrementa `cantidadPartidas++`, por lo que para el siguiente registro la posición libre será `puntajes[1]`.

---

### 8. ¿Cómo recorrerá únicamente las posiciones del arreglo que contienen puntajes registrados?

Se utilizará un bucle `for` cuyo límite superior esté determinado por el contador de partidas registradas (`cantidadPartidas`), en lugar de la capacidad total del arreglo (`puntajes.length`):

```java
for (int i = 0; i < cantidadPartidas; i++) {
    // Procesar únicamente puntajes[i]
}
