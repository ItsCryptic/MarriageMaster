/*
 *   Copyright (C) 2019 GeorgH93
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package at.pcgamingfreaks.MarriageMaster.Bukkit.Minepacks;

import at.pcgamingfreaks.Minepacks.Bukkit.API.MinepacksPlugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class MinepacksIntegration extends MinePacksIntegrationBase
{
	private MinepacksPlugin minepacks;

	public MinepacksIntegration()
	{
		Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("Minepacks");
		if(!(plugin instanceof MinepacksPlugin)) return;
		minepacks = (MinepacksPlugin) plugin;
	}

	@Override
	public void OpenBackpack(Player opener, Player owner, boolean editable)
	{
		minepacks.openBackpack(opener, owner, editable);
	}
}