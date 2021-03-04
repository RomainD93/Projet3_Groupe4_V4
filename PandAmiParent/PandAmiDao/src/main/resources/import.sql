-- Insert des Catégorie Aide
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (1, 'Extérieur');
INSERT INTO `categorie_aide` (id, nomCategorieAide) VALUES (2, 'Intérieur');

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
INSERT INTO `type_aide` (id, typeAide) VALUES (1, 'jardinage');
INSERT INTO `type_aide` (id, typeAide) VALUES (2, 'bricolage');
INSERT INTO `type_aide` (id, typeAide) VALUES (3, 'ménage');
INSERT INTO `type_aide` (id, typeAide) VALUES (4, 'soutien scolaire');
INSERT INTO `type_aide` (id, typeAide) VALUES (5, 'accompagnement RDV médical');

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