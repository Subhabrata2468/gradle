# Gradle
## It is a build automation tool.
### Takes your code and packages it into deployable unit
## Applies to small or large projects
## It is written in Groovy language.
## It is highly configurable to meet project needs![image](https://github.com/Subhabrata2468/gradle/assets/126705074/c2bbf655-3b16-4b65-ba3e-01e8ca72bc7b)

## Linux Gradle Installation

Validate that Java is installed:

```bash
  java -version
```
it should print out details of your current Java installation. Don’t worry if you’ve got a different
Java version installed because Gradle supports versions 8 and above.

Download the latest version of Gradle using the curl command:

```bash
  curl https://downloads.gradle-dn.com/distributions/gradle-8.3-bin.zip --output ~/gradle.zip
```

Unzip the file using the unzip command:
```bash
sudo unzip -d /opt/gradle gradle.zip
```


If you’re prompted for your password, enter it because we’re running this command as the root user
Look at the contents of the Gradle installation using the ls command:
```bash
ls /opt/gradle/gradle-8.3
```


You should see some files and directories &
Setup the PATH environment variable:

```bash
echo 'export PATH="$PATH:/opt/gradle/gradle-8.3/bin"' >> ~/.bashrc
```
Close the terminal and open a new one,
Show that Gradle has been successfully installed.

```bash
gradle --version
```
You should see some output showing that a specific version of Gradle is installed
