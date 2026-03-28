export class Registro {
    
    static #objeto = null;
    #listaFrutas = [];

    constructor(){
        if (Registro.#objeto === null) {
            Registro.#objeto = this;
        }
        return Registro.#objeto;
    };

    pegaObjeto(){
        return Registro.#objeto;
    }

    adicionaValores(x){
        this.#listaFrutas.push(x);
    };

    mostraLista() {
        return this.#listaFrutas;
    };


}