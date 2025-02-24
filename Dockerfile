# Etapa de Build
FROM eclipse-temurin:21-jdk AS buildstage 

WORKDIR /app

COPY pom.xml .  
COPY src /app/src  
COPY Wallet_QHKV1HXJX2PK6K3Q /app/wallet  

ENV TNS_ADMIN=/app/wallet  

# Compila el proyecto sin ejecutar pruebas
RUN apt-get update && apt-get install -y maven && mvn clean package -DskipTests=true

# Etapa Final (Runtime)
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copia solo el artefacto compilado
COPY --from=buildstage /app/target/backend_hospital-0.0.1-SNAPSHOT.jar /app/backend_hospital.jar

# Copia la Wallet de Oracle dentro del contenedor
COPY Wallet_QHKV1HXJX2PK6K3Q /app/wallet

# Definir la variable de entorno para Oracle Wallet
ENV TNS_ADMIN=/app/wallet  

# Expone el puerto del microservicio
EXPOSE 8085

# Ejecuta la aplicación
ENTRYPOINT [ "java", "-jar", "/app/backend_hospital.jar" ]
