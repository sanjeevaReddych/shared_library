def prepare_environment(){

echo "Env setup for Bazel"
sh '''
    sudo apt install npm
    sudo npm install -g @bazel/bazelisk
    bazel --version
  '''

}


def create_build(Map args){
 echo "dir1 ${args.dir1}"

 sh(script: """ cd ${args.dir1}
             bazel build //main: ${args.build_function}""")

}