package org.xiaoproject.xcw.xiaocrystalwar.command

import com.mojang.brigadier.CommandDispatcher
import net.minecraft.command.CommandSource
import net.minecraft.server.command.CommandManager
import net.minecraft.server.command.ServerCommandSource

fun register(dispatcher: CommandDispatcher<ServerCommandSource>) {
    dispatcher.register(
        CommandManager.literal("xcw")
            .requires { source -> source.hasPermissionLevel(4) }
            .then(
                CommandManager.literal("addCrystal")
                    .then(
                        CommandManager.argument("x", )
                    )
            )
    )
} 