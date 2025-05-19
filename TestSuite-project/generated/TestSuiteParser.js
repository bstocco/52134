// Generated from TestSuite.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import TestSuiteListener from './TestSuiteListener.js';
const serializedATN = [4,1,25,122,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,
4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,
1,0,4,0,28,8,0,11,0,12,0,29,1,1,1,1,1,1,5,1,35,8,1,10,1,12,1,38,9,1,1,1,
1,1,5,1,42,8,1,10,1,12,1,45,9,1,1,1,5,1,48,8,1,10,1,12,1,51,9,1,1,1,1,1,
1,2,1,2,1,2,4,2,58,8,2,11,2,12,2,59,1,2,3,2,63,8,2,3,2,65,8,2,1,2,1,2,5,
2,69,8,2,10,2,12,2,72,9,2,1,2,1,2,1,3,1,3,1,3,3,3,79,8,3,1,4,1,4,1,4,5,4,
84,8,4,10,4,12,4,87,9,4,1,5,1,5,1,6,1,6,1,6,1,6,1,6,3,6,96,8,6,1,7,1,7,3,
7,100,8,7,1,8,1,8,1,8,1,8,5,8,106,8,8,10,8,12,8,109,9,8,1,8,1,8,1,9,1,9,
1,9,1,10,1,10,1,11,1,11,1,12,1,12,1,12,0,0,13,0,2,4,6,8,10,12,14,16,18,20,
22,24,0,1,1,0,5,10,125,0,27,1,0,0,0,2,31,1,0,0,0,4,54,1,0,0,0,6,78,1,0,0,
0,8,80,1,0,0,0,10,88,1,0,0,0,12,95,1,0,0,0,14,99,1,0,0,0,16,101,1,0,0,0,
18,112,1,0,0,0,20,115,1,0,0,0,22,117,1,0,0,0,24,119,1,0,0,0,26,28,3,2,1,
0,27,26,1,0,0,0,28,29,1,0,0,0,29,27,1,0,0,0,29,30,1,0,0,0,30,1,1,0,0,0,31,
32,5,1,0,0,32,36,3,14,7,0,33,35,5,24,0,0,34,33,1,0,0,0,35,38,1,0,0,0,36,
34,1,0,0,0,36,37,1,0,0,0,37,39,1,0,0,0,38,36,1,0,0,0,39,43,5,17,0,0,40,42,
5,24,0,0,41,40,1,0,0,0,42,45,1,0,0,0,43,41,1,0,0,0,43,44,1,0,0,0,44,49,1,
0,0,0,45,43,1,0,0,0,46,48,3,4,2,0,47,46,1,0,0,0,48,51,1,0,0,0,49,47,1,0,
0,0,49,50,1,0,0,0,50,52,1,0,0,0,51,49,1,0,0,0,52,53,5,18,0,0,53,3,1,0,0,
0,54,55,3,6,3,0,55,64,3,8,4,0,56,58,3,10,5,0,57,56,1,0,0,0,58,59,1,0,0,0,
59,57,1,0,0,0,59,60,1,0,0,0,60,62,1,0,0,0,61,63,3,12,6,0,62,61,1,0,0,0,62,
63,1,0,0,0,63,65,1,0,0,0,64,57,1,0,0,0,64,65,1,0,0,0,65,70,1,0,0,0,66,67,
5,11,0,0,67,69,3,12,6,0,68,66,1,0,0,0,69,72,1,0,0,0,70,68,1,0,0,0,70,71,
1,0,0,0,71,73,1,0,0,0,72,70,1,0,0,0,73,74,5,24,0,0,74,5,1,0,0,0,75,79,5,
2,0,0,76,79,5,3,0,0,77,79,5,4,0,0,78,75,1,0,0,0,78,76,1,0,0,0,78,77,1,0,
0,0,79,7,1,0,0,0,80,85,3,24,12,0,81,82,5,20,0,0,82,84,3,24,12,0,83,81,1,
0,0,0,84,87,1,0,0,0,85,83,1,0,0,0,85,86,1,0,0,0,86,9,1,0,0,0,87,85,1,0,0,
0,88,89,7,0,0,0,89,11,1,0,0,0,90,96,3,14,7,0,91,96,3,20,10,0,92,96,3,22,
11,0,93,96,3,18,9,0,94,96,3,16,8,0,95,90,1,0,0,0,95,91,1,0,0,0,95,92,1,0,
0,0,95,93,1,0,0,0,95,94,1,0,0,0,96,13,1,0,0,0,97,100,5,12,0,0,98,100,5,13,
0,0,99,97,1,0,0,0,99,98,1,0,0,0,100,15,1,0,0,0,101,102,5,15,0,0,102,107,
3,12,6,0,103,104,5,19,0,0,104,106,3,12,6,0,105,103,1,0,0,0,106,109,1,0,0,
0,107,105,1,0,0,0,107,108,1,0,0,0,108,110,1,0,0,0,109,107,1,0,0,0,110,111,
5,16,0,0,111,17,1,0,0,0,112,113,5,14,0,0,113,114,3,24,12,0,114,19,1,0,0,
0,115,116,5,22,0,0,116,21,1,0,0,0,117,118,5,23,0,0,118,23,1,0,0,0,119,120,
5,21,0,0,120,25,1,0,0,0,13,29,36,43,49,59,62,64,70,78,85,95,99,107];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class TestSuiteParser extends antlr4.Parser {

    static grammarFileName = "TestSuite.g4";
    static literalNames = [ null, "'prueba'", "'dado'", "'cuando'", "'entonces'", 
                            "'es'", "'no es'", "'debe contener'", "'debe'", 
                            "'contiene'", "'existe'", "'y'", null, null, 
                            "'$'", "'['", "']'", "'{'", "'}'", "','", "'.'" ];
    static symbolicNames = [ null, "PRUEBA", "DADO", "CUANDO", "ENTONCES", 
                             "ES", "NO_ES", "DEBE_CONTENER", "DEBE", "CONTIENE", 
                             "EXISTE", "Y", "TEXTO_DOBLE", "TEXTO_SIMPLE", 
                             "DOLAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
                             "COMA", "PUNTO", "IDENTIFICADOR", "NUMERO", 
                             "BOOLEANO", "NEWLINE", "WS" ];
    static ruleNames = [ "suite", "prueba", "paso", "pasoTipo", "objeto", 
                         "estado", "valor", "texto", "lista", "variable", 
                         "numero", "booleano", "identificador" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = TestSuiteParser.ruleNames;
        this.literalNames = TestSuiteParser.literalNames;
        this.symbolicNames = TestSuiteParser.symbolicNames;
    }



	suite() {
	    let localctx = new SuiteContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, TestSuiteParser.RULE_suite);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 27; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 26;
	            this.prueba();
	            this.state = 29; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	prueba() {
	    let localctx = new PruebaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, TestSuiteParser.RULE_prueba);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 31;
	        this.match(TestSuiteParser.PRUEBA);
	        this.state = 32;
	        this.texto();
	        this.state = 36;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===24) {
	            this.state = 33;
	            this.match(TestSuiteParser.NEWLINE);
	            this.state = 38;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 39;
	        this.match(TestSuiteParser.LBRACE);
	        this.state = 43;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===24) {
	            this.state = 40;
	            this.match(TestSuiteParser.NEWLINE);
	            this.state = 45;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 49;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 28) !== 0)) {
	            this.state = 46;
	            this.paso();
	            this.state = 51;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 52;
	        this.match(TestSuiteParser.RBRACE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	paso() {
	    let localctx = new PasoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, TestSuiteParser.RULE_paso);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 54;
	        this.pasoTipo();
	        this.state = 55;
	        this.objeto();
	        this.state = 64;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) === 0 && ((1 << _la) & 2016) !== 0)) {
	            this.state = 57; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            do {
	                this.state = 56;
	                this.estado();
	                this.state = 59; 
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            } while((((_la) & ~0x1f) === 0 && ((1 << _la) & 2016) !== 0));
	            this.state = 62;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if((((_la) & ~0x1f) === 0 && ((1 << _la) & 12644352) !== 0)) {
	                this.state = 61;
	                this.valor();
	            }

	        }

	        this.state = 70;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===11) {
	            this.state = 66;
	            this.match(TestSuiteParser.Y);
	            this.state = 67;
	            this.valor();
	            this.state = 72;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 73;
	        this.match(TestSuiteParser.NEWLINE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	pasoTipo() {
	    let localctx = new PasoTipoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, TestSuiteParser.RULE_pasoTipo);
	    try {
	        this.state = 78;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 2:
	            localctx = new DadoPasoContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 75;
	            this.match(TestSuiteParser.DADO);
	            break;
	        case 3:
	            localctx = new CuandoPasoContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 76;
	            this.match(TestSuiteParser.CUANDO);
	            break;
	        case 4:
	            localctx = new EntoncesPasoContext(this, localctx);
	            this.enterOuterAlt(localctx, 3);
	            this.state = 77;
	            this.match(TestSuiteParser.ENTONCES);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	objeto() {
	    let localctx = new ObjetoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, TestSuiteParser.RULE_objeto);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 80;
	        this.identificador();
	        this.state = 85;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===20) {
	            this.state = 81;
	            this.match(TestSuiteParser.PUNTO);
	            this.state = 82;
	            this.identificador();
	            this.state = 87;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	estado() {
	    let localctx = new EstadoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, TestSuiteParser.RULE_estado);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 88;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 2016) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	valor() {
	    let localctx = new ValorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, TestSuiteParser.RULE_valor);
	    try {
	        this.state = 95;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 12:
	        case 13:
	            localctx = new TextoValorContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 90;
	            this.texto();
	            break;
	        case 22:
	            localctx = new NumeroValorContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 91;
	            this.numero();
	            break;
	        case 23:
	            localctx = new BooleanoValorContext(this, localctx);
	            this.enterOuterAlt(localctx, 3);
	            this.state = 92;
	            this.booleano();
	            break;
	        case 14:
	            localctx = new VariableValorContext(this, localctx);
	            this.enterOuterAlt(localctx, 4);
	            this.state = 93;
	            this.variable();
	            break;
	        case 15:
	            localctx = new ListaValorContext(this, localctx);
	            this.enterOuterAlt(localctx, 5);
	            this.state = 94;
	            this.lista();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	texto() {
	    let localctx = new TextoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, TestSuiteParser.RULE_texto);
	    try {
	        this.state = 99;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 12:
	            localctx = new TextoDobleContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 97;
	            this.match(TestSuiteParser.TEXTO_DOBLE);
	            break;
	        case 13:
	            localctx = new TextoSimpleContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 98;
	            this.match(TestSuiteParser.TEXTO_SIMPLE);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	lista() {
	    let localctx = new ListaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, TestSuiteParser.RULE_lista);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 101;
	        this.match(TestSuiteParser.LBRACK);
	        this.state = 102;
	        this.valor();
	        this.state = 107;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===19) {
	            this.state = 103;
	            this.match(TestSuiteParser.COMA);
	            this.state = 104;
	            this.valor();
	            this.state = 109;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 110;
	        this.match(TestSuiteParser.RBRACK);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	variable() {
	    let localctx = new VariableContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, TestSuiteParser.RULE_variable);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 112;
	        this.match(TestSuiteParser.DOLAR);
	        this.state = 113;
	        this.identificador();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	numero() {
	    let localctx = new NumeroContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, TestSuiteParser.RULE_numero);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 115;
	        this.match(TestSuiteParser.NUMERO);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	booleano() {
	    let localctx = new BooleanoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 22, TestSuiteParser.RULE_booleano);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 117;
	        this.match(TestSuiteParser.BOOLEANO);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	identificador() {
	    let localctx = new IdentificadorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 24, TestSuiteParser.RULE_identificador);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 119;
	        this.match(TestSuiteParser.IDENTIFICADOR);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

TestSuiteParser.EOF = antlr4.Token.EOF;
TestSuiteParser.PRUEBA = 1;
TestSuiteParser.DADO = 2;
TestSuiteParser.CUANDO = 3;
TestSuiteParser.ENTONCES = 4;
TestSuiteParser.ES = 5;
TestSuiteParser.NO_ES = 6;
TestSuiteParser.DEBE_CONTENER = 7;
TestSuiteParser.DEBE = 8;
TestSuiteParser.CONTIENE = 9;
TestSuiteParser.EXISTE = 10;
TestSuiteParser.Y = 11;
TestSuiteParser.TEXTO_DOBLE = 12;
TestSuiteParser.TEXTO_SIMPLE = 13;
TestSuiteParser.DOLAR = 14;
TestSuiteParser.LBRACK = 15;
TestSuiteParser.RBRACK = 16;
TestSuiteParser.LBRACE = 17;
TestSuiteParser.RBRACE = 18;
TestSuiteParser.COMA = 19;
TestSuiteParser.PUNTO = 20;
TestSuiteParser.IDENTIFICADOR = 21;
TestSuiteParser.NUMERO = 22;
TestSuiteParser.BOOLEANO = 23;
TestSuiteParser.NEWLINE = 24;
TestSuiteParser.WS = 25;

TestSuiteParser.RULE_suite = 0;
TestSuiteParser.RULE_prueba = 1;
TestSuiteParser.RULE_paso = 2;
TestSuiteParser.RULE_pasoTipo = 3;
TestSuiteParser.RULE_objeto = 4;
TestSuiteParser.RULE_estado = 5;
TestSuiteParser.RULE_valor = 6;
TestSuiteParser.RULE_texto = 7;
TestSuiteParser.RULE_lista = 8;
TestSuiteParser.RULE_variable = 9;
TestSuiteParser.RULE_numero = 10;
TestSuiteParser.RULE_booleano = 11;
TestSuiteParser.RULE_identificador = 12;

class SuiteContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_suite;
    }

	prueba = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(PruebaContext);
	    } else {
	        return this.getTypedRuleContext(PruebaContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterSuite(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitSuite(this);
		}
	}


}



class PruebaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_prueba;
    }

	PRUEBA() {
	    return this.getToken(TestSuiteParser.PRUEBA, 0);
	};

	texto() {
	    return this.getTypedRuleContext(TextoContext,0);
	};

	LBRACE() {
	    return this.getToken(TestSuiteParser.LBRACE, 0);
	};

	RBRACE() {
	    return this.getToken(TestSuiteParser.RBRACE, 0);
	};

	NEWLINE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TestSuiteParser.NEWLINE);
	    } else {
	        return this.getToken(TestSuiteParser.NEWLINE, i);
	    }
	};


	paso = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(PasoContext);
	    } else {
	        return this.getTypedRuleContext(PasoContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterPrueba(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitPrueba(this);
		}
	}


}



class PasoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_paso;
    }

	pasoTipo() {
	    return this.getTypedRuleContext(PasoTipoContext,0);
	};

	objeto() {
	    return this.getTypedRuleContext(ObjetoContext,0);
	};

	NEWLINE() {
	    return this.getToken(TestSuiteParser.NEWLINE, 0);
	};

	Y = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TestSuiteParser.Y);
	    } else {
	        return this.getToken(TestSuiteParser.Y, i);
	    }
	};


	valor = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ValorContext);
	    } else {
	        return this.getTypedRuleContext(ValorContext,i);
	    }
	};

	estado = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EstadoContext);
	    } else {
	        return this.getTypedRuleContext(EstadoContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterPaso(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitPaso(this);
		}
	}


}



class PasoTipoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_pasoTipo;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class CuandoPasoContext extends PasoTipoContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	CUANDO() {
	    return this.getToken(TestSuiteParser.CUANDO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterCuandoPaso(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitCuandoPaso(this);
		}
	}


}

TestSuiteParser.CuandoPasoContext = CuandoPasoContext;

class EntoncesPasoContext extends PasoTipoContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	ENTONCES() {
	    return this.getToken(TestSuiteParser.ENTONCES, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterEntoncesPaso(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitEntoncesPaso(this);
		}
	}


}

