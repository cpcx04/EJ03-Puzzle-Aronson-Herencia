# Joined Inheritance
Este tipo de herencia se basa en el principio de que cada clase hija tenga su propia tabla, utilizando el ID del objeto padre.
Para aplicar este tipo de herencia debemos usar la anotación: @Inheritance(strategy = InheritanceType.JOINED)

Creamos la clase hija y las padres: 


![image](https://github.com/cpcx04/EJ03-Puzzle-Aronson-Herencia/assets/114216577/cbeb0b91-effd-46ac-afa9-742b2d8d754c)

![image](https://github.com/cpcx04/EJ03-Puzzle-Aronson-Herencia/assets/114216577/63db9219-28f8-4b93-8ee3-a7684cfc70f8)

![image](https://github.com/cpcx04/EJ03-Puzzle-Aronson-Herencia/assets/114216577/e4d11ec0-0109-42c2-9d97-5225a97f21d8)

A la hora de acceder a la base de datos veremos que se crea una Cuenta por cada Cuenta de débito o de crédito, y en las tablas de las entidades hijas se almacenan todos los datos mientras que en la tabla de la entidad padre solamente se almacenan los más generales. 


# Mapped Superclass
- `Nos permite crear clases base, de las cuales nuestras entidades pueden heredar distintas propiedades`
- `Desde la base de datos, es invisible. Las propiedades heredadas simplemente se copian a la tabla mapeada`
- `Nos va a permitir evitar la repetición de atributos y métodos que son compartidos por muchas entidades (ID, fechas de alta, etc.)`

Ejemplo:

```java
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

		@Id
		private Long dni;
		private String nombre;

}
```

Con esta Clase Persona nuestra clase Empleado, que hereda de la Clase Persona pasa de verse así:

```java
@Entity
@Table(name="Empleado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

		@Id
		@GeneratedValue
		private Long dni;

		@Column(name="nombre")
		private String nombre;

		@Column(name="company")
		private String company;
		

}
```

A verse así:

```java
@Entity
@Table(name="Empleado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado extends Persona{

		@Column(name="company")
		private String company;

}
```

# Single Table

En la herencia Single Table, todas las clases o entidades que participan en la jerarquía de herencia se representan en una sola tabla en la base de datos. Esta tabla contiene todas las columnas necesarias para representar los atributos de todas las clases en la jerarquía.

Para distinguir entre las diferentes clases en la tabla única, se suele agregar una columna llamada "tipo" o "discriminador" que indica el tipo de entidad representada por cada fila. Esta columna permite diferenciar los registros correspondientes a las diferentes clases y determinar cómo se deben interpretar los datos almacenados en las demás columnas.

Para completar esta herencia hemos decidido realizar una herencia entre el animal,ave y mamifero, teniendo en como clase padre Animal
Creamos las clase.

En este ejemplo de código Java, se muestra cómo implementar la herencia Single Table utilizando la biblioteca de persistencia de Jakarta (anteriormente conocida como Java Persistence API o JPA). La herencia Single Table se utiliza para modelar una jerarquía de clases en una base de datos relacional utilizando una única tabla.

## Clase Animal

La clase `Animal` es una clase abstracta que sirve como clase base para la jerarquía. Contiene atributos comunes a todas las entidades de la jerarquía, como `numPatas` y `numDientes`. Además, se utiliza la anotación `@Inheritance` para indicar que se utilizará la estrategia Single Table, y `@DiscriminatorColumn` para especificar la columna que se utilizará como discriminador de tipo.

```java
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Animal_type")
public abstract class Animal {
    // ...
}
```

## Clase Ave

La clase Ave es una subclase de Animal que representa un tipo específico de animal (ave). Se utiliza la anotación @DiscriminatorValue para indicar el valor del discriminador de tipo correspondiente a esta clase.
```java

@Entity
@DiscriminatorValue("Ave")
public class Ave extends Animal {
    // ...
}
```
## Clase Mamifero

La clase Mamifero es otra subclase de Animal que representa otro tipo de animal (mamífero). Al igual que en la clase Ave, se utiliza la anotación @DiscriminatorValue para especificar el valor del discriminador de tipo.
```java

@Entity
@DiscriminatorValue("Mamifero")
public class Mamifero extends Animal {
    // ...
}
```
En este ejemplo, todas las entidades de la jerarquía (Ave y Mamifero) se representan en la misma tabla de base de datos, con una columna adicional llamada Animal_type que indica el tipo de entidad correspondiente a cada registro.
