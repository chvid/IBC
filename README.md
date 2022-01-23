# Fork of IB Controller that builds with Maven

This is a fork of the IB Controller project and its newer ibcAlpha/IBC revision that builds with Maven and creates a distributable in the form of a zip-file using the assembly plugin.

The various Windows utilities found in the original have been removed. Original documentation is inside the documentation folder.

To add Interactive Brokers TWS application into the local repository (./repository) run the following commands:

```
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 981/jars/total-2020.jar -DgroupId=com.interactivebrokers.tws -DartifactId=total-2020 -Dversion=981 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 981/jars/twslaunch-981.jar -DgroupId=com.interactivebrokers.tws -DartifactId=twslaunch -Dversion=981 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 981/jars/jts4launch-981.jar -DgroupId=com.interactivebrokers.tws -DartifactId=jts4launch -Dversion=981 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 981/jars/locales.jar -DgroupId=com.interactivebrokers.tws -DartifactId=locales -Dversion=981 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 981/jars/twslaunch-install4j-1.10.jar -DgroupId=com.interactivebrokers.tws -DartifactId=twslaunch-install4j -Dversion=981 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 981/jars/jxbrowser-7.10.jar -DgroupId=com.teamdev.jxbrowser -DartifactId=jxbrowser -Dversion=7.10 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 981/jars/jxbrowser-mac-7.10.jar -DgroupId=com.teamdev.jxbrowser -DartifactId=jxbrowser-mac -Dversion=7.10 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
mvn install:install-file -Dfile=/Users/chvid/Applications/Trader\ Workstation\ 981/jars/jxbrowser-swing-7.10.jar -DgroupId=com.teamdev.jxbrowser -DartifactId=jxbrowser-swing -Dversion=7.10 -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=./repository
```

Assuming the version of TWS is 981 and chvid needs to be your username.

Build with:

```
mvn clean install assembly:single
```

And unpack the distributable in:

```
target/IBC-3.12.0-981-distribution.zip
```

At a suitable location. Alter config.ini as you wish and set JAVA_HOME to JDK8 if necessary.

Start the TWS with:

```
sh start-ib-controller.sh
```

Stop it again with:

```
sh send-command.sh stop
```

Or send the other commands IB Controller supports (enableapi, reconnectdata, reconnectaccount).
