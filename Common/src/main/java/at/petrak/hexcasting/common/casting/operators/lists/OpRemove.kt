package at.petrak.hexcasting.common.casting.operators.lists

import at.petrak.hexcasting.api.spell.*
import at.petrak.hexcasting.api.spell.casting.CastingContext

object OpRemove : ConstManaOperator {
    override val argc: Int
        get() = 2

    override fun execute(args: List<Iota>, ctx: CastingContext): List<Iota> {
        val list = args.getChecked<SpellList>(0, argc).toMutableList()
        val index = args.getChecked<Double>(1, argc).toInt()
        if (index < 0 || index >= list.size)
            return list
        list.removeAt(index)
        return list.asSpellResult
    }
}
