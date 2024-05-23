def call(){
deploy adapters: [tomcat9(credentialsId: 'tomcat_creds', path: '', url: 'http://localhost:8081/')], contextPath: null, war: 'target/*war'
}
