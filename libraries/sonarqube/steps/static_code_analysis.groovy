void call(){
    stage("SonarQube: Static Code Analysis"){
        println "static code analysis from the sonarqube library"
        // RUN or Execute: // sonarScan ${env.BUILD_NUMBER}
    }
}