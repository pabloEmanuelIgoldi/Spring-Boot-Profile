# **Profile**

# Índice
### Definición breve sobre perfiles
### Proyecto
### Ambientes
### Comandos validos
### Archivo de configuración
### Índice de proyectos Spring

#  **Definición breve sobre perfiles**

Los Profiles en Spring Boot son un mecanismo poderoso que te permite definir diferentes configuraciones de tu aplicación para distintos entornos o escenarios.
Son esenciales para el despliegue en diferentes entornos sin modificar el código, haciendo tu aplicación más portable y fácil de configurar.
Las configuraciones especìficas se activan solo cuando ese perfil específico está activo. 


#  **Proyecto**

El presente proyecto contiene una configuración para ser ejecutada en tres ambientes distintos: desarrollo, testing y producción. 
Como es una demostración de perfiles, se trato de ser lo más conciso en el resto de la aplicación. 
Por ese motivo, solo se cambiará de ambiente a ambiente el puerto del servidor y el mensaje de respuesta del único controller.

## **Ambientes**
- Desarrollo:
http://localhost:8081
- Testing:
http://localhost:8082
- Producciòn:
http://localhost:8083


## **Comandos validos**

- Crea el artefacto con el Profile Activo por default(dev):

mvn clean package -DskipTests
- Crea el artefacto con el Profile Activo en dev:

mvn clean package -DskipTests -P dev
- Crea el artefacto con el Profile Activo en test:

mvn clean package -DskipTests -P test
- Crea el artefacto con el Profile Activo en prod:

mvn clean package -DskipTests -P prod



## **Archivo de configuración**

- Contiene la configuración comun de todos los ambientes:

application.properties
- Contiene la configuración del ambiente Desarrollo:

application-dev.properties
- Contiene la configuración del ambiente Testing:

application-test.properties
- Contiene la configuración del ambiente Produccion:

application-prod.properties


---
#  **Índice de proyectos Spring**
##  **Proyectos Spring Boot**
- [Response Uniforme](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Response-Wrapper)
- [LogBack](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Logback)
- [Profile](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Profile)
- [Spring Doc](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Swagger)
- [Validate](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Validate)
- [Inter-Service Communication](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Inter-Service-Communication)
##  **Proyectos Spring Data**
- [Spring Data + Redis(Cache)](https://github.com/pabloEmanuelIgoldi/Spring-Data-Redis)
