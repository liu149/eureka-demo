pipeline {
    agent { docker 'gradle:jdk8' }
    stages {
        stage('build') {
            steps {
                sh 'gradle build'
            }
        }

        stage('publish') {
            steps {
                sh 'gradle publish'
            }
        }

    }
}