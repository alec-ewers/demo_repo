/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeebieheebies;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author mr_penumbra
 */
public class JeebieHeebies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                shooterFrame ikaruga = new shooterFrame();
                ikaruga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ikaruga.setVisible(true);
            }
        });
    }
    
}

class shooterFrame extends JFrame {
    
    public shooterFrame () {
        dispose();
        
        setTitle("Welcome to hell... Bullet Hell!");
        setSize(480, 640);
        
        addKeyListener(new shooterListener());
        
        menuComponent menu = new menuComponent();
        shooterComponent shooter = new shooterComponent();
        
        add(interaction.inPlay == false ? menu : shooter);
    }
}

class interaction {
    
    public static boolean inPlay = false;
    
    
}