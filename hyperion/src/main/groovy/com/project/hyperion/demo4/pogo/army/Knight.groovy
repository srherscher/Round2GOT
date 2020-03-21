package com.project.hyperion.demo4.pogo.army

class Knight implements Unit {

    boolean routed = false
    int attackPower
    int defensePower
    Knight() {
        this.attackPower = 2
        this.defensePower = 2
    }

    @Override
    int calculateCombat(BattleType battleType) {
        return (battleType == BattleType.ATTACK) ? this.attackPower : this.defensePower
    }

    boolean isRouted() {
        return this.routed
    }
}
