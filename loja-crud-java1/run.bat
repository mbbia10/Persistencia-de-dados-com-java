
@echo off
echo Compilando...
javac -cp lib\sqlite-jdbc.jar src\*.java -d .
echo Rodando...
java -cp .;lib\sqlite-jdbc.jar Main
pause
