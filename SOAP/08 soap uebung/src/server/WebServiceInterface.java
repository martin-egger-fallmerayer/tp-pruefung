package server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.io.IOException;

@WebService(name = "MusicShop", targetNamespace = "http://localhost:12345/MusicShop")
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface WebServiceInterface {
    @WebMethod(operationName = "getPriceForAlbum")
    @WebResult(name = "price_EUR")
    public float getPriceForAlbum(@WebParam(name = "artist") String artist, @WebParam(name = "album") String album);

    @WebMethod(operationName = "getAlbumsFromArtist")
    @WebResult(name = "albums")
    public String [] getAlbumsFromArtist(@WebParam(name = "artist") String artist) throws IOException;

    @WebMethod(operationName = "buyAlbum")
    @WebResult(name = "status")
    public String buyAlbum(@WebParam(name = "artist") String artist, @WebParam(name = "album") String album);


}
