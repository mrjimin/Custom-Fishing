// TODO not tested

package net.momirealms.customfishing.bukkit.integration.quest.bq;

import org.betonquest.betonquest.api.DefaultObjective;
import org.betonquest.betonquest.api.QuestException;
import org.betonquest.betonquest.api.instruction.Argument;
import org.betonquest.betonquest.api.instruction.Instruction;
import org.betonquest.betonquest.api.quest.objective.ObjectiveFactory;
import org.bukkit.World;

public class TotemActivateObjectiveFactory implements ObjectiveFactory {

    @Override
    public DefaultObjective parseInstruction(final Instruction instruction) throws QuestException {
        final String worldRaw = instruction.string().get("world", "%location.world%").getValue(null);
        final Argument<World> world = instruction.chainForArgument(worldRaw).world().get();
        return new TotemActivateObjective(instruction, world);
    }
}
