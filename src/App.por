programa {
	/*
	 * Nome do autor: Matheus Fontes
	 * Data do código: 08/01/2023
	 * Requisitos funcionais: O sistema fornece um menu com as opções de adicionar CPF ou sair ao usuário final. O usuário deve escolher a opção e, caso queira adicionar um CPF, também deve fornecer os números do documento.
	 * Descrição: Sendo mais simples que o código feito em java, este sistema apenas fornece um menu ao usuário em uma estrutura de repetição, além de possuir uma lógica que entrega a situação de cada CPF
	 */
  
  funcao inicio() {
	
	inteiro opcao = 4
	cadeia cpf
	enquanto(opcao!=0) {
		escolha(opcao) {
			caso 1:
			escreva("Digite o CPF que quer adicionar (apenas números): ")
			leia(cpf)
			se(cpf == "13369992497" ou cpf == "70091475184" ou cpf == "28918774723") {
				escreva("O CPF informado encontra-se BLOQUEADO\n")
			} senao se(cpf =="58463944200" ou cpf == "26211538911") {
				escreva("O CPF informado está na lista de clientes VIP e encontra-se LIBERADO\n")
			} senao {
				escreva("O CPF informado encontra-se LIBERADO\n")
			}
			pare
			
			
		}
	
		escreva("----MENU----\n[0] -> Sair\n[1] -> Adicionar CPF\n")
		leia(opcao)
	}
	escreva("Obrigado por utilizar!")
	
	

  }
}
