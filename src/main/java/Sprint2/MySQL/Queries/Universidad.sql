select * from departamento;
select * from persona;
select * from profesor;
select * from grado;
select * from asignatura;
select * from curso_escolar;
select * from alumno_se_matricula_asignatura;


#Retorna un llistat amb el primer cognom, segon cognom i el nom de tots els/les alumnes. El llistat haurà d'estar ordenat alfabèticament de menor a major pel primer cognom, segon cognom i nom.
select persona.nombre, persona.apellido1, persona.apellido2 from persona where tipo = "alumno" order by persona.apellido1 asc, persona.apellido2 asc, persona.nombre asc;
#Esbrina el nom i els dos cognoms dels alumnes que no han donat d'alta el seu número de telèfon en la base de dades.
select persona.nombre, persona.apellido1, persona.apellido2 from persona where telefono is null;
#Retorna el llistat dels alumnes que van néixer en 1999.
select persona.nombre, persona.apellido1, persona.apellido2, persona.fecha_nacimiento from persona where fecha_nacimiento like "1999%";
#Retorna el llistat de professors/es que no han donat d'alta el seu número de telèfon en la base de dades i a més el seu NIF acaba en K.
select persona.nombre, persona.apellido1, persona.apellido2, persona.nif from persona where telefono is null and nif like "%K";
#Retorna el llistat de les assignatures que s'imparteixen en el primer quadrimestre, en el tercer curs del grau que té l'identificador 7.
select asignatura.nombre, asignatura.curso, asignatura.cuatrimestre, asignatura.id_grado from asignatura where cuatrimestre = "1" and curso = "3" and id_grado = "7";
#Retorna un llistat dels professors/es juntament amb el nom del departament al qual estan vinculats. El llistat ha de retornar quatre columnes, primer cognom, segon cognom, nom i nom del departament. El resultat estarà ordenat alfabèticament de menor a major pels cognoms i el nom.
select persona.nombre, persona.apellido1, persona.apellido2, departamento.nombre from persona inner join profesor on persona.id = profesor.id_profesor inner join departamento on departamento.id = profesor.id_departamento order by persona.apellido1 asc, persona.apellido2 asc, persona.nombre asc;																								
#Retorna un llistat amb el nom de les assignatures, any d'inici i any de fi del curs escolar de l'alumne/a amb NIF 26902806M.
select asignatura.nombre, persona.nif, curso_escolar.anyo_inicio, curso_escolar.anyo_fin from alumno_se_matricula_asignatura inner join asignatura on asignatura.id = id_asignatura inner join persona on persona.id = id_alumno inner join curso_escolar on curso_escolar.id = id_curso_escolar where persona.nif = "26902806M";
select asignatura.nombre, curso_escolar.anyo_inicio, curso_escolar.anyo_fin from asignatura inner join alumno_se_matricula_asignatura on alumno_se_matricula_asignatura.id_asignatura = asignatura.id inner join curso_escolar on alumno_se_matricula_asignatura.id_curso_escolar = curso_escolar.id inner join persona on alumno_se_matricula_asignatura.id_alumno = persona.id where persona.nif = "26902806M";
#Retorna un llistat amb el nom de tots els departaments que tenen professors/es que imparteixen alguna assignatura en el Grau en Enginyeria Informàtica (Pla 2015).
select grado.nombre, asignatura.nombre, departamento.nombre from profesor inner join asignatura on profesor.id_profesor = asignatura.id_profesor inner join departamento on departamento.id = profesor.id_departamento inner join grado on grado.id = asignatura.id_grado where grado.nombre = "Grado en Ingeniería Informática (Plan 2015)";
#Retorna un llistat amb tots els alumnes que s'han matriculat en alguna assignatura durant el curs escolar 2018/2019.
select distinct(persona.nif), persona.nombre, curso_escolar.anyo_inicio, curso_escolar.anyo_fin from alumno_se_matricula_asignatura inner join persona on persona.id = id_alumno inner join curso_escolar on curso_escolar.id = id_curso_escolar where curso_escolar.anyo_inicio = 2018 and persona.tipo = "alumno";


#Resol les 6 següents consultes utilitzant les clàusules LEFT JOIN i RIGHT JOIN.


