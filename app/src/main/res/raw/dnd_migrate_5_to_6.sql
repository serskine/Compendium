ALTER TABLE 'new_monsters' RENAME TO 'STANDARD_MONSTERS';
ALTER TABLE 'monsters' RENAME TO 'CUSTOM_MONSTERS';
ALTER TABLE 'magicItems' RENAME TO 'MAGIC_ITEMS';
PRAGMA user_version = 6;