TestSuiteParser.EntoncesPasoContext = EntoncesPasoContext;

class DadoPasoContext extends PasoTipoContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	DADO() {
	    return this.getToken(TestSuiteParser.DADO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterDadoPaso(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitDadoPaso(this);
		}
	}


}

TestSuiteParser.DadoPasoContext = DadoPasoContext;

class ObjetoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_objeto;
    }

	identificador = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(IdentificadorContext);
	    } else {
	        return this.getTypedRuleContext(IdentificadorContext,i);
	    }
	};

	PUNTO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TestSuiteParser.PUNTO);
	    } else {
	        return this.getToken(TestSuiteParser.PUNTO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterObjeto(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitObjeto(this);
		}
	}


}



class EstadoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_estado;
    }

	ES() {
	    return this.getToken(TestSuiteParser.ES, 0);
	};

	NO_ES() {
	    return this.getToken(TestSuiteParser.NO_ES, 0);
	};

	CONTIENE() {
	    return this.getToken(TestSuiteParser.CONTIENE, 0);
	};

	EXISTE() {
	    return this.getToken(TestSuiteParser.EXISTE, 0);
	};

	DEBE() {
	    return this.getToken(TestSuiteParser.DEBE, 0);
	};

	DEBE_CONTENER() {
	    return this.getToken(TestSuiteParser.DEBE_CONTENER, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterEstado(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitEstado(this);
		}
	}


}



class ValorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_valor;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class NumeroValorContext extends ValorContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	numero() {
	    return this.getTypedRuleContext(NumeroContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterNumeroValor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitNumeroValor(this);
		}
	}


}

TestSuiteParser.NumeroValorContext = NumeroValorContext;

class ListaValorContext extends ValorContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	lista() {
	    return this.getTypedRuleContext(ListaContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterListaValor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitListaValor(this);
		}
	}


}

TestSuiteParser.ListaValorContext = ListaValorContext;

class TextoValorContext extends ValorContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	texto() {
	    return this.getTypedRuleContext(TextoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterTextoValor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitTextoValor(this);
		}
	}


}

TestSuiteParser.TextoValorContext = TextoValorContext;

class VariableValorContext extends ValorContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterVariableValor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitVariableValor(this);
		}
	}


}

TestSuiteParser.VariableValorContext = VariableValorContext;

class BooleanoValorContext extends ValorContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	booleano() {
	    return this.getTypedRuleContext(BooleanoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterBooleanoValor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitBooleanoValor(this);
		}
	}


}

TestSuiteParser.BooleanoValorContext = BooleanoValorContext;

class TextoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_texto;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class TextoSimpleContext extends TextoContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	TEXTO_SIMPLE() {
	    return this.getToken(TestSuiteParser.TEXTO_SIMPLE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterTextoSimple(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitTextoSimple(this);
		}
	}


}

