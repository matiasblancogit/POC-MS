# Etapa de ejecución
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/api-gateway-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]


# Usar una imagen base con JDK 21
FROM eclipse-temurin:21-jdk

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el JAR compilado dentro del contenedor
COPY target/account-service-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que corre el servicio
EXPOSE 8082

# Comando para ejecutar el servicio
ENTRYPOINT ["java", "-jar", "app.jar"]