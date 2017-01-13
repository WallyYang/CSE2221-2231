# CSE2221-2231

## Getting Started
### Add OSU CSE Components on Command Line
## Linux
### [Download CSE Components](http://cse.osu.edu/software/common/components.jar)
* Move .jar file to an accessible location
  
  ie. `mv components.jar /opt/components.jar`

### Build with CLASSPATH
#### you can either
* explicitly build with components everytime
  
  ```bash
  # Compile
  javac -cp .:/opt/components.jar HelloWorld.java
  # Run
  java -cp .:/opt/components.jar HelloWorld
  # ".:" is necessary before your classpath
  ```
  
#### or if you don't want type command line arguments everytime
* Add components to your environment variables
  
  ```bash
  cd /etc/
  # Edit profile with your prefered editor (ie. emacs/vim)
  sudo vim profile
  # Add following command in your profile, DO NOT use relative path (ie. "../components.jar")
  # export CLASSPATH=$CLASSPATH:".:/opt/components.jar"
  source profile
  
  # Then you can build without command arguments
  javac HelloWorld.java
  java HelloWorld
  ```

## TODO
- [ ] Write instructions for Windows & macOS
- [ ] Write a shell script to configure environment variables
- [ ] Write a script to import OSU Java Project template
