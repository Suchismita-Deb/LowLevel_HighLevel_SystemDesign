### Network protocol.

Network protocol defines the roles how two computers can connect.

7 OSI Layers.

### Application Layer.

It has two parts **Client Server Protocols** and **Peer To Peer Protocol**.
Client Server Protocol - **HTTP**, FTP, SMTP, **Web Sockets**.

Peer To Peer Protocol - **WebRTC**.

Client Server means one browser and one server. Browser will send the request and the server will send the response. Only client can start the request.

In web socket the relation is bi directional. Client can talk to the server and server can talk to the client. It is not peer to peer as there the client can talk to other client.

Whatsapp, Telegram and other messaging app uses web socket.
Any message server can send to the client.
Client will not always hit the request to the server for any new message, server should send the message.

HTTP - 1 connection. Like in web page we can go to the other page.

FTP - 2 connection. Control connection and Data connection.
Data connection can be create and disconnect but the control connection is always created.

SMTP - Sending the email. IMAP is used to access the email.

User agent talks to the MTA(Message Transfer Agent) client and it tlks to the MTA server. MTA server connect to the User agent.

### Transport Layer or Network Layer.

TCP/IP - First maintain a virtual connection between two device and then make the data in small packets and then give them a sequence. For every packets there is an acknowledgement and when one packets not recived then it again send the packets.

UDP/IP - No connection, order, ackowledgement maintains and data is divided in data grams and sends together. Datagrams are send and no acknowledment or order of the packets are there. It is fast.
Like video calling if some parts gets missed then it continues for the next things and it does not waits for the part to again come.

**WebRTC** uses UDP. Like Video steaming.
WebRTC is a peer to peer protocol which uses UDP to transfer the data.

Summary.

Rest API and wep page HTTP.
Messaging app - WebSocket.
Live Streaming - WebRTC and UDP.
