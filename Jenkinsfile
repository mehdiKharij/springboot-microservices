pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Récupérer les dernières modifications du dépôt
                git branch: 'main', url: 'https://github.com/mehdiKharij/springboot-microservices.git'
            }
        }

        stage('Build Services') {
            parallel {
                stage('Run Service Discovery') {
                    steps {
                        dir('service-discovery') {
                            script {
                                // Compiler le service service-discovery
                                bat 'mvn spring-boot:run'
                            }
                        }
                    }
                }

                stage('Run Customer Service') {
                    steps {
                        dir('customer-service') {
                            script {
                                // Compiler le service customer
                                bat 'mvn spring-boot:run'
                            }
                        }
                    }
                }

                stage('Run Product Service') {
                    steps {
                        dir('product-service') {
                            script {
                                // Compiler le service product
                                bat 'mvn spring-boot:run'
                            }
                        }
                    }
                }

                stage('Run Gateway Service') {
                    steps {
                        dir('gateway-service') {
                            script {
                                // Compiler le service gateway
                                bat 'mvn spring-boot:run'
                            }
                        }
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
