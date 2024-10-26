# Projet CRUD avec Spring Boot et Thymeleaf

Ce projet est une application Web CRUD (Créer, Lire, Mettre à jour, Supprimer) développée avec Spring Boot et Thymeleaf. Il permet de gérer des entités utilisateur avec des fonctionnalités de validation et de persistance des données.



## Fonctionnalités

- Inscription d'utilisateurs avec validation des champs
- Affichage de la liste des utilisateurs
- Mise à jour et suppression des utilisateurs
- Interface utilisateur simple avec Thymeleaf

## Technologies utilisées


- **Spring Boot** : Framework pour le développement d'applications Java
- **Thymeleaf** : Moteur de template pour le rendu des pages HTML
- **Spring Data JPA** : Gestion de la persistance des données
- **MySQL** : Base de données relationnelle

## Prérequis

Avant de commencer, assurez-vous d'avoir installé :

- Java 21
- Maven
- MySQL
  
##  Configuration

Modifiez le fichier src/main/resources/application.properties pour configurer votre connexion à la base de données MySQL :

spring.datasource.url=jdbc:mysql://localhost:3306/thymeleaf?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update


 ## Démonstration vidéo


https://github.com/user-attachments/assets/1f64cfc1-7cf3-4a8e-be9a-0e5568bb5d4a



