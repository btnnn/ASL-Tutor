CREATE TABLE IF NOT EXISTS Users (
      Id          INTEGER PRIMARY KEY AUTOINCREMENT,
      Name        TEXT NOT NULL,
      LoginCount  INTEGER NOT NULL DEFAULT 0
)