-- Creacion de la base de datos de un centro de ventas
create database sis_ventas;

use sis_ventas;

-- Creacion de tabla usuario 1--

create table usuarios_tablas(
idUser int (11) auto_increment primary key,
nombre_User varchar(30) not null,
apellido_User varchar(30) not null,
name_User varchar(15) not null,
password varchar(15) not null,
contacto_User varchar(15) not null,
estado_User int(1) not null
);



-- Creacion de el usuario inicial--
insert into usuarios_tablas(nombre_User,apellido_User,name_User,password,contacto_User,estado_User)
values("David","Hernandez","davidhernandez","123456789","3334762487",1);

	-- Este como parte de creacion del primer usuario de prueba
select name_User, password from usuarios_tablas where name_User = "davidhernandez" and password = "123456789";

-- Creacion de tabla clientes 2--

create table cliente_tablas(
idClient int (11) auto_increment primary key,
nombre_Client varchar(30) not null,
apellido_Client varchar(30) not null,
name_ClientC varchar(15) not null,
contacto_Client varchar(15) not null,
direccion_Client varchar(150) not null,
estado_Client int(1) not null
);


-- Creacion de tabla categorias 3--

create table categorias_tabla(
idCategoria int (11) auto_increment primary key,
descrip_Categoria varchar(250) not null,
estado_Categoria int(1) not null
);

-- Creacion de tabla clientes 4--

create table productos_tablas(
idProducto int (11) auto_increment primary key,
nombre_Producto varchar(100) not null,
cantidad_Producto int(11) not null,
precio_Producto double(10,2) not null,
descripcion_Producto varchar(200) not null,
IVAporce_Producto int(2) not null,
idCategoria int(11) not null,
estado_Producto int(1) not null
);


-- Creacion de tabla ventas 5--

create table ventas_tablas(
idMainVentas int (11) auto_increment primary key,
idClient int(11) not null,
aPagar double(10,2) not null,
date_Venta date not null,
estado_Venta int(1) not null
);


-- Creacion de tabla ventaInfor 6--

create table ventasInfor_tablas(
idInforVentas int (11) auto_increment primary key,
idMainVentas int (11) not null,
idProducto int (11) not null,
cantidad int(11) not null,
precio_Unitario double(10,2) not null,
precio_Subtotal double(10,2) not null,
precio_Descuento double(10,2) not null,
precio_IVA double(10,2) not null,
precio_TotalPagar double(10,2) not null,
estado_Venta int(1) not null
);

show tables;

