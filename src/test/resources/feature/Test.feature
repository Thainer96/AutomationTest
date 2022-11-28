#language: es
Característica: Automatizacion Test

  Antecedentes: 
    Dado un usuario que ingrese a la pagina de fallabella

  @RegistrarUsuarioFallabella
  Esquema del escenario: Registrar usuario en fallabella
    Cuando seleccione el desplegable registrarte
    Y llene el formulario con la siguiente informacion <Nombre><PrimerApellido><RUT><Celular><Correo><Contrasena>
    Entonces se permite el registro de un usuario en el portal

    Ejemplos: 
      | Nombre   | PrimerApellido   | RUT           | Celular      | Correo                   | Contrasena    |
      | "pepito" | "Perez Carrillo" | "9.995.632-1" | "3133421083" | "Praueba1aas23@mail.com" | "Password123" |

  @EliminarProductosCarrito
  Esquema del escenario: Eliminar productos seleccionados del carrito
    Cuando realice la busqueda <Busqueda>
    Y seleccione el producto con nombre <Producto>
    Y agrege al carrito aumentando la cantidad maxima por producto
    Entonces permite eliminar la cantidad total de la orden

    Ejemplos: 
      | Busqueda       | Producto                                 |
      | "control Play" | "Mando control para play station 4 rojo" |

  @HacerCompraPorCarrito
  Esquema del escenario: Realizar la compra por el carrito
    Cuando realice la busqueda <Busqueda>
    Y seleccione el producto con nombre <Producto>
    Y agrege al carrito aumentando la cantidad maxima por producto  
    Y se agregue el <Correo>  

    Ejemplos: 
      | Busqueda       | Producto                                 |Correo|
      | "control Play" | "Mando control para play station 4 rojo" |"Praueba1aas23@mail.com"|
