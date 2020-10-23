# Se•Key•Quence

This application is built for the course [CIU196 Mobile Computing – Design and Implementation at Chalmers](https://chalmers.instructure.com/courses/10409/assignments/syllabus). The idea is to capture a sequence of photos which a machine learning model (Tensorflow Lite) will classify. The objects detected in the photos by Tensorflow are to be stored as the unique password, and in order to unlock the user has to capture the same objects in the same sequence again. Precious Keys is, as of current (Oct 2020), merely a proof of concept. Its current stage is for researching the technological feasibility of this concept.

### Website

More information can be found on [tuyen.me/sekeyquence](https://tuyen.me/sekeyquence).

## Prequisites

- Minimum supported API level is 21.
- Android Studio 3.6 or above.
- An Android device. Android Studio's emulator works too. **Using an AVD based on Android 11 or higher is recommended.**
  - A webcam to take pictures in the emulator

## Download and set up

- **Option A: Download as Zip**
  1. Code > Download Zip > Save to your computer and unzip the zip-file
  2. In Android Studio's dialog, pick "Open an existing Android Studio Project"
  3. Select the folder "preciouskeys-main" and open
- **Option B: Clone repository**
  1. Copy the repository's link: https://github.com/elizaII/preciouskeys
  2. In Android Studio's dialog, pick "Get from Version Control"
  3. Enter the link into URL, pick where the project should be saved
  4. Clone the repository

### Set up an Android Virtual Device (AVD)

- Basic instructions can be found [here in a codelab](https://codelabs.developers.google.com/codelabs/kotlin-android-training-get-started/#5).
- **System Image:** Choose _R_ (API level 30) (download the system image if you don't have it)
- **Choose "Show Advanced Settings"** and scroll down to Camera > Back:
  - Select "Webcam0" if you have a webcam.

### Set up a real device to debug on

- Basic instructions can be found [here in a codelab](https://codelabs.developers.google.com/codelabs/kotlin-android-training-get-started/#6).

## Run the application

1. If the "app" module isn't preselected to build, select it in the menu bar at the top of the window.
2. Choose the device to run the app on (i.e. emulator a real device).
3. Press play to run app (<kbd>^</kbd> + <kbd>R</kbd> on Mac, <kbd>⇧</kbd>+<kbd>F10</kbd> on Windows)
