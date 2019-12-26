package com.ketil.coap;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class App 
{
    public static void main( String[] args )
    {
        CoapServer server = new CoapServer(5683);//主机为localhost 端口为默认端口5683
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

            @Override
            public void handleFETCH(CoapExchange exchange) { //重写处理FETCH请求的方法
               exchange.respond(ResponseCode.CONTENT, "FETCH:Hello CoAP!");  
            }

            @Override
            public void handlePATCH(CoapExchange exchange) { //重写处理PATCH请求的方法
               exchange.respond(ResponseCode.CONTENT, "PATCH:Hello CoAP!");  
            }

            @Override
            public void handleIPATCH(CoapExchange exchange) { //重写处理IPATCH请求的方法
               exchange.respond(ResponseCode.CONTENT, "IPATCH:Hello CoAP!");  
            }
        });
      server.start();
      
    }
}
