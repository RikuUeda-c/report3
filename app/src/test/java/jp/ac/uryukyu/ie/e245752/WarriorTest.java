package jp.ac.uryukyu.ie.e245752;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        int defaultWarriorHp = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", defaultWarriorHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for(int i = 1; i <= 3; i++){
            int slimeMximumHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(demoWarrior.getAttack() * 1.5,slimeMximumHp - slime.getHitPoint());
        }
    }
}
