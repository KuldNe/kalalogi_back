-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-02-09 08:37:28.456

-- tables
-- Table: catch
CREATE TABLE catch (
                       id serial  NOT NULL,
                       date date  NOT NULL,
                       user_id int  NOT NULL,
                       waterbody_id int  NOT NULL,
                       CONSTRAINT catch_pk PRIMARY KEY (id)
);

-- Table: fish
CREATE TABLE fish (
                      id serial  NOT NULL,
                      length int  NOT NULL,
                      weight int  NOT NULL,
                      released boolean  NOT NULL,
                      comment varchar(1000)  NOT NULL,
                      public boolean  NOT NULL,
                      picture bytea  NOT NULL,
                      species_id int  NOT NULL,
                      catch_id int  NOT NULL,
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
                         name_latin varchar(255)  NOT NULL,
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
-- Reference: catch_user (table: catch)
ALTER TABLE catch ADD CONSTRAINT catch_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: catch_waterbody (table: catch)
ALTER TABLE catch ADD CONSTRAINT catch_waterbody
    FOREIGN KEY (waterbody_id)
        REFERENCES waterbody (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: fish_catch (table: fish)
ALTER TABLE fish ADD CONSTRAINT fish_catch
    FOREIGN KEY (catch_id)
        REFERENCES catch (id)
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

SELECT * FROM "user"

