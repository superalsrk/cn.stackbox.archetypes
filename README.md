org.stackbox.archetypes
===

It's a set of maven3 archetypes during my career, with convenient usage.


```
mvn install

#Init Project
mvn archetype:generate -DarchetypeGroupId=cn.stackbox.archetypes -DarchetypeArtifactId=rest-with-oauth2 -DarchetypeVersion=0.0.1-SNAPSHOT -DinteractiveMode=false -DarchetypeCatalog=internal -DgroupId=cn.demo -DartifactId=demoproject -Dpackage=cn.demo.v2
```