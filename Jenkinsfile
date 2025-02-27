pipeline {
    agent any



    stages {
        stage('Checkout') {
            steps {
                // Récupérer les dernières modifications du dépôt
                git branch: 'main', url: 'https://github.com/mehdiKharij/springboot-microservices.git'
            }
        }

        stage('Build Customer Service') {
            steps {
                dir('customer-service') {
                    script {
                        // Compiler le service customer
                         bat '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" clean install'
                    }
                }
            }
        }

        stage('Build Product Service') {
            steps {
                dir('product-service') {
                    script {
                        // Compiler le service product
                       bat '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" clean install'
                    }
                }
            }
        }

        stage('Build Service Discovery') {
            steps {
                dir('service-discovery') {
                    script {
                        // Compiler le service service-discovery
                        bat '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" clean install'
                    }
                }
            }
        }

        stage('Build Gateway Service') {
            steps {
                dir('gateway-service') {
                    script {
                        // Compiler le service gateway
                         bat '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" clean install'
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'Build successful for all services!'
        }
        failure {
            echo 'Build failed for one or more services!'
        }
    }
}
