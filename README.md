# Observables Y Medidas
This library made in Java contains the representation of complex numbers and the operations that can be performed between several complex numbers. There are also operations between complex number vectors and complex number matrices. It has a basic quantum theory implemented with functions that helps to understand the quantum mechanics. And test that are examples of observable and measuring exercises provided by the book of "Quantum Computing for computer scientist".

## Uso de la librería

### Si está usando maven

1. Agregue la siguiente dependencia en el POM de su proyecto:

```xml
<dependency>
	<groupId>edu.eci</groupId>
	<artifactId>ComplexNumbers</artifactId>
	<version>1.0-SNAPSHOT</version>
</dependency>
```

2. Vuelva a compilar su proyecto para que la dependencia sea descargada mediante:

> mvn compile<br>mvn package

### Si no está usando maven

1. Para usar la librería, se debe primero clonar el repositorio con el comando:

> git clone https://github.com/k26duran/calculadoraComplejos.git

1. Después se accede a la dirección donde el repositorio fue clonado y se ejecutan los siguientes comando:

> mvn compile<br>mvn package<br>mvn install

1. El último comando **mvn install** genera un archivo .jar que puede copiar y pegar en su proyecto para poder usar la librería.

## Pruebas

 ![](/img/pruebas.PNG)

## Prueba: Probabilidad de una particula en una posición

 ![](/img/pruebaProbabilidadParticula.PNG)



## Autor

*Karen Paola Durán Vivas*

*Estudiante de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito.*


## Licencia

> GNU GENERAL PUBLIC LICENSE - Version 3, 29 June 2007

Para ver más, leer el archivo **LICENSE** ubicado en la raíz de este repositorio.
