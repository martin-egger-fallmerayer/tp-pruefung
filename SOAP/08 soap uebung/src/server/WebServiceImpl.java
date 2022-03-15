package server;


import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.jws.WebService;
    

@WebService(targetNamespace = "http://localhost:12345/MusicShop", endpointInterface = "server.WebServiceInterface", name="MusicShop", serviceName="MusicShopService")

public class WebServiceImpl<HttpRequest> implements WebServiceInterface {
    @Override
    public float getPriceForAlbum(String artist, String album) {
        return (float) 13.034;
    }

    @Override
    public String[] getAlbumsFromArtist(String artist) throws IOException {
        return new String[]{"Hello from the other side", "u are still on the dark side", "dedicated"};
    }

    @Override
    public String buyAlbum(String artist, String album) {
        return "success";
    }
}
