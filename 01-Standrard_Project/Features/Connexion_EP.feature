Feature: Connexion à l'Espace Perso de SeLoger

  Scenario: Vérificaiton de la connexion à l'Espace Perso
    Given Ouvre la Home Page de SeLoger
    When Clique sur le bouton d'accès à l'EP
    And Choisir l'onglet 'Se connecter'
    And Saisir les bons Login
    And Clique sur le bouton 'Se connecter'
    Then L'utilisateur est connecté
