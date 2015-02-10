package utfpr.ct.dainf.if62c.avaliacao;
import java.util.Comparator;
/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class LancamentoComparator implements Comparator<Lancamento>{
    
    private boolean ordNum = true;
    private int numConta;
    private int numData;
    
    public LancamentoComparator() {
    }

    public LancamentoComparator(boolean ordNum, boolean contaAsc, boolean dataAsc) {
        this.ordNum = ordNum;
        this.numConta = contaAsc ? 1 : -1;
        this.numData = dataAsc ? 1 : -1;
    }

    public boolean isOrdNum() {
        return ordNum;
    }

    public int getNumConta() {
        return numConta;
    }

    public int getNumData() {
        return numData;
    }

    public void setOrdNum(boolean ordNum) {
        this.ordNum = ordNum;
    }

    public void setNumConta(boolean numConta) {
        this.numConta = numConta ? 1 : -1;
    }

    public void setNumData(boolean numData) {
        this.numData = numData ? 1 : -1;
    }
    public boolean isContaAsc() {
    return numConta == 1;
    }
     private int comparaConta(Lancamento j1, Lancamento j2) {
     return numConta * (j1.getConta() - j2.getConta());
     }
     private int comparaData(Lancamento j1, Lancamento j2) {
     return numData * j1.getData().compareTo(j2.getData());
     }
     @Override
     public int compare(Lancamento j1, Lancamento j2) {
     int comp;
     if (ordNum) {
     comp = comparaConta(j1, j2);
     if (comp == 0) comp = comparaData(j1, j2);
     } else {
     comp = comparaData(j1, j2);
     if (comp == 0) comp = comparaConta(j1, j2);
     }
     return comp;
     }
    
}
