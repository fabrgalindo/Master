echo off
javac -Xlint -cp C:\Users\abel\ArchivosDeProgramas\apache-tomcat-8.0.15/lib/servlet-api.jar edu/ipn/upiicsa/servlet/*.java -d ../../build/ServApp1/WEB-INF/classes
echo --Ejecutar con:
echo http://localhost:8080/ServApp1/ServApp1