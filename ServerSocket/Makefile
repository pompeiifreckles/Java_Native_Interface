CC = gcc

INC_DIR = $$JAVA_HOME/include/
LINUX_INC_DIR = $$JAVA_HOME/include/linux/

CC_FLAGS = -I$(INC_DIR) -I$(LINUX_INC_DIR) -shared -fPIC

C_SRC = server.c

JAVA_SRC = Main.java SocketServer.java

all : native java

native : $(C_SRC) header
	$(CC) $(CC_FLAGS) -o libserver.so $(C_SRC)

header : SocketServer.java
	javac -h . $<

java : $(JAVA_SRC)
	javac $(JAVA_SRC)


.PHONY : run clean

run :
	java -Djava.library.path=. Main

clean :
	rm Main.class SocketServer.class SocketServer.h libserver.so
