import socket
import csv

UDP_IP_ADDRESS = "127.0.0.1"
UDP_PORT_NO = 6449
serverSock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
serverSock.bind((UDP_IP_ADDRESS, UDP_PORT_NO))

data, addr = serverSock.recvfrom(1024)
