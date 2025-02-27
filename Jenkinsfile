pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/mehdiKharij/springboot-microservices.git'
            }
        }

        stage('Build Services') {
            parallel {
                stage('Build Service Discovery') {
                    steps {
                        dir('service-discovery') {
                            bat 'mvn clean install'
                        }
                    }
                }

                stage('Build Customer Service') {
                    steps {
                        dir('customer-service') {
                            bat 'mvn clean install'
                        }
                    }
                }

                stage('Build Product Service') {
                    steps {
                        dir('product-service') {
                            bat 'mvn clean install'
                        }
                    }
                }

                stage('Build Gateway Service') {
                    steps {
                        dir('gateway-service') {
                            bat 'mvn clean install'
                        }
                    }
                }
            }
        }

        stage('Run Services') {
            parallel {
                stage('Run Service Discovery') {
                    steps {
                        dir('service-discovery') {
                            bat 'start cmd /c mvn spring-boot:run'
                        }
                    }
                }

                stage('Run Customer Service') {
                    steps {
                        dir('customer-service') {
                            bat 'start cmd /c mvn spring-boot:run'
                        }
                    }
                }

                stage('Run Product Service') {
                    steps {
                        dir('product-service') {
                            bat 'start cmd /c mvn spring-boot:run'
                        }
                    }
                }

                stage('Run Gateway Service') {
                    steps {
                        dir('gateway-service') {
                            bat 'start cmd /c mvn spring-boot:run'
                        }
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'All services built and started successfully!'
        }
        failure {
            echo 'Build or startup failed for one or more services!'
        }
    }
}
