pipeline {
    agent {
        label 'podman'
    }
    stages {
        stage('podman build') {
            steps {
                sh 'podman build --build-arg JAR_FILE=helloworld.jar -t swrasdevops1.swmed.org:8888/helloworld:v1 .'
            }    
        }
    }
}