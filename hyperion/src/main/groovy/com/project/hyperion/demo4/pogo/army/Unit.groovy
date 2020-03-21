package com.project.hyperion.demo4.pogo.army

interface Unit {

    // Need something to calculate if the combat is located in the sea or land
    // That should maybe be handled elsewhere

    int calculateCombat(BattleType battleType)

    boolean isRouted()

}