def prepare_environment(){

echo "Env setup for Bazel"
sh '''
    sudo apt install npm
    sudo npm install -g @bazel/bazelisk
    bazel --version
  '''

}


def create_build(dir, build_function){

 sh '''            
            cd $dir
            bazel build //main: $build_function
              '''
}