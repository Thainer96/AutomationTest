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
      | Nombre   | PrimerApellido   | RUT           | Celular      | Correo               | Contrasena    |
      | "pepito" | "Perez Carrillo" | "9.995.632-1" | "3133421083" | "Praueba1aas23@mail.com" | "Password123" |

  @EliminarProductosCarrito
  Esquema del escenario: Realizar compra en fallabella
  Cuando realice la busqueda <Busqueda>
  Y seleccione el producto con nombre <Producto>
  Y agrege al carrito aumentando la cantidad maxima por producto  
  Entonces permite eliminar la cantidad total de la orden
  
  Ejemplos:
  |Busqueda| Producto| 
  |"control Play"|  "Mando control para play station 4 rojo" |
   