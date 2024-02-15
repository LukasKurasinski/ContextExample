# Context example with JavaEE 8

## This is a short example of simple context attributes management
### There are a couple of points made here:
    1. If we try to access an attribute that is not yet set in context, we get null
    2. if we set a context attribute in doGet, doPost etc. method it will not be set before a REQUEST is made to the Servlet
    3. If we set a context attribute in Servlets init() method, it is going to be set when the servlet is initialized.
        Meaning, it will be set first time any request is made to the Servlet.
    4. Attributes can be set on webapp start by using a specific context listener
    5. normal attributes are set when the setAttribute method is called.
    6. init attributes are ment to be set when Servlet or the app is initialized.