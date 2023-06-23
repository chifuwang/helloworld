pipeline {
    agent {
        label 'podman'
    }
    stages {
        stage('podman build') {
            steps {
                sh 'podman build --build-arg JAR_FILE=helloworld.jar -t devops.swmed.org:8082/helloworld:v1 .'
            }    
        }
    }
}
