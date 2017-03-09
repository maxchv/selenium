package org.itstep.qaexamples;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by User on 28.02.2017.
 */
public class RecordPosition extends Frame implements MouseMotionListener {
    public static void main(String[] args) throws AWTException {
       RecordPosition frame = new RecordPosition();
       frame.setVisible(true);
    }
    int x, y;
    RecordPosition() {
        addMouseMotionListener(this);
        reshape(100, 100, 100, 100);
    }

    public void mouseDragged(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }
}
