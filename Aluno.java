/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroalunos;

/**
 *
 * @author arthu_s55uht
 */
public class Aluno {
    private String nome;
    private String cpf;
    private String turma;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfMascara() {
        String cpfMascara = cpf.substring(0, 3);
        cpfMascara = cpfMascara + ".***.***-**";
        return cpfMascara;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
