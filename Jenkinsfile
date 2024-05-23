@Library('training-shared-library-demo1') _
pipeline {
    agent any

  stages{
    stage('Shared library demo')
    {
      steps{
        welcome("DevOps Training1")
        welcome("DevOps Training2")
          script{
              calculator.add(20,30)
              calculator.mul(20,30)
          }
      }
    }
    stage('SCM check out - shared library')
    {
        scmCheckout()
    }
    stage('Maven Build and Sonar scan - shared library')
    {
        mavenBuildSonarScan()
    }
    stage('archiveArtifacts - shared library')
    {
        archiveArtifacts()
    }
     stage('deployTomcat - shared library')
    {
        deployTomcat()
    }
  }
}
      
    
