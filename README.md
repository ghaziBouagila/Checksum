Pour tester l'exécution du projet, suivez ces étapes :

1. **Cloner le dépôt** :
   
   git clone https://github.com/ghaziBouagila/Checksum.git
   cd Checksum
   

2. **Construire les images Docker** :
   
   docker-compose build
  

3. **Démarrer les services** :
   
   docker-compose up
  

4. **Accéder à l'application** :
   Ouvrez votre navigateur web et allez à `http://localhost:8080` pour accéder à votre application Spring Boot.
   **Obtenir la liste des checksums :  **
        curl -X GET http://localhost:8080/checksums
    **Ajouter un nouveau checksum :**  
      curl -X POST "http://localhost:8080/checksum" -d "input=yourInputString" -d "algorithm=SHA-256"

6. **Accéder à la console H2** :
   Ouvrez votre navigateur web et allez à `http://localhost:8080/h2-console` pour accéder à la console de la base de données H2. Utilisez les identifiants suivants :
   - **JDBC URL** : `jdbc:h2:file:/app/data/todolist`
   - **Nom d'utilisateur** : `root`
   - **Mot de passe** : `password`

Ces étapes vous permettront de tester l'exécution de votre projet localement en utilisant Docker et Docker Compose.
