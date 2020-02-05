pipeline {
  agent any
  stages {
    stage('Prueba') {
      steps {
        sh '''echo "hello"

'''
      }
    }

    stage('') {
      steps {
        build(job: 'mvn clean install', wait: true, quietPeriod: 5)
      }
    }

  }
}