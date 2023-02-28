#!/usr/bin/env groovy
#!groovy
class Global {
    static Map config = null
}

def call() {
 node() {
   Global.config = null
   config = libs.getApplicationProperty()

   echo config
 }
}
