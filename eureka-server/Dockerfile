# Usar una imagen base con JDK 21
FROM eclipse-temurin:21-jdk

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el JAR compilado dentro del contenedor
COPY target/api-gateway-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que corre el servicio
EXPOSE 8761

# Comando para ejecutar el servicio
ENTRYPOINT ["java", "-jar", "app.jar"]