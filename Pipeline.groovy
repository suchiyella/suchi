pipeline {
    agent any
        stages {
        stage('build') {
            steps {
                echo "Build stage"
            }
        }
         stage('clone') {
            steps {
                println("clone")
                git clone https://github.com/suchiyella/suchi.git
            }
        }
    }
}      
