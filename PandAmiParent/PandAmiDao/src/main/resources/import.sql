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
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (1, 'Bricolage - Petits travaux', 1);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (2, 'Montage meubles en kit', 1);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (3, 'Tonte de pelouse', 2);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (4, 'Débroussaillage', 2);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (5, 'Taille de haies - arbuste', 2);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (6, 'Clôture - Grillage', 2);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (7, 'Déplacement cartons', 3);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (8, 'Déplacement meubles - électroménager', 3);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (9, 'Conduite camion', 3);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (10, 'Réparation mobilier', 4);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (11, 'Réparation électroménager', 4);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (12, 'Dépannage informatique', 4);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (13, 'Lavage auto', 5);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (14, 'Réparation vélo', 5);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (15, 'Covoiturage', 6);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (16, 'Livraison – Transport de colis', 6);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (17, 'Promenade et sorties véhiculées', 6);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (18, 'Lingerie – Repassage', 7);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (19, 'Couture', 7);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (20, 'Courses - Livraison de courses', 7);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (21, 'Gardiennage de domicile', 7);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (22, 'Baby Sitting', 8);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (23, 'Garde périscolaire', 8);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (24, 'Aide aux devoirs', 8);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (25, 'Toilettage', 9);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (26, 'Garde chien', 9);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (27, 'Garde chat', 9);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (28, 'Garde animaux (autres)', 9);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (29, 'Assistance Informatique', 10);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (30, 'Maths', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (31, 'Physique', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (32, 'Anglais', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (33, 'Français', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (34, 'Espagnol', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (35, 'Allemand', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (36, 'Arabe', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (37, 'Portugais', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (38, 'Mandarin', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (39, 'Informatique', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (40, 'Musique - Guitare', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (41, 'Musique - Piano', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (42, 'Cuisine', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (43, 'Couture', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (44, 'Dessin', 11);
INSERT INTO `type_aide` (id, nomTypeAide, categorieAide_id) VALUES (45, 'Danse', 11);

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

-- Insert Ville
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (1, '75001', 'Paris I');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (2, '75002', 'Paris II');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (3, '75003', 'Paris III');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (4, '75004', 'Paris IV');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (5, '75005', 'Paris V');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (6, '75006', 'Paris VI');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (7, '75007', 'Paris VII');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (8, '75008', 'Paris VIII');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (9, '75009', 'Paris IX');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (10, '75010', 'Paris X');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (11, '75011', 'Paris XI');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (12, '75012', 'Paris XII');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (13, '75013', 'Paris XIII');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (14, '75014', 'Paris XIV');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (15, '75015', 'Paris XV');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (16, '75016', 'Paris XVI');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (17, '75017', 'Paris XVII');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (18, '75018', 'Paris XVIII');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (19, '75019', 'Paris XIX');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (20, '75020', 'Paris XX');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (21, '93400', 'St-Ouen-Sur-Seine');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (22, '95380', 'Louvres');
INSERT INTO `ville` (id, codePostal, villeNom) VALUES (23, '93600', 'Aulnay-sous-Bois');



-- Insert Adresse
-- INSERT INTO `adresse` (id, codePostale, nomVoie, numeroVoie, ville) VALUES (1, '93400', 'rue Emile Zola', '10', 'St-Ouen');
-- INSERT INTO `adresse` (id, codePostale, nomVoie, numeroVoie, ville) VALUES (2, '93400', 'rue Alexandre Dumas', '22', 'St-Ouen');
-- INSERT INTO `adresse` (id, codePostale, nomVoie, numeroVoie, ville) VALUES (3, '93400', 'rue Pasteur', '5', 'St-Ouen');
-- INSERT INTO `adresse` (id, codePostale, nomVoie, numeroVoie, ville) VALUES (4, '93400', 'rue Farcot', '17', 'St-Ouen');
-- INSERT INTO `adresse` (id, codePostale, nomVoie, numeroVoie, ville) VALUES (5, '93400', 'rue du Capitaine Glardner', '13', 'St-Ouen');


-- Insert Utilisateur
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (1, null, '2018-01-12', '1985-01-04', 'to.toto@ecoleql.fr', 'Toto', '0102030401', 'toto', 'to', '10', 2, 1, '76 rue Emile Zola 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (2, null, '2018-01-12', '1986-01-08', 't', 'Tata', '0102030402', 't', 'ta', '15', 1, 1, '17 rue Alexandre Dumas 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (3, null, '2019-01-12', '1987-02-08', 'ti.titi@ecoleql.fr', 'Titi', '0102030403', 'titi', 'ti', '17', 1, 1, '25 rue Farcot 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (4, null, '2020-01-12', '1987-02-08', 'tutu', 'Tutu', '0102030405', 'tutu', 'tu', '27', 1, 1, '25 rue Pasteur 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (5, null, '2019-01-12', '1987-02-08', 'tete', 'Tete', '0102030406', 'tete', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');

-- Insert Utilsateur Analyse
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (201, null, '2020-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (202, null, '2020-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (203, null, '2020-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (204, null, '2020-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (205, null, '2020-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (206, null, '2020-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (207, null, '2020-04-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (208, null, '2020-04-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (209, null, '2020-04-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (210, null, '2020-04-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (211, null, '2020-04-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (212, null, '2020-05-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (213, null, '2020-05-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (214, null, '2020-05-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (215, null, '2020-06-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (216, null, '2020-06-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (217, null, '2020-07-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (218, null, '2020-08-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (219, null, '2020-08-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (220, null, '2020-09-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (221, null, '2020-09-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (222, null, '2020-09-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (223, null, '2020-10-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (224, null, '2020-10-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (225, null, '2020-10-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (226, null, '2020-10-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (227, null, '2020-10-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (228, null, '2020-10-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (229, null, '2020-11-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (230, null, '2020-11-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 1, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (231, null, '2020-11-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (232, null, '2020-12-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (233, null, '2020-12-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (234, null, '2020-12-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (235, null, '2021-01-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (236, null, '2021-01-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (237, null, '2021-01-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (238, null, '2021-01-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (239, null, '2021-01-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (240, null, '2021-01-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (241, null, '2021-01-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (242, null, '2021-02-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (243, null, '2021-02-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (244, null, '2021-02-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (245, null, '2021-02-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (246, null, '2021-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (247, null, '2021-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (248, null, '2021-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (249, null, '2021-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (250, null, '2021-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (251, null, '2021-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (252, null, '2021-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (253, null, '2021-03-15', '1987-02-08', 'stat', 'StatGuy', '0102030406', 'stat', 'te', '32', 1, 2, '18 rue Arago 93400 St Ouen');


-- Insert Utilisateur Admin
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (6, null, '2018-01-01', '1987-02-08', 'analyste.admin@pandami.fr', 'analyste', '0102030400', 'admin', 'admin_analyste', null, 3, 2, 'Siège Social PANDAMI');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (7, null, '2018-01-01', '1987-02-08', 'moderateur.admin@pandami.fr', 'moderateur', '0102030400', 'admin', 'admin_moderateur', null, 3, 3, 'Siège Social PANDAMI');

-- Insert Disponibilite
INSERT INTO `disponibilite` (id, dbtValiditeDispo, finValiditeDispo, heureDbtDispo, heureFinDispo, jourSemaine_id, utilisateur_id) VALUES (1, '2018-08-12', null, '14:30:00', '19:00:00', 1, 1);

-- Insert Service
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (1, '20 Avenue de Ségur 75007 Paris','2020-08-12', null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 35, 1); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (2, 'Rue Cler 75007 Paris', null,null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 34, 2); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (3, '21 Rue Vernet 75008 Paris', null, null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 33, 1); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (4, '21 Rue Cadet 75009 Paris', null, null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 32, 1); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (5, '21 Rue Cail 75010 Paris', null, null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 31, 4); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (6, '21 Rue Chanzy 75011 Paris', null, null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 30, 5); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (7, '21 Avenue Parmentier 75011 Paris',null,  null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 29, 3); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (8, '21 Avenue Reille 75014 Paris', '2021-01-13',  null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 28, 4); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (9, '21 Avenue Emile Zola 75015 Paris', '2021-01-13', null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 27, 5); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (10, '2 Avenue Foch 75016 Paris', null, null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 26, 4); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (11, '67 Avenue Foch 75016 Paris','2020-08-12', null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 25, 2); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (12, '6 Avenue Gourgaud 75017 Paris','2020-08-12', null, null, '2021-01-12', '2021-03-17', '08:00:00', '11:00:00', null, 24, 1); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (13, '20 Avenue de Ségur 75007 Paris',null, null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 35, 1); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (14, 'Rue Cler 75007 Paris', null,null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 34, 2); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (15, '21 Rue Vernet 75008 Paris', null, null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 33, 1); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (16, '21 Rue Cadet 75009 Paris', null, null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 32, 1); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (17, '21 Rue Cail 75010 Paris', null, null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 31, 4); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (18, '21 Rue Chanzy 75011 Paris', null, null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 30, 5); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (19, '21 Avenue Parmentier 75011 Paris',null,  null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 29, 3); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (20, '21 Avenue Reille 75014 Paris', null,  null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 28, 4); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (21, '21 Avenue Emile Zola 75015 Paris', '2020-03-21', null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', 110, 27, 5); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (22, '2 Avenue Foch 75016 Paris', null, null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 26, 4); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (23, '67 Avenue Foch 75016 Paris',null, null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 25, 2); 
INSERT INTO `service` (id, adresse, dateAcceptation, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (24, '6 Avenue Gourgaud 75017 Paris',null, null, null, '2021-01-12', '2021-04-17', '08:00:00', '11:00:00', null, 24, 1); 


-- Services Pour Analyse
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (100, 'rue de titi', null, '2021-01-15', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 3, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (101, 'rue de titi', null, '2021-01-15', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 4, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (102, 'rue de titi', null, '2021-01-15', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 5, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (103, 'rue de titi', null, '2021-01-15', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 6, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (104, 'rue de titi', null, '2021-01-15', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 7, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (105, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 8, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (106, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 9, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (107, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 10, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (108, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 10, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (109, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 11, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (111, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 12, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (112, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 13, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (113, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 13, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (114, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 15, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (115, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-01-14', '08:00:00', '11:00:00', null, 16, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (116, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 16, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (117, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 19, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (118, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 20, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (119, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 21, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (120, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 26, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (121, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 24, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (122, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 35, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (123, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 36, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (124, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 37, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (125, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 44, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (126, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 15, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (127, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 10, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (128, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 11, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (129, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 18, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (130, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 22, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (131, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 24, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (132, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 1, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (133, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 2, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (134, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 3, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (135, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 4, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (136, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 5, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (137, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 6, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (138, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 8, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (139, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 7, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (140, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 9, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (141, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 10, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (142, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 11, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (143, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 13, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (144, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 12, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (145, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 15, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (146, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 16, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (147, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 18, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (149, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 19, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (150, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 20, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (151, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 20, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (152, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 20, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (153, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 29, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (154, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 29, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (155, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 25, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (156, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 28, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (157, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 28, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (158, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 28, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (159, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 22, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (160, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 21, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (161, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 7, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (162, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 6, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (163, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 6, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (164, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 8, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (165, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 8, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (166, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 10, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (167, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 11, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (168, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 7, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (169, 'rue de titi', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 40, 1); 

-- Insert Services pour analyse Non cloturés
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (301, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (302, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (303, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (304, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (305, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (306, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (307, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (308, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (309, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (310, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (311, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (312, 'rue de titi', null, null, '2020-08-12', '2021-01-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (313, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (314, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (315, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (316, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (317, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (318, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (319, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (320, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (321, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (322, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (323, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (324, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (325, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (326, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (327, 'rue de titi', null, null, '2020-08-12', '2021-02-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (328, 'rue de titi', null, null, '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (329, 'rue de titi', null, null, '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (330, 'rue de titi', null, null, '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (331, 'rue de titi', null, null, '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (332, 'rue de titi', null, null, '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (333, 'rue de titi', null, null, '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (334, 'rue de titi', null, null, '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (335, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (336, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (337, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (338, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (339, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (340, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (341, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (342, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (343, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (344, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (345, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (346, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (347, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (348, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (349, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (350, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (351, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (352, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (353, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (354, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (355, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (356, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (357, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (358, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (359, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (360, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (361, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (362, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (363, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (364, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (365, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (366, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (367, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (368, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (369, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (370, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (371, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (372, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (373, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (374, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (375, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (376, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (377, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (378, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (379, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (380, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (381, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (382, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (383, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (384, 'rue de titi', null, null, '2020-08-12', '2021-04-19', '08:00:00', '11:00:00', null, 40, 1); 


-- Insert Service Pour Litiges
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (200, '20 Avenue de Ségur 75007 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 40, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (201, '17 Rue Lecourbe 75015 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 18, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (202, '17 Rue Lecourbe 75015 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 37, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (203, '25 Rue des Pyrénées 75020 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 25, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (204, '25 Rue des Pyrénées 75020 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 3, 2); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (205, '10 Rue d’Alésia 75014 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 20, 2); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (206, '10 Rue d’Alésia 75014 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 11, 3); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (207, '22 Rue Marcadet 75018 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 9, 3); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (208, '2 Avenue Jean Jaurès 75019 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 7, 4); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (209, '2 Avenue Jean Jaurès 75019 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 4, 4); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (210, '20 Avenue de Ségur 75007 Paris', null, '2020-08-19', '2020-08-12', '2021-03-18', '08:00:00', '11:00:00', null, 12, 4); 


-- Insert Reponse Service
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (1, '2020-08-12',null, 1, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (2, '2020-08-12','2020-08-12', 2, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (8, '2021-01-13', null, 8, 5);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (9, '2021-01-13', null, 9, 2);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (10, '2020-08-12','2020-08-12', 10, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (11, null, null, 11, 5);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (12, '2020-08-12', null, 12, 5);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (13, '2020-03-21', null, 21, 2);


-- Insert Reponse Service pour Litiges
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (200, '2020-08-12', null, 200, 2);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (201, '2020-08-12', null, 201, 2);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (202, '2020-08-12', null, 202, 3);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (203, '2020-08-12', null, 203, 3);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (204, '2020-08-12', null, 204, 4);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (205, '2020-08-12', null, 205, 3);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (206, '2020-08-12', null, 206, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (207, '2020-08-12', null, 207, 4);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (208, '2020-08-12', null, 208, 3);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (209, '2020-08-12', null, 209, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (210, '2020-08-12', null, 210, 2);


-- Insert Litiges
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (1, "10 minutes de retard", null, '2021-03-21', 200, 1, 1);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (2, null, null, '2021-03-22', 201, 5, 2);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (3, null, null, '2021-03-23', 202, 1, 3);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (4, null, '2021-02-02', '2021-02-01', 203, 1, 1);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (5, null, null, '2021-03-21', 204, 4, 2);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (6, "Je n'ai pas été remboursé", '2021-03-06', '2021-03-05', 205, 2, 3);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (7, null, '2020-12-31', '2020-12-30', 206, 3, 3);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (8, "Il a cassé un rétroviseur", '2020-12-27', '2019-12-20', 207, 5, 3);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (9, null, '2020-12-11', '2020-12-10', 208, 4, 4);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (10, "Personne impolie", '2020-11-29', '2020-11-28', 209, 5, 1);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (11, "Très désagrébale", '2020-11-17', '2020-11-16', 210, 5, 2);


-- Insert Négociation
INSERT INTO `negociation` (id, dateCloture, dateCreation, dateProposee, heureDbtProposee, heureFinProposee, isAccepted, createurNego_id, repondeurNego_id, service_id) VALUES (1, null, '2018-08-15', '2021-03-13', '15:45:00', '18:45:00', false, 1, 2, 1);


-- Insert Suspension Compte
INSERT INTO `suspension_compte` (id, dateDbtSuspension, dateFinSuspension, utilisateur_id) VALUES (1, '2021-08-15', '2021-08-25', 2);


-- Insert Preference Ville
INSERT INTO `preference_ville` (id, utilisateur_id, ville_id) VALUES (1, 1, 1);
INSERT INTO `preference_ville` (id, utilisateur_id, ville_id) VALUES (2, 5, 5);
INSERT INTO `preference_ville` (id, utilisateur_id, ville_id) VALUES (3, 5, 4);
INSERT INTO `preference_ville` (id, utilisateur_id, ville_id) VALUES (4, 5, 10);
INSERT INTO `preference_ville` (id, utilisateur_id, ville_id) VALUES (5, 5, 7);


-- Insert Preference Aide
INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (1,2,2);
INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (2,5,5);
INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (3,6,5);
INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (4,7,5);
INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (5,35,5);
INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (6,34,5);
--INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (2,2,5);