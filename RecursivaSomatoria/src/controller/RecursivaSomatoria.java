package controller;
	
	public class RecursivaSomatoria{
		
	public RecursivaSomatoria() {
			super();
			// TODO Auto-generated constructor stub
		}

	public int recursiva(int num, int aux) {
		if (aux == 0) { // provavelmente estava dando errado por causa da atibuição do aux
		return 1;
		} else {
				num=aux;
					aux = num-1;
						return num + recursiva(num, aux);
			}
	}
}