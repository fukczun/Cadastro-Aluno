/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroalunos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author arthu_s55uht
 */
public class ListaAlunos {
    ArrayList<Aluno> listaAlunos = new ArrayList<>();
    
    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void addListaAlunos(Aluno aluno) {
        if(listaAlunos.add(aluno)){
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastar");
        }
    }
    
    public void removeListaAlunos(int index) {
        listaAlunos.remove(index);
    }
}
