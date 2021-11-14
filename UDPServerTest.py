# # Again we import the necessary socket python module
# import socket
# import sys
# # Here we define the UDP IP address as well as the port number that we have
# # already defined in the client python script.
# UDP_IP_ADDRESS = "192.168.86.163"
# UDP_PORT_NO = 1234


# # declare our serverSocket upon which
# # we will be listening for UDP messages
# serverSock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
# # One difference is that we will have to bind our declared IP address
# # and port number to our newly declared serverSock
# serverSock.bind((UDP_IP_ADDRESS, UDP_PORT_NO))

# while True:
#     data, addr = serverSock.recvfrom(1024)
#     print("Message: " + data.decode())

import socket
import sys

if len(sys.argv) == 3:
    ip = sys.argv[1]
    port = sys.argv[2]
else:
    print("Run with command: python3 server.py <arg1:server ip for this system> <server port number> ")
    exit(1)

# Create socket
UDPSocket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
# Bind socket to port
server_address = (ip, port)
UDPSocket.bind(server_address)
print("Ctrl + C to exit")

while True:
    print("####### Server is listening #######")
    data, address = UDPSocket.recvfrom(4096)
    print("\n\n 2. Server received: ", data.decode('utf-8'), "\n\n")
    send_data = input("Type some text to send => ")
    UDPSocket.sendto(send_data.encode('utf-8'), address)
    print("\n\n 1. Server sent : ", send_data, "\n\n")
