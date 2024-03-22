This course covered the software development protocols for wearable and mobile electronics such as head-mounted displays, watches, and cell phones. Several embedded input/output interfaces were studied including, position and orientation sensors, hand trackers, holographic and stereoscopic displays. The students will practice the covered material by developing prototype software applications for such devices.

By the end of this course, I was be able to:

- Obtain a basic understanding of the technologies used in contemporary wearable and mobile devices
- Use the characteristics and design elements required for wearable devices and systems to be widely adopted by the mainstream population for use in everyday life
- Develop software development skills for wearable and mobile devices

# Applications

## GPT Treasure Hunt App
- The App should have 1 main activity with a first clue or introductory storyline. Make sure you decorate it with nice graphics/font styles/design etc
- The App should be able to detect and respond to AT LEAST 3 geographic locations in the following ways:
- When one of the known geographic locations is reached, a corresponding activity should be shown with a graphic and possibly a message
- Make some of the locations depend on others. For example, if location 1 is the "key that unlocks the chest," location 2 is the "chest with the diamond," and location 3 is the "statue with the missing diamond," then the user should not be able to unlock the chest when visiting location 2 without first visiting location 1. This can be implemented by introducing proper boolean variables in the program such as "got_the_key," "unlocked_the_chest" etc. and setting their values to true when visiting the corresponding locations
- The App should have a meaningful storyline, whatever you imagine, and NICE AESTHETICS
- Test your App using real geographic coordinates in the Location emulator tool. Make sure you test also for incorrect use case scenarios, such as visiting the "chest" location before getting the key from the "key" location

## Accelerormeter Game
Create a game that uses SurfaceView in a full-screen mode and is controlled using the accelerometer.
- The App should have 1 main activity, fully covered by one SurfaceView element.
- The App should lock the orientation to "Portrait mode" as I show it in this video, by editing the Android Manifest file. Video LinkLinks to an external site.
- The activity should be in "Full Screen" mode without the top title bar, as I show it in the previous video, by editing the styles.xml and the Android Manifest file. 
- The app should use the accelerometer, and in particular, only the first value (accelerometer along x-axis) to move the player element left and right. The player element should always remain on the bottom of the screen and only move left-right with the accelerometer. See examples.
- The game should show animated objects that are falling down: a) some objects need to be avoided otherwise they cost 1 point, b) some objects need to be collected to earn 1 point. 
- The App should have a single color background (due to slow execution in the android emulator) and SMALL images as the "player" object, the "obstacle" object, and the "collectible" object. If you use large images it will make it hard to emulate. Use my sample code to scale the images down as I show in the example (200x200 or so).
- On the top of the screen, you should render a text with the score. "Score: ...." which should be rendered along with the rest of the scene and reflect the current score in the game.
  
## Calculator app
- The layout should have at least 16 buttons: 1,2,3,4,5,6,7,8,9,0,C,+,-,x,/,=
- The layout should also have a label field for the result that will show "0" at the beginning of the app

The functionality should be limited to the following:
- If the user presses "C" the result field is set to "0"
- If the user presses any digit button, the current value of the result field should be retrieved and if it is currently "0" then it should be replaced by the value of the corresponding button that was pressed. For example, if the current result is "0" and you press "1" then the result field should be changed to "1"
Otherwise, if the user presses any digit button and the current value of the result field is not "0" then it should be appended by the value of the corresponding button that was pressed. For example, if the current result is "2" and you press "1" then the result field should be changed to "21"

## Unit Converter App

- Create a Unit Converter App in Android
- The App should have 1 main activity with options to select the type of conversion between Length, Weight, and Temperature.
- This could be implemented as a menu of 3 buttons. By clicking each button, another activity should open
- The App should have 3 more activities—one for each type of unit
- Each of these activities should have the necessary fields and buttons and radio buttons in order to allow the user to type a number, select unit (e.g. meters or feet in the case of Length conversion) and press Convert to see the result

## Design Smartwatch Face
- In this assignment you need to create your own Android Watch Face that is responsive according to either a) weather changes or b) date changes.
- You can start by creating a ***round*** Android watch emulator. (Please use the round emulator so that all of the projects can run in the same emulator on my end).
- Then open the code from the class (08_FaceExample) and modify it in one of the following two ways:
- Then you can create a service that listens to "Temperature" or "Humidity" that can be emulated in the emulator. When it is cold you can make your watch's face reflect that, when it is hot, etc.
- Alternatively, if you want, you can change the face based on the calendar; for instance, if it is Veteran's Day, you can use a patriotic background, or if it is Halloween, you can put a pumpkin, etc
