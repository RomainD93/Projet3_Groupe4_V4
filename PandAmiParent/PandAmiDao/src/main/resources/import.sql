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

-- Insert Utilisateur Admin
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (6, null, '2018-01-01', '1987-02-08', 'analyste.admin@pandami.fr', 'analyste', '0102030400', 'admin', 'admin_analyste', null, 3, 2, 'Siège Social PANDAMI');
INSERT INTO `utilisateur` (id, dateDesinscription, dateInscription, dateNaissance, email, nom, numTelephone, password, prenom, rayonAction, genre_id, typeUtilisateur_id, adresse) VALUES (7, null, '2018-01-01', '1987-02-08', 'moderateur.admin@pandami.fr', 'moderateur', '0102030400', 'admin', 'admin_moderateur', null, 3, 3, 'Siège Social PANDAMI');

-- Insert Disponibilite
INSERT INTO `disponibilite` (id, dbtValiditeDispo, finValiditeDispo, heureDbtDispo, heureFinDispo, jourSemaine_id, utilisateur_id) VALUES (1, '2018-08-12', null, '14:30:00', '19:00:00', 1, 1);

-- Insert Service
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (1, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 35, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (2, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 34, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (3, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 33, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (4, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 32, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (5, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 31, 5); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (6, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 30, 5); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (7, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 29, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (8, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 28, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (9, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 27, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (10, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 26, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (11, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 25, 1); 
INSERT INTO `service` (id, adresse, dateAnnulation, dateCloture, dateCreation, dateService, heureDbt, heureFin, sommeAPrevoir, typeAide_id, utilisateur_id) VALUES (12, 'rue de titi', null, null, '2020-08-12', '2021-03-17', '08:00:00', '11:00:00', null, 24, 1); 


-- Insert Reponse Service
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (1, '2020-08-12','2020-08-12', 1, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (2, '2020-08-12','2020-08-12', 2, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (3, '2020-08-12','2020-08-12', 3, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (4, '2020-08-12','2020-08-12', 4, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (5, null, null, 5, 5);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (6, '2020-08-12', null, 6, 5);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (7, '2020-08-12','2020-08-12', 7, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (8, null, null, 8, 5);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (9, '2020-08-12', null, 9, 5);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (10, '2020-08-12','2020-08-12', 10, 1);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (11, null, null, 11, 5);
INSERT INTO `reponse_service` (id, dateAcceptation, dateDesistement, service_id, utilisateur_id) VALUES (12, '2020-08-12', null, 12, 5);




-- Insert Litige
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (1, "Je n'ai pas été remboursé", null, '2019-12-31', 1, 2, 1);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (2, "Je n'ai pas été remboursé", null, '2019-12-31', 1, 1, 1);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (3, "Je n'ai pas été remboursé", null, '2019-12-31', 1, 2, 1);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (4, "Je n'ai pas été remboursé", '2019-12-31', '2019-12-30', 1, 3, 1);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (5, "Je n'ai pas été remboursé", null, '2019-12-31', 1, 4, 1);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (6, "Je n'ai pas été remboursé", '2019-12-31', '2019-12-29', 1, 5, 1);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (7, "Je n'ai pas été remboursé", null, '2019-12-31', 1, 2, 1);
INSERT INTO `litige` (id, commentaires, dateCloture, dateCreation, service_id, typeLitige_id, utilisateur_id) VALUES (8, "Je n'ai pas été remboursé", null, '2019-12-31', 1, 2, 1);

-- Insert Négociation
INSERT INTO `negociation` (id, dateCloture, dateCreation, dateProposee, heureDbtProposee, heureFinProposee, isAccepted, createurNego_id, repondeurNego_id, service_id) VALUES (1, null, '2018-08-15', '2021-03-13', '15:45:00', '18:45:00', false, 1, 2, 1);

-- Insert Suspension Compte
INSERT INTO `suspension_compte` (id, dateDbtSuspension, dateFinSuspension, utilisateur_id) VALUES (1, '2021-08-15', '2021-08-25', 2);


-- Insert Preference Ville
INSERT INTO `preference_ville` (id, utilisateur_id, ville_id) VALUES (1, 1, 1);
INSERT INTO `preference_ville` (id, utilisateur_id, ville_id) VALUES (2, 5, 5);
INSERT INTO `preference_ville` (id, utilisateur_id, ville_id) VALUES (3, 5, 4);
INSERT INTO `preference_ville` (id, utilisateur_id, ville_id) VALUES (4, 5, 22);

-- Insert Preference Aide
INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (1,2,2);
INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (2,5,5);
INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (3,6,5);
INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (4,7,5);
--INSERT INTO `preference_aide` (id, typeAide_id, utilisateur_id) VALUES (2,2,5);