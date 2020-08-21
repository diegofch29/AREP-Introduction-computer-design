# Introduction Computer Design
En esta mini aplicación se usan listas encadenadas (diseño propio) para calcular el valor del promedio y la desvición en un conjunto de numero reales que sera recibids mediante una aplicacion web que los procesara y devolvera el resultado, tambien se deplegara en heroku.

## Prerequisitos

Para usar la aplicación necesitara lo siguiente:

* maven
* jdk
* git


## Descargando y ejecutando
### Descarga
Para descargar la aplicación solo tiene que usar la siguiente linea.

```
git clone https://github.com/diegofch29/AREP-Introduction-computer-design
```
### Utilizado la aplicación
  Para usar la aplicación debe seguir los siguientes pasos
  *Compilar el codigo debe estar ubicado en la carpeta "/AREP-Introduction-computer-design/" y el siguiente comando.
  ```
  mvn compile
  ```
  *Para ejecutar el codigo utilice la siguiente linea, puede cambiar los numero como desee siempre y cuando los numeros esten separados por espacios.
  ```
  java $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arem.SparkWebApp
  ```
  ![Ejemplo](/imagenes/Ejemplo_Ejecucion.png)
  ## pruebas
  Para correr las pruebas use la siguiente linea y deberia ver como resulta algo parecido a la imagen.
  ```
  mvn test
  ```
  ![Pruebas](/imagenes/Pruebas.png)
  
  ## Detalles
  * **LinkedListNextTest** : La lista deberia poder recorrerce correctamente usando next (el ultimo elemento al no tener ningun elemento asocidado a next retornara null para inidicar el final de la lista).
  * **LinkedListPreviusTest** : La lista deberia poder recorrece tambien en "reversa" es decir del ultimo elemento al primero ( cuando llegue al primer elemento  se encontrara con que no tiene nada adelante de el por lo que se encontrara con un null).
  * **mean1Test y mean2Test** : Deberia calcular el promedio correctamente.
  * **deviation1Test y deviation2Test** : deberia calcular la desviaci+on correctamente.
  
## Construido con
* [Maven](https://maven.apache.org/) : Herramienta encargada de la construcción del proyecto y el manejo de dependencias
* [Spark](https://spark.apache.org/docs/0.9.1/java-programming-guide.html) : Framwework para desarrollo de aplicaciones web
* [Git](https://git-scm.com/) : Sistema de control de versiones.
* [CircleCI](https://circleci.com/) : Integración contínua [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/diegofch29/AREP-Introduction-computer-design)
* [Heroku](https://dashboard.heroku.com/apps) : Despliegue contínuo. [![Heroku](https://www.herokucdn.com/deploy/button.png)](https://immense-island-41005.herokuapp.com/inputdata) 
* Java : Lenguaje de Programación.

# Autor

* **Diego Fernando Chinchilla Bautista** - *Introdution computer design* - [Diegofch29](https://github.com/diegofch29)

## Licencia

Este proyecto está licenciado bajo la licencia del GNU - Vea el [LICENSE.txt](LICENSE.txt) para más detalles

Proyecto
https://immense-island-41005.herokuapp.com/inputdata
