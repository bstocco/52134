# Analizador Sintáctico - Legajo 52134

Este proyecto es un **analizador léxico y sintáctico** desarrollado con **ANTLR4 y Node.js**, que interpreta archivos con estructura tipo Gherkin en español. Forma parte del trabajo práctico evaluativo correspondiente al Parcial 2 de la asignatura.

---

## 🧾 Contenido del repositorio

- `TestSuite.g4`: Gramática ANTLR del lenguaje de pruebas.
- Carpeta `generated/`: Contiene los archivos generados por ANTLR (Lexer, Parser, Listener, Visitor).
- `input.txt`: Archivo de entrada principal.
- `input-correcto1.txt`, `input-correcto2.txt`: Ejemplos válidos.
- `input-incorrecto1.txt`, `input-incorrecto2.txt`: Ejemplos que deben generar errores sintácticos.
- `indexTestSuite.js`: Script principal para ejecutar el análisis.
- `CustomTestSuiteListener.js`, `CustomTestSuiteVisitor.js`: Lógica personalizada para recorrer el árbol.
- `README.md`: Este archivo con instrucciones de uso.
- `arbol-ejemplo.png`: Imagen con ejemplo de árbol de análisis.

---

## ⚙️ Requisitos

- Node.js (v14 o superior)
- ANTLR 4 (usado desde código generado, no requiere instalación global)

---

## 💻 Instalación
IMPORTANTE
1. Clonar el repositorio:

   ```bash
   git clone https://github.com/bstocco/52134.git
   cd 52134
   cd TestSuite-project //este último posee todos los archivos excepto los 4 inputs, el README y las Reglas.pdf y es donde funciona el árbol sintáctico

2. Instalar las dependencias:
npm install

▶️ Cómo ejecutar el analizador
El archivo indexTestSuite.js analiza por defecto el contenido de input.txt.

node indexTestSuite.js

Si input.txt no está presente, permite ingresar texto por teclado.


🧪 Probar distintos casos
Para cambiar el archivo de prueba, reemplaza el contenido de input.txt con uno de los ejemplos:

cp input-correcto2.txt input.txt
node indexTestSuite.js

Resultados posibles:
✅ Muestra árbol sintáctico, recorrido con Listener y Visitor si la entrada es válida.
❌ Muestra errores con línea y descripción si la entrada es inválida.

📷 Ejemplo de árbol sintáctico generado
A continuación se muestra una captura del árbol generado por input.txt:
![Árbol generado](arbol-ejemplo.png)


📌 Notas adicionales
- El árbol también se imprime como texto en consola.
- El análisis se puede ejecutar desde Visual Studio Code con F5 (usando launch.json).
- Toda la lógica de análisis léxico y sintáctico está definida en la gramática TestSuite.g4.

👩‍💻 Autor
Bárbara Stocco
Legajo: 52134
GitHub: @bstocco
