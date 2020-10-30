# ReactiveApp
El script que ejecuta la creación de 3 instancias EC2 de Aws, las configura  e instala  de docker, con  el jdk 1.8 de aws coretto 8 y finalmente realiza el despliegue de una aplicación alojada en el repositorio de docker para cada una de las instancias. La aplicación básicamente son 2 servicios rest reactivos que al ser consumidos verificamos la disponibilidad inmediata y la velocidad en la que responde, debido a que no dependen de ningún estado en particular para que se ejecute. Hay un servicio POST que tienen el método flux, y hay un servicio con un GET, que expone un método Nano.

1. Describe las Vpc disponibles
![vpcs](https://user-images.githubusercontent.com/72947118/97646865-d633eb80-1a1e-11eb-8ae7-a1cf1de72737.jpg)

2. Verifica el grupo de seguridad, sino existe lo crea.
![reglas](https://user-images.githubusercontent.com/72947118/97646889-e51a9e00-1a1e-11eb-848e-6d2e0847aff2.jpg)
3. Obtienen la información del AMI.
![traeAMI](https://user-images.githubusercontent.com/72947118/97646970-0ed3c500-1a1f-11eb-960e-a331a01b41a5.jpg)
4.Creacion de instancias.
![creacion de instancias](https://user-images.githubusercontent.com/72947118/97646993-1f843b00-1a1f-11eb-83e4-ffa1e005fdb1.jpg)
5.instalaciones de componentes y docker 
![instalacion componentes docker 1 instancia](https://user-images.githubusercontent.com/72947118/97647067-4d697f80-1a1f-11eb-9140-e995ad605ced.jpg)

6.Instalación instancias.
![instalacion componentes docker 1 instancia](https://user-images.githubusercontent.com/72947118/97647241-bea93280-1a1f-11eb-9d40-20afeef6b122.jpg)
7 Verificación de las 3 instancias en AWS.
![1](https://user-images.githubusercontent.com/72947118/97647556-90782280-1a20-11eb-985b-38f911a07442.jpg)
![2](https://user-images.githubusercontent.com/72947118/97647559-9241e600-1a20-11eb-8994-4b07c2881f97.jpg)
![3](https://user-images.githubusercontent.com/72947118/97647563-93731300-1a20-11eb-82d8-c8ae1555e475.jpg)
![4](https://user-images.githubusercontent.com/72947118/97647565-94a44000-1a20-11eb-86ab-9b8b01dffb7d.jpg)
![5](https://user-images.githubusercontent.com/72947118/97647569-95d56d00-1a20-11eb-89c2-5cfc5c55086d.jpg)

7 Verificación de las 3 instancias en AWS.
![i1](https://user-images.githubusercontent.com/72947118/97647922-725ef200-1a21-11eb-80ef-a13179606397.jpg)
![i2](https://user-images.githubusercontent.com/72947118/97647924-72f78880-1a21-11eb-9de6-7169f25a5fdc.jpg)
![i3](https://user-images.githubusercontent.com/72947118/97647927-74c14c00-1a21-11eb-8312-15ad342b4d55.jpg)
![i4](https://user-images.githubusercontent.com/72947118/97647932-7559e280-1a21-11eb-879a-d024a15f59ef.jpg)
Consumo de instancias:

AygoReactive_1: ec2-54-147-244-67.compute-1.amazonaws.com:8080/user
![e1](https://user-images.githubusercontent.com/72947118/97648310-67589180-1a22-11eb-82d3-23ecef85a9fd.jpg)

AygoReactive_1: ec2-54-147-244-67.compute-1.amazonaws.com:8080/user/1
![e2](https://user-images.githubusercontent.com/72947118/97648311-67f12800-1a22-11eb-8627-70562120f6a6.jpg)

AygoReactive_2: ec2-3-83-24-90.compute-1.amazonaws.com:8080/user
![e3](https://user-images.githubusercontent.com/72947118/97648344-7e977f00-1a22-11eb-9cc9-65abed6ef08e.jpg)

AygoReactive_2: ec2-3-83-24-90.compute-1.amazonaws.com:8080/user/2
![e4](https://user-images.githubusercontent.com/72947118/97648349-80614280-1a22-11eb-907c-36288ae00f36.jpg)

AygoReactive_3: ec2-3-87-208-69.compute-1.amazonaws.com:8080/user 
![e5](https://user-images.githubusercontent.com/72947118/97648382-9838c680-1a22-11eb-925c-86cd60870e60.jpg)

AygoReactive_3: ec2-3-87-208-69.compute-1.amazonaws.com:8080/user/6

 ![e6](https://user-images.githubusercontent.com/72947118/97648385-9969f380-1a22-11eb-968a-1ec04414256d.jpg)
 






