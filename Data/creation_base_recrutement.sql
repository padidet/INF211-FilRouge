-- CHARLOT Maxence - ROUX Simon
-- 20/01/2023
-- INF 211 FIP 2A
-- Titre : Setup Base de données recrutement
-- +----------------------------------------------------------------------------------------------+
-- | suppression des tables                                                                       |
-- +----------------------------------------------------------------------------------------------+

drop table if exists entreprise cascade;
drop table if exists offre_emploi cascade;
drop table if exists message_offre_emploi cascade;
drop table if exists niveau_qualification cascade;
drop table if exists secteur_activite cascade;
drop table if exists candidature cascade;
drop table if exists message_candidature cascade;
drop table if exists index_offre_secteur cascade;
drop table if exists index_candidature_secteur cascade;

-- +----------------------------------------------------------------------------------------------+
-- | création des tables                                                                          |
-- +----------------------------------------------------------------------------------------------+

create table entreprise
(
	id_ent				serial primary key,
	nom							varchar(50) not null,
	descriptif					text,
	adresse_postale				varchar(30) -- pour simplifier, adresse_postale = ville.
);

create table niveau_qualification
(
	id_qualification		serial primary key,
	intitule 					varchar(50) not null
);

create table secteur_activite
(
	id_secteur			serial primary key,
	intitule	 				text not null 
);


create table offre_emploi
(
	id_offre				serial primary key,
	id_entreprise				int not null references entreprise(id_ent),
	id_qualification		int not null references niveau_qualification(id_qualification),   
	titre						varchar(50) not null,
	description_mission			text,
	profil_recherche			text,
	date_depot					date not null
);

create table candidature
(
	id_candidature				serial primary key, -- cand_numéro_candidature
	nom 						varchar(50) not null,
	prenom 						varchar(50) not null,
	date_naissance				date not null,
	adresse_postale				varchar(30),
	adresse_email				varchar(50),
	cv			 				text,
	date_depot					date not null,
	id_qualification 	int not null references niveau_qualification(id_qualification)
);

create table message_offre_emploi
(
	id_message_offre		serial primary key,
	date_envoi					date not null,
	corps_message 				text,
	id_offre				int not null references offre_emploi(id_offre),
	id_candidature				int not null references candidature(id_candidature)
);


create table message_candidature
(
	id_message_candidature		serial primary key,
	date_envoi					date not null,
	corps_message	 			text,
	id_offre_emploi			 	int not null references offre_emploi(id_offre),
	id_candidature 			 	int not null references candidature(id_candidature)
);

create table index_offre_secteur
(
	id_offre			 	int references offre_emploi(id_offre),
	id_secteur 		int references secteur_activite(id_secteur),
	primary key (id_offre,id_secteur)
);

create table index_candidature_secteur
(
	id_candidature			 	int references candidature(id_candidature),
	id_secteur 		int references secteur_activite (id_secteur),
	primary key (id_candidature,id_secteur)
);




-- Insertion des données de test dans la table 'entreprise'
-- Insertion des données de test dans la table 'entreprise'
INSERT INTO entreprise (nom, descriptif, adresse_postale) 
VALUES ('Microsoft', 'Microsoft Corporation est une multinationale américaine de technologie qui développe, licence et vend des logiciels, des produits et des services informatiques.', 'Redmond'),
 ('Google', 'Google LLC est une société américaine de technologie qui propose des services en ligne et des produits liés à l''Internet.', 'Mountain View'), 
 ('IBM', 'International Business Machines Corporation est une multinationale américaine d''informatique, de logiciels et de services informatiques.', 'Armonk');

-- Insertion des données de test dans la table 'niveau_qualification'
INSERT INTO niveau_qualification (intitule) 
VALUES ('Débutant'), ('Confirmé'), ('Expert');

-- Insertion des données de test dans la table 'secteur_activite'
INSERT INTO secteur_activite (intitule)
VALUES ('Informatique'), ('Réseau'), ('Télécom');

-- Insertion des données de test dans la table 'offre_emploi'
INSERT INTO offre_emploi (id_entreprise, id_qualification, titre, description_mission, profil_recherche, date_depot) 
VALUES (1, 2, 'Ingénieur réseau', 'Gestion et maintenance des réseaux informatiques de l''entreprise', 'Diplôme en informatique et expérience en réseau', '2022-01-01');

-- Insertion des données de test dans la table 'candidature'
INSERT INTO candidature (nom, prenom, date_naissance, adresse_postale, adresse_email, cv, date_depot, id_qualification)
VALUES ('Dupont', 'Jean', '1995-01-01', 'Paris', 'jean.dupont@gmail.com', 'CV en format texte', '2022-01-01', 1);

-- Insertion des données de test dans la table 'message_offre_emploi'
INSERT INTO message_offre_emploi (date_envoi, corps_message, id_offre, id_candidature)
VALUES ('2022-01-01', 'Bonjour, je suis intéressé par cette offre d''emploi.', 1, 1);

-- Insertion des données de test dans la table 'message_candidature'
INSERT INTO message_candidature (date_envoi, corps_message, id_offre_emploi, id_candidature)
VALUES ('2022-01-01', 'Bonjour, merci pour votre candidature. Nous allons l''étudier.', 1, 1);

-- Insertion des données de test dans la table 'index_offre_secteur'
INSERT INTO index_offre_secteur (id_offre, id_secteur)
VALUES (1, 1);

-- Insertion des données de test dans la table 'index_candidature_secteur
INSERT INTO index_candidature_secteur (id_candidature, id_secteur)
VALUES (1, 1);


