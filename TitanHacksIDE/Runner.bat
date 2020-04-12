@echo off
javac CoffeeBean.java > output.txt
java -cp ./;. CoffeeBean > output.txt
exit