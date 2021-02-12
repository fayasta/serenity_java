# language: es
@plataforma:services
Característica: Login en la pagina de Crece
  En orden de validar que solo clientes de Crece+ pueden ingresar a la pagina
  Como usuario
  Quiero poder ingresar los datos y acceder a la lista opciones disponibles y en el caso de que
  no este registrado o no proporcione los datos correctos, el sistema me indique el error

  Escenario: Login a Crece+ utilizando "Correo Electronico y Clave" con datos válidos
    Dado que se realiza el login con los datos Correo Electronico: 'qatesting@bodega.com' y Contraseña: '12345678'
    Entonces se obtiene un token de autenticacion