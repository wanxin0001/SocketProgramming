# SocketProgramming
Example about socket programming


1. SimpleClient and SimpleServer
SimpleClient will send a request to SimpleServer
Server is in a while loop for the request. It serverSocket doesn't receive any requests, it will hang there unitl receving the new request.

My old understanding is wrong: in a while loop, it serverSocket doesn't receive any new data, go to next while loop.
