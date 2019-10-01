# Amazon Gateway y Lambda

# Laboratorio 1 - ARSW
## Empezando
Se debe de clonar el proyecto, para esto utilizaremos el comando git clone. ubíquese la carpeta a guardar el proyecto y escriba el siguiente comando en la terminal:
 
 ### git clone https://github.com/diego2097/AwsGatewayLambda.git
Una vez clonado, ubicarse en la carpeta del proyecto. al ingresar podra ejecutarlo de forma inmediata mediante el comando. 

```
mvn package
```
```
java -cp target/awsGatewayLambda-1.0-SNAPSHOT.jar edu.escuelaing.arep.SparkWebApp
```

Para ejecutar el jar simplemente 
```
java -jar awsGatewayLambda-1.0-SNAPSHOT.jar 
```

## Prerrequisitos
Se debe tener instalados los siguientes programas en nuestro sistema operativo: 
- Maven 
- Git
- Java
## Contenido 

Creacion de la maquina ec2

![alt text](https://github.com/diego2097/AwsGatewayLambda/blob/master/img/ec2.PNG "Ec2")

Creacion y configuracion del gateway 

![alt text](https://github.com/diego2097/AwsGatewayLambda/blob/master/img/gateway.PNG "Gateway")

Se configuro el puerto 8080 para permitir el trafico de informacion.

![alt text](https://github.com/diego2097/AwsGatewayLambda/blob/master/img/puerto.PNG "Puerto")

Se realizo la siguiente prueba funcional ingresando 5 a nuestro formulario

![alt text](https://github.com/diego2097/AwsGatewayLambda/blob/master/img/prueba-maquina.PNG "prueba1")


Podemos observar el resultado, despues de oprimir calcular

![alt text](https://github.com/diego2097/AwsGatewayLambda/blob/master/img/resultado.PNG "prueba2")


## Construido en
- Maven: Es una herramienta de software para la gestión y construcción de proyectos Java.

## Autor  
- Diego Alejandro Corredor Tolosa https://github.com/diego2097


## Licencia 
- GNU General Public License v3.0

