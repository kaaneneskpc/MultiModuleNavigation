## Multi Module Navigation in KMP

This is a Kotlin Multiplatform navigation project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

</br>

## App Contents

### Android

[Screen_recording_20241122_004924.webm](https://github.com/user-attachments/assets/e23af458-42b1-4717-ba98-448153aa4aaa)

### Ios

https://github.com/user-attachments/assets/440a3c9b-a298-457b-88c1-dedd4b6cb204




