package com.project.hyperion.demo4.pogo.territory

import com.project.hyperion.demo4.pogo.army.BattleType
import com.project.hyperion.demo4.pogo.army.Unit
import lombok.Data


@Data
class LandTerritory implements Territory {
    String name

    List<Unit> units

    List<Territory> adjacentLandTerritories

    List<Territory> adjacentSeaTerritories

    TerritoryType type

    LandTerritory() {
//        this.type = TerritoryType.LAND_TERRITORY
    }



    @Override
    int getTotalCombatPower(BattleType battleType) {
        int totalPower = 0
        this.units.each { Unit unit ->
            totalPower += unit.calculateCombat(battleType)
        }
        return totalPower
    }
}
