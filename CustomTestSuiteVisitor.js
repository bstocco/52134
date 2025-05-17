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

    // Objeto, construimos concatenando identificadores con puntos si hay
    const objetoCtx = ctx.objeto();
    let objeto = objetoCtx.articulo() ? objetoCtx.articulo().getText() + '.' : '';
    objeto += objetoCtx.identificador(0).getText();
    for (let i = 1; i < objetoCtx.identificador().length; i++) {
      objeto += '.' + objetoCtx.identificador(i).getText();
    }

    // Estado opcional
    const estado = ctx.estado() ? ctx.estado().getText() : '';

    // Valores: pueden ser uno o varios (por ejemplo: valor 'y' valor 'y' valor...)
    const valoresCtx = ctx.valor();
    let valoresTexto = '';
    if (valoresCtx.length > 0) {
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