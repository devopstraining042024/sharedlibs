def call(){

stage('Sonarqube') {
    environment {
        scannerHome = tool 'SonarQubeScanner'
    }
    steps {
        withSonarQubeEnv('sonarqube') {
            // bat "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=test"
            bat "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=sharedlib"
        }
        timeout(time: 10, unit: 'MINUTES') {
            waitForQualityGate abortPipeline: true
        }
    }
    }

}