#Retorna un llistat amb els noms de tots els professors/es i els departaments que tenen vinculats. El llistat també ha de mostrar aquells professors/es que no tenen cap departament associat. El llistat ha de retornar quatre columnes,
# nom del departament, primer cognom, segon cognom i nom del professor/a. El resultat estarà ordenat alfabèticament de menor a major pel nom del departament, cognoms i el nom.
select departamento.nombre as "Nombre departamento", persona.apellido1, persona.apellido2, persona.nombre from persona right join profesor on persona.id = profesor.id_profesor left join departamento on departamento.id = profesor.id_departamento order by departamento.nombre asc, apellido1 asc, apellido2 asc, persona.nombre asc;
#Retorna un llistat amb els professors/es que no estan associats a un departament.
select persona.* from persona right join profesor on persona.id = profesor.id_profesor where profesor.id_departamento is null;
#Retorna un llistat amb els departaments que no tenen professors/es associats.
select departamento.nombre from departamento left join profesor on profesor.id_departamento = departamento.id where profesor.id_departamento is null;
#Retorna un llistat amb els professors/es que no imparteixen cap assignatura.
select persona.* from persona right join profesor on persona.id = profesor.id_profesor left join asignatura on asignatura.id_profesor = profesor.id_profesor where asignatura.nombre is null;
#Retorna un llistat amb les assignatures que no tenen un professor/a assignat.
select asignatura.nombre from asignatura left join profesor on asignatura.id_profesor = profesor.id_profesor where asignatura.id_profesor is null;
#Retorna un llistat amb tots els departaments que no han impartit assignatures en cap curs escolar.
select distinct departamento.nombre from departamento left join profesor on departamento.id = profesor.id_departamento left join asignatura on profesor.id_profesor = asignatura.id_profesor where asignatura.nombre is null;


#Consultes resum:


#Retorna el nombre total d'alumnes que hi ha.
select count(persona.nombre) as "Numero de alumnos" from persona where tipo = "alumno";
#Calcula quants alumnes van néixer en 1999.
select count(persona.nombre) as "Alumnos nacidos en 1999" from persona where fecha_nacimiento like "1999%";
#Calcula quants professors/es hi ha en cada departament. El resultat només ha de mostrar dues columnes, una amb el nom del departament i una altra amb el nombre de professors/es que hi ha en aquest departament. El resultat només ha d'incloure els departaments que tenen professors/es associats i haurà d'estar ordenat de major a menor pel nombre de professors/es.
select count(id_profesor), departamento.nombre from profesor inner join departamento on id_departamento = departamento.id group by departamento.id order by count(id_profesor) desc;
#Retorna un llistat amb tots els departaments i el nombre de professors/es que hi ha en cadascun d'ells. Tingui en compte que poden existir departaments que no tenen professors/es associats. Aquests departaments també han d'aparèixer en el llistat.
select count(id_profesor), departamento.nombre from profesor right join departamento on id_departamento = departamento.id group by departamento.id;
#Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun. Tingues en compte que poden existir graus que no tenen assignatures associades. Aquests graus també han d'aparèixer en el llistat. El resultat haurà d'estar ordenat de major a menor pel nombre d'assignatures.
select count(asignatura.nombre), grado.nombre from asignatura right join grado on id_grado = grado.id group by grado.nombre order by count(asignatura.nombre) desc;
#Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun, dels graus que tinguin més de 40 assignatures associades.
select count(asignatura.nombre) as "contador", grado.nombre from asignatura inner join grado on id_grado = grado.id group by grado.nombre  having count(asignatura.nombre) > 40 order by "contador" desc;
#Retorna un llistat que mostri el nom dels graus i la suma del nombre total de crèdits que hi ha per a cada tipus d'assignatura. El resultat ha de tenir tres columnes: nom del grau, tipus d'assignatura i la suma dels crèdits de totes les assignatures que hi ha d'aquest tipus.
select tipo, sum(asignatura.creditos) as "Suma créditos", id_grado, grado.nombre from asignatura inner join grado on grado.id = id_grado group by id_grado, tipo;
#Retorna un llistat que mostri quants alumnes s'han matriculat d'alguna assignatura en cadascun dels cursos escolars. El resultat haurà de mostrar dues columnes, una columna amb l'any d'inici del curs escolar i una altra amb el nombre d'alumnes matriculats.
select count(distinct(id_alumno)) as "Nombre d'alumnes matriculats" , curso_escolar.anyo_inicio  from alumno_se_matricula_asignatura inner join curso_escolar on curso_escolar.id = id_curso_escolar  group by id_curso_escolar;
#Retorna un llistat amb el nombre d'assignatures que imparteix cada professor/a. El llistat ha de tenir en compte aquells professors/es que no imparteixen cap assignatura. El resultat mostrarà cinc columnes: id, nom, primer cognom, segon cognom i nombre d'assignatures. El resultat estarà ordenat de major a menor pel nombre d'assignatures.
select persona.id, persona.nombre, persona.apellido1, persona.apellido2, count(asignatura.nombre) as "Número de asignaturas" from asignatura right join profesor on profesor.id_profesor = asignatura.id_profesor inner join persona on profesor.id_profesor = persona.id group by asignatura.id_profesor, persona.id order by count(asignatura.nombre) desc;
#Retorna totes les dades de l'alumne/a més jove.
select * from persona order by fecha_nacimiento desc limit 1;
#Retorna un llistat amb els professors/es que tenen un departament associat i que no imparteixen cap assignatura.
select persona.* from persona left join profesor on persona.id = profesor.id_profesor left join asignatura on profesor.id_profesor = asignatura.id_profesor where persona.tipo = "profesor" and asignatura.id_profesor is null;

