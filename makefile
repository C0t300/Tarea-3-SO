uno: 
	javac src/uno/*.java
	cd src/ && java uno/Main
	
rununo:
	cd src/ && java uno/Main

cleanuno:
	$(RM) src/uno/*.class
	
dos:
	javac src/dos/*.java
	cd src/ && java dos/Main
	
rundos:
	cd src/ && java dos/Main

cleandos:
	$(RM) src/dos/*.class
