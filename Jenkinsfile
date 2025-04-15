pipeline {
    agent any

    tools {
        maven 'MAVEN_HOME'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/khalid0210/PageObjectModelDemo.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            // Only archive test reports
            junit 'target/surefire-reports/*.xml'
        }

        success {
            emailext(
                to: 'khalithsheik@gmail.com',
                subject: "✅ Build Success: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                    <html>
                        <body>
                            <p>Hello Team,</p>
                            <p>The latest Jenkins build has completed.</p>
                            <p><b>Project Name:</b> ${env.JOB_NAME}</p>
                            <p><b>Build Number:</b> #${env.BUILD_NUMBER}</p>
                            <p><b>Build Status:</b> <span style="color: green;"><b>SUCCESS</b></span></p>
                            <p><b>Build URL:</b> <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>
                            <p><b>Last Commit:</b> ${env.GIT_COMMIT}</p>
                            <p><b>Branch:</b> ${env.GIT_BRANCH}</p>
                            <p>Build log is attached.</p>
                            <p>Best regards,</p>
                            <p><b>Khalid</b></p>
                        </body>
                    </html>
                """,
                mimeType: 'text/html',
                attachLog: true
            )
        }

        failure {
            emailext(
                to: 'khalithsheik@gmail.com',
                subject: "❌ Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                    <html>
                        <body>
                            <p>Hello Team,</p>
                            <p>The Jenkins build has <b>FAILED</b>.</p>
                            <p><b>Project Name:</b> ${env.JOB_NAME}</p>
                            <p><b>Build Number:</b> #${env.BUILD_NUMBER}</p>
                            <p><b>Build Status:</b> <span style="color: red;"><b>FAILURE</b></span></p>
                            <p><b>Build URL:</b> <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>
                            <p><b>Branch:</b> ${env.GIT_BRANCH}</p>
                            <p>Build log is attached for troubleshooting.</p>
                            <p>Best regards,</p>
                            <p><b>Khalid</b></p>
                        </body>
                    </html>
                """,
                mimeType: 'text/html',
                attachLog: true
            )
        }
    }
}
