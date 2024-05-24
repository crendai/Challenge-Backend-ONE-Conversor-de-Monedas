# 💱 Convertidor de Monedas

Este es un convertidor de monedas en Java que utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para realizar conversiones entre diferentes monedas. El programa se ejecuta en la consola y guía al usuario paso a paso para obtener las monedas de origen y destino, así como el monto a convertir.

## ✨ Funcionalidades

- 📋 Mostrar un menú con una lista de países y sus respectivas monedas.
- 🇨🇳 Permitir al usuario seleccionar la moneda del país de origen.
- 🇺🇸 Permitir al usuario seleccionar la moneda del país de destino.
- 💰 Solicitar al usuario que introduzca el monto a convertir.
- 🌐 Utilizar la API de ExchangeRate-API para obtener la tasa de conversión actual entre las dos monedas seleccionadas.
- 🔄 Calcular y mostrar el monto convertido en la consola.

## 🗂️ Estructura del Proyecto

- `src`: Contiene todo el código fuente del proyecto.
- `.gitignore`: Especifica los archivos y carpetas que Git debe ignorar.
- `README.md`: Este archivo, que proporciona información sobre el proyecto.

## 🛠️ Instrucciones de Uso

### 📋 Prerrequisitos

1. **Java Development Kit (JDK) 17**: Asegúrate de tener JDK 17 instalado en tu máquina. Puedes descargarlo desde [aquí](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).

2. **Dependencia JSON-java**: Necesitas la biblioteca JSON-java para manejar objetos JSON. Descárgala desde [GitHub](https://github.com/stleary/JSON-java).

### 🚀 Instalación

1. Clona este repositorio en tu máquina local:
    ```bash
    git clone https://github.com/crendai/Challenge-Backend-ONE-Conversor-de-Monedas.git
    cd convertidor-de-monedas
    ```

2. Abre el proyecto en tu entorno de desarrollo preferido (por ejemplo, IntelliJ IDEA).

3. Agrega la biblioteca JSON-java al proyecto:
    - Descarga el archivo JAR de la biblioteca JSON-java desde el [repositorio oficial](https://github.com/stleary/JSON-java).
    - En IntelliJ IDEA, ve a "File" > "Project Structure" > "Modules" > "Dependencies" y añade el archivo JAR descargado.

### 🔧 Configuración de la API

1. Obtén una clave de API de [ExchangeRate-API](https://www.exchangerate-api.com/).
2. Reemplaza `TU_API_KEY` en el archivo `ExchangeRateAPI.java` con tu clave de API.

### ▶️ Ejecución

1. Ejecuta el programa desde tu entorno de desarrollo o desde la línea de comandos:
    ```bash
    cd src
    javac Main.java
    java Main
    ```

2. Sigue las instrucciones en la consola:
    - Selecciona la moneda de origen.
    - Selecciona la moneda de destino.
    - Introduce el monto a convertir.
    - El programa mostrará el monto convertido en la consola.

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún error o tienes alguna sugerencia de mejora, por favor abre un issue o envía un pull request.

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Para más información, consulta el archivo [LICENSE](LICENSE).

![Badge-Conversor.png](https://raw.githubusercontent.com/crendai/Challenge-Backend-ONE-Conversor-de-Monedas/main/Badge-Conversor.png)
