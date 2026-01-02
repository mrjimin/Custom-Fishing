// TODO not tested

package net.momirealms.customfishing.bukkit.integration.quest.bq;

import net.momirealms.customfishing.api.event.TotemActivateEvent;
import org.betonquest.betonquest.api.DefaultObjective;
import org.betonquest.betonquest.api.QuestException;
import org.betonquest.betonquest.api.instruction.Argument;
import org.betonquest.betonquest.api.instruction.Instruction;
import org.betonquest.betonquest.api.profile.OnlineProfile;
import org.betonquest.betonquest.api.profile.Profile;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class TotemActivateObjective extends DefaultObjective implements Listener {

    private final Argument<World> world;

    public TotemActivateObjective(final Instruction instruction, final Argument<World> world) throws QuestException {
        super(instruction);
        this.world = world;
    }

    @EventHandler(ignoreCancelled = true)
    public void onTotemActivateEvent(TotemActivateEvent event) {
        OnlineProfile profile = profileProvider.getProfile(event.getPlayer());
        if (!containsPlayer(profile)) {
            return;
        }
        if (!checkConditions(profile)) {
            return;
        }
        completeObjective(profile);
    }

    @Override
    public String getDefaultDataInstruction(Profile profile) throws QuestException {
        return "";
    }

    @Override
    public String getProperty(String s, Profile profile) throws QuestException {
        return "";
    }
}
