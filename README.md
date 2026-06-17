# 🎮 Catálogo de Videojuegos - Android Compose

Esta es una app de Android desarrollada en **Jetpack Compose**. **Unidad 3: Listas y Material Design**.

---

## 📱 Funcionamiento de la App

<p align="center">
  <img width="250" alt="App de Videojuegos Animada" src="https://github.com/user-attachments/assets/ef415d97-1604-499c-8e40-c990e30a0ac1" />
</p>

---

## 🎯 Objetivos del Proyecto

El objetivo principal de esta aplicación es mostrar un catálogo visual de videojuegos:

* Implementación de listas eficientes y escalables.
* Uso del sistema de Material Design (colores, formas y contenedores).
* Estructuración de datos inmutables mediante Kotlin.
* Creación de layouts adaptables y anidados.

---

## 🛠️ Tecnologías y Conceptos Clave

| Concepto | Implementación en el Código |
| :--- | :--- |
| **Data Classes** | Creación de la estructura `Game` para modelar de forma segura el título, plataforma, imagen y colores asociados a cada videojuego. |
| **LazyColumn** | Renderizado altamente eficiente de la lista de 10+ juegos, instanciando en memoria únicamente las tarjetas (`GameCard`) visibles en la pantalla. |
| **Scaffold** | Configuración de la estructura base (Edge-to-Edge) respetando los márgenes seguros (`PaddingValues`) del sistema operativo. |
| **Material Theme** | Personalización de componentes `Card` con bordes, formas (`RoundedCornerShape`) y esquemas de colores oscuros (Dark Theme). |
| **Scroll Anidado** | Uso de un `Row` con `horizontalScroll` para mostrar etiquetas dinámicas de plataformas (PS, Xbox, PC) dentro de una lista de desplazamiento vertical. |

---

## 📂 Estructura Principal del Código

1. **`MainActivity.kt`**: Punto de entrada de la aplicación que configura el tema principal y el contenedor `Scaffold`.
2. **`GameListScreen` (Composable)**: Pantalla principal que gestiona el estado visual y (`LazyColumn`).
3. **`GameCard` (Composable)**: Componente visual reutilizable que da formato a cada elemento individual (imagen, título y etiquetas de plataforma generadas dinámicamente).
4. **`Game.kt` (Modelo)**: Contiene la clase de datos `Game` y la simulación de la base de datos local (`gameList`).

---

> **Nota:** La aplicación está diseñada con colores estáticos de tema oscuro para resaltar las portadas y etiquetas personalizadas de las plataformas.

---
