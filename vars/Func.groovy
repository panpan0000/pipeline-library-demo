#!/usr/bin/env groovy

def call(String name = 'human') {
  status.foo="change2"
  echo "Func, ${name}."
}
