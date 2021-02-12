# language: es
@plataforma:web
@feature:login
Característica: Login en la pagina de DocEle

  @regression @loginEscenarioValido
  Escenario: Login a DocEle con un usuario y contrasena valida
    Dado que cliente requiere ingresar al portal URL DocEle
    Cuando ingresa su usuario valido 'correo@correo.com' y contrasena correcta 'psswd'
    Entonces selecciona el boton de ingresar
    Y el usuario accede al a la pagina y aparecera su nombre de usuario 'Usuario Name'

  @regression @loginEscenarioInvalido
  Escenario: Login a DocEle con un usuario y contrasena valida
    Dado que cliente requiere ingresar al portal URL DocEle
    Cuando ingresa su usuario valido 'correo@correo.com' y contrasena correcta 'psswd'
    Entonces selecciona el boton de ingresar
    Y el usuario accede al a la pagina y aparecera su nombre de usuario 'Usuario Name'