# @TEST Automation

Automatizacion de casos de pruebas en URL "https://www.falabella.com/falabella-cl/"

## Casos de prueba automatizados

- RegistrarUsuarioFallabella
- EliminarProductosCarrito
- HacerCompraPorCarrito

## Tecnologias usadas e instaladas

Este proyecto utiliza el patron POM (Page Object Model) con las siguientes tecnologias:

- Java - Lenguaje de programación orientado a objetos
- Cucumber - Framework para implementar BDD
- Gherkin - Lenguaje BDD basado en los criterios de aceptacion de las historias de usuario
- Junit - Ejecutor de pruebas 
- Selenium - Framework para interactuar con los diferentes navegadores
- Maven - Manejo de dependencias por medio de Maven Repository
- GitHub - Controlador de versiones

## Instalación

Descargar el repositorio de la siguiente URL "https://github.com/Thainer96/AutomationTest.git"
Ejecutar los siguientes comandos

```sh
git clone https://github.com/Thainer96/AutomationTest.git
git pull origin master
mvn clean install -U
```

## Plugins

Plugins necesarios para la ejecucion correcta de los test

| Plugin | 
| ------ | 
| Cucumber |

## Ejecución

Abrir el IDE "Eclipse" e importar el proyecto como maven project, entrar a la la siguiente ruta para la visualizacion de los test cases **/AutomatizacionGeneral/src/test/resources/feature/Test.feature**.
los casos de prueba se encuentran en este archivo con la notacion **@nombre caso prueba**
Ingresar a la siguiente ruta **/AutomatizacionGeneral/src/test/java/Runner/MyRunner.java**
Los casos de prueba a ejecutar se encuentrar dentro de la notacion **tags={@}**, si se desea ejecutar todos dejarlos, de lo contrario quitar los que no se quieran 
ejecutar.
En este archivo presionar clic derecho Run as // JUnit Test para su correcta ejecucion


#### Preguntas o Sugerencias
Estare muy atento de recibir retroalimentacion o responder alguna duda referente al proyecto que se podra realizar por medio de correo electronico **Thainer.perez@gmail.com**

## Autor

THAINER ANDRES FRANKLIN PEREZ - QA AUTOMATION

