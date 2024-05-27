@Library('training-shared-library-demo1') _
pipeline {
    agent slave1

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
        steps{
            scmCheckout()
        }    
    }
    stage('Maven Build and Sonar scan - shared library')
    {
        steps{
            mavenBuildSonarScan()
        }
    }
    stage('archiveArtifacts - shared library')
    {
        steps{
        artifactsArchieveStore()
        }
    }
     stage('deployTomcat - shared library')
    {    
        steps{
        deployTomcat()
        }
    }
  }
}
