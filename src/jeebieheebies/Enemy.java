/*
 * This code was written by Alec Ewers, whether he's proud of it
 * or not. It is distributed freely so long as you include this
 * header and give what you think is appropriate credit.
 * This code comes with no warranty, implied or otherwise.
 */
package jeebieheebies;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author mr_penumbra
 */
public class Enemy {
    
    private int health;
    private int weapon;
    private int enemy;
    private int speed;
    
    public void Enemy(int hp, int weaponType, int enemyType, int moveSpeed) {
        health = hp;
        weapon = weaponType;
        enemy = enemyType;
        speed = moveSpeed;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int val) {
        health = val;
    }
    
    public int getWeapon() {
        return weapon;
    }
    
    public void setWeapon(int val) {
        weapon = val;
    }
    
    public int getEnemy() {
        return enemy;
    }
    
    public void setEnemy(int val) {
        enemy = val;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int val) {
        speed = val;
    }
}
