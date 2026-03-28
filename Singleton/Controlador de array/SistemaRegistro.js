import { Registro } from './Registro.js';

export class SistemaRegistro {
    constructor(){
        this.SR1 = new Registro();
    }

    pegaValor(x){
        this.SR1.pegaObjeto().adicionaValores(x);
    }

    mostrar() {
        console.log(this.SR1.mostraLista());
    }
}