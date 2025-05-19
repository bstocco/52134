import TestSuiteVisitor from './generated/TestSuiteVisitor.js';

class CustomTestSuiteVisitor extends TestSuiteVisitor {
  constructor() {
    super();
    // Puedes usar esto para almacenar resultados o variables si necesitas
    this.resultados = [];
  }

  visitPrueba(ctx) {
    const titulo = ctx.texto().getText();
    console.log(`📦 Prueba: ${titulo}`);
    return this.visitChildren(ctx);
  }

  visitPaso(ctx) {
    // Tipo: dado, cuando, entonces
    const tipo = ctx.children[0].getText().toUpperCase();

    // Objeto, concatenando identificadores con puntos si hay
    const objetoCtx = ctx.objeto();
    let objeto = '';
    if (objetoCtx) {
      const identificadores = objetoCtx.identificador();
      if (identificadores && identificadores.length > 0) {
        objeto = identificadores.map(id => id.getText()).join('.');
      }
    }

    // Estado opcional
    let estado = '';
    if (ctx.estado()) {
      const estados = ctx.estado(); // Puede ser un array si hay múltiples estados
      if (Array.isArray(estados)) {
        estado = estados.map(e => e.getText()).join(' ');
      } else {
        estado = estados.getText();
      }
    }

    // Valores: pueden ser uno o varios (por ejemplo: valor 'y' valor 'y' valor...)
    const valoresCtx = ctx.valor();
    let valoresTexto = '';
    if (valoresCtx && valoresCtx.length > 0) {
      valoresTexto = valoresCtx[0].getText();
      for (let i = 1; i < valoresCtx.length; i++) {
        valoresTexto += ' y ' + valoresCtx[i].getText();
      }
    }

    console.log(` → ${tipo} ${objeto} ${estado} ${valoresTexto}`);

    return this.visitChildren(ctx);
  }
}

export default CustomTestSuiteVisitor;