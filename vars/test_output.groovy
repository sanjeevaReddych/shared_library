def call(inp, out='Hello world') {
  echo inp
  if (inp.trim() == out) {
    return true
  } else {
    return false
  }
}
