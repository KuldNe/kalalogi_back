INSERT INTO public.role (id, name) VALUES (DEFAULT, 'admin');
INSERT INTO public.role (id, name) VALUES (DEFAULT, 'user');

INSERT INTO public."user" (id, role_id, username, password, status, e_mail) VALUES (DEFAULT, 1, 'admin', '123', 'A', 'admin@email.eu');
INSERT INTO public."user" (id, role_id, username, password, status, e_mail) VALUES (DEFAULT, 1, 'roby', '123', 'A', 'roby@admin.ee');
INSERT INTO public."user" (id, role_id, username, password, status, e_mail) VALUES (DEFAULT, 2, 'priit', '123', 'A', 'priit@kalal.ee');
INSERT INTO public."user" (id, role_id, username, password, status, e_mail) VALUES (DEFAULT, 2, 'Toivo', '123', 'D', 'toits88@email.ee');

INSERT INTO public.waterbody (id, name, latitude, longitude, status) VALUES (DEFAULT, 'Peipsi', 58.769242, 27.047289, 'A');
INSERT INTO public.waterbody (id, name, latitude, longitude, status) VALUES (DEFAULT, 'Võrtsjärv', 58.155871, 26.043522, 'A');
INSERT INTO public.waterbody (id, name, latitude, longitude, status) VALUES (DEFAULT, 'Pirita jõgi', 59.219976, 25.039984, 'A');
INSERT INTO public.waterbody (id, name, latitude, longitude, status) VALUES (DEFAULT, 'Sauga jõgi', null, null, 'D');

INSERT INTO public.species (id, name) VALUES (DEFAULT, 'koha');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'haug');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'latikas');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'kiisk');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'ahven');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'särg');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'viidikas');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'nurg');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'tint');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'luts');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'angerjas');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'säinas');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'rünt');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'linask');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'roosärg');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'hõbekoger');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'koger');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'tõugjas');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'jõeforell');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'turb');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'teib');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'karpkala');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'rääbis');

INSERT INTO public.catch (id, date, user_id, waterbody_id) VALUES (DEFAULT, '2023-02-09', 3, 1);
INSERT INTO public.catch (id, date, user_id, waterbody_id) VALUES (DEFAULT, '2022-02-01', 4, 2);
INSERT INTO public.catch (id, date, user_id, waterbody_id) VALUES (DEFAULT, '2022-09-01', 3, 3);
INSERT INTO public.catch (id, date, user_id, waterbody_id) VALUES (DEFAULT, '2022-12-24', 4, 4);

INSERT INTO public.fish (id, length, weight, released, comment, public, picture, species_id, catch_id) VALUES (DEFAULT, 10, 70, true, 'kuradi kilu, lendas tagasi', true, 'asd', 7, 1);
INSERT INTO public.fish (id, length, weight, released, comment, public, picture, species_id, catch_id) VALUES (DEFAULT, 20, 200, false, 'hea snäkk', true, 'asd', 14, 2);
INSERT INTO public.fish (id, length, weight, released, comment, public, picture, species_id, catch_id) VALUES (DEFAULT, 30, 1200, false, 'salakojhast võtsin, ei näita', false, 'asd', 23, 3);
INSERT INTO public.fish (id, length, weight, released, comment, public, picture, species_id, catch_id) VALUES (DEFAULT, 80, 6500, false, 'Ahhsamait, vaadake seda', true, 'asd', 17, 4);
INSERT INTO public.fish (id, length, weight, released, comment, public, picture, species_id, catch_id) VALUES (DEFAULT, 15, 220, false, 'ka suht ok', true, 'asd', 12, 4);