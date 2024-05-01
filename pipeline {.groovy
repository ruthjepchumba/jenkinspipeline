pipeline {
    agent any

    stages {
            stage("Build") {
                steps {
                    echo "Building...."   
                }
                post{
                    success{
                        mail to: "rjepchumba078@gmail.com",
                        subject:"build staus email",
                        body: "build was successful"
                    }
                }
            }
    }
}