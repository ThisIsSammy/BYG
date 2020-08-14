//package voronoiaoc.byg.common.world.structure.village.villagepools;
//
//import com.google.common.collect.ImmutableList;
//import com.mojang.datafixers.util.Pair;
//import net.minecraft.block.Blocks;
//import net.minecraft.tags.BlockTags;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.world.biome.DefaultBiomeFeatures;
//import net.minecraft.world.gen.feature.Feature;
//import net.minecraft.world.gen.feature.jigsaw.*;
//import net.minecraft.world.gen.feature.template.*;
//
//@SuppressWarnings("deprecation")
//public class BYGAdobeVillagePools {
//    public static void init() {
//        ImmutableList<StructureProcessor> immutablelist = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new TagMatchRuleTest(BlockTags.DOORS), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new RuleEntry(new BlockMatchRuleTest(Blocks.TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new RuleEntry(new BlockMatchRuleTest(Blocks.WALL_TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.SMOOTH_SANDSTONE, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.CUT_SANDSTONE, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.TERRACOTTA, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.SMOOTH_SANDSTONE_STAIRS, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.SMOOTH_SANDSTONE_SLAB, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.MELON_STEM.getDefaultState()))));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/town_centers"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/town_centers/adobe_meeting_point_1"), 98), new Pair<>(new SingleJigsawPiece("byg:village/adobe/town_centers/adobe_meeting_point_2"), 98), new Pair<>(new SingleJigsawPiece("byg:village/adobe/town_centers/adobe_meeting_point_3"), 49), new Pair<>(new SingleJigsawPiece("byg:village/adobe/town_centers/adobe_meeting_point_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/town_centers/adobe_meeting_point_2", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/town_centers/adobe_meeting_point_3", immutablelist), 1)), JigsawPattern.PlacementBehaviour.RIGID));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/streets"), new ResourceLocation("byg:village/adobe/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/corner_01"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/corner_02"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/straight_01"), 4), new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/straight_02"), 4), new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/straight_03"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/crossroad_01"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/crossroad_02"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/crossroad_03"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/square_01"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/square_02"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/streets/turn_01"), 3)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
////        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/zombie/streets"), new ResourceLocation("byg:village/adobe/zombie/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/corner_01"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/corner_02"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/straight_01"), 4), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/straight_02"), 4), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/straight_03"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/crossroad_01"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/crossroad_02"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/crossroad_03"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/square_01"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/square_02"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/streets/turn_01"), 3)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
//        ImmutableList<StructureProcessor> immutablelist1 = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.MELON_STEM.getDefaultState()))));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/houses"), new ResourceLocation("byg:village/adobe/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_small_house_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_small_house_2"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_small_house_3"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_small_house_4"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_small_house_5"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_small_house_6"), 1), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_small_house_7"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_small_house_8"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_medium_house_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_medium_house_2"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_butcher_shop_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_tool_smith_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_fletcher_house_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_shepherd_house_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_armorer_1"), 1), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_fisher_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_tannery_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_cartographer_house_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_library_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_mason_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_weaponsmith_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_temple_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_temple_2"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_large_farm_1", immutablelist1), 11), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_farm_1", immutablelist1), 4), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_farm_2", immutablelist1), 4), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_animal_pen_1"), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_animal_pen_2"), 2), Pair.of(EmptyJigsawPiece.INSTANCE, 5)), JigsawPattern.PlacementBehaviour.RIGID));
////        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/zombie/houses"), new ResourceLocation("byg:village/adobe/zombie/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/houses/adobe_small_house_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/houses/adobe_small_house_2", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/houses/adobe_small_house_3", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/houses/adobe_small_house_4", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/houses/adobe_small_house_5", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/houses/adobe_small_house_6", immutablelist), 1), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/houses/adobe_small_house_7", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/houses/adobe_small_house_8", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/houses/adobe_medium_house_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/houses/adobe_medium_house_2", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_butcher_shop_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_tool_smith_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_fletcher_house_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_shepherd_house_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_armorer_1", immutablelist), 1), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_fisher_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_tannery_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_cartographer_house_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_library_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_mason_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_weaponsmith_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_temple_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_temple_2", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_large_farm_1", immutablelist), 7), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_farm_1", immutablelist), 4), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_farm_2", immutablelist), 4), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_animal_pen_1", immutablelist), 2), new Pair<>(new SingleJigsawPiece("byg:village/adobe/houses/adobe_animal_pen_2", immutablelist), 2), Pair.of(EmptyJigsawPiece.INSTANCE, 5)), JigsawPattern.PlacementBehaviour.RIGID));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/terminators"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/terminators/terminator_01"), 1), new Pair<>(new SingleJigsawPiece("byg:village/adobe/terminators/terminator_02"), 1)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
////        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/zombie/terminators"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/terminators/terminator_01"), 1), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/terminators/terminator_02"), 1)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/decor"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/adobe_lamp_1"), 10), new Pair<>(new FeatureJigsawPiece(Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.CACTUS_CONFIG)), 4), new Pair<>(new FeatureJigsawPiece(Feature.BLOCK_PILE.withConfiguration(DefaultBiomeFeatures.HAY_PILE_CONFIG)), 4), Pair.of(EmptyJigsawPiece.INSTANCE, 10)), JigsawPattern.PlacementBehaviour.RIGID));
////        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/zombie/decor"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/adobe_lamp_1", immutablelist), 10), new Pair<>(new FeatureJigsawPiece(Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.CACTUS_CONFIG)), 4), new Pair<>(new FeatureJigsawPiece(Feature.BLOCK_PILE.withConfiguration(DefaultBiomeFeatures.HAY_PILE_CONFIG)), 4), Pair.of(EmptyJigsawPiece.INSTANCE, 10)), JigsawPattern.PlacementBehaviour.RIGID));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/villagers"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/villagers/nitwit"), 0), new Pair<>(new SingleJigsawPiece("byg:village/adobe/villagers/baby"), 3), new Pair<>(new SingleJigsawPiece("byg:village/adobe/villagers/unemployed"), 10)), JigsawPattern.PlacementBehaviour.RIGID));
////        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/adobe/zombie/villagers"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/villagers/nitwit"), 1), new Pair<>(new SingleJigsawPiece("byg:village/adobe/zombie/villagers/unemployed"), 10)), JigsawPattern.PlacementBehaviour.RIGID));
//    }
//}
