pipeline {
    agent any

    tools { 
      maven 'MAVEN_HOME'
    }
 
    stages {
        stage('Test') {
            steps {
                bat "mvn -D clean test"
            }
 
            post {                
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    echo "Report"
                  archiveArtifacts artifacts: 'Reports/index.html', followSymlinks: false
                }
            }
        }
    }
}
