# 📌 Sistema de Gestión de Empleados y Clientes - Mojave Systems

**Universidad Mariano Gálvez de Guatemala**  
**Campus Huehuetenango**  
**Aseguramiento de la Calidad de Software 2025**

Este proyecto es para la empresa **Mojave Systems** y está desarrollado en **Java**.  
El sistema permite **registrar, buscar y listar empleados y clientes**, cumpliendo con buenas prácticas de programación y el uso de clases abstractas, interfaces y repositorios.

---


## 📦 Rama Actual de Desarrollo

Actualmente, el proyecto se encuentra en la rama **`feature`**, donde se está trabajando en la implementación y pruebas de la nueva funcionalidad de **registro de proveedores**.  
En esta fase se está validando el flujo completo de registro de proveedores, incluyendo:

- Verificación de **IDs duplicados**.
- Almacenamiento temporal en memoria mediante el repositorio de proveedores.
- Pruebas unitarias simples desde la clase `Main`.

Cuando esta funcionalidad esté lista y probada, se integrará a la rama **dev** para su posterior validación junto con el resto del sistema.

---

## 📂 Estructura del Proyecto

- **Clase base (abstracta)**  
  - `PersonaEntity` → Contiene atributos y métodos comunes para empleados y clientes.
  
- **Clases concretas**  
  - `EmpleadoEntity` → Hereda de `PersonaEntity` y agrega campos como `puesto` y `salario`.  
  - `ClienteEntity` → Hereda de `PersonaEntity` y agrega campos como `direccion` y `telefono`.

- **Interfaces**  
  - `RegistrarInterface<T>` → Define el contrato para registrar y validar si un ID existe.  
  - `ConsultarInterface<T>` → Define el contrato para buscar por ID y contar registros.

- **Repositorios**  
  - `EmpleadoRepository` → Implementa las interfaces para manejar empleados en memoria.  
  - `ClienteRepository` → Implementa las interfaces para manejar clientes en memoria.

- **Servicios**  
  - `EmpleadoService` → Contiene la lógica de negocio para registrar y buscar empleados.  
  - `ClienteService` → Contiene la lógica de negocio para registrar y buscar clientes.

- **Clase principal**  
  - `Main` → Punto de entrada para ejecutar el sistema y realizar pruebas.

---

## 🚀 Funcionalidades

- Registrar empleados y clientes.
- Buscar registros por ID.
- Filtrar empleados por puesto.
- Filtrar clientes por teléfono.
- Listar todos los registros.
- Validar IDs duplicados.

---

## 📋 Requisitos

- **JDK 11 o superior**
- **Cualquier IDE que soporte Java**
- **Git instalado**

---

## 🔄 Cómo Clonar el Repositorio

```bash
git clone https://github.com/ItsFernan17/Parcial1-MojaveSystems.git
cd Parcial1-MojaveSystems
