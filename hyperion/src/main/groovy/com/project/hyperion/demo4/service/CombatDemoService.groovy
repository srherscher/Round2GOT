package com.project.hyperion.demo4.service

import com.project.hyperion.demo4.pogo.combat.CombatDto
import com.project.hyperion.demo4.pogo.territory.Territory
import org.springframework.stereotype.Service

@Service
class CombatDemoService {

    // add some service to calculate whos in support range

    // Add ability to include a list of supporting territories
    CombatDto doCombat(CombatDto attackingForce, CombatDto defendingForce) {
        // some tieBreaker based on sword
        int attackingPower = attackingForce.territory.getTotalCombatPower()
        int defendingPower = defendingForce.territory.getTotalCombatPower()

        return attackingPower > defendingPower ? attackingForce : defendingForce

    }
}
