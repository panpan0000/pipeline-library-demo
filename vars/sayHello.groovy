#!/usr/bin/env groovy

def call(String name = 'human') {
  status.foo="change 1"
  echo "Hello, ${name}."
}

