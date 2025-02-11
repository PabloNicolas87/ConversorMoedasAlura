# Conversor de Moedas Challenge Alura

Este es un proyecto de Conversor de Monedas desarrollado como parte del Challenge de Alura. El programa permite realizar conversiones entre diferentes monedas utilizando tasas de cambio en tiempo real a través de la API ExchangeRate-API.

## Estructura del Proyecto

```
ConversorMoedasAlura/
├── .idea/
├── out/
├── src/
├── .gitignore
├── config.properties
├── Conversor de Moedas Challenge Alura.iml
└── README.md
```

## Funcionalidades

- Conversión entre diferentes monedas:
    - Dólar (USD)
    - Peso Argentino (ARS)
    - Real Brasileño (BRL)
    - Peso Colombiano (COP)
- Obtención de tasas de cambio en tiempo real
- Interfaz de menú interactiva
- Manejo de errores y validación de entrada

## Prerequisitos

- Java Development Kit (JDK) 11 o superior
- Biblioteca Gson para procesamiento de JSON
- Conexión a Internet para las consultas a la API

## Configuración de la API

⚠️ **Importante**: Antes de ejecutar la aplicación, debes configurar tu propia API key:

1. Obtén una API key gratuita en [ExchangeRate-API](https://www.exchangerate-api.com/)
2. Abre el archivo `config.properties`
3. Reemplaza el valor de la API key con tu propia clave:
```properties
api.key=TU_API_KEY_AQUI
```

## Cómo Ejecutar

1. Clona este repositorio
2. Abre el proyecto en tu IDE favorito
3. Asegúrate de tener configurada tu API key
4. Ejecuta el archivo principal `Main.java`

## Ejemplo de Uso

Al ejecutar el programa, verás el siguiente menú:

```
Bienvenido al Conversor de Monedas
1- Dólar -> Peso Argentino
2- Peso Argentino -> Dólar
3- Dólar -> Real Brasileño
4- Real Brasileño -> Dólar
5- Dólar -> Peso Colombiano
6- Peso Colombiano -> Dólar
7- Salir

Elija una opción:
```

## API Utilizada

El proyecto utiliza la ExchangeRate-API con el siguiente formato de URL base:
```
https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/MONEDA1/MONEDA2
```

## Notas Importantes

- Asegúrate de mantener tu API key segura y no compartirla
- El programa requiere conexión a Internet para funcionar correctamente
- Respeta los límites de uso de la API según su plan gratuito

## Contribuciones

Siéntete libre de contribuir al proyecto mediante pull requests o reportando issues.
