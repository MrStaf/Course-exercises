# Exercice 5

## Part 1

In you previous exercise you had to create the following UI:
(Look at *img.png*)

Now make it do the following:
1. when the selection of the combo box (Choice) changes, save it into a String
somewhere;
2. when any one of the radio buttons is selected, save the selected value into another
String;
3. when the button is pressed:
    - save the text which is currently into the TextField into a String and clear the TextField;
    - write all of the above strings into the console.
### Directions:
- You'll need at least the following listeners (perhaps multiple instances): ItemListener, ActionListener
- You might want to the method use *Choice.getSelectedItem()* for getting the current selection, although there are better ways of doing this
- Some useful methods of *Checkbox*, that you might want to use are: *getState()* and *getLabel()*
- One problem you'll face is that you have multiple controls that fire the same event: three radio buttons and a "normal" button. Solve the task by using:
    - one class, implementing *ActionListener*
    - 4 separate classes for each button (these may be inner and better yet, anonymous classes)


## Part 2

Create a small GUI program with one empty window. Make it track the mouse motion, i.e. when the mouse is being moved within the window, its current coordinates (X and Y position of the mouse cursor within the window) must be shown. Show them at the mouse cursor position.
### Directions:
- Your application's window would something like this:
- You'll need a MouseMotionListener and more specifically, its method *mouseMoved(MouseEvent me)*;
- Look up the class *java.awt.event.MouseEvent* in Oracle's documentation or elsewhere on the Web; there you'll find methods for getting the current mouse position;
- Initially it will be easier to write the mouse coordinates in the console, using *System.out.println()*; don't try to write them in the window, before you have made sure you've got the coordinates right;
- For writing the coordinates inside the window, you'll need to override the method *paint()* for your class, representing the window (descendant of *Frame*). In your implementation of *paint()* you may use the method *java.awt.Graphics.drawString()*. Look all of these up in Oracle's documentation or elsewhere on the Web.
- The text you write in the window will probably not get refreshed while you move the mouse. This is by design. You'll have to call the method *repaint()*, which starts from *java.awt.Component*.

## Part 3

Continuing from Part 2:
- Make a very simple program for drawing lines by dragging the mouse, similarly to what any graphics editor (e.g. *Microsoft Paint*) does. Do not bother with different colours and/or line thicknesses, just a simple line would be OK.
- Try minimizing and restoring your window. Does the line disappear? Make it always visible.
- How many lines can you have in you window - one or more? If you can only have one line at a time, try to rework the program so that it can draw multiple lines.
### Directions:
- In addition to the *MouseMotionListener* from the previous task, now you'll also need a *MouseListener*.