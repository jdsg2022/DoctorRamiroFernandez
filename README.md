# Doctor Ramiro Fernandez

## Para el desarrollo del contenido fue necesario entender la necesidad del cliente, el cual solicitaba poder gestionar sus citas medicas, sus pacientes y la información de los mismos.

### Fue necesesario contemplar diferentes modelos para lograr cumplir todas las necesidades del cliente.

- Inicialmente se contempla en el codigo, manejar un diseño ordenado por medio de paquetes,
los cuales son fundamentales para la comprensión del codigo: se tuvo en cuanta cuatro paquetes, que son:
controllers: son clases, las cuales nos permite manejar toda la interacción con nuestra API
models: son clases, que son modelos para poder construir y realizar la abstración de la necesidad del cliente. 
repositorys: son clases, donde allí almacenaremos datos de nuestros modelos.
services: donde tendremos clases, las cuales nos ayudaran a tener toda nuestra logica de negocio y ejecutar los requerimientos. 
**Todo lo anterior, es con el fin de lograr una independencia unica en cada clase, para reflejar un orden por medio de las 
buenas practicas de programación.**

### Los modelos que se tuvieron en cuenta son:
- Doctor
- Paciente
- Historia Medica
- Cita Medica
- Horario Doctor

### Las repositorios que se tuvieron en cuenta son:
- Cita Repositorio: esta clase contiene una lista donde nos permitirá almacenar las citas agregadas previamente o de forma futura. 
- Paciente Repositorio: en este tipo de repositorio, almacenaremos todos aquellos pacientes que esten incritos en el consultorio y también todos aquellos pacientes nuevos que vayan incribiendose.
- Historia medica Repositorio: en esta clase, almacenaremos las historias clinicas de cada uno de los pacientes.

### Los servicios que se tuvieron en cuenta son:
#### **(Cada clase, tiene una interface relacionada, de las cuales se le implementan metodos. Las interfaces en este caso son con el fin de generar una independecia con respecto hacia los controllers, los cuales su funcionamiento no se enfocará en la logica interna, sino mas bien en los metodos que agreguemos en las interfaces)** 
- Cita Service: 
- Historia Medica Service
- Paciente Service

### Los controladores que se usaron son:
- Cita Controller: en este controlador, los pacientes podrán agendar sus citas o incluso cancelarlas.
- Historia Medica Controller: aquí el cliente tendrá la oportunidad de poder agregar nuevas historias clinicas e incluso actualizar los datos que hay en las mismas.
- Paciente Controller: en este controlador, cliente tendrá la oportunidad de poder agregar un nuevo paciente, eliminarlo e incluso actualizar los datos del mismo.

# Endpoints utilizados para gestionar nuestra API:
- Cita controller: para ejecutar el metodo get es necesario:  *"api/v1/rest/bring/cita"* para visualizar las citas que ya están agendadas y el metodo post *"api/v1/rest/add/cita"* para poder agendar una nueva cita.
- Historia Medica Controller: para saber que historias medicas hay registradas, es necesario ejecutar el metodo get, el cual funciona con *"api/v1/rest/bring/HM"*, para poder agregar una nueva es necesario ejecutar un post *"api/v1/rest/add/HM"* y para poder actaulizar algun parametro de la historia medica, es necesesario ejecutar el metodo put *"api/v1/rest/change/dataHM"* 
- Paciente controller: para poder visualizar los pacientes inscritos, es necesario ejecutar el metodo get *"api/v1/rest/bring/paciente"*, para agregar un nuevo pacientes es necesario el metodo post *"api/v1/rest/add/paciente"*, para poder eliminar un paciente es necesario el metodo delete *"api/v1/rest/remove/paciente"* y para actualizar los datos de un pacientes es necesario ejecutar el metodo put *"api/v1/rest/change/data"*

*Todo lo anterior fue tenido en cuenta para el desarrollo de los requerimientos especificados, y explicados detalladamente para la ejecución del mismo de forma correcta.*
