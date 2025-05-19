import antlr4 from "antlr4";
import fs from 'fs';
import readline from 'readline';
import TestSuiteLexer from "./generated/TestSuiteLexer.js";
import TestSuiteParser from "./generated/TestSuiteParser.js";
import { CustomTestSuiteListener } from "./CustomTestSuiteListener.js";
import CustomTestSuiteVisitor from "./CustomTestSuiteVisitor.js";

const { CharStreams, CommonTokenStream, ParseTreeWalker } = antlr4;

async function main() {
    let input;

    // Leer desde input.txt o pedir por teclado
    try {
        input = fs.readFileSync('input.txt', 'utf8');
    } catch (err) {
        input = await leerCadena();
    }

    // Crear el input stream y preparar lexer/parser
    const inputStream = CharStreams.fromString(input);
    const lexer = new TestSuiteLexer(inputStream);
    const tokenStream = new CommonTokenStream(lexer);
    const parser = new TestSuiteParser(tokenStream);

    // Contador de errores de sintaxis
    let errores = 0;
    parser.removeErrorListeners();
    parser.addErrorListener({
        syntaxError: (rec, symbol, line, col, msg) => {
            console.error(`❌ Error de sintaxis en línea ${line}:${col}: ${msg}`);
            errores++;
        }
    });

    // Construcción del árbol
    const tree = parser.suite();

    if (errores > 0) {
        console.error("\n⛔ Se encontraron errores de sintaxis. Revisa tu input.");
        return;
    }

    console.log("\n✅ Entrada válida.");
    console.log(`\n🌳 Árbol de derivación:\n${tree.toStringTree(parser.ruleNames)}`);

    // Recorrido con Listener
    console.log("\n🎧 Recorrido con Listener:");
    const listener = new CustomTestSuiteListener();
    ParseTreeWalker.DEFAULT.walk(listener, tree);

    // Interpretación con Visitor
    console.log("\n🧠 Interpretación con Visitor:");
    const visitor = new CustomTestSuiteVisitor();
    visitor.visit(tree);
}

function leerCadena() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });
    return new Promise(resolve => {
        rl.question("Ingrese una cadena: ", (answer) => {
            rl.close();
            resolve(answer);
        });
    });
}

main();