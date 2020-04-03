# Java Native Interface
Tutorial - Incorporating Native Code in java codebase

## What is JNI?
The Java Native Interface (JNI) is a foreign function interface programming framework that enables Java code running in a Java virtual machine (JVM) to call and be called by native applications (programs specific to a hardware and operating system platform) and libraries written in other languages such as C, C++ and assembly. 

## How do I start
A very simple tutorial is written in HelloWorld, displaying "Hello World!" on the console natively.
For simpilicity I wrote the code with compatibility with \*nix sytems only but can be changed to work with Windows.

The process for using the interface is simple. Java uses the native code as methods of classes therefore the native code can be called during Java runtime.

**For simply reproducing the code**

Before starting you have to define your java home directory for makefile to work.
This is my system's path for java home directory.

```shell
$ export JAVA_HOME="/usr/lib/jvm/java-13/"
```

```shell
$ cd HelloWorld
$ make all
$ make run
```
**For cleaning up**

```shell
$ make clean
```
**For compiling Java files**

```shell
$ make java
```

**For making the header file**
```shell
$ make header
```
**For compiling the C/C++ code**
```shell
$ make native
```
