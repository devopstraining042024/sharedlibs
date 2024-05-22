@Library('training-shared-library-demo') _
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
  }
}
      
    
