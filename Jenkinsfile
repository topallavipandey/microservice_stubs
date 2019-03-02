pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {

                echo 'Deploying....'
                sh '''

                chmod 777 gradlew
                # ./gradlew startstub
                export JENKINS_NODE_COOKIE=dontKillMe
                nohup ./gradlew startstub &


                '''


            }
        }
    }
}