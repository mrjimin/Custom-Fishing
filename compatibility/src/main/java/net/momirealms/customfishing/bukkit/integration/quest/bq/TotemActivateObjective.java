//// TODO not tested
//
//package net.momirealms.customfishing.bukkit.integration.quest.bq;
//
//import net.momirealms.customfishing.api.event.TotemActivateEvent;
//import org.betonquest.betonquest.api.CountingObjective;
//import org.betonquest.betonquest.api.DefaultObjective;
//import org.betonquest.betonquest.api.QuestException;
//import org.betonquest.betonquest.api.instruction.Argument;
//import org.betonquest.betonquest.api.instruction.Instruction;
//import org.betonquest.betonquest.api.profile.OnlineProfile;
//import org.betonquest.betonquest.api.profile.Profile;
//import org.bukkit.World;
//import org.bukkit.event.EventHandler;
//import org.bukkit.event.Listener;
//import org.jetbrains.annotations.Nullable;
//
//public class TotemActivateObjective extends CountingObjective implements Listener {
//
//    private final Argument<World> world;
//
//    public TotemActivateObjective(
//            final Instruction instruction,
//            final Argument<Number> targetAmount,
//            final Argument<World> world
//    ) throws QuestException {
//        super(instruction, targetAmount, "customfishcatch_fish");
//        this.world = world;
//    }
//
//
//    @EventHandler(ignoreCancelled = true)
//    public void onTotemActivateEvent(TotemActivateEvent event) {
//        OnlineProfile profile = profileProvider.getProfile(event.getPlayer());
//        if (!containsPlayer(profile)) {
//            return;
//        }
//        if (!checkConditions(profile)) {
//            return;
//        }
//        completeObjective(profile);
//    }
//
//}
