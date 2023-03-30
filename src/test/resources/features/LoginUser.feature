Feature:Validar el funcionamiento del Login
  Yo como analista
  Necesito realizar pruebas de Login en la pagina
  Para Validar el correcto funcionamiento


  @TestCase2
  Scenario:Realizar Login de forma correcta en la pagina
    Given Ingreso a la pagina que se empleara para pruebas
    When Ingreso la informacion solicitada para el Login
    Then Valido que el login se genere de forma correcta

  @TestCase3
  Scenario: Realizar login con correo incorrecto
    Given Ingreso a la pagina que se empleara para pruebas
    When Ingreso la informacion solicitada para el Login con correo incorrecto
    Then Valido que se genere el mensaje de control

  @TestCase4
  Scenario: Realizar el Logaut de forma correcta en la pagina
    Given Ingreso a la pagina que se empleara para pruebas
    When Realizo el login en la pagina con las credenciales correctas
    Then Valido que permita realizar el logaut


