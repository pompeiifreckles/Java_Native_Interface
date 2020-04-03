CC = gcc

INC_DIR = $$JAVA_HOME/include/
LINUX_INC_DIR = $$JAVA_HOME/include/linux/

CC_FLAGS = -I$(INC_DIR) -I$(LINUX_INC_DIR) -shared -fPIC

C_SRC = HelloWorldImp.c

JAVA_SRC = Main.java HelloWorld.java

all : native java

native : $(C_SRC) header
	$(CC) $(CC_FLAGS) -o libhello.so $(C_SRC)

header : HelloWorld.java
	javac -h . $<

java : $(JAVA_SRC)
	javac $(JAVA_SRC)


.PHONY : run clean

run :
	java -Djava.library.path=. Main

clean :
	rm Main.class HelloWorld.class HelloWorld.h libhello.so
