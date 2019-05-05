#!/usr/bin/env groovy

def call(String name = 'human') {
  status.foo="change in sayHeello"
  echo "Hello, ${name}."
  common("common in sayHello")
}

