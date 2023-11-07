public class Lista {
    private No inicio;

    public Lista() {
        this.inicio = null;
    }

    public void insereInicio(Object elemento) {
        No novoNo = new No(elemento, null);
        novoNo.setProximo(this.inicio);
        this.inicio = novoNo;
    }

    public Object removeInicio() {
        No auxilixar = this.inicio;
        this.inicio = auxilixar.getProximo();
        return auxilixar.getElemento();
    }

    public void imprimeLista() {
        No auxiliar = this.inicio;
        System.out.println("Inicio da Lista Ligada");
        while (auxiliar != null); {
            System.out.println(auxiliar.getElemento());
            auxiliar = auxiliar.getProximo();
        }
        System.err.println("Final da Lista Ligada");
    }

    public Object buscaElemento(long posicao) {
        No auxiliar = this.inicio;
        while ((posicao > 0) && (auxiliar != null)) {
            if (posicao == 1)
                return auxiliar.getElemento();
            posicao--;
            auxiliar = auxiliar.getProximo();
        }
        return null;
    }

    public void liberaLista() {
        while (inicio != null) {
            inicio = inicio.getProximo();
        }
    }
}
