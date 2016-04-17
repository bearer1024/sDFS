#/bin/sh
#write a shell script to start the RMI server
#Question (4.4)
java
-Djava.rmi.server.codebase="file:///C:/Export/server.jar"
-Djava.rmi.server.useCodebaseOnly=false
-Djava.security.policy="policy.permission"
CO3090.rmi.server.Server

