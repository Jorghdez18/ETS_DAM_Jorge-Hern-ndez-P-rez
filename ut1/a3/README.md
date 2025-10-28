
<center>

# PRACTICANDO CON GIT
___

</center>

***Nombre:*** Jorge Hernandez Perez
<br>
***Curso:*** 1DAM
___
### ÍNDICE

+ [Introducción](#id1)
+ [Objetivos](#id2)
+ [Material empleado](#id3)
+ [Desarrollo](#id4)
+ [Conclusiones](#id5)
+ [Preguntas y respuestas dentro de la actividad](#id5)

___
#### ***Introducción***. <a name="id1"></a>
En esta practica realizaremos una actividad de repaso para saber utilizar git. En ella haremos dos actividades, en una crearemos un repositorio en el cual haremos diferentes comandos, que a su misma vez nos daran una serie de conflictos que tendremos que ir solucionando poco a poco. En la segunda actividad realizaremos un readme en el cual redactaremos el guion de la actividad, para asi dejar documentado nuestro trabajo.
___
#### ***Objetivos***. <a name="id2"></a>

Los objetivos de esta actividad, serian aprender a usar git y la terminal para asi desemvolvernos bien con dichas herramientas, ademas de aprender a resolver conflictos.

#### ***Material empleado***. <a name="id3"></a>

En esta actividad utilizaremos nuestra maquina virtual de linux, junto a la terminal y a la herramienta git, que se conectara a nuestro repositorio en git hub para asi almacenar todo nuestro progreso.

#### ***Desarrollo***. <a name="id4"></a>

1-Primero iniciaremos nuestro proyecto creando nuestro primer commit, llamado "commit inicial".
<br>
2-Luego crearemos dentro de nuestro repo un Readme.
<br>
3-Despues de esto haremos un push para enviar los cambios a nuestro repositorio remoto.
<br>
4-Luego creamos un fichero llamado privado.txt
<br>
5-Creamos una nueva carpeta llamada privada
<br>
6-Luego realizamos unos cambios oportunos para que tanto el archivo y la carpeta sean ignorados por git.
<br>
7-Añadimos los cambios, y creamos un nuevo commit llamado "añadido al fichero .gitignore"
<br>
8-Añadimos el fichero 1.txt al repositorio local, y hacemos un nuevo commit denominado como "añadido a 1.txt".
<br>
9-Creamos un tag.
<br>
10-Subimos los cambio al repositorio remoto.
<br>
11-Creamos una nueva rama denomionada como "v0.2"
<br>
12-Añadimos un fichero 2.txt en la rama que acabamos de crear y hacemos un nuevo commit para guardar los camnbios.
![cap3](/ut1/a3/img/cap3.png)
<br>
13-Subimos los cambios al repositorio remoto.
<br>
14-Nos posicionamos en la rama main y  hacemos un merge de la rama v0.2 en la rama main.
<br>
15-En la rama main agregamos un "Hola" en el fichero 1.txt y hacemos un nuevo commit.
![cap4](/ut1/a3/img/cap4.png)
<br>
16-Luego nos posicionamos en la rama v0.2 y ponemos un "Adios" en el fichero 1.txt para hacer nuevamente otro commit.
<br>
17-Nos poosicionamos de nuevo en la rama main y hacemos un merge con la rama v0.2, para hacer de nuevo un nuevo commit.
<br>
18- Listamos las ramas con merge y las ramas sin merge.
<br>
19-Como nos ha salido un conflicto, arreglamos dicho problema y hacemos un commit.
![cap5](/ut1/a3/img/cap5png)
<br>
20-Creamos un tag v0.2.
<br>
21-Borramos la rama v0.2.
<br>
22-Hacemos un listado de los distintos commits con sus ramas y sus tags.
![cap6](/ut1/a3/img/cap6.png)
<br>

> ***IMPORTANTE:*** si estamos capturando una terminal no hace falta capturar todo el escritorio y es importante que se vea el nombre de usuario.

En este trabajo he tenido algunas dificultades, pero todas han estado relacionadas con la parte de los pasos, ya que al ser bastantes a veces nos podemos llegar a confumdir saltandonos algun paso o equivocandonos en algun comando, o que nos olvidemos de hacer algun pull o commit, pero con la ayuda del trabajo diario y repaso podremos llegar a acostumbrarnos al uso de estas  herramientas. Ademas tambien he tenid dificultades a la hora de hacer mi maquina virtual, ya que al principio del todo no me dejaba usar virtualbox, pero metiendome en la bios de mi ordenador y cambiando algun ajuste he llegado a poder acceder a la maquina y poder hacer la tarea.
___
#### ***Conclusiones***. <a name="id5"></a>

Gracias a este trabajo he podido refrescar la memoria en cuanto a la utilizacion de distintos comandos de git y aperender algunos nuevos, ademas de poder empezar a documentar trabajos, lo cual nos ayudara a poder documentar mas en un futuro.
___

#### ***Preguntas y respuestas dentro de la actividad***. <a name="id5"></a>
1- Pregunta: Si has clonado el repositorio es necesario que parte del comando anterior puedo omitir.Justifica tu respuesta en el fichero
<br>
Tras clonar un repositorio, Git directamente configura el remoto y la rama que estás siguiendo, por lo tanto te puedes saltar "origin master"
<br>
2- Pregunta: el fichero y el directorio privado debe de subir al repositorio si se encuentra añadido al fichero .gitingnore. [Si/No]. Justifica tu respuesta en el fichero README.md:
<br>
Si un fichero o directorio está añadido al archivo .gitignore, significa que Git debe ignorarlo y no incluirlo en el repositorio. Esto se hace para evitar subir archivos innecesarios, temporales o que contengan información sensible (como configuraciones privadas o datos personales). Por tanto, no debe subirse al repositorio.
<br>
3- Pregunta: Si ejecutado las acciones add y commit, que realiza cada una sobre el/los ficheros. Justifica tu respuesta en el fichero README.md:
<br>
El comando git add prepara los archivos modificados o nuevos para ser guardados, mientras que el comando git commit guarda esos cambios en el historial del repositorio. En conjunto, ambos pasos permiten controlar y documentar la evolución del proyecto de manera organizada.
<br>
4-   Pregunta: ¿Qué es un tag sobre un repositorio git, en nuestro caso Github?. Justifica tu respuesta en el fichero README.md:
<br>
Es una etiqueta que marca un punto específico del historial, usada para identificar versiones importantes del proyecto.
<br>
5-Pregunta: Cuando estamos trabajando con ramas, cual es su fin, y sentido en organizaciones pequeñas/medianas/grandes. Justifica tu respuesta en el fichero README.md:
<br>
Las ramas permiten corregir errores sin afectar a la versión principal. En organizaciones pequeñas, medianas o grandes facilitan el trabajo, la organización del código y la colaboración entre equipos.
<br>
6-Pregunta: Se tendrían que producir conflictos en esta acción. [Si/No] Justifica tu respuesta en el fichero README.md:
<br>
No, no se deberían de producir conflictos en esa acción, pues el merge es directo entre la rama de trabajo y la principal, y se asume que al no haber modificaciones simultáneas, git puede realizar la fusión automáticamente.
___







