Feature:Validar el carge de forma correcta de las Paginas de la Web
  Yo como Analista Qa
  Necesito validar el correcto cargue de las paginas de las Web
  Para comprobar que no se presenten fallos

  @TestCase6
  Scenario: Validar el funcionamiento de la pagina Contact Us Form
    Given ingreso a la pagina que se empleara para pruebas opcion de Contact us
    When realizo la validacion de las funcionalidades de la pagina
    Then Verifico que no se presenten errores en el flujo
