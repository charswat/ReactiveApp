# ReactiveApp
El script que ejecuta la creación de 3 instancias EC2 de Aws, las configura  e instala  de docker, con  el jdk 1.8 de aws coretto 8 y finalmente realiza el despliegue de una aplicación alojada en el repositorio de docker para cada una de las instancias. La aplicación básicamente son 2 servicios rest reactivos que al ser consumidos verificamos la disponibilidad inmediata y la velocidad en la que responde, debido a que no dependen de ningún estado en particular para que se ejecute. Hay un servicio POST que tienen el método flux, y hay un servicio con un GET, que expone un método Nano.

1. Describe las Vpc disponibles
2. Verifica el grupo de seguridad, sino existe lo crea.
3. Obtienen la información del AMI.
4.Creacion de instancias.
5.instalaciones de componentes y docker 
6.Instalación instancias.
7 Verificación de las 3 instancias en AWS.

Consumo de instancias:
AygoReactive_1: ec2-54-147-244-67.compute-1.amazonaws.com:8080/user
AygoReactive_1: ec2-54-147-244-67.compute-1.amazonaws.com:8080/user/1
AygoReactive_2: ec2-3-83-24-90.compute-1.amazonaws.com:8080/user
AygoReactive_2: ec2-3-83-24-90.compute-1.amazonaws.com:8080/user/2
AygoReactive_3: ec2-3-87-208-69.compute-1.amazonaws.com:8080/user 
AygoReactive_3: ec2-3-87-208-69.compute-1.amazonaws.com:8080/user/6

 
 






