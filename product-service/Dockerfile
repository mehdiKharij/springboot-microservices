# Étape 1 : Utiliser une image de base contenant Java
FROM openjdk:17-jdk-slim

# Étape 2 : Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Étape 3 : Copier le fichier JAR de l'application dans le conteneur
COPY target/*.jar app.jar

# Étape 4 : Exposer le port sur lequel l'application écoute
EXPOSE 8081

# Étape 5 : Définir la commande à exécuter lorsque le conteneur démarre
CMD ["java", "-jar", "app.jar"]