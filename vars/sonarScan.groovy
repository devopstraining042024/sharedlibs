def call(){

// stage('Sonarqube') {
//     environment {
//         scannerHome = tool 'SonarQubeScanner'
//     }
//     steps {
//         withSonarQubeEnv('sonarqube') {
//             // bat "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=test"
//             bat "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=sharedlib"
//         }
//         timeout(time: 10, unit: 'MINUTES') {
//             waitForQualityGate abortPipeline: true
//         }
//     }
//     }
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=sharedlib \
  -Dsonar.projectName='sharedlib' \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=sqp_7bfc101116c0edd827e81d2c0ea3ceaed6839b0d
    
}
