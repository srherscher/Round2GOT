package com.project.hyperion.demo4.pogo.army

import lombok.Data

@Data
class Infantry implements Unit {

    boolean routed = false
    int attackPower
    int defensePower
    Infantry() {
        this.attackPower = 1
        this.defensePower = 1
    }

    @Override
    int calculateCombat(BattleType battleType) {
        return (battleType == BattleType.ATTACK) ? this.attackPower : this.defensePower
    }

    boolean isRouted() {
        return this.routed
    }
}
