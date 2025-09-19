package com.agus.protosim.tcp;

public class TCPSimulator {
    
    public static void main(String[] args) {
        System.out.println("=== PROTOTIPO TCP ===");
        System.out.println("Primera parte del programa");
        System.out.println();
        
        System.out.println("1. Creando servidor...");
        TCPServer servidor = new TCPServer();
        
        System.out.println("2. Creando cliente...");
        TCPClient cliente = new TCPClient();
        
        System.out.println("3. Probando métodos básicos...");
        servidor.iniciar();
        cliente.conectar();
        
        System.out.println("4. Prototipo completado!");
        System.out.println("(Esta es solo la primera parte del programa)");
    }
}
