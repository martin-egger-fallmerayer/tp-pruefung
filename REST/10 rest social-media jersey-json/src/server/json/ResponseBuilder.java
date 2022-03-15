package server.json;

import javax.ws.rs.core.Response;

public class ResponseBuilder {

    /**
     * @param status HTTP-Status-Code (z.B. 404 = Not Found).
     * @param entity Ein beliebiges Objekt, das zurückgegeben wird.
     */
    public static Response build(int status, Object entity){
        return Response.status(status).entity(entity.toString()).build();
    }

}
