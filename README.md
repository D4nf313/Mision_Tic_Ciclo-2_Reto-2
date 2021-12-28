Mision_Tic_Ciclo-2_Reto-2


Empresa transportadora

Una empresa transportadora adquiere vehículos para uso particular y uso público, por lo que requiere mantener un inventario de todos vehículos con los que cuenta la empresa. El inventario se debe realizar con los datos básicos de cada carro como:  placas, color, carga máxima y número de pasajeros. Los datos solicitados dependen del tipo de vehículo (particular o público). A continuación, se muestra el diagrama de clases que define el esquema que se desea programar:




Se requiere entonces, realizar un programa en Java que implemente la situación descrita. El sistema debe operar a través de comando digitados en modo consola, con la siguiente estructura:

1&PUBLICO&SAA234&140&4&30T

Cada línea representa un comando a ejecutar.

Para este ejemplo la primera línea consta de dos partes (comando y datos del vehículo): el primer carácter 1 significa que se desea introducir un nuevo vehículo al inventario; los caracteres siguientes después del primer & PUBLICO, identifica el tipo de vehículo que se debe agregar que para este caso es Público. Los demás datos corresponden a las placas, la velocidad máxima, la cantidad de pasajeros que admite y la carga máxima expresada en toneladas.

La segunda línea solo tiene un dato (2), que significa que se desea obtener un listado de todos los vehículos que existan, en ese momento, en el inventario.

La tercera línea (3) significa que se desea dar por terminado el programa y salir del sistema.

Procesar Comandos

En la clase Inventario, se debe definir la función procesar comandos que realiza las siguientes operaciones:

Agregar vehículo: Opción 1

Se puede añadir un vehículo de tipo público con el siguiente comando:

1&PUBLICO&SAA234&140&4&10T

Ejemplo:

1&PUBLICO&SAA734&140&4&30T

Se puede añadir un vehículo de tipo particular con el siguiente comando:

1&PARTICULAR&AAC345&120&5&PLATA

Ejemplo:

1&PARTICULAR&LMC555&150&6&ROJO

Listar ítems del inventario: Opción 2

Con esta opción se muestra la totalidad del inventario.

Se debe mostrar en una línea la frase: “***Inventario de vehículos***”. En las siguientes líneas (una línea por cada vehículo) se debe listar cada vehículo que exista, en el orden en que fueron agregados al inventario.

Para listar los vehículos, al principio de cada línea de debe utilizar la secuencia de escape \t para que deje un espacio al principio de la línea.

A continuación, se muestra cómo debe quedar la impresión por pantalla:

***Inventario Vehículos***

            Vehículo Particular-Placa: ADB223 Velocidad: 180.0 Km/h Pasajeros: 4 Color: ROJO

            Vehículo Publico-Placa: SAB133 Velocidad: 150.0 Km/h Pasajeros: 4 Carga Máxima: 20
