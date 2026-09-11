It allows object with incompatible interfaces to word together.

An application like the e-comm and it sends email notification to customers. The in-house email notification service `EmailNotificationService` is shifting to the third party service like SendGrid. The interface in the in-house and the third party service are incompatible.

Say the in-house service uses sendEmail() method and takes some parameter and the SendGrid uses sendEmailNotification() method with different parameter and using the application will make the change in all the services and many change in existing code. The Adapter design pattern solves the problem.

In the code the notificationService.send part needs to be changed in the entire application. It an issue and also the third party application method will not be changed so the application method.
In the AdapterPattern code the send method is used and the sendEmail method is called internally.


In real word the java InputStreamReader uses the adapter pattern to convert InputStream(byte-based) to Reader(character-based).


