def prepare_environment(){

echo "Env setup for Bazel"
sh '''
    sudo apt install npm
    sudo npm install -g @bazel/bazelisk
    bazel --version
  '''

}


def create_build(dir1, build_function){
 echo 'dir1 $dir1'

 sh(script: ''' cd ${dir1}
             bazel build //main: ${build_function}''')

}