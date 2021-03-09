-- Insert des Catégorie Aide
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (1, 'Bricolage - Travaux');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (2, 'Jardinage');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (3, 'Déménagement');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (4, 'Dépannage');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (5, 'Entretien - Réparation Véhicules');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (6, 'Services véhiculés');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (7, 'Services à la personne');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (8, 'Enfants');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (9, 'Animaux');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (10, 'Informatique - Web');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (11, 'Cours - Formations');

-- Insert Genre
INSERT INTO `genre` (id, genre) VALUES (1, 'Mme');
INSERT INTO `genre` (id, genre) VALUES (2, 'Mr');
INSERT INTO `genre` (id, genre) VALUES (3, 'Autre');

-- Insert Jours de la semaine
INSERT INTO `jour_semaine` (id, nomJour) VALUES (1, 'lundi');
INSERT INTO `jour_semaine` (id, nomJour) VALUES (2, 'mardi');
INSERT INTO `jour_semaine` (id, nomJour) VALUES (3, 'mercredi');
INSERT INTO `jour_semaine` (id, nomJour) VALUES (4, 'jeudi');
INSERT INTO `jour_semaine` (id, nomJour) VALUES (5, 'vendredi');
INSERT INTO `jour_semaine` (id, nomJour) VALUES (6, 'samedi');
INSERT INTO `jour_semaine` (id, nomJour) VALUES (7, 'dimanche');

-- Insert Materiel
INSERT INTO `materiel` (id, nomMateriel) VALUES (1, 'kit ménage');
INSERT INTO `materiel` (id, nomMateriel) VALUES (2, 'kit jardinage');
INSERT INTO `materiel` (id, nomMateriel) VALUES (3, 'kit bricolage');
INSERT INTO `materiel` (id, nomMateriel) VALUES (4, 'ordinateur');
INSERT INTO `materiel` (id, nomMateriel) VALUES (5, 'voiture');

-- Insert Type Aide
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (1, 'Bricolage - Petits travaux', 1, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (2, 'Montage meubles en kit', 1, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (3, 'Tonte de pelouse', 2, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (4, 'Débroussaillage', 2, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (5, 'Taille de haies - arbuste', 2, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (6, 'Clôture - Grillage', 2, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (7, 'Déplacement cartons', 3, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (8, 'Déplacement meubles - électroménager', 3, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (9, 'Conduite camion', 3, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (10, 'Réparation mobilier', 4, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (11, 'Réparation électroménager', 4, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (12, 'Dépannage informatique', 4, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (13, 'Lavage auto', 5, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (14, 'Réparation vélo', 5, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (15, 'Covoiturage', 6, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (16, 'Livraison – Transport de colis', 6, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (17, 'Promenade et sorties véhiculées', 6, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (18, 'Lingerie – Repassage', 7, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (19, 'Couture', 7, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (20, 'Courses - Livraison de courses', 7, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (21, 'Gardiennage de domicile', 7, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (22, 'Baby Sitting', 8, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (23, 'Garde périscolaire', 8, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (24, 'Aide aux devoirs', 8, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (25, 'Toilettage', 9, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (26, 'Garde chien', 9, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (27, 'Garde chat', 9, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (28, 'Garde animaux (autres)', 9, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (29, 'Assistance Informatique', 10, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (30, 'Maths', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (31, 'Physique', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (32, 'Anglais', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (33, 'Français', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (34, 'Espagnol', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (35, 'Allemand', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (36, 'Arabe', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (37, 'Portugais', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (38, 'Mandarin', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (39, 'Informatique', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (40, 'Musique - Guitare', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (41, 'Musique - Piano', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (42, 'Cuisine', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (43, 'Couture', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (44, 'Dessin', 11, null);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id, materiel_id) VALUES (45, 'Danse', 11, null);

-- Insert Type Litige
INSERT INTO `type_litige` (id, nomTypeLitige) VALUES (1, 'retard');
INSERT INTO `type_litige` (id, nomTypeLitige) VALUES (2, 'litige financier');
INSERT INTO `type_litige` (id, nomTypeLitige) VALUES (3, 'dégradation matérielle');
INSERT INTO `type_litige` (id, nomTypeLitige) VALUES (4, 'incident physique');
INSERT INTO `type_litige` (id, nomTypeLitige) VALUES (5, 'mauvais comportement');

-- Insert Type Utilisateur
INSERT INTO `type_utilisateur` (id, autorisation) VALUES (1, 'utilisateur');
INSERT INTO `type_utilisateur` (id, autorisation) VALUES (2, 'admin analyste');
INSERT INTO `type_utilisateur` (id, autorisation) VALUES (3, 'admin modérateur');
INSERT INTO `type_utilisateur` (id, autorisation) VALUES (4, 'super admin');

-- Insert Adresse
INSERT INTO `adresse` (id, codePostale, nomVoie, numeroVoie, ville) VALUES (1, '93400', 'rue Emile Zola', '10', 'St-Ouen');
INSERT INTO `adresse` (id, codePostale, nomVoie, numeroVoie, ville) VALUES (2, '93400', 'rue Alexandre Dumas', '22', 'St-Ouen');
INSERT INTO `adresse` (id, codePostale, nomVoie, numeroVoie, ville) VALUES (3, '93400', 'rue Pasteur', '5', 'St-Ouen');
INSERT INTO `adresse` (id, codePostale, nomVoie, numeroVoie, ville) VALUES (4, '93400', 'rue Farcot', '17', 'St-Ouen');
INSERT INTO `adresse` (id, codePostale, nomVoie, numeroVoie, ville) VALUES (5, '93400', 'rue du Capitaine Glardner', '13', 'St-Ouen');

-- Insert Disponibilite
INSERT INTO `disponibilite` (id, dbtValiditeDispo, finValiditeDispo, heureDbtDispo, heureFinDispo, jourSemaine_id, utilisateur_id) VALUES (1, '2018-08-12', null, '2011-12-31 14:30:00', '2011-12-31 19:00:00', 1,null);


-- Insert Utilisateur
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, adresse_id, genre_id, typeUtilisateur_id) VALUES (1, null, '2018-01-12', '1985-01-04', 'to.toto@ecoleql.fr', 'Toto', '0102030401', 'toto', 'to', '10', 1, 2, 1);
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, adresse_id, genre_id, typeUtilisateur_id) VALUES (2, null, '2018-01-12', '1986-01-08', 'ta.tata@ecoleql.fr', 'Tata', '0102030402', 'tata', 'ta', '15', 2, 1, 1);

-- Insert Service
INSERT INTO `service` (id, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, nom, sommeAPrevoir, adresse_id, typeAide_id, utilisateur_id) VALUES (1, null, null, '2018-08-12', '2021-03-12', '2021-03-12 14:30:00', '2021-03-12 18:30:00', null, null, 1, 2, 1); 

-- Insert Litige
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (1, "Je n'ai pas été remboursé", null, '2019-12-31', 1, 2, 1);

-- Insert Négociation
INSERT INTO `negociation` (id, dateCloture, dateCreation, dateProposee, heureDbtProposee, heureFinProposee, isAccepted, createurNego_id, repondeurNego_id, service_id) VALUES (1, null, '2018-08-15', '2021-03-13', '2021-03-12 15:45:00', '2021-03-12 18:45:00', false, 1, 2, 1);

-- Insert Reponse Service
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (1, '2018-08-13', null, 1, 2);

-- Insert Suspension Compte
INSERT INTO `suspension_compte` (id, dateDbtSuspension, dateFinSuspension, utilisateur_id) VALUES (1, '2021-08-15', '2021-08-25', 2);

