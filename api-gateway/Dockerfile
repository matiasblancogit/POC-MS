# Primera etapa: Construcción del JAR
FROM eclipse-temurin:21-jdk AS builder

RUN apt-get update && \
    apt-get install -y maven

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo pom.xml para descargar las dependencias
COPY pom.xml .

VOLUME /tmp

# Descarga las dependencias del proyecto
RUN mvn dependency:go-offline -B

# Copia el código fuente del proyecto
COPY src ./src

# Compila y empaqueta el proyecto
RUN mvn clean package -DskipTests



# Segunda etapa: Imagen final optimizada
FROM eclipse-temurin:21-jdk


# Copiar el JAR desde la etapa de construcción
COPY --from=builder /app/target/api-gateway-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto de la aplicación
EXPOSE 8081

# Comando de ejecución
ENTRYPOINT ["java", "-jar", "/app.jar"]



