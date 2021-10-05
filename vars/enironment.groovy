def call(env){
if (env == 'bazel'){
echo "Env setup for Bazel"
sh '''
    sudo apt install npm
    sudo npm install -g @bazel/bazelisk
    bazel --version
  '''
}
}