class A<T> {
  void foo(A<T> a){}

  void bar(B b, B b1) {
    b1./*in method call*/foo(b/*comment in arg*/);//end line comment
  }
}

class B extends A<String> {}