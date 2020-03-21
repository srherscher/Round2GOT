package com.project.hyperion.demo4.pogo.territory

import com.project.hyperion.demo4.pogo.army.BattleType
import com.project.hyperion.demo4.pogo.army.Unit
import lombok.Data

@Data
interface Territory {

//    String name
//
//    List<Unit> units
//
//    List<Territory> adjacentLandTerritories
//
//    List<Territory> adjacentSeaTerritories
//
//    TerritoryType type

    int getTotalCombatPower(BattleType battleType)
}