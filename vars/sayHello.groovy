#!/usr/bin/env groovy

def call(String name = 'human') {
  //status.foo="change in sayHeello"
  //echo "Hello, ${name}."
  echo "read from sayHello ", gv_in_main
  common("common in sayHello")
}

