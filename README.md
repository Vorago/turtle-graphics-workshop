# Getting started

1. [Setup on Windows](#setup-on-windows)
1. [Setup on macOS](#setup-on-macos)
1. [Building a project](#build-project)

## Setup on Windows

### 1. Run cmd as admin

* Press start button
* Type cmd
* Right click and select "Run as administrator"

![CMD as admin](/readme/run-cmd.png)

### 2. Install chocolatey

Paste this command in cmd and press enter to install [chocolatey](https://chocolatey.org/)
```
@"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"
```

### 3. Install Java

Paste this command in cmd and press enter to install Java
```
choco install jdk8 -params 'installdir=c:\\java8'
```

### 4. Install IntelliJ IDEA

https://www.jetbrains.com/idea/download/

## Setup on macOS

### 1. Open terminal

Can be found in Applications -> Utilities

![Terminal](/readme/terminal.png)


### 2. Install brew

Paste this command in terminal and press enter

```
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

### 3. Install Java

Paste this command in terminal and press enter
```
brew update; brew cask install java
```

# Build project

## Building on macOS and Linux

```
cd turtle-graphics-workshop/
./gradlew clean build idea
```

## Building on Windows

```
cd turtle-graphics-workshop/
gradlew clean build idea
```
