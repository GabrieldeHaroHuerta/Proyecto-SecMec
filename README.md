# 🏥 Secure Medical – Versión 1

## 📌 Descripción del proyecto

**Secure Medical** es un proyecto desarrollado en Java por consola que simula el funcionamiento básico de un consultorio médico.  
El objetivo principal de esta primera versión es aplicar correctamente los conceptos fundamentales de **Programación Orientada a Objetos (POO)**, como la herencia, la abstracción, la composición y el polimorfismo.

El sistema permite gestionar personas, pacientes, médicos, administrativos y el historial médico de los pacientes, siguiendo estrictamente el diagrama de clases proporcionado en el enunciado del proyecto.

---

## 🎯 Objetivos de la Versión 1

- Aplicar correctamente la **herencia entre clases**.
- Usar **clases abstractas** cuando corresponda.
- Implementar **composición y agregación**.
- Gestionar un **historial médico** con diferentes tipos de entradas.
- Crear un programa **funcional por consola**.
- Respetar estrictamente las clases y métodos indicados en el PDF del proyecto.

---

## 🧱 Estructura del proyecto

src/
└── secmed/
├── Main.java
└── model/
├── Persona.java
├── Usuario.java
├── Paciente.java
├── Administrativo.java
├── PersonalSanitario.java
├── Medico.java
├── HistorialMedico.java
├── EntradaHistorial.java
├── PruebaMedica.java
└── Receta.java

markdown
Copiar código

---

## 🧠 Diseño y relaciones entre clases

### 🔹 Persona (clase abstracta)
Clase base que representa a cualquier persona del sistema. Contiene información básica como nombre, DNI, email y dirección.

### 🔹 Usuario
Hereda de `Persona` y añade credenciales de acceso al sistema (username, passwordHash y salt).

### 🔹 Paciente
Hereda de `Persona`.  
Tiene:
- Un **HistorialMedico** (relación de composición).
- Un **Medico asignado** (relación de agregación).

### 🔹 Administrativo
Hereda de `Usuario`.  
Se encarga de:
- Asignar médicos a pacientes.
- Asignar pruebas médicas a pacientes.

### 🔹 PersonalSanitario (clase abstracta)
Hereda de `Usuario`.  
Añade el número de colegiado.

### 🔹 Medico
Hereda de `PersonalSanitario`.  
Incluye la especialidad médica.

### 🔹 HistorialMedico
Contiene una lista de entradas médicas (`EntradaHistorial`).

### 🔹 EntradaHistorial (clase abstracta)
Clase base para las distintas entradas del historial médico.

Subclases:
- `PruebaMedica`
- `Receta`

Gracias a esta estructura se aplica **polimorfismo**, permitiendo almacenar distintos tipos de entradas en el historial médico.

---

## ▶️ Ejecución del programa

La ejecución del programa se realiza desde la clase `Main`.

### Ejemplo de funcionamiento:
1. Se crea un médico.
2. Se crea un paciente.
3. Se crea un administrativo.
4. El administrativo asigna un médico al paciente.
5. Se añaden pruebas médicas y recetas al historial del paciente.
6. Se muestra por consola la información del paciente y su historial médico.

### Ejemplo de salida por consola:
Juan Pérez | DNI: 87654321B | Email: juan@mail.com
Médico asignado: Dr. García

Historial Médico:
Prueba Médica | Tipo: Análisis de sangre | Resultado: Valores normales
Receta | Medicamentos: [Ibuprofeno, Paracetamol]

yaml
Copiar código

---

## 📦 Tecnologías utilizadas

- Lenguaje: **Java**
- Paradigma: **Programación Orientada a Objetos**
- Entorno: Aplicación de consola
- Librerías estándar:
  - `java.util`
  - `java.time`

---

## 🔮 Posibles mejoras futuras

- Implementación del patrón **MVC (Modelo-Vista-Controlador)**.
- Conexión con una base de datos NoSQL.
- Gestión de sesiones de usuario.
- Cifrado real de contraseñas mediante funciones hash.
- Interfaz gráfica o menú interactivo por consola.

---

## 👤 Autor

**Jonathan Carrero**  
Proyecto desarrollado con fines académicos.

---

## 📄 Notas finales

Este proyecto corresponde a la **Versión 1** y cumple con todos los requisitos especificados en el enunciado:
- Clases exactas al UML proporcionado.
- Sin uso de `enum` ni clases adicionales.
- Funcional y correctamente estructurado.
