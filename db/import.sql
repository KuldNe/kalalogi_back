INSERT INTO public.role (id, name) VALUES (DEFAULT, 'admin');
INSERT INTO public.role (id, name) VALUES (DEFAULT, 'user');

INSERT INTO public."user" (id, role_id, username, password, status, e_mail) VALUES (DEFAULT, 1, 'admin', '123', 'A', 'admin@fish.ee');
INSERT INTO public."user" (id, role_id, username, password, status, e_mail) VALUES (DEFAULT, 2, 'marii', '123', 'A', 'marii@fish.ee');


INSERT INTO public.species (id, name) VALUES (DEFAULT, 'Koha');
INSERT INTO public.species (id, name) VALUES (DEFAULT, 'Latikas');


INSERT INTO public.waterbody (id, name, latitude, longitude, status) VALUES (DEFAULT, 'Peipsi', null, null, 'A');