TestSuiteParser.TextoSimpleContext = TextoSimpleContext;

class TextoDobleContext extends TextoContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	TEXTO_DOBLE() {
	    return this.getToken(TestSuiteParser.TEXTO_DOBLE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterTextoDoble(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitTextoDoble(this);
		}
	}


}

TestSuiteParser.TextoDobleContext = TextoDobleContext;

class ListaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_lista;
    }

	LBRACK() {
	    return this.getToken(TestSuiteParser.LBRACK, 0);
	};

	valor = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ValorContext);
	    } else {
	        return this.getTypedRuleContext(ValorContext,i);
	    }
	};

	RBRACK() {
	    return this.getToken(TestSuiteParser.RBRACK, 0);
	};

	COMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(TestSuiteParser.COMA);
	    } else {
	        return this.getToken(TestSuiteParser.COMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterLista(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitLista(this);
		}
	}


}



class VariableContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_variable;
    }

	DOLAR() {
	    return this.getToken(TestSuiteParser.DOLAR, 0);
	};

	identificador() {
	    return this.getTypedRuleContext(IdentificadorContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterVariable(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitVariable(this);
		}
	}


}



class NumeroContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_numero;
    }

	NUMERO() {
	    return this.getToken(TestSuiteParser.NUMERO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterNumero(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitNumero(this);
		}
	}


}



class BooleanoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_booleano;
    }

	BOOLEANO() {
	    return this.getToken(TestSuiteParser.BOOLEANO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterBooleano(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitBooleano(this);
		}
	}


}



class IdentificadorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = TestSuiteParser.RULE_identificador;
    }

	IDENTIFICADOR() {
	    return this.getToken(TestSuiteParser.IDENTIFICADOR, 0);
	};

	enterRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.enterIdentificador(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof TestSuiteListener ) {
	        listener.exitIdentificador(this);
		}
	}


}




TestSuiteParser.SuiteContext = SuiteContext; 
TestSuiteParser.PruebaContext = PruebaContext; 
TestSuiteParser.PasoContext = PasoContext; 
TestSuiteParser.PasoTipoContext = PasoTipoContext; 
TestSuiteParser.ObjetoContext = ObjetoContext; 
TestSuiteParser.EstadoContext = EstadoContext; 
TestSuiteParser.ValorContext = ValorContext; 
TestSuiteParser.TextoContext = TextoContext; 
TestSuiteParser.ListaContext = ListaContext; 
TestSuiteParser.VariableContext = VariableContext; 
TestSuiteParser.NumeroContext = NumeroContext; 
TestSuiteParser.BooleanoContext = BooleanoContext; 
TestSuiteParser.IdentificadorContext = IdentificadorContext; 
