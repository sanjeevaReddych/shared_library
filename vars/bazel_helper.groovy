def prepare_environment(){

echo "Env setup for Bazel"
sh '''
    sudo apt install npm
    sudo npm install -g @bazel/bazelisk
    bazel --version
  '''

}


def create_build(Map args){

 sh(script: """ cd ${args.build_path}
             bazel build //main: ${args.build_function}""")

}