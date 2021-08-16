
// ESTE FRAGMENTO DE CODIGO NOS AYUDARA A EVITAR QUE SALGAMOS DE LA SECION HASTA CERRARLA CON EL BOTON DE SALIR


String to = request.getParameter("to")!= null ? request.getParameter("to"): "view/home.jsp";
request.getRequestDispatcher("WEB-INF/"+to).forward(request,response);



// ESTE FRAGMENTO DE COODIGO VA EN EL SERVLET QUE NOS AYUDARA A CERRAR UNA SESION POR EL METODO DO GET

HttpSession session = request.getSession(true);
session.invalidate();
request.getRequestDispatcher("index.jsp").forward(request,response);

// -------------------------------------------------------------------------------------------------------


//SECCION DE TAGLIBS-------

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<c:if test="${sessionScope.login==null}">
    <c:redirect url="/index.jsp"/>
</c:if>   




// ESTO DEPENDENCIA VA EN EL POM ES UN JSTL

<dependency>
   <groupId>javax.servlet</groupId>
   <artifactId>jstl</artifactId>
   <version>1.2</version>
</dependency>

//----------------------------------------------------------