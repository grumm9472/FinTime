package enchia.time.main.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Collections;

public class SYSTEMPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "cl_main_room_start"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos((int) (-5), (int) 17, (int) (-5)), new BlockPos((int) (-5), (int) 17, (int) (-5)),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		{
			Entity _ent = entity;
			_ent.teleportTo(0, 20, 0);
			if (_ent instanceof ServerPlayer _serverPlayer) {
				_serverPlayer.connection.teleport(0, 20, 0, _ent.getYRot(), _ent.getXRot(), Collections.emptySet());
			}
		}
	}
}
