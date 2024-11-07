pipeline {
    agent any
    stages {
        stage("Permission") {
            steps {
                sh "chmod +x ./gradlew"
            }
        }
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Test") {
            steps {
                sh "./gradlew test"
            }
        }
        stage("Code Coverage") {
            steps {
                sh "./gradlew jacocoTestCoverageVerification"
                sh "./gradlew jacocoTestReport"
            } // 이 부분에서 중괄호가 누락되어 있었음
            publishHTML (target:[
                       reportDir: 'build/reports/jacoco/test/html',
                       reportFiles: 'index.html',
                       reportName: 'JaCoCo Report'
            ])

        } // stage("Code Coverage")의 닫는 중괄호
    } // stages의 닫는 중괄호
}
