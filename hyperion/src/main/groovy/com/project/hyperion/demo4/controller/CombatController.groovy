package com.project.hyperion.demo4.controller

import com.project.hyperion.demo4.pogo.army.Infantry
import com.project.hyperion.demo4.pogo.army.Unit
import com.project.hyperion.demo4.pogo.combat.CombatDto
import com.project.hyperion.demo4.service.CombatDemoService
import com.project.hyperion.demo4.service.MockUpSomeStuff
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.jooq.JooqAutoConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class CombatController {


    @Autowired
    MockUpSomeStuff mockUpSomeStuff

    @Autowired
    CombatDemoService combatDemoService


    @GetMapping("/combat")
    CombatDto hello() {

        JooqAutoConfiguration.DslContextConfiguration
        CombatDto attacker = mockUpSomeStuff.makeAttackDto()
        CombatDto defender = mockUpSomeStuff.makeDefenseDto()

        CombatDto winner = combatDemoService.doCombat(attacker, defender)

//        Account account = new Account()
//        account.userId = 1234
//        account.username = "Scotty2HOtty"
//        AccountRecord accountRecord = new AccountRecord()
//        accountRecord.username = "fasdfs"
//        accountRecord.store()


        return winner
    }

}
