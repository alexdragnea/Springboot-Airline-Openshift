def version, mvnCmd = "mvn -s templates/cicd-settings-nexus3.xml"
      pipeline
      {
       agent any
        tools
        {
            maven 'M3'
        }

        stages
        {
          stage('Build App')
          {
            steps
             {
              git branch: 'master', url: 'https://github.com/alexdragnea/Springboot-Airline-Openshift.git'
              script {
                  def pom = readMavenPom file: 'pom.xml'
                  version = pom.version
              }
              sh "mvn clean install -DskipTests=true"
            }
          }
          stage('Test')
          {
            steps
            {
              sh "${mvnCmd} test -Dspring.profiles.active=test"
              //step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
            }
          }


          stage('Create Image Builder') {

            when {
              expression {
                openshift.withCluster() {
                  openshift.withProject(env.DEV_PROJECT-dev) {
                    return !openshift.selector("bc", "spring-boot-airline-openshift-git").exists()
                  }
                }
              }
            }
            steps {
              script {
                openshift.withCluster() {
                  openshift.withProject(env.DEV_PROJECT) {
                    openshift.newBuild("--name=spring-boot-airline-openshift-git", "--image-stream=redhat-openjdk18-openshift:latest", "--binary=true")
                  }
                }
              }
            }
          }
