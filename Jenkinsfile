pipeline {
    agent any

        parameters {
            booleanParam(defaultValue: false, description: 'Stop the stubs', name: 'StopStub')
            string(defaultValue: '8085', description: 'port number to run the stub server', name: 'portNumber')
        }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Kill') {
            steps {
            if(params.StopStub)
            {
                echo 'stop server'
                sh '''
                kill -9 $(ps -ef | grep "wiremock" | awk '{print $2}')
                    '''
             }
            }
        }
        stage('Deploy') {
            steps {
            if(!params.StopStub)
            {
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
}