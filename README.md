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

```
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

```
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

´´´
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
´´´