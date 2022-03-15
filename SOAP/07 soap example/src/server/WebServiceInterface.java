package server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "HelloWorld", targetNamespace = "http://localhost:12345/HelloWorld")
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface WebServiceInterface {
        @WebMethod(operationName = "getHelloWorldAsString")
        @WebResult(name = "result")
    public String getHelloWorldAsString(@WebParam(name = "str") String str);
}
