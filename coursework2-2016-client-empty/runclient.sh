#write a shell script to start the client
#Question (4.4)
java
-Djava.rmi.server.codebase="file:///C:/Export/client.jar"
-Djava.rmi.server.useCodebaseOnly=false
-Djava.security.policy="policy.permission"
CO3090.rmi.client.Client 
