node('maven') {
    stage('Clone') {
        sh "git config --global http.sslVerify false"
        sh "git clone https://github.com/alexdragnea/Springboot-Airline-Openshift.git"
    }
    stage('Build') {
        sh "mvn -v"
        sh "mvn clean package -f Springboot-Airline-Openshift/pom.xml"
         
        def jarFile = sh(returnStdout: true, script: 'find hello-world/target -maxdepth 1 -regextype posix-extended -regex ".+\\.(jar|war)\$" | head -n 1').trim()
        sh "cp ${jarFile} app.jar"
    }
    stage('Deploy') {
        sh "oc new-build --name hello-world --binary -n my-project --image-stream=my-project/openjdk-11-rhel7  || true"
        sh "oc start-build hello-world --from-file=app.jar -n my-project --follow --wait"
        sh "oc new-app hello-world || true"
        sh "oc expose svc/hello-world || true"
    }
}
