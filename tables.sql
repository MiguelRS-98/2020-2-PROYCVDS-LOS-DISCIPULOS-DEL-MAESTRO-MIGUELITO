CREATE TABLE IF NOT EXISTS "Personal" (
	Documento INT NOT NULL,
	Nombres VARCHAR(50) NOT NULL,
	Apellidos VARCHAR(50) NOT NULL,
	Correo VARCHAR(50)NOT NULL,
	Telefono INT NOT NULL,
	Rol INT NOT NULL,
	Estado VARCHAR(30)NOT NULL,
	Constraseña VARCHAR(30) NOT NULL,
	LaboratorioAsignado INT NOT NULL
);
---------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Laboratorios" (
	IdLaboratorio INT NOT NULL,
	Nombre VARCHAR(30)NOT NULL,
	CantidadEquipos INT NOT NULL,
	Informacion VARCHAR(100)NOT NULL
);
---------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Equipos"(
	IdEquipo INT NOT NULL,
	Ip VARCHAR(30)NOT NULL,
	Informacion VARCHAR(100)NOT NULL,
	Laboratorio INT NOT NULL
);
---------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Elementos"(
	IdElemento INT NOT NULL,
	Tipo VARCHAR(30)NOT NULL,
	Informacion VARCHAR(100)NOT NULL,
	Equipo INT NOT NULL
);
---------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Novedades"(
	IdNovedad INT NOT NULL,
	Fecha DATE NOT NULL,
	Titulo VARCHAR(20)NOT NULL,
	Detalle VARCHAR(100) NOT NULL,
	Responsable INT NOT NULL,
	Registro INT NOT NULL
);

---------------------------------------------------------------------
ALTER TABLE "Personal" ADD CONSTRAINT PK_Personal PRIMARY KEY(Documento);
ALTER TABLE "Laboratorios" ADD CONSTRAINT PK_Laboratorios PRIMARY KEY(IdLaboratorio);
ALTER TABLE "Equipos" ADD CONSTRAINT PK_Equipos PRIMARY KEY(IdEquipo);
ALTER TABLE "Elementos" ADD CONSTRAINT PK_Elementos PRIMARY KEY(IdElemento);
ALTER TABLE "Novedades" ADD CONSTRAINT PK_Novedades PRIMARY KEY(IdNovedad);
---------------------------------------------------------------------
ALTER TABLE "Personal" ADD CONSTRAINT UK_Personal UNIQUE (Correo,Telefono);
ALTER TABLE "Equipos" ADD CONSTRAINT UK_Equipos UNIQUE (Ip);
---------------------------------------------------------------------
ALTER TABLE "Novedades" ADD CONSTRAINT FK_Novedades_Per FOREIGN KEY(Responsable) REFERENCES "Personal"(Documento);
ALTER TABLE "Personal" ADD CONSTRAINT FK_Personal_Lab FOREIGN KEY(LaboratorioAsignado) REFERENCES "Laboratorios"(IdLaboratorio);
ALTER TABLE "Equipos" ADD CONSTRAINT FK_Equipos_Lab FOREIGN KEY(Laboratorio) REFERENCES "Laboratorios"(IdLaboratorio);
ALTER TABLE "Elementos" ADD CONSTRAINT FK_elementos_Eq FOREIGN KEY(Equipo) REFERENCES "Equipos"(IdEquipo);
ALTER TABLE "Novedades" ADD CONSTRAINT FK_novedades_Eq FOREIGN KEY(Registro) REFERENCES "Equipos"(IdEquipo);
ALTER TABLE "Novedades" ADD CONSTRAINT FK_novedades_elem FOREIGN KEY(Registro) REFERENCES "Elementos"(IdElemento);
ALTER TABLE "Novedades" ADD CONSTRAINT FK_novedades_Lab FOREIGN KEY(Registro) REFERENCES "Laboratorios"(IdLaboratorio);