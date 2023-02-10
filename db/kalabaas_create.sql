-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-02-10 08:00:22.781

-- tables
-- Table: acatch
CREATE TABLE acatch (
                        id serial  NOT NULL,
                        date date  NOT NULL,
                        user_id int  NOT NULL,
                        waterbody_id int  NOT NULL,
                        CONSTRAINT acatch_pk PRIMARY KEY (id)
);

-- Table: fish
CREATE TABLE fish (
                      id serial  NOT NULL,
                      length int  NOT NULL,
                      weight int  NOT NULL,
                      released boolean  NOT NULL,
                      comment varchar(1000)  NULL,
                      public boolean  NOT NULL,
                      picture bytea  NULL,
                      species_id int  NOT NULL,
                      acatch_id int  NOT NULL,
                      CONSTRAINT fish_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role (
                      id serial  NOT NULL,
                      name varchar(255)  NOT NULL,
                      CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: species
CREATE TABLE species (
                         id serial  NOT NULL,
                         name varchar(255)  NOT NULL,
                         CONSTRAINT species_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
                        id serial  NOT NULL,
                        role_id int  NOT NULL,
                        username varchar(255)  NOT NULL,
                        password varchar(255)  NOT NULL,
                        status char(1)  NOT NULL,
                        e_mail varchar(255)  NOT NULL,
                        CONSTRAINT user_pk PRIMARY KEY (id)
);

-- Table: waterbody
CREATE TABLE waterbody (
                           id serial  NOT NULL,
                           name varchar(255)  NOT NULL,
                           latitude decimal(8,6)  NULL,
                           longitude decimal(9,6)  NULL,
                           status varchar(255)  NOT NULL,
                           CONSTRAINT waterbody_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: acatch_waterbody (table: acatch)
ALTER TABLE acatch ADD CONSTRAINT acatch_waterbody
    FOREIGN KEY (waterbody_id)
        REFERENCES waterbody (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: catch_user (table: acatch)
ALTER TABLE acatch ADD CONSTRAINT catch_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: fish_acatch (table: fish)
ALTER TABLE fish ADD CONSTRAINT fish_acatch
    FOREIGN KEY (acatch_id)
        REFERENCES acatch (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: fish_species (table: fish)
ALTER TABLE fish ADD CONSTRAINT fish_species
    FOREIGN KEY (species_id)
        REFERENCES species (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_role (table: user)
ALTER TABLE "user" ADD CONSTRAINT user_role
    FOREIGN KEY (role_id)
        REFERENCES role (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.

