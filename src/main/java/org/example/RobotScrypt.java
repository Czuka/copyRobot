package org.example;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.Time;

public class RobotScrypt {

    public String textToCopy;



    public RobotScrypt(String textToCopy)  {
        this.textToCopy = textToCopy;

        try{
            waiting();
        }catch (InterruptedException ex){
            System.out.println("time exeption");
        }

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        for(char c : textToCopy.toCharArray())
        {

            boolean keyCode = false;
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    keyCode = true;
                }
            } else if ( c=='!'    ) {
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(KeyEvent.VK_1);
                robot.keyRelease(KeyEvent.VK_1);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                keyCode = false;
                continue;
            }
            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar((int) c));
            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar((int) c));
            if (keyCode == true){
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }
            keyCode = false;
        }
        robot.keyRelease(KeyEvent.VK_SHIFT);
    }


    public void waiting() throws InterruptedException {
        Thread.sleep(1000);
    }

}
