package com.project.hyperion.demo4.pogo.combat

import com.project.hyperion.demo4.pogo.army.BattleType
import com.project.hyperion.demo4.pogo.army.Unit
import com.project.hyperion.demo4.pogo.territory.Territory
import lombok.Data

@Data
class CombatDto {

    // Include House too? Or can that be stored in territory?
    Territory territory
    BattleType battleType
    List<Unit> units
}
