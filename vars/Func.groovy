#!/usr/bin/env groovy

def call(String name = 'human') {
  status.foo="changein Func"
  echo "Func, ${name}."
  common("common in sayHello")
}
