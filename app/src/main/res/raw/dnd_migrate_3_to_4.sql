CREATE TABLE IF NOT EXISTS `NOTES` (
    `id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
    `title` TEXT,
    `content` TEXT
);
PRAGMA user_version = 4;