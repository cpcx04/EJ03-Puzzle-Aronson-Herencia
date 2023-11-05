# Joined Inheritance
Este tipo de herencia se basa en el principio de que cada clase hija tenga su propia tabla, utilizando el ID del objeto padre.
Para aplicar este tipo de herencia debemos usar la anotación: @Inheritance(strategy = InheritanceType.JOINED)

Creamos la clase hija y las padres: 


![image](https://github.com/cpcx04/EJ03-Puzzle-Aronson-Herencia/assets/114216577/cbeb0b91-effd-46ac-afa9-742b2d8d754c)

![image](https://github.com/cpcx04/EJ03-Puzzle-Aronson-Herencia/assets/114216577/63db9219-28f8-4b93-8ee3-a7684cfc70f8)

![image](https://github.com/cpcx04/EJ03-Puzzle-Aronson-Herencia/assets/114216577/e4d11ec0-0109-42c2-9d97-5225a97f21d8)

A la hora de acceder a la base de datos veremos que se crea una Cuenta por cada Cuenta de débito o de crédito, y en las tablas de las entidades hijas se almacenan todos los datos mientras que en la tabla de la entidad padre solamente se almacenan los más generales. 


# Mapped Superclass