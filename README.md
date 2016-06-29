# Adopt-A-JSR Java9 Testing

###test-example project
####compile

javac.exe -d mods/addmodule src\main\java\module-info.java src\main\java\com\bobpaulin\AddService.java src\main\java\com\bobpaulin\Main.java src\main\java\com\bobpaulin\impl\AddServiceImpl.java

####compile test

javac.exe -Xmodule:addmodule -d testing\addmodule -mp mods src\test\java\com\bobpaulin\impl\AddServiceImplTest.java

####run

c:\sdks\jdk-9-123\jdk-9\bin\java.exe -ea -Xpatch:addmodule=testing\addmodule -mp mods -addmods addmodule -m addmodule/com.bobpaulin.impl.AddServiceImplTest

###test-junit

####compile

javac.exe -d mods/addmodule src\main\java\module-info.java src\main\java\com\bobpaulin\AddService.java src\main\java\com\bobpaulin\Main.java src\main\java\com\bobpaulin\impl\AddServiceImpl.java

####compile tests

javac.exe -Xmodule:addmodule -d testing\addmodule -mp mods;lib-test -XaddReads:addmodule=junit src\test\java\com\bobpaulin\impl\AddServiceImplTest.java

####run

java.exe -ea -Xpatch:addmodule=testing\addmodule -XaddReads:addmodule=junit -XaddExports:addmodule/com.bobpaulin.impl=junit -mp mods;lib-test -addmods addmodule,hamcrest.core -m junit/org.junit.runner.JUnitCore com.bobpaulin.impl.AddServiceImplTest