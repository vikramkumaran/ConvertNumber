#!/bin/bash   
JAVA_HOME="/usr/bin"
rm -rf build
mkdir build
$JAVA_HOME/javac -d build ./src/*.java
cp manifest.txt ./build
cd ./build
$JAVA_HOME/jar cvfm ConvertNumber manifest.txt *.class
mv ConvertNumber ..
cd ..
