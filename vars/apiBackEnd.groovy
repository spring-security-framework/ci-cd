import devops.cicd.tools.Ssh

def call() {
    stage("Test Code") {
        sh 'echo "Hello world"'
    }
}
