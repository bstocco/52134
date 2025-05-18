import TestSuiteListener from './generated/TestSuiteListener.js';

export class CustomTestSuiteListener extends TestSuiteListener {

  enterPrueba(ctx) {
    const titulo = ctx.texto().getText();
    console.log(`\n➡️  Entrando a prueba: "${titulo}"`);
  }

  exitPrueba(ctx) {
    const titulo = ctx.texto().getText();
    console.log(`⬅️  Saliendo de prueba: "${titulo}"`);
  }

  enterPaso(ctx) {
    const tipo = ctx.children[0].getText().toUpperCase();
    console.log(`  ➡️ Paso tipo: ${tipo}`);
  }

  exitPaso(ctx) {
    console.log(`  ⬅️ Paso terminado`);
  }

  // Otros enter/exit opcionales (ej: enterValor, exitObjeto, etc.)
}