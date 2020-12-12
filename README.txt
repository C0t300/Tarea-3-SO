Tarea-3-SO

José Runín
201873553-1

Importante:
	-Correr con JDK 8, pero setear el ompiler compliance level de eclipse a 1.8. No logre compilarlo fuera de eclipse.
  
Problema 2:
	Mientras mas grande el n que se le entrea al "creador de arrays", mayor es la diferencia.
	Con:
		int n = 100000000;
		int maxNumber = 100;
	La diferencia fue de 10 segundos a favor de los threads, haciendo evidente la mejora.
	
	No hubo mucho que cambiar de la implementacion original, principalmente se hizo lo necesario para 
	lograr hacer correr la misma implementacion con threads, sobreescribiendo las 
	funciones necesarias para lograr hacer el run(), y modificando minimamente la clase, para poder
	entregar las variables necesarias.
	
	El dato que se le entrega es un array de largo n, con los numeros de 0 a maxNumber. Mientras
	mas grande n, mas es la diferencia a favor de la implementacion con threads.
	
	El punto de quiebre es en aproximadamente n = 400000, con el mismo maxNumber de 100, donde
	quien "gana" es pura varianza.
	
	El sort es basicamente un mergeSort "traducido" a Java.