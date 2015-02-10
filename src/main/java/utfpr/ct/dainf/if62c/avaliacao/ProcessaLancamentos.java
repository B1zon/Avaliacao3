package utfpr.ct.dainf.if62c.avaliacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.io.FileReader;
import java.util.Date;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class ProcessaLancamentos {
    private BufferedReader reader;

    public ProcessaLancamentos(File arquivo) throws FileNotFoundException {
        
        if(arquivo == null){
        throw new UnsupportedOperationException("Arquivo Vazio");
        }
        reader = new BufferedReader(new FileReader(arquivo));
    }

    public ProcessaLancamentos(String path) throws FileNotFoundException {
  
        if(path == null){
        throw new UnsupportedOperationException("Arquivo não encontrado");
        }
        reader = new BufferedReader(new FileReader(path));
    }
    
    private String getNextLine() throws IOException {
        if(reader == null){
        throw new UnsupportedOperationException("Arquivo Vazio");
        }
        return reader.readLine();
    }
    
    private Lancamento processaLinha(String linha) {
        String s1,s2,s3,s4;
        
        if(linha==null || linha.length()!= 86){
        throw new UnsupportedOperationException("Arquivo Vazio");
        }
        s1 = linha.substring(1, 6);
        s2 = linha.substring(7, 14);
        s3 = linha.substring(15,74);
        s4 = linha.substring(75, 86);
        Integer I1 = Integer.parseInt(s1);
        Date D1 = new Date(s2);
        Double D2 = Double.parseDouble(s4);
        Lancamento L = new Lancamento(I1,D1,s3,D2);
        return L;
    }
    
    private Lancamento getNextLancamento() throws IOException {
        
        throw new UnsupportedOperationException("Não implementado");
    }
    
    public List<Lancamento> getLancamentos() throws IOException {
        throw new UnsupportedOperationException("Não implementado");
    }
    
}
