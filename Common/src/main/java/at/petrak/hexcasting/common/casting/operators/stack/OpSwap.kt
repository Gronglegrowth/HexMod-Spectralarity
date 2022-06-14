package at.petrak.hexcasting.common.casting.operators.stack

import at.petrak.hexcasting.api.spell.ConstManaOperator
import at.petrak.hexcasting.api.spell.getChecked
import at.petrak.hexcasting.api.spell.spellListOf
import at.petrak.hexcasting.api.spell.iota.Iota
import at.petrak.hexcasting.api.spell.casting.CastingContext

object OpSwap : ConstManaOperator {
    override val argc: Int
        get() = 2

    override fun execute(args: List<Iota>, ctx: CastingContext): List<Iota> {
        val a = args.getChecked<Any>(0, argc)
        val b = args.getChecked<Any>(1, argc)
        return spellListOf(b, a)
    }
}
