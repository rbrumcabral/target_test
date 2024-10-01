// Rafael Brum Cabral	
// caianarafaelcabral@gmail.com

class FaturamentoTools {

	public static String calcularValores(Double[] faturamentos) {
		
		// Algorítmo com Complexidade O(n), 
		// pois dadas as necessidades, não é necessário ordenar o vetor
		
		if(faturamentos.length==0) {
			return "Não há faturamentos";
		}

		Double maxValor = faturamentos[0];
		Double minValor = faturamentos[0];
		Double soma = 0.0;
		Double media = 0.0;
		int countDias = 0;
		int countDiasAcimaDaMedia = 0;

		for (Double v : faturamentos) {
			if (v != 0) {
				if (v > maxValor) {
					maxValor = v;
				}
				if (v < minValor) {
					minValor = v;
				}
				countDias = countDias + 1;
				soma = soma + v;
			}
		}

		media = soma / countDias;

		for (Double v : faturamentos) {
			if (v > media) {
				countDiasAcimaDaMedia = countDiasAcimaDaMedia + 1;
			}
		}

		return "Menor Valor: " + minValor + "\nMaior Valor: " + maxValor + "\nDias Acima da média: "
				+ countDiasAcimaDaMedia + " (Média: " + media  + ")";

	}

	public static void main(String[] args) {

		// Exemplo de uso
		
		Double[] faturamentos = new Double[] { 2.56, 9.6, 7.89, 9.35, 9.8, 0.0, 11.2, 0.2, 0.0, 0.0, 52.4 };
		System.out.print(FaturamentoTools.calcularValores(faturamentos));

	}

}

// 
