package com.project.hyperion.demo4.service

import com.project.hyperion.demo4.pogo.army.BattleType
import com.project.hyperion.demo4.pogo.army.Infantry
import com.project.hyperion.demo4.pogo.army.Knight
import com.project.hyperion.demo4.pogo.army.Unit
import com.project.hyperion.demo4.pogo.combat.CombatDto
import com.project.hyperion.demo4.pogo.territory.LandTerritory
import org.springframework.stereotype.Service

@Service
class MockUpSomeStuff {

    CombatDto makeAttackDto () {
        List<Unit> units = new ArrayList<>()
        units.add(new Knight())
        units.add(new Infantry())
        units.add(new Infantry())

        LandTerritory territory = new LandTerritory()
        territory.name = "Winterfell"
        territory.units = units
        return new CombatDto(units: units, territory: territory, battleType: BattleType.ATTACK)
    }

    CombatDto makeDefenseDto () {
        List<Unit> units = new ArrayList<>()
        units.add(new Knight())
        units.add(new Knight())
        units.add(new Infantry())

        LandTerritory territory = new LandTerritory()
        territory.name = "Karstark"
        territory.units = units

        return new CombatDto(units: units, territory: territory, battleType: BattleType.DEFENSE)
    }
}
