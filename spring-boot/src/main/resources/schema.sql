CREATE TABLE star_wars_character (
     character_id IDENTITY NOT NULL PRIMARY KEY,
     name VARCHAR(255),
     species VARCHAR(255),
     home_world VARCHAR(255),
     affiliation VARCHAR(255)
);
