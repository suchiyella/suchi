pipeline {
    agent any
        stages {
        stage('build') {
            steps {
                echo "Build stage"
            }
        }
         stage('Suchi') {
            steps {
                println("Suchitra")
            }
        }
    }
}      
