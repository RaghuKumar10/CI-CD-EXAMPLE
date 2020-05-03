pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                withMaven {
                    sh 'mvn clean package'
                }
            }
        }
        stage ('Test') {
            steps {
                withMaven {
                    sh 'mvn test'
                }
            }
        }
        stage ('Deploy') {
            steps {
                withCredentials([[$class          : 'UsernamePasswordMultiBinding',
                                  credentialsId   : 'PCF',
                                  usernameVariable: 'USERNAME',
                                  passwordVariable: 'PASSWORD']]) {
                    sh 'cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
                    sh 'cf push'
                }
            }
        }
    }
}