/*
 * Copyright 2015 Filip.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.filippop1.bazzars.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import pl.filippop1.bazzars.gui.GUIConfirm;
import pl.filippop1.bazzars.gui.GUIManager;
import pl.filippop1.bazzars.gui.GUIShop;

public class InventoryCloseListener implements Listener {
    @EventHandler
    public void onInventoryClose(InventoryCloseEvent e) {
        GUIConfirm guiConfirm = GUIManager.getGUIConfirm(e.getInventory());
        if (guiConfirm != null) {
            GUIManager.removeGUIConfirm(guiConfirm);
        }
        
        GUIShop guiShop = GUIManager.getGUIShop(e.getInventory());
        if (guiShop != null) {
            GUIManager.removeGUIShop(guiShop);
        }
    }
}
