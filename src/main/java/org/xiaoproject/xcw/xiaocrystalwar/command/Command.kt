package org.xiaoproject.xcw.xiaocrystalwar.command

import com.mojang.brigadier.CommandDispatcher
import net.minecraft.block.Blocks
import net.minecraft.command.CommandSource
import net.minecraft.command.argument.ArgumentTypes
import net.minecraft.command.argument.Vec3ArgumentType
import net.minecraft.server.command.CommandManager
import net.minecraft.server.command.ServerCommandSource
import net.minecraft.util.math.BlockPos

fun register(dispatcher: CommandDispatcher<ServerCommandSource>) {
    dispatcher.register(
        CommandManager.literal("xcw")
            .requires { source -> source.hasPermissionLevel(4) }
            .then(
                CommandManager.literal("addCrystal")
                    .then(
                        CommandManager.argument("x", Vec3ArgumentType.vec3())
                            .then(
                                CommandManager.argument("y", Vec3ArgumentType.vec3())
                                    .then(
                                        CommandManager.argument("z", Vec3ArgumentType.vec3())
                                            .executes { context ->
                                                val x = Vec3ArgumentType.getVec3(context, "x").x
                                                val y = Vec3ArgumentType.getVec3(context, "y").y
                                                val z = Vec3ArgumentType.getVec3(context, "z").z
                                                1
                                            }
                                    )
                            )
                    )
            )
    )
} 