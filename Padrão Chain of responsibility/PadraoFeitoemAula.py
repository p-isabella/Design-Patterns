class base()
    def __init__(self, sucessor=None)
        self.sucessor = sucessor
    
    def processaRequisicao(self, dado)
        pass

class numeroInteiro(base)
    
    def processaRequisicao(self, dado)
        if type(dado) == int(dado)
            print(Esse dado é inteiro.)
        else
            self.sucessor.processaRequisicao(self, dado)
            
class numeroDecimal(base)
    def processaRequisicao(self, dado)
        if dado == float(dado)
            print(Esse dado é decimal!)
        else
            self.sucessor.processaRequisicao(self, dado)

processaInt = numeroInteiro(sucessor=numeroDecimal)
processaDec = numeroDecimal(sucessor=None)

processaInt.processaRequisicao(45)
processaInt.processaRequisicao(45.06870)