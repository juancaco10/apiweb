# Usamos una imagen base de JDK 17
FROM openjdk:17-jdk-alpine

# Establecemos el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el archivo .jar generado a la imagen Docker
COPY target/datos-0.0.1-SNAPSHOT.jar app.jar

# Exponemos el puerto 8080 para que se pueda acceder desde fuera del contenedor
EXPOSE 8080

# Definimos el comando para ejecutar la aplicación cuando se inicie el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]
