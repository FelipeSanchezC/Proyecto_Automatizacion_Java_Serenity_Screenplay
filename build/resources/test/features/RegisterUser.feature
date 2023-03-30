Feature: Validar funcionameinto del Register User
  Yo como analista
  Necesito Validar el funcionameinto del register User
  Para comprobar que cumpla con las solicitudes del cliente

  @TestCase1
  Scenario: Realizar registro de usuario con toda la infromaicon correcta
    Given Ingreso a la pagina que se empleara para pruebas
    When Realizo un flujo de Register User
    Then Valido que l usuario quede registrado de forma correcta

  @TestCase5
  Scenario: Realizar registro de usuario con un correo que se encuentre registrado
    Given Ingreso a la pagina que se empleara para pruebas
      When Realizo un flujo de Register User con correo ya registrado
    Then Valido que se presente el mensaje de control por el corroe



