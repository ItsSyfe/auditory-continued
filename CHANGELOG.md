# Changelog

## [1.0.0-1.21.1] - 2025-08-22

### Added

- Full compatibility with Minecraft 1.21.1
- Updated to Fabric Loader 0.16.5

### Changed

- Updated datapack format from 10 to 48 (1.21.1 requirement)
- Migrated tags directory structure: `tags/blocks/` → `tags/block/`, `tags/items/` → `tags/item/`
- Updated ResourceLocation API calls to use new 1.21.1 syntax
- Updated mixin targeting for 1.21.1 BlockBehaviour changes
- Fixed block ID references: `minecraft:grass` → `minecraft:short_grass`

### Technical Notes

- Maintains data-driven approach using tags for block sound assignments
- All original sound functionality preserved
- Clean codebase following original mod structure
- Compatible with ModMenu for configuration

### Dependencies

- Minecraft 1.21.1
- Fabric Loader 0.16.5+
- Fabric API 0.104.0+1.21.1

### Optional Dependencies

- ModMenu (for in-game configuration)
- Cloth Config API (for configuration GUI)
