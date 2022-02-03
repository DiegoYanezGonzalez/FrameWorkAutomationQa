Feature: Validar que al comprar un producto se muestre un mensaje de error de mail invalido

  'Cuando estoy en la pagina de MercadoLibre , y compro un notebook
  al ingresar un mail invalido en el formulario del cliente de Soy Nuevo
  se muestra un mensaje de error correspondiente.'

  Scenario Outline: 01 - Mensaje de error Mail Invalido - Compra
    Given cuando estoy en la pagina de MercadoLibre
    When agrego un "<product>" al campo de texto
    And doi click en el boton buscar
    And selecciono marca Hp
    And selecciono la primera opcion de los resultados
    And selecciono el boton comprar ahora
    And click en opcion Soy Nuevo
    And al agregar el "<user>" el "<apellido>" el "<mail>" invalido y el "<pass>"
    Then se muestra un mensaje error

    Examples:
      |product      |user |apellido|mail|pass
      |notebooks    |asd|qwe   |a@b |qwerty

