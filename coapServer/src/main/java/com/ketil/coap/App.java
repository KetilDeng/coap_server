package com.ketil.coap;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class App 
{
    public static void main( String[] args )
    {
        CoapServer server = new CoapServer(5684);//主机为localhost 端口为默认端口5683
        server.add(new CoapResource("api") {
            @Override
            public void handleGET(CoapExchange exchange) { //重写处理GET请求的方法
               exchange.respond(ResponseCode.CONTENT, "GET:Hello CoAP!"); 
            }

            @Override
            public void handlePOST(CoapExchange exchange) { //重写处理POST请求的方法
               exchange.respond(ResponseCode.CONTENT, "POST:Hello CoAP!");  
            }

            @Override
            public void handlePUT(CoapExchange exchange) { //重写处理PUT请求的方法
               exchange.respond(ResponseCode.CONTENT, "PUT:Hello CoAP!");  
            }

            @Override
            public void handleDELETE(CoapExchange exchange) { //重写处理DELETE请求的方法
               exchange.respond(ResponseCode.CONTENT, "DELETE:Hello CoAP!");  
            }
        });
      server.start();
      
    }
}
