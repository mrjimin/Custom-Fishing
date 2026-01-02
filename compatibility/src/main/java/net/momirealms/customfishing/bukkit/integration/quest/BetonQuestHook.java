/*
 *  Copyright (C) <2024> <XiaoMoMi>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package net.momirealms.customfishing.bukkit.integration.quest;

import net.momirealms.customfishing.bukkit.integration.quest.bq.FishingGroupObjectiveFactory;
import net.momirealms.customfishing.bukkit.integration.quest.bq.FishingIdObjectiveFactory;
import net.momirealms.customfishing.bukkit.integration.quest.bq.TotemActivateObjectiveFactory;
import org.betonquest.betonquest.BetonQuest;

public final class BetonQuestHook {

    public static void register() {
        BetonQuest bq = BetonQuest.getInstance();
        bq.getQuestRegistries().objective().register("customfish_catch_fish", new FishingIdObjectiveFactory());
        bq.getQuestRegistries().objective().register("customfish_catch_group", new FishingGroupObjectiveFactory());
        // fixed
        // bq.getQuestRegistries().objective().register("customfishing_totem_activate", new TotemActivateObjectiveFactory());
    }
}
