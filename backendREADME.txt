Requests currently served by URLs like 
https://bathroom-map-1525993289750.appspot.com/backend/api_w_ndb/get_msg_for_me?recipient=User2
https://bathroom-map-1525993289750.appspot.com/backend/api_w_ndb/get_msg_thread?recipient=User2&sender=User1
https://bathroom-map-1525993289750.appspot.com/backend/api_w_ndb/send_msg?recipient=u1&sender=u2&msg=testmessage1
https://bathroom-map-1525993289750.appspot.com/backend/api_w_ndb/delete_msg?recipient=User2&sender=User1

The app allows you to send messages easily but they can be enconded manually in a browser with the same URLs as above.

This modified backend starter code and can send messages using Volley and POST/GET Requests.
The app sends Strings over HTTP but I believe components can send JSONObjects or JSONArrays with the params.put().

send_msg uses POST which is recommended over GET to send parameters that get stored in a Message Class with a database.
In the web2py backend, send_msg uses nbd put() to create a JSONObject with dict pairs of the parameters that is stored in the database.

get_msg_for_me uses GET which is more complicated in sending parameters.
In the backend, it queries the Message Class database, filters using GET parameters, and creates a single JSONObject of a single dictionary pair with a string and an array of JSONObject messages: { "result" : [{,,},{,,},etc] }.

The way these pairs and objects are stored can be modified for whatever component and other database Classes can be created for them.
