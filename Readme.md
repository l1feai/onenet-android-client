<br/>
<div align="center">
<p align="center">
  <img width="234" src="https://raw.githubusercontent.com/l1feai/one-network/main/docs/media/logo-full.png"/>
</p>
  <p>
     <a href="https://github.com/l1feai/one-network/blob/main/LICENSE">
       <img height="20" src="https://www.gnu.org/graphics/gplv3-88x31.png" />
     </a>
    
  </p>
</div>


<p align="center">
<strong>
  <br/>
  See <a href="https://docs.l1fe.network/">Documentation</a>
  <br/>
   Join our <a href="https://join.slack.com/t/l1feai/shared_invite/zt-vrahf41g-ik1v7fV8du6t0RwxSrJ96A">Slack channel</a>
  <br/>

</strong>
</p>

<br>

# OneNet Android client

The OneNet Android client allows connections from mobile devices running Android to private resources in the One Network.

## Screenshots

<p align="center">
  <img src="https://github.com/l1feai/onenet-android-client/assets/7756831/31fea824-9604-4e6a-a6ed-78cb526b6066" alt="menu" width="250" style="margin-right: 10px;"/>
  <img src="https://github.com/l1feai/onenet-android-client/assets/7756831/97b3bf1b-6e70-4f25-b5ab-e62b3337f10d" alt="peer-overview" width="250" style="margin-right: 10px;"/>
  <img src="https://github.com/l1feai/onenet-android-client/assets/7756831/d3ce7c74-aa1e-4be0-ba0c-4761432171e4" alt="mainscreen" width="250"/>
</p>

## Install
You can download and install the app from the Google Play Store:

[<img src="https://play.google.com/intl/en_us/badges/images/generic/en-play-badge.png" alt="Get it on Google Play" height="80">](https://play.google.com/store/apps/details?id=io.onenet.client)


## Building from source
### Requirements
We need the following software:
* Java 1.11. Usually comes with Android Studio
* android studio initialized with jdk and emulator (not covered here, is a req from android-client project)
* gradle (https://gradle.org/install/)

### Prepare development environment
1. Close all repositories:
> assuming you use a path like ~/projects locally
```shell
mkdir ~/projects
cd projects
# clone onenet repo
git clone --recurse-submodules git@github.com:l1feai/onenet-android-client.git
```
2. Checkout the repositories to the branches you want to test. If you want the latest, check the status information on your IDE or on https://github.com and verify the branch list and commit history.
3. Export JDK and Android home vars, on macOS they are: (please contribute with Linux equivalent)
```shell
# replace <USERNAME> with your name
export ANDROID_HOME=/Users/<USERNAME>/Library/Android/sdk
export JAVA_HOME=/Applications/Android Studio.app/Contents/jbr/Contents/Home
```
4. Install NDK and CMake
```shell
cd ~/projects/android-client
$ANDROID_HOME/cmdline-tools/latest/bin/sdkmanager --install "ndk;23.1.7779620"
```
### Generate debug bundle
Follow the steps to run locally until the step 5 then run the following steps:
1. Build Go agent library
```shell
cd ~/projects/android-client
./build-android-lib.sh
```
2. Run gradlew
```shell
cd ~/projects/android-client/android
./gradlew bundleDebug  -PversionCode=123 -PversionName=1.2.3
```
