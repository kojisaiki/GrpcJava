package org.example.impl.server;

import io.grpc.ServerBuilder;

public class Server {
    public static void main(String[] args) {
        int port = 8080;

        io.grpc.Server server = ServerBuilder.forPort(port).addService()
    }
}
