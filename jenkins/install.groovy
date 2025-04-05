def call(String workingDir) {
    echo ">>> Using install.groovy"

    def repo = "https://github.com/mtararujs/python-greetings"

    // Klone Python mikropakalpojumu
    bat "git clone ${repo} ${workingDir}"

    dir(workingDir) {
        bat 'echo Current directory: %cd%'
        bat '"C:\\Users\\Krist\\AppData\\Local\\Programs\\Python\\Python313\\Scripts\\pip.exe" install -r requirements.txt'
    }
}
return this
